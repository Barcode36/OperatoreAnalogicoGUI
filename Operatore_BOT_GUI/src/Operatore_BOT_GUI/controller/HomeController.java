package Operatore_BOT_GUI.controller;

import java.io.IOException;

/**
 * Sample Skeleton for 'Home.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.scene.control.ComboBox;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblAzienda"
    private Label lblAzienda; // Value injected by FXMLLoader

    @FXML // fx:id="btnProdotti"
    private Button btnProdotti; // Value injected by FXMLLoader

    @FXML // fx:id="btnNews"
    private Button btnNews; // Value injected by FXMLLoader

    @FXML // fx:id="btnProgetti"
    private Button btnProgetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnBrevetti"
    private Button btnBrevetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnAppalti"
    private Button btnAppalti; // Value injected by FXMLLoader

    @FXML // fx:id="btnBilancio"
    private Button btnBilancio; // Value injected by FXMLLoader
    
    @FXML // fx:id="cmbPesiBil"
    private ComboBox<Integer> cmbPesiBil; // Value injected by FXMLLoader

    @FXML // fx:id="cmbPesiApp"
    private ComboBox<Integer> cmbPesiApp; // Value injected by FXMLLoader

    @FXML // fx:id="cmbPesiPrg"
    private ComboBox<Integer> cmbPesiPrg; // Value injected by FXMLLoader

    @FXML // fx:id="cmbPesiBrv"
    private ComboBox<Integer> cmbPesiBrv; // Value injected by FXMLLoader

    @FXML // fx:id="cmbPesiArt"
    private ComboBox<Integer> cmbPesiArt; // Value injected by FXMLLoader

    @FXML // fx:id="btnArticoli"
    private Button btnArticoli; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor1"
    private Button btnCompetitor1; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara1"
    private Button btnCompara1; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor2"
    private Button btnCompetitor2; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara2"
    private Button btnCompara2; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor3"
    private Button btnCompetitor3; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara3"
    private Button btnCompara3; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor4"
    private Button btnCompetitor4; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara4"
    private Button btnCompara4; // Value injected by FXMLLoader
    
    @FXML
    private Button btnAziendaHome;

    @FXML
    private TextField keywordsField;

    
    private Model model;
    
    List<Azienda> aziende;
    List<Azienda> aziendeCompetitor;
    
    public void setModel(Model model) {
    	this.model = model;
    	Azienda azienda = model.getAzienda();
    	lblAzienda.setText(azienda.toString());
    	
    	this.populateWeights();
    	
    	String[] keywords = this.keywordsField.getText().split(", ");
    	aziendeCompetitor = model.ordineAziende(this.weightsToModel(), keywords);
    	
//    	if(aziendeCompetitor.size()>0) {
//    		btnCompetitor1.setText(aziendeCompetitor.get(0).toString());
//    		if(aziendeCompetitor.size()>1) {
//    			btnCompetitor2.setText(aziendeCompetitor.get(1).toString());
//    			if(aziendeCompetitor.size()>2) {
//    				btnCompetitor3.setText(aziendeCompetitor.get(2).toString());
//    				if(aziendeCompetitor.size()>3) {
//    					btnCompetitor4.setText(aziendeCompetitor.get(3).toString());
//    				}
//    			}
//    		}
//    	}
    	
    	
    	
    }
    
    
    private int[] weightsToModel() {
    	int[] weights = new int[5];
    	
    	weights[0] = this.cmbPesiApp.getValue();
    	weights[1] = this.cmbPesiArt.getValue();
    	weights[2] = this.cmbPesiBil.getValue();
    	weights[3] = this.cmbPesiBrv.getValue();
    	weights[4] = this.cmbPesiPrg.getValue();

    	
    	return weights;
    }
    
    
    private void populateWeights () {
    	ArrayList<Integer> ints = new ArrayList<Integer>();
    	for (int i=1; i<=10; i++) {
    		ints.add(i);
    	}
    	ObservableList<Integer> percentages = FXCollections.observableArrayList(ints);
    	this.cmbPesiApp.setItems(percentages);
    	this.cmbPesiArt.setItems(percentages);
    	this.cmbPesiBil.setItems(percentages);
    	this.cmbPesiBrv.setItems(percentages);
    	this.cmbPesiPrg.setItems(percentages);
    	
    	this.cmbPesiApp.setValue(percentages.get(4));
    	this.cmbPesiArt.setValue(percentages.get(4));
    	this.cmbPesiBil.setValue(percentages.get(4));
    	this.cmbPesiBrv.setValue(percentages.get(4));
    	this.cmbPesiPrg.setValue(percentages.get(4));
    }

    @FXML
    void doAppalti(ActionEvent event) throws IOException {
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
    void doArticoli(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doBilancio(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doBrevetti(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doCompara1(ActionEvent event) throws IOException {
    	
    	Azienda competitor = aziendeCompetitor.get(0);
    	model.setCompetitor(competitor);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Compara.fxml"));
		ScrollPane root = (ScrollPane)loader.load();
		ComparaController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();

    }

    @FXML
    void doCompara2(ActionEvent event) throws IOException {
    	Azienda competitor = aziendeCompetitor.get(1);
    	System.out.println(competitor);
    	
    	model.setCompetitor(competitor);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Compara.fxml"));
		ScrollPane root = (ScrollPane)loader.load();
		ComparaController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();

    }

    @FXML
    void doCompara3(ActionEvent event) throws IOException {
    	Azienda competitor = aziendeCompetitor.get(2);
    	System.out.println(competitor);
    	
    	model.setCompetitor(competitor);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Compara.fxml"));
		ScrollPane root = (ScrollPane)loader.load();
		ComparaController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();

    }

    @FXML
    void doCompara4(ActionEvent event) throws IOException {
    	Azienda competitor = aziendeCompetitor.get(3);
    	System.out.println(competitor);
    	
    	model.setCompetitor(competitor);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Compara.fxml"));
		ScrollPane root = (ScrollPane)loader.load();
		ComparaController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();

    }

    @FXML
    void doCompetitor1(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(aziendeCompetitor.get(0));
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
    void doCompetitor2(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(aziendeCompetitor.get(1));
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
    void doCompetitor3(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(aziendeCompetitor.get(2));
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
    void doCompetitor4(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(aziendeCompetitor.get(3));
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
    void doNews(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doProdotti(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doVaiInfoAzienda(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void doProgetti(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getAzienda());
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
    void goHome(MouseEvent event) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Start.fxml"));
		AnchorPane root = null;
		try {
			root = (AnchorPane)loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	StartController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        assert lblAzienda != null : "fx:id=\"lblAzienda\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnProdotti != null : "fx:id=\"btnProdotti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnNews != null : "fx:id=\"btnNews\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnProgetti != null : "fx:id=\"btnProgetti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnBrevetti != null : "fx:id=\"btnBrevetti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnAppalti != null : "fx:id=\"btnAppalti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnBilancio != null : "fx:id=\"btnBilancio\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnArticoli != null : "fx:id=\"btnArticoli\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor1 != null : "fx:id=\"btnCompetitor1\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara1 != null : "fx:id=\"btnCompara1\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor2 != null : "fx:id=\"btnCompetitor2\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara2 != null : "fx:id=\"btnCompara2\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor3 != null : "fx:id=\"btnCompetitor3\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara3 != null : "fx:id=\"btnCompara3\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor4 != null : "fx:id=\"btnCompetitor4\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara4 != null : "fx:id=\"btnCompara4\" was not injected: check your FXML file 'Home.fxml'.";

    }
}
