package Operatore_BOT_GUI.controller;


	import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Bilancio;
import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class IndiciBilancioController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAz"
	    private ImageView imgComparaangAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompAz"
	    private Label lblAziendaCompAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnInfoAzInBil"
	    private Button btnInfoAzInBil; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilanBlc"
	    private Button btnIndBilanBlc; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAz"
	    private Button btnIndBrevettiAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAz"
	    private Button btnIndAppaltiAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAz"
	    private Button btnIndProgettiAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAz"
	    private Button btnIndProdottiAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAz"
	    private Button btnIndArticoliAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAz"
	    private Button btnIndNewsAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassifica"
	    private Button btnTornaClassifica; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAzienda"
	    private ComboBox<Azienda> cmbAltraAzienda; // Value injected by FXMLLoader

	    @FXML // fx:id="lblIdAnno1Az"
	    private Label lblIdAnno1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRicavi1Az"
	    private Label lblRicavi1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblMol1Az"
	    private Label lblMol1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblValoreAggiunto1Az"
	    private Label lblValoreAggiunto1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRO1Az"
	    private Label lblRO1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRE1Az"
	    private Label lblRE1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCCN1Az"
	    private Label lblCCN1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKN1Az"
	    private Label lblKN1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblROI1Az"
	    private Label lblROI1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblROE1Az"
	    private Label lblROE1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblROS1Az"
	    private Label lblROS1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblGIV1Az"
	    private Label lblGIV1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLevFin1Az"
	    private Label lblLevFin1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLevOper1Az"
	    private Label lblLevOper1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLeverage1Az"
	    private Label lblLeverage1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblMSP1Az"
	    private Label lblMSP1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblMSS1Az"
	    private Label lblMSS1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCurrentRatio1Az"
	    private Label lblCurrentRatio1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAcidTest1Az"
	    private Label lblAcidTest1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblIndLiqui1Az"
	    private Label lblIndLiqui1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInvRDAz"
	    private Label lblInvRDAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDebVsBanche1Az"
	    private Label lblDebVsBanche1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblOnFin1Az"
	    private Label lblOnFin1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRicAddet1Az"
	    private Label lblRicAddet1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblVaAddetto1Az"
	    private Label lblVaAddetto1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblReAddetto1Az"
	    private Label lblReAddetto1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCostAddetto1Az"
	    private Label lblCostAddetto1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDurMedDeb1Az"
	    private Label lblDurMedDeb1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtfatturato161Az"
	    private TextField txtfatturato161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtVA161Az"
	    private TextField txtVA161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMOL161Az"
	    private TextField txtMOL161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRO161Az"
	    private TextField txtRO161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRE161Az"
	    private TextField txtRE161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCCN161Az"
	    private TextField txtCCN161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKN161Az"
	    private TextField txtKN161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROI161Az"
	    private TextField txtROI161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROE161Az"
	    private TextField txtROE161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROS161Az"
	    private TextField txtROS161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtGIV161Az"
	    private TextField txtGIV161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevFin161Az"
	    private TextField txtLevFin161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevOp161Az"
	    private TextField txtLevOp161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLeverage161Az"
	    private TextField txtLeverage161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSP161Az"
	    private TextField txtMSP161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSS161Az"
	    private TextField txtMSS161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCurrentRatio161Az"
	    private TextField txtCurrentRatio161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAcidTest161Az"
	    private TextField txtAcidTest161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndLiquidita161Az"
	    private TextField txtIndLiquidita161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndIndebBrev161Az"
	    private TextField txtIndIndebBrev161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDebBanche161Az"
	    private TextField txtDebBanche161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOnFin161Az"
	    private TextField txtOnFin161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRicAddetto161Az"
	    private TextField txtRicAddetto161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRisEsercAddeto161Az"
	    private TextField txtRisEsercAddeto161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtValAggAddeto161Az"
	    private TextField txtValAggAddeto161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCostAddetto161Az"
	    private TextField txtCostAddetto161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedCrediti161Az"
	    private TextField txtDurataMedCrediti161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="lblIdDurMedDebAz"
	    private Label lblIdDurMedDebAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInvRD1Az"
	    private Label lblInvRD1Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedDebiti161Az"
	    private TextField txtDurataMedDebiti161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInvestimentiRD161Az"
	    private TextField txtInvestimentiRD161Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtfatturato171Az"
	    private TextField txtfatturato171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtVA171Az"
	    private TextField txtVA171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMOL171Az"
	    private TextField txtMOL171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRO171Az"
	    private TextField txtRO171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRE171Az"
	    private TextField txtRE171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCCN171Az"
	    private TextField txtCCN171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKN171Az"
	    private TextField txtKN171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROI171Az"
	    private TextField txtROI171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROE171Az"
	    private TextField txtROE171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROS171Az"
	    private TextField txtROS171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtGIV171Az"
	    private TextField txtGIV171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevFin171Az"
	    private TextField txtLevFin171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevOp171Az"
	    private TextField txtLevOp171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLeverage171Az"
	    private TextField txtLeverage171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSP171Az"
	    private TextField txtMSP171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSS171Az"
	    private TextField txtMSS171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCurrentRatio171Az"
	    private TextField txtCurrentRatio171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAcidTest171Az"
	    private TextField txtAcidTest171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndLiquidita171Az"
	    private TextField txtIndLiquidita171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndIndebBrev171Az"
	    private TextField txtIndIndebBrev171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtfatturato181Az"
	    private TextField txtfatturato181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtVA181Az"
	    private TextField txtVA181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMOL181Az"
	    private TextField txtMOL181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRO181Az"
	    private TextField txtRO181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRE181Az"
	    private TextField txtRE181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCCN181Az"
	    private TextField txtCCN181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKN181Az"
	    private TextField txtKN181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROI181Az"
	    private TextField txtROI181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROE181Az"
	    private TextField txtROE181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtROS181Az"
	    private TextField txtROS181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtGIV181Az"
	    private TextField txtGIV181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevFin181Az"
	    private TextField txtLevFin181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDebBanche171Az"
	    private TextField txtDebBanche171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOnFin171Az"
	    private TextField txtOnFin171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLevOp181Az"
	    private TextField txtLevOp181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSP181Az"
	    private TextField txtMSP181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtMSS181Az"
	    private TextField txtMSS181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRicAddetto171Az"
	    private TextField txtRicAddetto171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRisEsercAddeto171Az"
	    private TextField txtRisEsercAddeto171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtValAggAddeto171Az"
	    private TextField txtValAggAddeto171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCostAddetto171Az"
	    private TextField txtCostAddetto171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedCrediti171Az"
	    private TextField txtDurataMedCrediti171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedDebiti171Az"
	    private TextField txtDurataMedDebiti171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInvestimentiRD171Az"
	    private TextField txtInvestimentiRD171Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCurrentRatio181Az"
	    private TextField txtCurrentRatio181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAcidTest181Az"
	    private TextField txtAcidTest181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndLiquidita181Az"
	    private TextField txtIndLiquidita181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndIndebBrev181Az"
	    private TextField txtIndIndebBrev181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDebBanche181Az"
	    private TextField txtDebBanche181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOnFin181Az"
	    private TextField txtOnFin181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRicAddetto181Az"
	    private TextField txtRicAddetto181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRisEsercAddeto181Az"
	    private TextField txtRisEsercAddeto181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtValAggAddeto181Az"
	    private TextField txtValAggAddeto181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCostAddetto181Az"
	    private TextField txtCostAddetto181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedCrediti181Az"
	    private TextField txtDurataMedCrediti181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDurataMedDebiti181Az"
	    private TextField txtDurataMedDebiti181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInvestimentiRD181Az"
	    private TextField txtInvestimentiRD181Az; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLeverage181Az"
	    private TextField txtLeverage181Az; // Value injected by FXMLLoader

	    Model model;
	    
	    
	    public void setModel(Model model) {
	    	this.model = model;
	    	Azienda aziendaSel = model.getAziendaSelezionata();
	    	lblAziendaCompAz.setText(aziendaSel.toString());
	    	
	    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
	    	cmbAltraAzienda.getItems().addAll(altreAz);
	    	cmbAltraAzienda.getItems().add(0, null);
	    	
	    	Bilancio bilancio2016 = model.getBilancioAziendaAnno(aziendaSel, 2016);
	    	Bilancio bilancio2017 = model.getBilancioAziendaAnno(aziendaSel, 2017);
	    	Bilancio bilancio2018 = model.getBilancioAziendaAnno(aziendaSel, 2018);

	    	
	    	txtfatturato161Az.setText(String.valueOf(bilancio2016.getRicavi()));
	    	System.out.println(bilancio2016.getRicavi());
	    	System.out.println(String.valueOf(bilancio2016.getRicavi()));
	    	txtVA161Az.setText(String.valueOf(bilancio2016.getValoreAggiunto()));
	    	txtMOL161Az.setText(String.valueOf(bilancio2016.getMOL()));
	    	txtRO161Az.setText(String.valueOf(bilancio2016.getRedditoOperativo()));
	    	txtRE161Az.setText(String.valueOf(bilancio2016.getRisultatoEsercizio()));
	    	txtCCN161Az.setText(String.valueOf(bilancio2016.getCapitaleCircNetto()));
	    	txtKN161Az.setText(String.valueOf(bilancio2016.getPatrimonioNetto()));
	    	txtROI161Az.setText(String.valueOf(bilancio2016.getROI()));
	    	txtROE161Az.setText(String.valueOf(bilancio2016.getROE()));
	    	txtROS161Az.setText(String.valueOf(bilancio2016.getROS()));
	    	txtGIV161Az.setText(String.valueOf(bilancio2016.getGIV()));
	    	txtLevFin161Az.setText(String.valueOf(bilancio2016.getLevaFinanziaria()));
	    	txtLevOp161Az.setText(String.valueOf(bilancio2016.getLevaOperativa()));
	    	txtLeverage161Az.setText(String.valueOf(bilancio2016.getLeverage()));
	    	txtMSP161Az.setText(String.valueOf(bilancio2016.getMargineStrutturaPrimario()));
	    	txtMSS161Az.setText(String.valueOf(bilancio2016.getMargineStrutturaSecondario()));
	    	txtCurrentRatio161Az.setText(String.valueOf(bilancio2016.getCurrentRatio()));
	    	txtAcidTest161Az.setText(String.valueOf(bilancio2016.getAcidTest()));
	    	txtIndLiquidita161Az.setText(String.valueOf(bilancio2016.getIndiceLiquidita()));
	    	txtIndIndebBrev161Az.setText(String.valueOf(bilancio2016.getIndiceIndebBreve()));
	    	txtDebBanche161Az.setText(String.valueOf(bilancio2016.getDebBancheFatturato()));
	    	txtOnFin161Az.setText(String.valueOf(bilancio2016.getOfFatturato()));
	    	txtRicAddetto161Az.setText(String.valueOf(bilancio2016.getRicaviAddetto()));
	    	txtRisEsercAddeto161Az.setText(String.valueOf(bilancio2016.getReAddetto()));
	    	txtValAggAddeto161Az.setText(String.valueOf(bilancio2016.getVaAddetto()));
	    	txtCostAddetto161Az.setText(String.valueOf(bilancio2016.getCost_lav_addetto()));
	    	txtDurataMedCrediti161Az.setText(String.valueOf(bilancio2016.getDurataMediaCrediti()));
	    	txtDurataMedDebiti161Az.setText(String.valueOf(bilancio2016.getDurataMediaDebiti()));
	    	txtInvestimentiRD161Az.setText(String.valueOf(bilancio2016.getInvestimentiReD()));
	    	
	    	txtfatturato171Az.setText(String.valueOf(bilancio2017.getRicavi()));
	    	txtVA171Az.setText(String.valueOf(bilancio2017.getValoreAggiunto()));
	    	txtMOL171Az.setText(String.valueOf(bilancio2017.getMOL()));
	    	txtRO171Az.setText(String.valueOf(bilancio2017.getRedditoOperativo()));
	    	txtRE171Az.setText(String.valueOf(bilancio2017.getRisultatoEsercizio()));
	    	txtCCN171Az.setText(String.valueOf(bilancio2017.getCapitaleCircNetto()));
	    	txtKN171Az.setText(String.valueOf(bilancio2017.getPatrimonioNetto()));
	    	txtROI171Az.setText(String.valueOf(bilancio2017.getROI()));
	    	txtROE171Az.setText(String.valueOf(bilancio2017.getROE()));
	    	txtROS171Az.setText(String.valueOf(bilancio2017.getROS()));
	    	txtGIV171Az.setText(String.valueOf(bilancio2017.getGIV()));
	    	txtLevFin171Az.setText(String.valueOf(bilancio2017.getLevaFinanziaria()));
	    	txtLevOp171Az.setText(String.valueOf(bilancio2017.getLevaOperativa()));
	    	txtLeverage171Az.setText(String.valueOf(bilancio2017.getLeverage()));
	    	txtMSP171Az.setText(String.valueOf(bilancio2017.getMargineStrutturaPrimario()));
	    	txtMSS171Az.setText(String.valueOf(bilancio2017.getMargineStrutturaSecondario()));
	    	txtCurrentRatio171Az.setText(String.valueOf(bilancio2017.getCurrentRatio()));
	    	txtAcidTest171Az.setText(String.valueOf(bilancio2017.getAcidTest()));
	    	txtIndLiquidita171Az.setText(String.valueOf(bilancio2017.getIndiceLiquidita()));
	    	txtIndIndebBrev171Az.setText(String.valueOf(bilancio2017.getIndiceIndebBreve()));
	    	txtDebBanche171Az.setText(String.valueOf(bilancio2017.getDebBancheFatturato()));
	    	txtOnFin171Az.setText(String.valueOf(bilancio2017.getOfFatturato()));
	    	txtRicAddetto171Az.setText(String.valueOf(bilancio2017.getRicaviAddetto()));
	    	txtRisEsercAddeto171Az.setText(String.valueOf(bilancio2017.getReAddetto()));
	    	txtValAggAddeto171Az.setText(String.valueOf(bilancio2017.getVaAddetto()));
	    	txtCostAddetto171Az.setText(String.valueOf(bilancio2017.getCost_lav_addetto()));
	    	txtDurataMedCrediti171Az.setText(String.valueOf(bilancio2017.getDurataMediaCrediti()));
	    	txtDurataMedDebiti171Az.setText(String.valueOf(bilancio2017.getDurataMediaDebiti()));
	    	txtInvestimentiRD171Az.setText(String.valueOf(bilancio2017.getInvestimentiReD()));
	    	
	    	txtfatturato181Az.setText(String.valueOf(bilancio2018.getRicavi()));
	    	txtVA181Az.setText(String.valueOf(bilancio2018.getValoreAggiunto()));
	    	txtMOL181Az.setText(String.valueOf(bilancio2018.getMOL()));
	    	txtRO181Az.setText(String.valueOf(bilancio2018.getRedditoOperativo()));
	    	txtRE181Az.setText(String.valueOf(bilancio2018.getRisultatoEsercizio()));
	    	txtCCN181Az.setText(String.valueOf(bilancio2018.getCapitaleCircNetto()));
	    	txtKN181Az.setText(String.valueOf(bilancio2018.getPatrimonioNetto()));
	    	txtROI181Az.setText(String.valueOf(bilancio2018.getROI()));
	    	txtROE181Az.setText(String.valueOf(bilancio2018.getROE()));
	    	txtROS181Az.setText(String.valueOf(bilancio2018.getROS()));
	    	txtGIV181Az.setText(String.valueOf(bilancio2018.getGIV()));
	    	txtLevFin181Az.setText(String.valueOf(bilancio2018.getLevaFinanziaria()));
	    	txtLevOp181Az.setText(String.valueOf(bilancio2018.getLevaOperativa()));
	    	txtLeverage181Az.setText(String.valueOf(bilancio2018.getLeverage()));
	    	txtMSP181Az.setText(String.valueOf(bilancio2018.getMargineStrutturaPrimario()));
	    	txtMSS181Az.setText(String.valueOf(bilancio2018.getMargineStrutturaSecondario()));
	    	txtCurrentRatio181Az.setText(String.valueOf(bilancio2018.getCurrentRatio()));
	    	txtAcidTest181Az.setText(String.valueOf(bilancio2018.getAcidTest()));
	    	txtIndLiquidita181Az.setText(String.valueOf(bilancio2018.getIndiceLiquidita()));
	    	txtIndIndebBrev181Az.setText(String.valueOf(bilancio2018.getIndiceIndebBreve()));
	    	txtDebBanche181Az.setText(String.valueOf(bilancio2018.getDebBancheFatturato()));
	    	txtOnFin181Az.setText(String.valueOf(bilancio2018.getOfFatturato()));
	    	txtRicAddetto181Az.setText(String.valueOf(bilancio2018.getRicaviAddetto()));
	    	txtRisEsercAddeto181Az.setText(String.valueOf(bilancio2018.getReAddetto()));
	    	txtValAggAddeto181Az.setText(String.valueOf(bilancio2018.getVaAddetto()));
	    	txtCostAddetto181Az.setText(String.valueOf(bilancio2018.getCost_lav_addetto()));
	    	txtDurataMedCrediti181Az.setText(String.valueOf(bilancio2018.getDurataMediaCrediti()));
	    	txtDurataMedDebiti181Az.setText(String.valueOf(bilancio2018.getDurataMediaDebiti()));
	    	txtInvestimentiRD181Az.setText(String.valueOf(bilancio2018.getInvestimentiReD()));
	    	
	    	
	    }
	    
	    @FXML
	    void Az(ActionEvent event) {

	    }

	    @FXML
	    void doApriBilancio(ActionEvent event) {

	    }
	    
	    @FXML
	    void doApriaListaAziende(ActionEvent event) throws IOException {
	    	model.setAziendaSelezionata(cmbAltraAzienda.getValue());
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Appalti.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			AppaltiController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }


	    @FXML
	    void doEstraiAppalti(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Appalti.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			AppaltiController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiArticoli(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Articoli.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			ArticoliController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiBrevetti(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AziendaBrevetto.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			AziendaBrevettoController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiInfoAzienda(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("InfoAzienda.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			InfoAziendaController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiNews(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("News.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			NewsController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiProdotti(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ProdottiServizi.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			ProdottiServiziController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML
	    void doEstraiProgetti(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Progetti.fxml"));
			ScrollPane root = (ScrollPane)loader.load();
			ProgettiController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }
	    
	    
	    @FXML
	    void doTornaClassifica(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
	    	AnchorPane root = (AnchorPane)loader.load();
			HomeController controller = loader.getController();
			controller.setModel(model);
	    	
			Scene goToHome = new Scene(root);
	    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	newStage.setScene(goToHome);
	    	newStage.show();
	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert imgComparaangAz != null : "fx:id=\"imgComparaangAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblAziendaCompAz != null : "fx:id=\"lblAziendaCompAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnInfoAzInBil != null : "fx:id=\"btnInfoAzInBil\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndBilanBlc != null : "fx:id=\"btnIndBilanBlc\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndBrevettiAz != null : "fx:id=\"btnIndBrevettiAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndAppaltiAz != null : "fx:id=\"btnIndAppaltiAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndProgettiAz != null : "fx:id=\"btnIndProgettiAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndProdottiAz != null : "fx:id=\"btnIndProdottiAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndArticoliAz != null : "fx:id=\"btnIndArticoliAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnIndNewsAz != null : "fx:id=\"btnIndNewsAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert btnTornaClassifica != null : "fx:id=\"btnTornaClassifica\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert cmbAltraAzienda != null : "fx:id=\"cmbAltraAzienda\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblIdAnno1Az != null : "fx:id=\"lblIdAnno1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblRicavi1Az != null : "fx:id=\"lblRicavi1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblMol1Az != null : "fx:id=\"lblMol1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblValoreAggiunto1Az != null : "fx:id=\"lblValoreAggiunto1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblRO1Az != null : "fx:id=\"lblRO1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblRE1Az != null : "fx:id=\"lblRE1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblCCN1Az != null : "fx:id=\"lblCCN1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblKN1Az != null : "fx:id=\"lblKN1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblROI1Az != null : "fx:id=\"lblROI1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblROE1Az != null : "fx:id=\"lblROE1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblROS1Az != null : "fx:id=\"lblROS1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblGIV1Az != null : "fx:id=\"lblGIV1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblLevFin1Az != null : "fx:id=\"lblLevFin1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblLevOper1Az != null : "fx:id=\"lblLevOper1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblLeverage1Az != null : "fx:id=\"lblLeverage1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblMSP1Az != null : "fx:id=\"lblMSP1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblMSS1Az != null : "fx:id=\"lblMSS1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblCurrentRatio1Az != null : "fx:id=\"lblCurrentRatio1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblAcidTest1Az != null : "fx:id=\"lblAcidTest1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblIndLiqui1Az != null : "fx:id=\"lblIndLiqui1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblInvRDAz != null : "fx:id=\"lblInvRDAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblDebVsBanche1Az != null : "fx:id=\"lblDebVsBanche1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblOnFin1Az != null : "fx:id=\"lblOnFin1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblRicAddet1Az != null : "fx:id=\"lblRicAddet1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblVaAddetto1Az != null : "fx:id=\"lblVaAddetto1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblReAddetto1Az != null : "fx:id=\"lblReAddetto1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblCostAddetto1Az != null : "fx:id=\"lblCostAddetto1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblDurMedDeb1Az != null : "fx:id=\"lblDurMedDeb1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtfatturato161Az != null : "fx:id=\"txtfatturato161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtVA161Az != null : "fx:id=\"txtVA161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMOL161Az != null : "fx:id=\"txtMOL161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRO161Az != null : "fx:id=\"txtRO161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRE161Az != null : "fx:id=\"txtRE161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCCN161Az != null : "fx:id=\"txtCCN161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtKN161Az != null : "fx:id=\"txtKN161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROI161Az != null : "fx:id=\"txtROI161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROE161Az != null : "fx:id=\"txtROE161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROS161Az != null : "fx:id=\"txtROS161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtGIV161Az != null : "fx:id=\"txtGIV161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevFin161Az != null : "fx:id=\"txtLevFin161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevOp161Az != null : "fx:id=\"txtLevOp161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLeverage161Az != null : "fx:id=\"txtLeverage161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSP161Az != null : "fx:id=\"txtMSP161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSS161Az != null : "fx:id=\"txtMSS161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCurrentRatio161Az != null : "fx:id=\"txtCurrentRatio161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtAcidTest161Az != null : "fx:id=\"txtAcidTest161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndLiquidita161Az != null : "fx:id=\"txtIndLiquidita161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndIndebBrev161Az != null : "fx:id=\"txtIndIndebBrev161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDebBanche161Az != null : "fx:id=\"txtDebBanche161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtOnFin161Az != null : "fx:id=\"txtOnFin161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRicAddetto161Az != null : "fx:id=\"txtRicAddetto161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRisEsercAddeto161Az != null : "fx:id=\"txtRisEsercAddeto161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtValAggAddeto161Az != null : "fx:id=\"txtValAggAddeto161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCostAddetto161Az != null : "fx:id=\"txtCostAddetto161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedCrediti161Az != null : "fx:id=\"txtDurataMedCrediti161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblIdDurMedDebAz != null : "fx:id=\"lblIdDurMedDebAz\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert lblInvRD1Az != null : "fx:id=\"lblInvRD1Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedDebiti161Az != null : "fx:id=\"txtDurataMedDebiti161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtInvestimentiRD161Az != null : "fx:id=\"txtInvestimentiRD161Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtfatturato171Az != null : "fx:id=\"txtfatturato171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtVA171Az != null : "fx:id=\"txtVA171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMOL171Az != null : "fx:id=\"txtMOL171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRO171Az != null : "fx:id=\"txtRO171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRE171Az != null : "fx:id=\"txtRE171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCCN171Az != null : "fx:id=\"txtCCN171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtKN171Az != null : "fx:id=\"txtKN171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROI171Az != null : "fx:id=\"txtROI171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROE171Az != null : "fx:id=\"txtROE171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROS171Az != null : "fx:id=\"txtROS171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtGIV171Az != null : "fx:id=\"txtGIV171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevFin171Az != null : "fx:id=\"txtLevFin171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevOp171Az != null : "fx:id=\"txtLevOp171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLeverage171Az != null : "fx:id=\"txtLeverage171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSP171Az != null : "fx:id=\"txtMSP171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSS171Az != null : "fx:id=\"txtMSS171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCurrentRatio171Az != null : "fx:id=\"txtCurrentRatio171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtAcidTest171Az != null : "fx:id=\"txtAcidTest171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndLiquidita171Az != null : "fx:id=\"txtIndLiquidita171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndIndebBrev171Az != null : "fx:id=\"txtIndIndebBrev171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtfatturato181Az != null : "fx:id=\"txtfatturato181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtVA181Az != null : "fx:id=\"txtVA181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMOL181Az != null : "fx:id=\"txtMOL181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRO181Az != null : "fx:id=\"txtRO181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRE181Az != null : "fx:id=\"txtRE181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCCN181Az != null : "fx:id=\"txtCCN181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtKN181Az != null : "fx:id=\"txtKN181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROI181Az != null : "fx:id=\"txtROI181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROE181Az != null : "fx:id=\"txtROE181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtROS181Az != null : "fx:id=\"txtROS181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtGIV181Az != null : "fx:id=\"txtGIV181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevFin181Az != null : "fx:id=\"txtLevFin181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDebBanche171Az != null : "fx:id=\"txtDebBanche171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtOnFin171Az != null : "fx:id=\"txtOnFin171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLevOp181Az != null : "fx:id=\"txtLevOp181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSP181Az != null : "fx:id=\"txtMSP181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtMSS181Az != null : "fx:id=\"txtMSS181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRicAddetto171Az != null : "fx:id=\"txtRicAddetto171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRisEsercAddeto171Az != null : "fx:id=\"txtRisEsercAddeto171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtValAggAddeto171Az != null : "fx:id=\"txtValAggAddeto171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCostAddetto171Az != null : "fx:id=\"txtCostAddetto171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedCrediti171Az != null : "fx:id=\"txtDurataMedCrediti171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedDebiti171Az != null : "fx:id=\"txtDurataMedDebiti171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtInvestimentiRD171Az != null : "fx:id=\"txtInvestimentiRD171Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCurrentRatio181Az != null : "fx:id=\"txtCurrentRatio181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtAcidTest181Az != null : "fx:id=\"txtAcidTest181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndLiquidita181Az != null : "fx:id=\"txtIndLiquidita181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtIndIndebBrev181Az != null : "fx:id=\"txtIndIndebBrev181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDebBanche181Az != null : "fx:id=\"txtDebBanche181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtOnFin181Az != null : "fx:id=\"txtOnFin181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRicAddetto181Az != null : "fx:id=\"txtRicAddetto181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtRisEsercAddeto181Az != null : "fx:id=\"txtRisEsercAddeto181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtValAggAddeto181Az != null : "fx:id=\"txtValAggAddeto181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtCostAddetto181Az != null : "fx:id=\"txtCostAddetto181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedCrediti181Az != null : "fx:id=\"txtDurataMedCrediti181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtDurataMedDebiti181Az != null : "fx:id=\"txtDurataMedDebiti181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtInvestimentiRD181Az != null : "fx:id=\"txtInvestimentiRD181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";
	        assert txtLeverage181Az != null : "fx:id=\"txtLeverage181Az\" was not injected: check your FXML file 'Azienda_Indici_bilancio.fxml'.";

	    }


}
