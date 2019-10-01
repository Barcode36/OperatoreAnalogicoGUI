package Operatore_BOT_GUI.controller;


	import java.io.IOException;
import java.net.URL;
	import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;
	import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

	public class InfoAziendaController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAz"
	    private ImageView imgComparaangAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompAzinf"
	    private Label lblAziendaCompAzinf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnInfoAzAz"
	    private Button btnInfoAzAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzInf"
	    private Button btnIndBilancioAzInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzBrInf"
	    private Button btnIndBrevettiAzBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAzBrInf"
	    private Button btnIndAppaltiAzBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAzBrinf"
	    private Button btnIndProgettiAzBrinf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAzBrInf"
	    private Button btnIndProdottiAzBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAzBrInf"
	    private Button btnIndArticoliAzBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzBrInf"
	    private Button btnIndNewsAzBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaBrInf"
	    private Button btnTornaClassificaBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaBrInf"
	    private ChoiceBox<Azienda> cbxAltraAziendaBrInf; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCap"
	    private GridPane lblCap; // Value injected by FXMLLoader

	    @FXML // fx:id="lblPIVAInf"
	    private Label lblPIVAInf; // Value injected by FXMLLoader

	    @FXML // fx:id="lblIndirizzo"
	    private Label lblIndirizzo; // Value injected by FXMLLoader

	    @FXML // fx:id="lblProvincia"
	    private Label lblProvincia; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRegione"
	    private Label lblRegione; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodAtecoInf"
	    private Label lblCodAtecoInf; // Value injected by FXMLLoader

	    @FXML // fx:id="lblStartUp"
	    private Label lblStartUp; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrAz"
	    private Label lblDescrAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppHold"
	    private Label lblAppHold; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEmail"
	    private Label lblEmail; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTelefono"
	    private Label lblTelefono; // Value injected by FXMLLoader

	    @FXML // fx:id="lblSitoWeb"
	    private Label lblSitoWeb; // Value injected by FXMLLoader

	    @FXML // fx:id="txtPivaInf"
	    private TextField txtPivaInf; // Value injected by FXMLLoader

	    @FXML // fx:id="txtIndirizzo"
	    private TextField txtIndirizzo; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCap"
	    private TextField txtCap; // Value injected by FXMLLoader

	    @FXML // fx:id="txtProvincia"
	    private TextField txtProvincia; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRegione"
	    private TextField txtRegione; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodatecInf"
	    private TextField txtCodatecInf; // Value injected by FXMLLoader

	    @FXML // fx:id="txtStartUp"
	    private TextField txtStartUp; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppHold"
	    private TextField txtAppHold; // Value injected by FXMLLoader

	    @FXML // fx:id="txtEmail"
	    private TextField txtEmail; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTele"
	    private TextField txtTele; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescrAzie"
	    private TextArea txtDescrAzie; // Value injected by FXMLLoader

	    @FXML // fx:id="txtSitoWeb"
	    private TextField txtSitoWeb; // Value injected by FXMLLoader

	    @FXML // fx:id="btnFacebook"
	    private Button btnFacebook; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTwitter"
	    private Button btnTwitter; // Value injected by FXMLLoader

	    @FXML // fx:id="btnLinkdin"
	    private Button btnLinkdin; // Value injected by FXMLLoader

	    Model model;
	    
	    public void setModel(Model model) {
	    	this.model = model;
	    	Azienda aziendaSel = model.getAziendaSelezionata();
	    	lblAziendaCompAzinf.setText(aziendaSel.toString());
	    	txtPivaInf.setText(aziendaSel.getPartitaIVA());
	    	txtIndirizzo.setText(aziendaSel.getIndirizzo());
	    	txtCap.setText(String.valueOf(aziendaSel.getCAP()));
	    	txtProvincia.setText(aziendaSel.getProvincia());
	    	txtRegione.setText(aziendaSel.getRegione());
	    	txtCodatecInf.setText(aziendaSel.getCodiceAteco());
	    	Boolean bool = aziendaSel.getStartup();
	    	String bo = bool.toString();
	    	txtStartUp.setText(bo);
	    	txtDescrAzie.setText(aziendaSel.getDescrizioneAzienda());
	    	Boolean boole = aziendaSel.getAppartenenzaHolding();
	    	String bol = boole.toString();
	    	txtAppHold.setText(bol);
	    	txtEmail.setText(aziendaSel.getEmail());
	    	txtTele.setText(aziendaSel.getTelefono());
	    	txtSitoWeb.setText(aziendaSel.getSitoWeb());
	    	
	    	
	    }
	    
	    @FXML
	    void Inf(MouseEvent event) {

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
	    void doApriFacebook(ActionEvent event) {

	    }

	    @FXML
	    void doApriLink(ActionEvent event) {

	    }

	    @FXML
	    void doApriLinkedin(ActionEvent event) {

	    }

	    @FXML
	    void doApriTwitter(ActionEvent event) {

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
	        assert imgComparaangAz != null : "fx:id=\"imgComparaangAz\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblAziendaCompAzinf != null : "fx:id=\"lblAziendaCompAzinf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnInfoAzAz != null : "fx:id=\"btnInfoAzAz\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndBilancioAzInf != null : "fx:id=\"btnIndBilancioAzInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndBrevettiAzBrInf != null : "fx:id=\"btnIndBrevettiAzBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndAppaltiAzBrInf != null : "fx:id=\"btnIndAppaltiAzBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndProgettiAzBrinf != null : "fx:id=\"btnIndProgettiAzBrinf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndProdottiAzBrInf != null : "fx:id=\"btnIndProdottiAzBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndArticoliAzBrInf != null : "fx:id=\"btnIndArticoliAzBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnIndNewsAzBrInf != null : "fx:id=\"btnIndNewsAzBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnTornaClassificaBrInf != null : "fx:id=\"btnTornaClassificaBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert cbxAltraAziendaBrInf != null : "fx:id=\"cbxAltraAziendaBrInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblCap != null : "fx:id=\"lblCap\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblPIVAInf != null : "fx:id=\"lblPIVAInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblIndirizzo != null : "fx:id=\"lblIndirizzo\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblProvincia != null : "fx:id=\"lblProvincia\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblRegione != null : "fx:id=\"lblRegione\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblCodAtecoInf != null : "fx:id=\"lblCodAtecoInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblStartUp != null : "fx:id=\"lblStartUp\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblDescrAz != null : "fx:id=\"lblDescrAz\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblAppHold != null : "fx:id=\"lblAppHold\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblTelefono != null : "fx:id=\"lblTelefono\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert lblSitoWeb != null : "fx:id=\"lblSitoWeb\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtPivaInf != null : "fx:id=\"txtPivaInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtIndirizzo != null : "fx:id=\"txtIndirizzo\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtCap != null : "fx:id=\"txtCap\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtProvincia != null : "fx:id=\"txtProvincia\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtRegione != null : "fx:id=\"txtRegione\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtCodatecInf != null : "fx:id=\"txtCodatecInf\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtStartUp != null : "fx:id=\"txtStartUp\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtAppHold != null : "fx:id=\"txtAppHold\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtTele != null : "fx:id=\"txtTele\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtDescrAzie != null : "fx:id=\"txtDescrAzie\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert txtSitoWeb != null : "fx:id=\"txtSitoWeb\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnFacebook != null : "fx:id=\"btnFacebook\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnTwitter != null : "fx:id=\"btnTwitter\" was not injected: check your FXML file 'Info_Azienda.fxml'.";
	        assert btnLinkdin != null : "fx:id=\"btnLinkdin\" was not injected: check your FXML file 'Info_Azienda.fxml'.";

	    }
	
}
