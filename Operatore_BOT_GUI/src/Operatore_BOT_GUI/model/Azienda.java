package Operatore_BOT_GUI.model;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Azienda {
		
		private String partitaIVA;
		private String nomeAzienda;
		private String ragioneSociale;
		
		private double score_temp = 0;
		
		private ArrayList<Brevetto> brevetti = new ArrayList<Brevetto>();
		private ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		private ArrayList<Bilancio> bilanci = new ArrayList<Bilancio>();
		private ArrayList<Appalto> appalti = new ArrayList<Appalto>();
		private ArrayList<News> news = new ArrayList<News>();
		private ArrayList<ProdottoServizio> servizi = new ArrayList<ProdottoServizio>();
		private ArrayList<Progetto> progetti = new ArrayList<Progetto>();



		
		private String indirizzo;
		private String comune;
		private int CAP;
		private String provincia;
		private String regione;
		private String codiceAteco;
		private Boolean startup;
		private String descrizioneAzienda;
		private Boolean appartenenzaHolding;
		private String email;
		private String telefono;
		private String sitoWeb;
		private String linkedin;
		private String twitter;
		private String facebook;
		
		public Azienda(String partitaIVA, String nomeAzienda, String indirizzo, String comune, int CAP,
				String provincia, String regione, String codiceAteco, Boolean startup, String descrizioneAzienda,
				Boolean appartenenzaHolding, String email, String telefono, String sitoWeb, String linkedin,
				String twitter, String facebook) {
			super();
			this.partitaIVA = partitaIVA;
			this.nomeAzienda = nomeAzienda;
			this.indirizzo = indirizzo;
			this.comune = comune;
			this.CAP = CAP;
			this.provincia = provincia;
			this.regione = regione;
			this.codiceAteco = codiceAteco;
			this.startup = startup;
			this.descrizioneAzienda = descrizioneAzienda;
			this.appartenenzaHolding = appartenenzaHolding;
			this.email = email;
			this.telefono = telefono;
			this.sitoWeb = sitoWeb;
			this.linkedin = linkedin;
			this.twitter = twitter;
			this.facebook = facebook;
		}

		public Azienda (String nome, String iva, String ragione) {
			this.partitaIVA = iva;
			this.nomeAzienda = nome;
			this.ragioneSociale = ragione;
		}
		
		
		// CALCOLO INDICI //////////////////////////////////////////////
		public double getBrevettiIndex (int max_brevetti) {
			// return MIN 0, MAX 1
			
			return brevetti.size()/max_brevetti;
		}
		
		public double getArticoliIndex (String[] keywords, int max_articoli) {
			// return MIN 0, MAX 1
			int size = articoli.size();			
			if (size == 0) return 0;
			
			if (keywords == null) return size/max_articoli;

			int occurrences = 0;
			
			for (String key : keywords) {
				
				for (Articolo art : articoli) {
					String[] words = art.getText().split(" ");
					for (String word : words)
						if (word.contains(key)) occurrences += 1;
				}				
			}
			
			double score = 0.2*(size/max_articoli) + 0.8*(occurrences/size);
			
			if (score > 1) return 1;
			return score;
		}
		
		public double getBilancioIndex (double fatturato_medio, double ricerca_media) {
			// calcolato su FATTURATO, ROE, ROS, ROI, R&D, Liquidita
			// return MIN 0, MAX 1
			Bilancio b2018 = this.getBilancioOfYear(2018);
			double ROEmin = 0.05, ROEok = 0.07, ROEmax = 0.1;
			double ROSmin = 0.03, ROSok = 0.06, ROSmax = 0.1;
			double ROImin = 0.05, ROIok = 0.08, ROImax = 0.12;
			double LIQmin = 1, LIQok = 1.5, LIQmax = 2;
			double FATmin = 0.6, FATok = 1, FATmax = 1.4;
			double RICmin = 0.6, RICok = 1, RICmax = 1.4;

			
			double ROEscore = indexScore(b2018.getROE(), ROEmin, ROEok, ROEmax);
			double ROSscore = indexScore(b2018.getROS(), ROSmin, ROSok, ROSmax);
			double ROIscore = indexScore(b2018.getROI(), ROImin, ROIok, ROImax);
			double LIQscore = indexScore(b2018.getIndiceLiquidita(), LIQmin, LIQok, LIQmax);
			
			double FATscore = indexScore(b2018.getRicavi()/fatturato_medio, FATmin, FATok, FATmax);
			double RICscore = indexScore(b2018.getInvestimentiReD()/ricerca_media, RICmin, RICok, RICmax);
			
			double total_index = (ROEscore + ROSscore + ROIscore + LIQscore + FATscore + RICscore)/18;
			
			return total_index;
		}
		
		
		private double indexScore(double index, double min, double ok, double max) {
			
			if (index > max) return 3;
			if (index > ok) return 2;
			if (index > min) return 1;
			
			return 0;
		}
		
		public double getNewsIndex () {
			
			return news.size();
		}
		
		public double getServiziIndex () {
			
			return servizi.size();
		}
		
		public double getAppaltiIndex (double fat_medio) {
			// return MIN 0, MAX 1
			if (appalti.size() == 0) return 0;
			
			double total_value = 0;			
			for (Appalto app : appalti) {
				total_value += app.getValoreContratto();
			}
			
			double score = total_value/(appalti.size()*fat_medio);
			
			if (score > 1) return 1;
			return score;
		}
		
		public double getProgettiIndex (double fat_medio) {
			// return MIN 0, MAX 1
			if (progetti.size() == 0) return 0;
			
			double total_value = 0;			
			for (Progetto prg : progetti) {
				total_value += prg.getTotalCost();
			}
			
			double score = total_value/(progetti.size()*fat_medio);
			
			if (score > 1) return 1;
			return score;
		}
		
		
		
		

		public String getPartitaIVA() {
			return partitaIVA;
		}

		public String getNomeAzienda() {
			return nomeAzienda;
		}

		public ArrayList<Brevetto> getBrevetti() {
			return brevetti;
		}
		
		public ArrayList<Articolo> getArticoli() {
			return articoli;
		}
		
		// INSERISCE LISTA BREVETTI
		public void insertBrevetti (ArrayList<Brevetto> lista) {

			for (Brevetto b : lista) {
				brevetti.add(b);			
			}
		}
		
		// INSERISCE SINGOLO BREVETTO
		public void insertBrevetto (Brevetto b) {

			brevetti.add(b);
		}
		
		
		public String getRagioneSociale() {
			return ragioneSociale;
		}

		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}
		
		public void setScore (double sc) {
			this.score_temp = Math.round(sc*1e2)/1e2	;
		}
		
		public double getScore () {
			return this.score_temp;
			
		}
		

		public String getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}

		public String getComune() {
			return comune;
		}

		public void setComune(String comune) {
			this.comune = comune;
		}

		public int getCAP() {
			return CAP;
		}

		public void setCAP(int cAP) {
			CAP = cAP;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getRegione() {
			return regione;
		}

		public void setRegione(String regione) {
			this.regione = regione;
		}

		public String getCodiceAteco() {
			return codiceAteco;
		}

		public void setCodiceAteco(String codiceAteco) {
			this.codiceAteco = codiceAteco;
		}

		public Boolean getStartup() {
			return startup;
		}

		public void setStartup(Boolean startup) {
			this.startup = startup;
		}

		public String getDescrizioneAzienda() {
			return descrizioneAzienda;
		}

		public void setDescrizioneAzienda(String descrizioneAzienda) {
			this.descrizioneAzienda = descrizioneAzienda;
		}

		public Boolean getAppartenenzaHolding() {
			return appartenenzaHolding;
		}

		public void setAppartenenzaHolding(Boolean appartenenzaHolding) {
			this.appartenenzaHolding = appartenenzaHolding;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getSitoWeb() {
			return sitoWeb;
		}

		public void setSitoWeb(String sitoWeb) {
			this.sitoWeb = sitoWeb;
		}

		public String getLinkedin() {
			return linkedin;
		}

		public void setLinkedin(String linkedin) {
			this.linkedin = linkedin;
		}

		public String getTwitter() {
			return twitter;
		}

		public void setTwitter(String twitter) {
			this.twitter = twitter;
		}

		public String getFacebook() {
			return facebook;
		}

		public void setFacebook(String facebook) {
			this.facebook = facebook;
		}

		public void setPartitaIVA(String partitaIVA) {
			this.partitaIVA = partitaIVA;
		}

		public void setNomeAzienda(String nomeAzienda) {
			this.nomeAzienda = nomeAzienda;
		}

		public void setBrevetti(ArrayList<Brevetto> brevetti) {
			this.brevetti = brevetti;
		}
		
		public void setArticoli(ArrayList<Articolo> brevetti) {
			this.articoli = brevetti;
		}

		@Override
		public String toString() {
			return  partitaIVA + " - " + nomeAzienda;
		}
		
		
		// BILANCI ///////////////////////////////////////////////////////////
		public ArrayList<Bilancio> getBilanci (){
			return this.bilanci;
		}

		public Bilancio getBilancioOfYear (int anno) {
			Bilancio bil = null;
			for (Bilancio b : this.bilanci) {
				if (b.getAnno() == anno) bil = b;
			}
			
			if (bil == null) return new Bilancio ("", 0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			
			return bil;
		}
		
		public void setBilanci (ArrayList<Bilancio> bils) {
			this.bilanci = bils;
		}
		
		public void insertBilancio (Bilancio bil) {
			this.bilanci.add(bil);
		}
		
		
		// APPALTI ///////////////////////////////////////////////////////////
		public ArrayList<Appalto> getAppalti (){
			return this.appalti;
		}
		
		public void setAppalti (ArrayList<Appalto> apps) {
			this.appalti = apps;
		}
		
		public void insertAppalto (Appalto app) {
			this.appalti.add(app);
		}
		
		
		// NEWS /////////////////////////////////////////////////////////////		
		public ArrayList<News> getNews (){
			return this.news;
		}
		
		public void setNews (ArrayList<News> nws) {
			this.news = nws;
		}
		
		public void insertNews (News nw) {
			this.news.add(nw);
		}
		
		
		// PRODOTTO-SERVIZIO /////////////////////////////////////////////////////////////		
		public ArrayList<ProdottoServizio> getServizi (){
			return this.servizi;
		}
		
		public void setServizi (ArrayList<ProdottoServizio> servs) {
			this.servizi = servs;
		}
		
		public void insertServizio (ProdottoServizio serv) {
			this.servizi.add(serv);
		}
		
		
		// PROGETTO /////////////////////////////////////////////////////////////		
		public ArrayList<Progetto> getProgetti (){
			return this.progetti;
		}
		
		public void setProgetti (ArrayList<Progetto> prgs) {
			this.progetti = prgs;
		}
		
		public void insertProgetto (Progetto prg) {
			this.progetti.add(prg);
		}
		
		
}
