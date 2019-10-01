package Operatore_BOT_GUI.controller;



import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Appalto;
import Operatore_BOT_GUI.model.Azienda;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppaltiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaangAzAp"
    private ImageView imgComparaangAzAp; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaCompAzAp"
    private Label lblAziendaCompAzAp; // Value injected by FXMLLoader

    @FXML // fx:id="cmbAppalti"
    private ComboBox<Appalto> cmbAppalti; // Value injected by FXMLLoader

    @FXML // fx:id="btnInfoAzApp"
    private Button btnInfoAzApp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilancioAzAp"
    private Button btnIndBilancioAzAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBrevettiAzBrAp"
    private Button btnIndBrevettiAzBrAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnAppaltiApp"
    private Button btnAppaltiApp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProgettiAzBrAp"
    private Button btnIndProgettiAzBrAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProdottiAzBrAp"
    private Button btnIndProdottiAzBrAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndArticoliAzBrAp"
    private Button btnIndArticoliAzBrAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNewsAzAp"
    private Button btnIndNewsAzAp; // Value injected by FXMLLoader

    @FXML // fx:id="btnTornaClassificaAp"
    private Button btnTornaClassificaAp; // Value injected by FXMLLoader

    @FXML // fx:id="cbxAltraAziendaAp"
    private ComboBox<Azienda> cmbAltraAziendaAp; // Value injected by FXMLLoader

    @FXML // fx:id="lblFunding"
    private GridPane lblFunding; // Value injected by FXMLLoader

    @FXML // fx:id="lblCoAppalto"
    private Label lblCoAppalto; // Value injected by FXMLLoader

    @FXML // fx:id="lblDataPubb"
    private Label lblDataPubb; // Value injected by FXMLLoader

    @FXML // fx:id="lblDataScad"
    private Label lblDataScad; // Value injected by FXMLLoader

    @FXML // fx:id="lblEsito"
    private Label lblEsito; // Value injected by FXMLLoader

    @FXML // fx:id="lblAppaltatrice"
    private Label lblAppaltatrice; // Value injected by FXMLLoader

    @FXML // fx:id="lblContraente"
    private Label lblContraente; // Value injected by FXMLLoader

    @FXML // fx:id="lblRaggruppamento"
    private Label lblRaggruppamento; // Value injected by FXMLLoader

    @FXML // fx:id="lblAltriCont"
    private Label lblAltriCont; // Value injected by FXMLLoader

    @FXML // fx:id="lblCodiceCpv"
    private Label lblCodiceCpv; // Value injected by FXMLLoader

    @FXML // fx:id="lblOggetto"
    private Label lblOggetto; // Value injected by FXMLLoader

    @FXML // fx:id="lblDescriziAp"
    private Label lblDescriziAp; // Value injected by FXMLLoader

    @FXML // fx:id="lblLuogEsec"
    private Label lblLuogEsec; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodAppalto"
    private TextField txtCodAppalto; // Value injected by FXMLLoader

    @FXML // fx:id="txtDataPubb"
    private TextField txtDataPubb; // Value injected by FXMLLoader

    @FXML // fx:id="txtDataScad"
    private TextField txtDataScad; // Value injected by FXMLLoader

    @FXML // fx:id="txtEsito"
    private TextField txtEsito; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppalt"
    private TextField txtAppalt; // Value injected by FXMLLoader

    @FXML // fx:id="txtRaggru"
    private TextField txtRaggru; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodiceCpv"
    private TextField txtCodiceCpv; // Value injected by FXMLLoader

    @FXML // fx:id="txtOggettoApp"
    private TextField txtOggettoApp; // Value injected by FXMLLoader

    @FXML // fx:id="txtLugEsecu"
    private TextField txtLugEsecu; // Value injected by FXMLLoader

    @FXML // fx:id="txtAltrContr"
    private TextField txtAltrContr; // Value injected by FXMLLoader

    @FXML // fx:id="lblFondiEU"
    private Label lblFondiEU; // Value injected by FXMLLoader

    @FXML // fx:id="lblCodiceProgettoAp"
    private Label lblCodiceProgettoAp; // Value injected by FXMLLoader

    @FXML // fx:id="lblValContApp"
    private Label lblValContApp; // Value injected by FXMLLoader

    @FXML // fx:id="txtContraent"
    private TextField txtContraent; // Value injected by FXMLLoader

    @FXML // fx:id="txtDescrApp"
    private TextArea txtDescrApp; // Value injected by FXMLLoader

    @FXML // fx:id="txtFondiEu"
    private TextField txtFondiEu; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodProgApp"
    private TextField txtCodProgApp; // Value injected by FXMLLoader

    @FXML // fx:id="txtValContApp"
    private TextField txtValContApp; // Value injected by FXMLLoader

    Model model;
    private Appalto appalto = new Appalto();
    Azienda aziendaSel;
    
    public void setModel(Model model) {
    	this.model = model;
    	aziendaSel = model.getAziendaSelezionata();
    	List<Appalto> appalti = this.model.getAppaltiAzienda(aziendaSel);
    	cmbAppalti.getItems().addAll(appalti);
    	cmbAppalti.getItems().add(0, null);
    	lblAziendaCompAzAp.setText(aziendaSel.toString());    	
    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
    	cmbAltraAziendaAp.getItems().addAll(altreAz);
    	cmbAltraAziendaAp.getItems().add(0, null);
    }
    
    
    @FXML
    void Inf(MouseEvent event) {

    }

    @FXML
    void Pj(MouseEvent event) {

    }

    @FXML
    void doApriBilancio(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("IndiciBilancio.fxml"));
		ScrollPane root = (ScrollPane)loader.load();
		IndiciBilancioController controller = loader.getController();
		controller.setModel(model);
    	
		Scene goToHome = new Scene(root);
    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	newStage.setScene(goToHome);
    	newStage.show();
    }

    @FXML
    void doApriaListaAziende(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(cmbAltraAziendaAp.getValue());
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
    void doEstraiAppalti(ActionEvent event) {

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
    void doScegliAppalto(ActionEvent event) {
    	this.appalto = cmbAppalti.getValue();

    	txtCodAppalto.setText(appalto.getCodiceAppalto());
    	txtDataPubb.setText(appalto.getDataPubblicazione());
    	txtDataScad.setText(appalto.getDataScadenza());
    	txtEsito.setText(appalto.getEsito());
    	txtAppalt.setText(appalto.getAppaltatrice());
    	txtContraent.setText(appalto.getContraente());
    	Boolean raggruppamento = appalto.isRaggruppamento();
    	String raggrupp = raggruppamento.toString();
    	txtRaggru.setText(raggrupp);
    	txtAltrContr.setText(appalto.getAltriContraenti());
    	txtCodiceCpv.setText(appalto.getCodiceCPV());
    	txtOggettoApp.setText(appalto.getOggetto());
    	txtDescrApp.setText(appalto.getDescrizione());
    	txtLugEsecu.setText(appalto.getLuogoEsecuzione());
    	Boolean fondiUE = appalto.isFondiUE();
    	String fondi = fondiUE.toString();
    	txtFondiEu.setText(fondi);
    	txtCodProgApp.setText(appalto.getCodiceProgetto());
    	txtValContApp.setText(String.valueOf(appalto.getValoreContratto()));
    	
    }

    @FXML
    void doTornaclassifica(ActionEvent event) throws IOException {
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
        assert imgComparaangAzAp != null : "fx:id=\"imgComparaangAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblAziendaCompAzAp != null : "fx:id=\"lblAziendaCompAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert cmbAppalti != null : "fx:id=\"cmbAppalti\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnInfoAzApp != null : "fx:id=\"btnInfoAzApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndBilancioAzAp != null : "fx:id=\"btnIndBilancioAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndBrevettiAzBrAp != null : "fx:id=\"btnIndBrevettiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnAppaltiApp != null : "fx:id=\"btnAppaltiApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndProgettiAzBrAp != null : "fx:id=\"btnIndProgettiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndProdottiAzBrAp != null : "fx:id=\"btnIndProdottiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndArticoliAzBrAp != null : "fx:id=\"btnIndArticoliAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnIndNewsAzAp != null : "fx:id=\"btnIndNewsAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert btnTornaClassificaAp != null : "fx:id=\"btnTornaClassificaAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert cmbAltraAziendaAp != null : "fx:id=\"cmbAltraAziendaAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblFunding != null : "fx:id=\"lblFunding\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblCoAppalto != null : "fx:id=\"lblCoAppalto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblDataPubb != null : "fx:id=\"lblDataPubb\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblDataScad != null : "fx:id=\"lblDataScad\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblEsito != null : "fx:id=\"lblEsito\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblAppaltatrice != null : "fx:id=\"lblAppaltatrice\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblContraente != null : "fx:id=\"lblContraente\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblRaggruppamento != null : "fx:id=\"lblRaggruppamento\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblAltriCont != null : "fx:id=\"lblAltriCont\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblCodiceCpv != null : "fx:id=\"lblCodiceCpv\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblOggetto != null : "fx:id=\"lblOggetto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblDescriziAp != null : "fx:id=\"lblDescriziAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblLuogEsec != null : "fx:id=\"lblLuogEsec\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtCodAppalto != null : "fx:id=\"txtCodAppalto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtDataPubb != null : "fx:id=\"txtDataPubb\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtDataScad != null : "fx:id=\"txtDataScad\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtEsito != null : "fx:id=\"txtEsito\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtAppalt != null : "fx:id=\"txtAppalt\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtRaggru != null : "fx:id=\"txtRaggru\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtCodiceCpv != null : "fx:id=\"txtCodiceCpv\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtOggettoApp != null : "fx:id=\"txtOggettoApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtLugEsecu != null : "fx:id=\"txtLugEsecu\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtAltrContr != null : "fx:id=\"txtAltrContr\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblFondiEU != null : "fx:id=\"lblFondiEU\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblCodiceProgettoAp != null : "fx:id=\"lblCodiceProgettoAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert lblValContApp != null : "fx:id=\"lblValContApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtContraent != null : "fx:id=\"txtContraent\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtDescrApp != null : "fx:id=\"txtDescrApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtFondiEu != null : "fx:id=\"txtFondiEu\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtCodProgApp != null : "fx:id=\"txtCodProgApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
        assert txtValContApp != null : "fx:id=\"txtValContApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";

    }
}
