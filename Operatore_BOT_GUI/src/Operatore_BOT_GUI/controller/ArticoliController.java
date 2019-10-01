package Operatore_BOT_GUI.controller;

	import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import com.kennycason.kumo.WordFrequency;

import javafx.scene.control.Hyperlink;
import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.WordCloudGenerator;
import javafx.embed.swing.SwingFXUtils;
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
	
	

		public class ArticoliController {
			
		    @FXML // ResourceBundle that was given to the FXMLLoader
		    private ResourceBundle resources;

		    @FXML // URL location of the FXML file that was given to the FXMLLoader
		    private URL location;

		    @FXML // fx:id="imgComparaangAzAr"
		    private ImageView imgComparaangAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="lblAziendaCompArt"
		    private Label lblAziendaCompArt; // Value injected by FXMLLoader

		    @FXML // fx:id="cmbArticoli"
		    private ComboBox<Articolo> cmbArticoli; // Value injected by FXMLLoader

		    @FXML // fx:id="btninfoAzArt"
		    private Button btninfoAzArt; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndBilancioAzAr"
		    private Button btnIndBilancioAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndBrevettiAzAr"
		    private Button btnIndBrevettiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndAppaltiAzAr"
		    private Button btnIndAppaltiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndProgettiAzAr"
		    private Button btnIndProgettiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndProdottiAzAr"
		    private Button btnIndProdottiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnArticArt"
		    private Button btnArticArt; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndNewsAzAr"
		    private Button btnIndNewsAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnTornaClassificaAr"
		    private Button btnTornaClassificaAr; // Value injected by FXMLLoader

		    @FXML // fx:id="cmbAltraAziendaAr"
		    private ComboBox<Azienda> cmbAltraAziendaAr; // Value injected by FXMLLoader

		    @FXML // fx:id="lblLinkArt"
		    private Label lblLinkArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblBackArt"
		    private Label lblBackArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblTestoArt"
		    private Label lblTestoArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblDataArticolo"
		    private Label lblDataArticolo; // Value injected by FXMLLoader

		    @FXML // fx:id="lblKeywordsAr"
		    private Label lblKeywordsAr; // Value injected by FXMLLoader

		    @FXML // fx:id="txtAppNumero"
		    private TextField txtAppNumero; // Value injected by FXMLLoader

		    @FXML // fx:id="txtFamilyID"
		    private TextField txtFamilyID; // Value injected by FXMLLoader

		    @FXML // fx:id="txtTit"
		    private TextField txtTit; // Value injected by FXMLLoader

		    @FXML // fx:id="txtTestoArt"
		    private TextArea txtTestoArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtDataArt"
		    private TextField txtDataArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtKeywordArt"
		    private TextField txtKeywordArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtBackArti"
		    private TextField txtBackArti; // Value injected by FXMLLoader

		    @FXML // fx:id="txtLinkArt"
		    private TextField txtLinkArt; // Value injected by FXMLLoader
		    
		    @FXML // fx:id="imgKeyAr"
		    private ImageView imgKeyAr; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr1"
		    private Hyperlink hypKeyAr1; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr2"
		    private Hyperlink hypKeyAr2; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr3"
		    private Hyperlink hypKeyAr3; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr4"
		    private Hyperlink hypKeyAr4; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr5"
		    private Hyperlink hypKeyAr5; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr6"
		    private Hyperlink hypKeyAr6; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr7"
		    private Hyperlink hypKeyAr7; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr8"
		    private Hyperlink hypKeyAr8; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr9"
		    private Hyperlink hypKeyAr9; // Value injected by FXMLLoader

		    @FXML // fx:id="hypKeyAr10"
		    private Hyperlink hypKeyAr10; // Value injected by FXMLLoader

		    Model model;
		    private Articolo articolo = new Articolo();
		    Azienda aziendaSel;
		    
		    public void setModel(Model model) {
		    	this.model = model;
		    	aziendaSel = model.getAziendaSelezionata();
		    	List<Articolo> articoli = this .model.getArticoliAzienda(aziendaSel);
		    	cmbArticoli.getItems().addAll(articoli);
		    	cmbArticoli.getItems().add(0, null);
		    	lblAziendaCompArt.setText(aziendaSel.toString());
		    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
		    	cmbAltraAziendaAr.getItems().addAll(altreAz);
		    	cmbAltraAziendaAr.getItems().add(0, null);
		    }
		    
		    @FXML
		    void doApriaListaAziende(ActionEvent event) throws IOException {
		    	model.setAziendaSelezionata(cmbAltraAziendaAr.getValue());
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
//		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Articoli.fxml"));
//				ScrollPane root = (ScrollPane)loader.load();
//				ArticoliController controller = loader.getController();
//				controller.setModel(model);
//		    	
//				Scene goToHome = new Scene(root);
//		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		    	newStage.setScene(goToHome);
//		    	newStage.show();
		    }

		    @FXML
		    void doEstraiAziendeArtic(ActionEvent event) {
		    	this.articolo = cmbArticoli.getValue();

		    	WordCloudGenerator gen = new WordCloudGenerator (articolo.getText());
		    	BufferedImage buff = gen.generateCloud();
		    	
		    	this.imgKeyAr.setImage(SwingFXUtils.toFXImage(buff, null));
		    	
		    	List<WordFrequency> frequencies = gen.getFrequencies();
		    	Collections.sort(frequencies);
		    	
		    	hypKeyAr1.setText(frequencies.get(0).getWord());
		    	hypKeyAr2.setText(frequencies.get(1).getWord());
		    	hypKeyAr3.setText(frequencies.get(2).getWord());
		    	hypKeyAr4.setText(frequencies.get(3).getWord());
		    	hypKeyAr5.setText(frequencies.get(4).getWord());
		    	hypKeyAr6.setText(frequencies.get(5).getWord());
		    	hypKeyAr7.setText(frequencies.get(6).getWord());
		    	hypKeyAr8.setText(frequencies.get(7).getWord());
		    	hypKeyAr9.setText(frequencies.get(8).getWord());
		    	hypKeyAr10.setText(frequencies.get(9).getWord());
		    	
		    	txtLinkArt.setText(articolo.getLink());
		    	txtBackArti.setText(articolo.getBacklink());
		    	txtTestoArt.setText(articolo.getText());
		    	txtKeywordArt.setText(articolo.getKeywordsAsString());
		    	txtDataArt.setText(articolo.getDate());

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

		    @FXML
		    void doOpenLInkAr(ActionEvent event) {
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
		        assert imgComparaangAzAr != null : "fx:id=\"imgComparaangAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblAziendaCompArt != null : "fx:id=\"lblAziendaCompArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert cmbArticoli != null : "fx:id=\"cmbArticoli\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btninfoAzArt != null : "fx:id=\"btninfoAzArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndBilancioAzAr != null : "fx:id=\"btnIndBilancioAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndBrevettiAzAr != null : "fx:id=\"btnIndBrevettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndAppaltiAzAr != null : "fx:id=\"btnIndAppaltiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndProgettiAzAr != null : "fx:id=\"btnIndProgettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndProdottiAzAr != null : "fx:id=\"btnIndProdottiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnArticArt != null : "fx:id=\"btnArticArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndNewsAzAr != null : "fx:id=\"btnIndNewsAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnTornaClassificaAr != null : "fx:id=\"btnTornaClassificaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert cmbAltraAziendaAr != null : "fx:id=\"cmbAltraAziendaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblLinkArt != null : "fx:id=\"lblLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblBackArt != null : "fx:id=\"lblBackArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblTestoArt != null : "fx:id=\"lblTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblDataArticolo != null : "fx:id=\"lblDataArticolo\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblKeywordsAr != null : "fx:id=\"lblKeywordsAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtTestoArt != null : "fx:id=\"txtTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtDataArt != null : "fx:id=\"txtDataArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtKeywordArt != null : "fx:id=\"txtKeywordArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtBackArti != null : "fx:id=\"txtBackArti\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtLinkArt != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr1 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr2 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr3 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr4 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr5 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr6 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr7 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr8 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr9 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert hypKeyAr10 != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert imgKeyAr != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        
		    }
		}
