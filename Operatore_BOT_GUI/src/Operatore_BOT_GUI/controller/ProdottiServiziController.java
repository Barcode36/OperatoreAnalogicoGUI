package Operatore_BOT_GUI.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.ProdottoServizio;
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

public class ProdottiServiziController {
	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaangAzPreSer"
    private ImageView imgComparaangAzPreSer; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaCompPreSer"
    private Label lblAziendaCompPreSer; // Value injected by FXMLLoader

    @FXML // fx:id="cmbScegliProdotti1"
    private ComboBox<ProdottoServizio> cmbScegliProdotti1; // Value injected by FXMLLoader

    @FXML // fx:id="btnInfoAzPreSe"
    private Button btnInfoAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilancioAzPreSe"
    private Button btnIndBilancioAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBrevettiAzPreSe"
    private Button btnIndBrevettiAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndAppaltiAzPreSe"
    private Button btnIndAppaltiAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProgettiAzPreSe"
    private Button btnIndProgettiAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnProdottiPr"
    private Button btnProdottiPr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndArticoliAzPreSe"
    private Button btnIndArticoliAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNewsAzPreSe"
    private Button btnIndNewsAzPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="btnTornaClassificaPreSe"
    private Button btnTornaClassificaPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="cmbAltraAziendaPreSe"
    private ComboBox<Azienda> cmbAltraAziendaPreSe; // Value injected by FXMLLoader

    @FXML // fx:id="lblDescrizionePReSe"
    private Label lblDescrizionePReSe; // Value injected by FXMLLoader

    @FXML // fx:id="lblTipoloPr"
    private Label lblTipoloPr; // Value injected by FXMLLoader

    @FXML // fx:id="txtTit"
    private TextField txtTit; // Value injected by FXMLLoader

    @FXML // fx:id="txtDescriPreSer"
    private TextArea txtDescriPreSer; // Value injected by FXMLLoader

    @FXML // fx:id="txtTipolPreSer"
    private TextArea txtTipolPreSer; // Value injected by FXMLLoader
    
    Model model;
    private ProdottoServizio prodServ = new ProdottoServizio();
    Azienda aziendaSel;
    
    public void setModel(Model model) {
    	this.model = model;
    	aziendaSel = model.getAziendaSelezionata();
    	List<ProdottoServizio> prodotti = this .model.getProdottiServizi(aziendaSel);
    	cmbScegliProdotti1.getItems().addAll(prodotti);
    	cmbScegliProdotti1.getItems().add(0, null);
    	lblAziendaCompPreSer.setText(aziendaSel.toString());
    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
    	cmbAltraAziendaPreSe.getItems().addAll(altreAz);
    	cmbAltraAziendaPreSe.getItems().add(0, null);
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
    void doApriListaProdotti(ActionEvent event) {
    	this.prodServ = cmbScegliProdotti1.getValue();
    	txtDescriPreSer.setText(prodServ.getDescrizione());
    	txtTipolPreSer.setText(prodServ.getTipologia());
    }

    @FXML
    void doApriaListaAziende(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(cmbAltraAziendaPreSe.getValue());
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
        assert imgComparaangAzPreSer != null : "fx:id=\"imgComparaangAzPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert lblAziendaCompPreSer != null : "fx:id=\"lblAziendaCompPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert cmbScegliProdotti1 != null : "fx:id=\"cmbScegliProdotti1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnInfoAzPreSe != null : "fx:id=\"btnInfoAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndBilancioAzPreSe != null : "fx:id=\"btnIndBilancioAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndBrevettiAzPreSe != null : "fx:id=\"btnIndBrevettiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndAppaltiAzPreSe != null : "fx:id=\"btnIndAppaltiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndProgettiAzPreSe != null : "fx:id=\"btnIndProgettiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnProdottiPr != null : "fx:id=\"btnProdottiPr\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndArticoliAzPreSe != null : "fx:id=\"btnIndArticoliAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnIndNewsAzPreSe != null : "fx:id=\"btnIndNewsAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert btnTornaClassificaPreSe != null : "fx:id=\"btnTornaClassificaPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert cmbAltraAziendaPreSe != null : "fx:id=\"cmbAltraAziendaPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert lblDescrizionePReSe != null : "fx:id=\"lblDescrizionePReSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert lblTipoloPr != null : "fx:id=\"lblTipoloPr\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert txtDescriPreSer != null : "fx:id=\"txtDescriPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
        assert txtTipolPreSer != null : "fx:id=\"txtTipolPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";

    }
}
