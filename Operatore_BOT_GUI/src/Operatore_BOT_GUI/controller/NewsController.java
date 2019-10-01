package Operatore_BOT_GUI.controller;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.News;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NewsController {

	    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaangAzAr"
    private ImageView imgComparaangAzAr; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaCompNws"
    private Label lblAziendaCompNws; // Value injected by FXMLLoader

    @FXML // fx:id="cmbNews"
    private ComboBox<News> cmbNews; // Value injected by FXMLLoader

    @FXML // fx:id="btninfoAzNws"
    private Button btninfoAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilancioAzNws"
    private Button btnIndBilancioAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBrevettiAzNws"
    private Button btnIndBrevettiAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndAppaltiAzNws"
    private Button btnIndAppaltiAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProgettiAzNws"
    private Button btnIndProgettiAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProdottiAzNws"
    private Button btnIndProdottiAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnArticNws"
    private Button btnArticNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNewsAzNws"
    private Button btnIndNewsAzNws; // Value injected by FXMLLoader

    @FXML // fx:id="btnTornaClassificaNws"
    private Button btnTornaClassificaNws; // Value injected by FXMLLoader

    @FXML // fx:id="cmbAltraAziendaNws"
    private ComboBox<Azienda> cmbAltraAziendaNws; // Value injected by FXMLLoader

    @FXML // fx:id="lblTitNws"
    private Label lblTitNws; // Value injected by FXMLLoader

    @FXML // fx:id="lblDataNws"
    private Label lblDataNws; // Value injected by FXMLLoader

    @FXML // fx:id="lblAbstNws"
    private Label lblAbstNws; // Value injected by FXMLLoader

    @FXML // fx:id="lblFonteNws"
    private Label lblFonteNws; // Value injected by FXMLLoader

    @FXML // fx:id="lblKeywordsNws"
    private Label lblKeywordsNws; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppNumero"
    private TextField txtAppNumero; // Value injected by FXMLLoader

    @FXML // fx:id="txtFamilyID"
    private TextField txtFamilyID; // Value injected by FXMLLoader

    @FXML // fx:id="txtTit"
    private TextField txtTit; // Value injected by FXMLLoader

    @FXML // fx:id="txtAbstractNws"
    private TextArea txtAbstractNws; // Value injected by FXMLLoader

    @FXML // fx:id="txtFonteNws"
    private TextField txtFonteNws; // Value injected by FXMLLoader

    @FXML // fx:id="txtKeywordNws"
    private TextField txtKeywordNws; // Value injected by FXMLLoader

    @FXML // fx:id="txtDataNws"
    private TextField txtDataNws; // Value injected by FXMLLoader

    @FXML // fx:id="txtTitoloNws"
    private TextField txtTitoloNws; // Value injected by FXMLLoader
    
    Model model;
    News newsSel;
    
    public void setModel(Model model) {
    	this.model = model;
    	Azienda aziendaSel = model.getAziendaSelezionata();
    	lblAziendaCompNws.setText(aziendaSel.toString());
    	List<News> newsList = this.model.getNewsAzienda(aziendaSel);
    	cmbNews.getItems().addAll(newsList);
    	cmbNews.getItems().add(0, null);
    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
    	cmbAltraAziendaNws.getItems().addAll(altreAz);
    	cmbAltraAziendaNws.getItems().add(0, null);
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
    	model.setAziendaSelezionata(cmbAltraAziendaNws.getValue());
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
    void doEstraiAziendeNws(ActionEvent event) {
    	this.newsSel = cmbNews.getValue();
    	
    	txtTitoloNws.setText(newsSel.getTitolo());
    	txtDataNws.setText(newsSel.getDataPubblicazione());
    	txtAbstractNws.setText(newsSel.getAbstractNews());
    	txtKeywordNws.setText(newsSel.getKeywords());
    	txtFonteNws.setText(newsSel.getFonte());

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
    void doEstraiNews(ActionEvent event) {

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
        assert imgComparaangAzAr != null : "fx:id=\"imgComparaangAzAr\" was not injected: check your FXML file 'News.fxml'.";
        assert lblAziendaCompNws != null : "fx:id=\"lblAziendaCompNws\" was not injected: check your FXML file 'News.fxml'.";
        assert cmbNews != null : "fx:id=\"cmbNews\" was not injected: check your FXML file 'News.fxml'.";
        assert btninfoAzNws != null : "fx:id=\"btninfoAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndBilancioAzNws != null : "fx:id=\"btnIndBilancioAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndBrevettiAzNws != null : "fx:id=\"btnIndBrevettiAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndAppaltiAzNws != null : "fx:id=\"btnIndAppaltiAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndProgettiAzNws != null : "fx:id=\"btnIndProgettiAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndProdottiAzNws != null : "fx:id=\"btnIndProdottiAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnArticNws != null : "fx:id=\"btnArticNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnIndNewsAzNws != null : "fx:id=\"btnIndNewsAzNws\" was not injected: check your FXML file 'News.fxml'.";
        assert btnTornaClassificaNws != null : "fx:id=\"btnTornaClassificaNws\" was not injected: check your FXML file 'News.fxml'.";
        assert cmbAltraAziendaNws != null : "fx:id=\"cmbAltraAziendaNws\" was not injected: check your FXML file 'News.fxml'.";
        assert lblTitNws != null : "fx:id=\"lblTitNws\" was not injected: check your FXML file 'News.fxml'.";
        assert lblDataNws != null : "fx:id=\"lblDataNws\" was not injected: check your FXML file 'News.fxml'.";
        assert lblAbstNws != null : "fx:id=\"lblAbstNws\" was not injected: check your FXML file 'News.fxml'.";
        assert lblFonteNws != null : "fx:id=\"lblFonteNws\" was not injected: check your FXML file 'News.fxml'.";
        assert lblKeywordsNws != null : "fx:id=\"lblKeywordsNws\" was not injected: check your FXML file 'News.fxml'.";
        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'News.fxml'.";
        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'News.fxml'.";
        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'News.fxml'.";
        assert txtAbstractNws != null : "fx:id=\"txtAbstractNws\" was not injected: check your FXML file 'News.fxml'.";
        assert txtFonteNws != null : "fx:id=\"txtFonteNws\" was not injected: check your FXML file 'News.fxml'.";
        assert txtKeywordNws != null : "fx:id=\"txtKeywordNws\" was not injected: check your FXML file 'News.fxml'.";
        assert txtDataNws != null : "fx:id=\"txtDataNws\" was not injected: check your FXML file 'News.fxml'.";
        assert txtTitoloNws != null : "fx:id=\"txtTitoloNws\" was not injected: check your FXML file 'News.fxml'.";

    }
}
