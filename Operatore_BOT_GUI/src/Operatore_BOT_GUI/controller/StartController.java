package Operatore_BOT_GUI.controller;
/**
 * Sample Skeleton for 'Start.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.*;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StartController {
	private Model model;
	List<Azienda> aziende = new LinkedList<Azienda>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmbAzienda"
    private ComboBox<Azienda> cmbAzienda; // Value injected by FXMLLoader

    @FXML // fx:id="btnCerca"
    private Button btnCerca; // Value injected by FXMLLoader

    public void setModel(Model model) {
    	this.model= model;
    	cmbAzienda.getItems().addAll(this.model.getAziende());
    	cmbAzienda.getItems().add(0, null);
    }
    
    List<Azienda> aziendeCompetitor;

    
    @FXML
    void doBtnCerca(ActionEvent event) throws IOException {
    	model.setAzienda(cmbAzienda.getValue());
    	model.setAziendeCompetitorHome(model.getAziendeMenoSelezionata(cmbAzienda.getValue()));
    	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
		AnchorPane root = (AnchorPane)loader.load();
		HomeController controller = loader.getController();
		controller.setModel(model);
		
//    	Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//    	Scene goToHome = new Scene(parent);
    	Scene goToHome = new Scene(root);
    	Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
    	windowHome.setScene(goToHome);
    	windowHome.show();
    	
    }

    @FXML
    void doCmbAzienda(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmbAzienda != null : "fx:id=\"cmbAzienda\" was not injected: check your FXML file 'Start.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Start.fxml'.";

    }
}
