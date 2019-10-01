package Operatore_BOT_GUI.model;

import java.math.BigDecimal;

public class Bilancio {

	private String partitaIVA;
	private int anno;
	private String codiceAteco;
	private double ricavi;
	private double valoreAggiunto;
	private double MOL;
	private double redditoOperativo;
	private double risultatoEsercizio;
	private double capitaleCircNetto;
	private double patrimonioNetto;
	private float ROI;
	private float ROE;
	private float ROS;
	private float levaFinanziaria;
	private float levaOperativa;
	private float leverage;
	private float margineStrutturaPrimario;
	private float margineStrutturaSecondario;
	private float currentRatio;
	private float acidTest;
	private float indiceLiquidita;
	private float indiceIndebBreve;
	private float debBancheFatturato;
	private float ofFatturato;
	private float GIV;
	private float ricaviAddetto;
	private float vaAddetto;
	private float reAddetto;
	private float cost_lav_addetto;
	private float numAddetti;
	private float durataMediaCrediti;
	private float durataMediaDebiti;
	private float investimentiReD;
	
	public Bilancio(String partitaIVA, int anno) {
		super();
		this.partitaIVA = partitaIVA;
		this.anno = anno;
	}
	
	
	

	public Bilancio(String partitaIVA, int anno, double ricavi) {
		super();
		this.partitaIVA = partitaIVA;
		this.anno = anno;
		this.ricavi = ricavi;
	}




	public Bilancio(String partitaIVA, int anno, String codiceAteco, double ricavi, double valoreAggiunto, double MOL,
			double redditoOperativo, double risultatoEsercizio, double capitaleCircNetto, double patrimonioNetto,
			float ROI, float ROE, float ROS, float levaFinanziaria, float levaOperativa, float leverage,
			float margineStrutturaPrimario, float margineStrutturaSecondario, float currentRatio, float acidTest,
			float indiceLiquidita, float indiceIndebBreve, float debBancheFatturato, float ofFatturato, float GIV,
			float ricaviAddetto, float vaAddetto, float reAddetto, float cost_lav_addetto, float numAddetti,
			float durataMediaCrediti, float durataMediaDebiti, float investimentiReD) {
		super();
		this.partitaIVA = partitaIVA;
		this.anno = anno;
		this.codiceAteco = codiceAteco;
		this.ricavi = ricavi;
		this.valoreAggiunto = valoreAggiunto;
		this.MOL = MOL;
		this.redditoOperativo = redditoOperativo;
		this.risultatoEsercizio = risultatoEsercizio;
		this.capitaleCircNetto = capitaleCircNetto;
		this.patrimonioNetto = patrimonioNetto;
		this.ROI = ROI;
		this.ROE = ROE;
		this.ROS = ROS;
		this.levaFinanziaria = levaFinanziaria;
		this.levaOperativa = levaOperativa;
		this.leverage = leverage;
		this.margineStrutturaPrimario = margineStrutturaPrimario;
		this.margineStrutturaSecondario = margineStrutturaSecondario;
		this.currentRatio = currentRatio;
		this.acidTest = acidTest;
		this.indiceLiquidita = indiceLiquidita;
		this.indiceIndebBreve = indiceIndebBreve;
		this.debBancheFatturato = debBancheFatturato;
		this.ofFatturato = ofFatturato;
		this.GIV = GIV;
		this.ricaviAddetto = ricaviAddetto;
		this.vaAddetto = vaAddetto;
		this.reAddetto = reAddetto;
		this.cost_lav_addetto = cost_lav_addetto;
		this.numAddetti = numAddetti;
		this.durataMediaCrediti = durataMediaCrediti;
		this.durataMediaDebiti = durataMediaDebiti;
		this.investimentiReD = investimentiReD;
	}
	
	



	



	@Override
	public String toString() {
		return "Bilancio [partitaIVA=" + partitaIVA + ", anno=" + anno + ", ricavi=" + ricavi + ", valoreAggiunto="
				+ valoreAggiunto + "]";
	}



	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getCodiceAteco() {
		return codiceAteco;
	}

	public void setCodiceAteco(String codiceAteco) {
		this.codiceAteco = codiceAteco;
	}

	public double getRicavi() {
		return ricavi;
	}

	public void setRicavi(double ricavi) {
		this.ricavi = ricavi;
	}

	public double getValoreAggiunto() {
		return valoreAggiunto;
	}

	public void setValoreAggiunto(double valoreAggiunto) {
		this.valoreAggiunto = valoreAggiunto;
	}

	public double getMOL() {
		return MOL;
	}

	public void setMOL(double MOL) {
		this.MOL = MOL;
	}

	public double getRedditoOperativo() {
		return redditoOperativo;
	}

	public void setRedditoOperativo(double redditoOperativo) {
		this.redditoOperativo = redditoOperativo;
	}

	public double getRisultatoEsercizio() {
		return risultatoEsercizio;
	}

	public void setRisultatoEsercizio(double risultatoEsercizio) {
		this.risultatoEsercizio = risultatoEsercizio;
	}

	public double getCapitaleCircNetto() {
		return capitaleCircNetto;
	}

	public void setCapitaleCircNetto(double capitaleCircNetto) {
		this.capitaleCircNetto = capitaleCircNetto;
	}

	public double getPatrimonioNetto() {
		return patrimonioNetto;
	}

	public void setPatrimonioNetto(double patrimonioNetto) {
		this.patrimonioNetto = patrimonioNetto;
	}

	public float getROI() {
		return ROI;
	}

	public void setROI(float ROI) {
		this.ROI = ROI;
	}

	public float getROE() {
		return ROE;
	}

	public void setROE(float ROE) {
		this.ROE = ROE;
	}

	public float getROS() {
		return ROS;
	}

	public void setROS(float ROS) {
		this.ROS = ROS;
	}

	public float getLevaFinanziaria() {
		return levaFinanziaria;
	}

	public void setLevaFinanziaria(float levaFinanziaria) {
		this.levaFinanziaria = levaFinanziaria;
	}

	public float getLevaOperativa() {
		return levaOperativa;
	}

	public void setLevaOperativa(float levaOperativa) {
		this.levaOperativa = levaOperativa;
	}

	public float getLeverage() {
		return leverage;
	}

	public void setLeverage(float leverage) {
		this.leverage = leverage;
	}

	public float getMargineStrutturaPrimario() {
		return margineStrutturaPrimario;
	}

	public void setMargineStrutturaPrimario(float margineStrutturaPrimario) {
		this.margineStrutturaPrimario = margineStrutturaPrimario;
	}

	public float getMargineStrutturaSecondario() {
		return margineStrutturaSecondario;
	}

	public void setMargineStrutturaSecondario(float margineStrutturaSecondario) {
		this.margineStrutturaSecondario = margineStrutturaSecondario;
	}

	public float getCurrentRatio() {
		return currentRatio;
	}

	public void setCurrentRatio(float currentRatio) {
		this.currentRatio = currentRatio;
	}

	public float getAcidTest() {
		return acidTest;
	}

	public void setAcidTest(float acidTest) {
		this.acidTest = acidTest;
	}

	public float getIndiceLiquidita() {
		return indiceLiquidita;
	}

	public void setIndiceLiquidita(float indiceLiquidita) {
		this.indiceLiquidita = indiceLiquidita;
	}

	public float getIndiceIndebBreve() {
		return indiceIndebBreve;
	}

	public void setIndiceIndebBreve(float indiceIndebBreve) {
		this.indiceIndebBreve = indiceIndebBreve;
	}

	public float getDebBancheFatturato() {
		return debBancheFatturato;
	}

	public void setDebBancheFatturato(float debBancheFatturato) {
		this.debBancheFatturato = debBancheFatturato;
	}

	public float getOfFatturato() {
		return ofFatturato;
	}

	public void setOfFatturato(float ofFatturato) {
		this.ofFatturato = ofFatturato;
	}

	public float getGIV() {
		return GIV;
	}

	public void setGIV(float GIV) {
		this.GIV = GIV;
	}

	public float getRicaviAddetto() {
		return ricaviAddetto;
	}

	public void setRicaviAddetto(float ricaviAddetto) {
		this.ricaviAddetto = ricaviAddetto;
	}

	public float getVaAddetto() {
		return vaAddetto;
	}

	public void setVaAddetto(float vaAddetto) {
		this.vaAddetto = vaAddetto;
	}

	public float getReAddetto() {
		return reAddetto;
	}

	public void setReAddetto(float reAddetto) {
		this.reAddetto = reAddetto;
	}

	public float getCost_lav_addetto() {
		return cost_lav_addetto;
	}

	public void setCost_lav_addetto(float cost_lav_addetto) {
		this.cost_lav_addetto = cost_lav_addetto;
	}

	public float getNumAddetti() {
		return numAddetti;
	}

	public void setNumAddetti(float numAddetti) {
		this.numAddetti = numAddetti;
	}

	public float getDurataMediaCrediti() {
		return durataMediaCrediti;
	}

	public void setDurataMediaCrediti(float durataMediaCrediti) {
		this.durataMediaCrediti = durataMediaCrediti;
	}

	public float getDurataMediaDebiti() {
		return durataMediaDebiti;
	}

	public void setDurataMediaDebiti(float durataMediaDebiti) {
		this.durataMediaDebiti = durataMediaDebiti;
	}

	public float getInvestimentiReD() {
		return investimentiReD;
	}

	public void setInvestimentiReD(float investimentiReD) {
		this.investimentiReD = investimentiReD;
	}
	
	
	
}
