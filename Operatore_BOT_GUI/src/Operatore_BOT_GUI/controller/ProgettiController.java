package Operatore_BOT_GUI.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.Progetto;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProgettiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaangAzPj"
    private ImageView imgComparaangAzPj; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaCompAzPj"
    private Label lblAziendaCompAzPj; // Value injected by FXMLLoader

    @FXML // fx:id="cmbScegliProgetto"
    private ComboBox<Progetto> cmbScegliProgetto; // Value injected by FXMLLoader

    @FXML // fx:id="btnInfoAzPr"
    private Button btnInfoAzPr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilancioAzPj"
    private Button btnIndBilancioAzPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBrevettiAzBrPj"
    private Button btnIndBrevettiAzBrPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndAppaltiAzBrPj"
    private Button btnIndAppaltiAzBrPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnProgettiPr"
    private Button btnProgettiPr; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProdottiAzBrPj"
    private Button btnIndProdottiAzBrPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndArticoliAzBrPj"
    private Button btnIndArticoliAzBrPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNewsAzPj"
    private Button btnIndNewsAzPj; // Value injected by FXMLLoader

    @FXML // fx:id="btnTornaClassificaPj"
    private Button btnTornaClassificaPj; // Value injected by FXMLLoader

    @FXML // fx:id="cmbAltraAziendaPj"
    private ComboBox<Azienda> cmbAltraAziendaPj; // Value injected by FXMLLoader

    @FXML // fx:id="lblFunding"
    private GridPane lblFunding; // Value injected by FXMLLoader

    @FXML // fx:id="lblProjectRcn"
    private Label lblProjectRcn; // Value injected by FXMLLoader

    @FXML // fx:id="lblStatus"
    private Label lblStatus; // Value injected by FXMLLoader

    @FXML // fx:id="lblProgramme"
    private Label lblProgramme; // Value injected by FXMLLoader

    @FXML // fx:id="lblStartDate"
    private Label lblStartDate; // Value injected by FXMLLoader

    @FXML // fx:id="lblEndDate"
    private Label lblEndDate; // Value injected by FXMLLoader

    @FXML // fx:id="lblObjective"
    private Label lblObjective; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalCostPj"
    private Label lblTotalCostPj; // Value injected by FXMLLoader

    @FXML // fx:id="lblEuropeanContr"
    private Label lblEuropeanContr; // Value injected by FXMLLoader

    @FXML // fx:id="lblEuropeanTotal"
    private Label lblEuropeanTotal; // Value injected by FXMLLoader

    @FXML // fx:id="lblEmail"
    private Label lblEmail; // Value injected by FXMLLoader

    @FXML // fx:id="lblCoordinator"
    private Label lblCoordinator; // Value injected by FXMLLoader

    @FXML // fx:id="lblOther"
    private Label lblOther; // Value injected by FXMLLoader

    @FXML // fx:id="txtProRcn"
    private TextField txtProRcn; // Value injected by FXMLLoader

    @FXML // fx:id="txtStatus"
    private TextField txtStatus; // Value injected by FXMLLoader

    @FXML // fx:id="txtProgrammr"
    private TextField txtProgrammr; // Value injected by FXMLLoader

    @FXML // fx:id="txtStartDate"
    private TextField txtStartDate; // Value injected by FXMLLoader

    @FXML // fx:id="txtEndDate"
    private TextField txtEndDate; // Value injected by FXMLLoader

    @FXML // fx:id="txtTotCostPj"
    private TextField txtTotCostPj; // Value injected by FXMLLoader

    @FXML // fx:id="txtEurTotal"
    private TextField txtEurTotal; // Value injected by FXMLLoader

    @FXML // fx:id="txtFundingScheme"
    private TextField txtFundingScheme; // Value injected by FXMLLoader

    @FXML // fx:id="txtCoordinator"
    private TextField txtCoordinator; // Value injected by FXMLLoader

    @FXML // fx:id="txtOther"
    private TextField txtOther; // Value injected by FXMLLoader

    @FXML // fx:id="txtEuContr"
    private TextField txtEuContr; // Value injected by FXMLLoader

    @FXML // fx:id="txtObjective"
    private TextArea txtObjective; // Value injected by FXMLLoader

    @FXML
    void Inf(MouseEvent event) {

    }

    @FXML
    void Pj(MouseEvent event) {

    }
    
    Model model;
    private Progetto progetto = new Progetto();
    Azienda aziendaSel;
    
    public void setModel(Model model) {
    	this.model = model;
    	aziendaSel = model.getAziendaSelezionata();
    	List<Progetto> progetti = this .model.getProgettiAzienda(aziendaSel);
    	cmbScegliProgetto.getItems().addAll(progetti);
    	cmbScegliProgetto.getItems().add(0, null);
    	lblAziendaCompAzPj.setText(aziendaSel.toString());
    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
    	cmbAltraAziendaPj.getItems().addAll(altreAz);
    	cmbAltraAziendaPj.getItems().add(0, null);
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
    void doApriLink(ActionEvent event) {

    }

    @FXML
    void doApriListaProgetti(ActionEvent event) {
    	this.progetto = cmbScegliProgetto.getValue();
    	
    	txtProRcn.setText(progetto.getProjectRCN());
    	txtStatus.setText(progetto.getStatus());
    	txtProgrammr.setText(progetto.getProgramme());
    	txtStartDate.setText(progetto.getStartDate());
    	txtEndDate.setText(progetto.getEndDate());
    	txtObjective.setText(progetto.getObjective());
    	txtTotCostPj.setText(String.valueOf(progetto.getTotalCost()));
    	txtEuContr.setText(String.valueOf(progetto.getEcContribution()));
    	txtEurTotal.setText(String.valueOf(progetto.getEcContributionTotal()));
    	txtFundingScheme.setText(progetto.getFundingScheme());
    	Boolean coordin = progetto.isCoordinator();
    	String coor = coordin.toString();
    	txtCoordinator.setText(coor);
    	txtOther.setText(progetto.getOtherParticipants());
    	
    }

    @FXML
    void doApriaListaAziende(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(cmbAltraAziendaPj.getValue());
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
        assert imgComparaangAzPj != null : "fx:id=\"imgComparaangAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblAziendaCompAzPj != null : "fx:id=\"lblAziendaCompAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert cmbScegliProgetto != null : "fx:id=\"cmbScegliProgetto\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnInfoAzPr != null : "fx:id=\"btnInfoAzPr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndBilancioAzPj != null : "fx:id=\"btnIndBilancioAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndBrevettiAzBrPj != null : "fx:id=\"btnIndBrevettiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndAppaltiAzBrPj != null : "fx:id=\"btnIndAppaltiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnProgettiPr != null : "fx:id=\"btnProgettiPr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndProdottiAzBrPj != null : "fx:id=\"btnIndProdottiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndArticoliAzBrPj != null : "fx:id=\"btnIndArticoliAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnIndNewsAzPj != null : "fx:id=\"btnIndNewsAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert btnTornaClassificaPj != null : "fx:id=\"btnTornaClassificaPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert cmbAltraAziendaPj != null : "fx:id=\"cmbAltraAziendaPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblFunding != null : "fx:id=\"lblFunding\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblProjectRcn != null : "fx:id=\"lblProjectRcn\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblProgramme != null : "fx:id=\"lblProgramme\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblStartDate != null : "fx:id=\"lblStartDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblEndDate != null : "fx:id=\"lblEndDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblObjective != null : "fx:id=\"lblObjective\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblTotalCostPj != null : "fx:id=\"lblTotalCostPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblEuropeanContr != null : "fx:id=\"lblEuropeanContr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblEuropeanTotal != null : "fx:id=\"lblEuropeanTotal\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblCoordinator != null : "fx:id=\"lblCoordinator\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert lblOther != null : "fx:id=\"lblOther\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtProRcn != null : "fx:id=\"txtProRcn\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtStatus != null : "fx:id=\"txtStatus\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtProgrammr != null : "fx:id=\"txtProgrammr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtStartDate != null : "fx:id=\"txtStartDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtEndDate != null : "fx:id=\"txtEndDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtTotCostPj != null : "fx:id=\"txtTotCostPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtEurTotal != null : "fx:id=\"txtEurTotal\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtFundingScheme != null : "fx:id=\"txtFundingScheme\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtCoordinator != null : "fx:id=\"txtCoordinator\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtOther != null : "fx:id=\"txtOther\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtEuContr != null : "fx:id=\"txtEuContr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
        assert txtObjective != null : "fx:id=\"txtObjective\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";

    }
}
