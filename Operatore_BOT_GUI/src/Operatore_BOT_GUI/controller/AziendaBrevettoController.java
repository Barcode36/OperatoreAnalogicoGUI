package Operatore_BOT_GUI.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.kennycason.kumo.WordFrequency;

import javafx.scene.control.Hyperlink;
import Operatore_BOT_GUI.model.Appalto;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Brevetto;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.WordCloudGenerator;
import javafx.embed.swing.SwingFXUtils;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AziendaBrevettoController {
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaangAz"
    private ImageView imgComparaangAz; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaCompAz"
    private Label lblAziendaCompAz; // Value injected by FXMLLoader

    @FXML // fx:id="cmbAziendeBrevetto"
    private ComboBox<Brevetto> cmbAziendeBrevetto; // Value injected by FXMLLoader

    @FXML // fx:id="btnInfoAzBre"
    private Button btnInfoAzBre; // Value injected by FXMLLoader
    
    @FXML // fx:id="imgKeyBr"
    private ImageView imgKeyBr; // Value injected by FXMLLoader
    
    @FXML // fx:id="lbl10keyw"
    private Label lbl10keyw; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey1"
    private Hyperlink hypKey1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey2"
    private Hyperlink hypKey2; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey3"
    private Hyperlink hypKey3; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey4"
    private Hyperlink hypKey4; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey5"
    private Hyperlink hypKey5; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey6"
    private Hyperlink hypKey6; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey7"
    private Hyperlink hypKey7; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey8"
    private Hyperlink hypKey8; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey9"
    private Hyperlink hypKey9; // Value injected by FXMLLoader

    @FXML // fx:id="hypKey10"
    private Hyperlink hypKey10; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilancioAzBr"
    private Button btnIndBilancioAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnBrevettiBrv"
    private Button btnBrevettiBrv; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndAppaltiAzBr"
    private Button btnIndAppaltiAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProgettiAzBr"
    private Button btnIndProgettiAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProdottiAzBr"
    private Button btnIndProdottiAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndArticoliAzBr"
    private Button btnIndArticoliAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNewsAzBr"
    private Button btnIndNewsAzBr; // Value injected by FXMLLoader

    @FXML // fx:id="btnTornaClassificaBr"
    private Button btnTornaClassificaBr; // Value injected by FXMLLoader

    @FXML // fx:id="cbxAltraAziendaBr"
    private ComboBox<Azienda> cmbAltraAziendaBr; // Value injected by FXMLLoader

    @FXML // fx:id="lblAppNumber"
    private Label lblAppNumber; // Value injected by FXMLLoader

    @FXML // fx:id="lblFamiId"
    private Label lblFamiId; // Value injected by FXMLLoader

    @FXML // fx:id="lblTitolo"
    private Label lblTitolo; // Value injected by FXMLLoader

    @FXML // fx:id="lblAssegnatario"
    private Label lblAssegnatario; // Value injected by FXMLLoader

    @FXML // fx:id="lblInventori"
    private Label lblInventori; // Value injected by FXMLLoader

    @FXML // fx:id="lblData"
    private Label lblData; // Value injected by FXMLLoader

    @FXML // fx:id="lblDescrizione"
    private Label lblDescrizione; // Value injected by FXMLLoader

    @FXML // fx:id="lblCodClass"
    private Label lblCodClass; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppNumero"
    private TextField txtAppNumero; // Value injected by FXMLLoader

    @FXML // fx:id="txtFamilyID"
    private TextField txtFamilyID; // Value injected by FXMLLoader

    @FXML // fx:id="txtTit"
    private TextField txtTit; // Value injected by FXMLLoader

    @FXML // fx:id="txtAssegnee"
    private TextField txtAssegnee; // Value injected by FXMLLoader

    @FXML // fx:id="txtInve"
    private TextField txtInve; // Value injected by FXMLLoader

    @FXML // fx:id="txtDate"
    private TextField txtDate; // Value injected by FXMLLoader

    @FXML // fx:id="txtDescription"
    private TextArea txtDescription; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodiceClass"
    private TextField txtCodiceClass; // Value injected by FXMLLoader

    Model model;
    private Brevetto brevetto = new Brevetto();
    Azienda aziendaSel;
    
    public void setModel(Model model) {
    	this.model = model;
    	aziendaSel = model.getAziendaSelezionata();
    	List<Brevetto> brevetti = this.model.getBrevettiAzienda(aziendaSel);
    	cmbAziendeBrevetto.getItems().addAll(brevetti);
    	cmbAziendeBrevetto.getItems().add(0, null);
    	lblAziendaCompAz.setText(aziendaSel.toString());    	
    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
    	cmbAltraAziendaBr.getItems().addAll(altreAz);
    	cmbAltraAziendaBr.getItems().add(0, null);
    }
    @FXML
    void doApriaListaAziende(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(cmbAltraAziendaBr.getValue());
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
    void doEstraiAppalti(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doEstraiBrevetti(ActionEvent event) {
    

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
    void doEstraiNews(ActionEvent event)throws IOException {
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
    void doListaBrevettAz(ActionEvent event) {
    	this.brevetto = cmbAziendeBrevetto.getValue();
    	
    	WordCloudGenerator gen = new WordCloudGenerator (brevetto.getAbstractBrevetto());
    	BufferedImage buff = gen.generateCloud();
    	
    	this.imgKeyBr.setImage(SwingFXUtils.toFXImage(buff, null));    	
    	
    	txtAppNumero.setText(brevetto.getAppNumber());
    	txtFamilyID.setText(brevetto.getFamilyID());
    	txtTit.setText(brevetto.getTitolo());
    	txtAssegnee.setText(brevetto.getAssegnatario());
    	txtInve.setText(brevetto.getInventori());
    	txtDate.setText(brevetto.getData());
    	txtDescription.setText(brevetto.getAbstractBrevetto());
    	txtCodiceClass.setText(brevetto.getCodClass());
    	

    	List<WordFrequency> frequencies = gen.getFrequencies();    	
    	if (frequencies.size() == 0) return;
    	
    	Collections.sort(frequencies);
    	
    	hypKey1.setText(frequencies.get(0).getWord());
    	hypKey2.setText(frequencies.get(1).getWord());
    	hypKey3.setText(frequencies.get(2).getWord());
    	hypKey4.setText(frequencies.get(3).getWord());
    	hypKey5.setText(frequencies.get(4).getWord());
    	hypKey6.setText(frequencies.get(5).getWord());
    	hypKey7.setText(frequencies.get(6).getWord());
    	hypKey8.setText(frequencies.get(7).getWord());
    	hypKey9.setText(frequencies.get(8).getWord());
    	hypKey10.setText(frequencies.get(9).getWord());
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

    @FXML
    void doOpenLink(ActionEvent event) {
    	Hyperlink hyperword = (Hyperlink) event.getSource();
    	String word = hyperword.getText();
    	
    	//model.setAziendaSelezionata(model.getAzienda());
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("KeywordCorrelation.fxml"));
		ScrollPane root = null;
		try {
			root = (ScrollPane)loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KeywordCorrelationController controller = loader.getController();
		controller.setModel(model);
		controller.setKeyword(word);
    	
		Scene goToHome = new Scene(root);
    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	newStage.setScene(goToHome);
    	newStage.show();
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert imgComparaangAz != null : "fx:id=\"imgComparaangAz\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblAziendaCompAz != null : "fx:id=\"lblAziendaCompAz\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert cmbAziendeBrevetto != null : "fx:id=\"cmbAziendeBrevetto\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnInfoAzBre != null : "fx:id=\"btnInfoAzBre\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndBilancioAzBr != null : "fx:id=\"btnIndBilancioAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnBrevettiBrv != null : "fx:id=\"btnBrevettiBrv\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndAppaltiAzBr != null : "fx:id=\"btnIndAppaltiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndProgettiAzBr != null : "fx:id=\"btnIndProgettiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndProdottiAzBr != null : "fx:id=\"btnIndProdottiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndArticoliAzBr != null : "fx:id=\"btnIndArticoliAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnIndNewsAzBr != null : "fx:id=\"btnIndNewsAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert btnTornaClassificaBr != null : "fx:id=\"btnTornaClassificaBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert cmbAltraAziendaBr != null : "fx:id=\"cmbAltraAziendaBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblAppNumber != null : "fx:id=\"lblAppNumber\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblFamiId != null : "fx:id=\"lblFamiId\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblTitolo != null : "fx:id=\"lblTitolo\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblAssegnatario != null : "fx:id=\"lblAssegnatario\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblInventori != null : "fx:id=\"lblInventori\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblData != null : "fx:id=\"lblData\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblDescrizione != null : "fx:id=\"lblDescrizione\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert lblCodClass != null : "fx:id=\"lblCodClass\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtAssegnee != null : "fx:id=\"txtAssegnee\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtInve != null : "fx:id=\"txtInve\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtDate != null : "fx:id=\"txtDate\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtDescription != null : "fx:id=\"txtDescription\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
        assert txtCodiceClass != null : "fx:id=\"txtCodiceClass\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";

    }
}
