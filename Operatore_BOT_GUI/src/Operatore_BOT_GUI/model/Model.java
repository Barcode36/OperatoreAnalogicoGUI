package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AppaltoDAO;
import Operatore_BOT_GUI.DAO.ArticoloDAO;
import Operatore_BOT_GUI.DAO.AziendaDAO;
import Operatore_BOT_GUI.DAO.BilancioDAO;
import Operatore_BOT_GUI.DAO.BrevettoDAO;
import Operatore_BOT_GUI.DAO.NewsDAO;
import Operatore_BOT_GUI.DAO.ProdottoServizioDAO;
import Operatore_BOT_GUI.DAO.ProgettoDAO;

public class Model {

	private List<Azienda> aziende;
	private Azienda azienda;
	private Azienda competitor;
	private Azienda aziendaSelezionata;
	private List<Azienda> aziendeCompetitorHome;
	
	public Model() {
		super();
		AziendaDAO dao = new AziendaDAO();
		BilancioDAO bilancioDAO = new BilancioDAO();
		ArticoloDAO artDAO = new ArticoloDAO();
		BrevettoDAO brevDAO = new BrevettoDAO();
		AppaltoDAO appDAO = new AppaltoDAO();
		ProdottoServizioDAO servDAO = new ProdottoServizioDAO();
		ProgettoDAO prgDAO = new ProgettoDAO();

		this.aziende = dao.getTutteLeAziende();
		
		for (Azienda az : aziende) {
			bilancioDAO.getBilanciByAzienda(az);
		}

		for (Azienda az : aziende) {
			artDAO.getArticoliAzienda(az);
		}
		
		for (Azienda az : aziende) {
			brevDAO.getBrevettiAzienda(az);
		}
		
		for (Azienda az : aziende) {
			appDAO.getAppaltiAzienda(az);
		}
		
		for (Azienda az : aziende) {
			servDAO.getProdottiServiziAzienda(az);
		}
		
		for (Azienda az : aziende) {
			prgDAO.getProgettiAzienda(az);
		}
	}

	public ArrayList<Azienda> ordineAziende(int[] weights, String[] keywords){
		
		ArrayList<Azienda> aziendeOrdinate = new ArrayList<Azienda>();
		int score_max = 0;
		for (int w : weights) score_max += w;
		
		for (Azienda az : aziende) {
			this.punteggioAzienda(az, weights, keywords);
			aziendeOrdinate.add(az);
		}

		Collections.sort(aziendeOrdinate, new Comparator<Azienda> () {

			@Override
			public int compare(Azienda a1, Azienda a2) {
				double s1 = a1.getScore(), s2 = a2.getScore();
				
				if (s1 == s2) return 0;
				if (s1 < s2) return -1;
				
				return 1;
			}
			
		});
		
		return aziendeOrdinate;
		
		
	}
	
	
	public ArrayList<Articolo> getArticoliCorrelati (String keyword){
		
		ArrayList<Articolo> art_correlati = new ArrayList<Articolo>();
		for (Articolo art : this.getAllArticles()) {
			if (art.checkKeyword(keyword)) art_correlati.add(art);
		}
		
		return art_correlati;
	}
	
	
	public ArrayList<Brevetto> getBrevettiCorrelati (String keyword){
		
		ArrayList<Brevetto> brev_correlati = new ArrayList<Brevetto>();
		for (Brevetto brev : this.getAllPatents()) {
			if (brev.checkKeyword(keyword)) brev_correlati.add(brev);
		}
		
		return brev_correlati;
	}
	
	
	
	private ArrayList<Articolo> getAllArticles (){
		ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		
		for (Azienda az : aziende) {
			articoli.addAll(az.getArticoli());
		}
		
		return articoli;
	}
	
	
	private ArrayList<Brevetto> getAllPatents (){
		ArrayList<Brevetto> brevetti = new ArrayList<Brevetto>();
		
		for (Azienda az : aziende) {
			brevetti.addAll(az.getBrevetti());
		}
		
		return brevetti;
	}
	
	
	
	public List<Azienda> getAziendeCompetitorHome() {
		return aziendeCompetitorHome;
	}

	public void setAziendeCompetitorHome(List<Azienda> aziendeCompetitorHome) {
		this.aziendeCompetitorHome = aziendeCompetitorHome;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	
	
	public Azienda getAziendaSelezionata() {
		return aziendaSelezionata;
	}

	public void setAziendaSelezionata(Azienda aziendaSelezionata) {
		this.aziendaSelezionata = aziendaSelezionata;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public List<Azienda> getAziende() {
		return aziende;
	}
	
	public List<Azienda> getAziendeMenoSelezionata(Azienda azienda){
//		List<Azienda> azs = this.aziende;
//		azs.remove(azienda);
//		return azs;
		return aziende;
	}

	public void setAziende(List<Azienda> aziende) {
		this.aziende = aziende;
	}
	
	
	
	public Azienda getCompetitor() {
		return competitor;
	}


	public void setCompetitor(Azienda competitor) {
		this.competitor = competitor;
	}


	public void getInfoAzienda (Azienda azienda) {
		
		
	}
	
	public Bilancio getBilancioAziendaAnno(Azienda azienda, int anno) {
		return azienda.getBilancioOfYear(anno);
	}
//	
//	public Bilancio getRicaviAziendaAnnoProva(Azienda azienda, int anno) {
//		BilancioDAO bilancioDAO = new BilancioDAO();
//		Bilancio bilancio = bilancioDAO.getRicaviAziendaAnno(azienda, anno);
//		return bilancio;
//	}
	
	public List<Appalto> getAppaltiAzienda(Azienda azienda) {
		return azienda.getAppalti();
	}
	
	public List<Progetto> getProgettiAzienda(Azienda azienda){
		return azienda.getProgetti();
	}
	
	public List<Articolo> getArticoliAzienda(Azienda azienda){
		return azienda.getArticoli();
		
	}
	
	public List<News> getNewsAzienda (Azienda azienda){
		return azienda.getNews();
	}
	
	
	public List<ProdottoServizio> getProdottiServizi (Azienda azienda){
		return azienda.getServizi();
	}
	
	public List<Brevetto> getBrevettiAzienda (Azienda azienda){
		return azienda.getBrevetti();
	}
	
	private double fatturatoMedio () {
		double fat_tot = 0;
		int count = 0;
		for (Azienda az : aziende) {
			fat_tot += az.getBilancioOfYear(2018).getRicavi();
			count++;
		}
		return fat_tot/count;
	}
	
	private double ricercaSviluppoMedio () {
		double ric_tot = 0;
		int count = 0;
		for (Azienda az : aziende) {
			ric_tot += az.getBilancioOfYear(2018).getInvestimentiReD();
			count++;
		}
		return ric_tot/count;
	}
	
	private int numMaxBrevetti () {
		int max = 0;
		
		for (Azienda az : aziende) {
			int size = az.getBrevetti().size();
			if (size > max) max = size;
		}
		
		return max;
	}
	
	private int numMaxArticoli () {
		int max = 0;
		
		for (Azienda az : aziende) {
			int size = az.getArticoli().size();
			if (size > max) max = size;
		}
		
		return max;
	}
	
	
	private double punteggioAzienda (Azienda az, int[] weights, String[] keywords) {
		double fatturato_medio = this.fatturatoMedio();
		double ricercaSviluppo_medio = this.ricercaSviluppoMedio();
		double score = 0;
		double appalti, articoli, bilancio, brevetti, news, servizi, progetti;
		
		appalti = az.getAppaltiIndex(fatturato_medio);
		articoli = az.getArticoliIndex(keywords, this.numMaxArticoli());
		bilancio = az.getBilancioIndex(fatturato_medio, ricercaSviluppo_medio);
		brevetti = az.getBrevettiIndex(this.numMaxBrevetti());
		//news = az.getNewsIndex();
		//servizi = az.getServiziIndex();
		progetti = az.getProgettiIndex(fatturato_medio);
		
		
		score = (weights[0]*appalti + weights[1]*articoli + weights[2]*bilancio + weights[3]*brevetti + weights[4]*progetti)/10;
		az.setScore(score);
		return score;
	}
}
