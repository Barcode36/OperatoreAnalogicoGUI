package Operatore_BOT_GUI.controller;



import java.awt.Image;
import java.io.IOException;

/**
 * Sample Skeleton for 'Compara.fxml' Controller Class
 */

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.control.Hyperlink;
import Operatore_BOT_GUI.model.Appalto;
import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Bilancio;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.Progetto;
import Operatore_BOT_GUI.model.SpiderChart;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ComparaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgComparaang"
    private ImageView imgComparaang; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBilanc"
    private Button btnIndBilanc; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProgetti"
    private Button btnIndProgetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndAppalti"
    private Button btnIndAppalti; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndBrevetti"
    private Button btnIndBrevetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndProdotti"
    private Button btnIndProdotti; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndArticoli"
    private Button btnIndArticoli; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndNews"
    private Button btnIndNews; // Value injected by FXMLLoader

    @FXML // fx:id="lblAziendaComp"
    private Label lblAziendaComp; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitorComp"
    private Button btnCompetitorComp; // Value injected by FXMLLoader

    @FXML // fx:id="lblIdAnno"
    private Label lblIdAnno; // Value injected by FXMLLoader

    @FXML // fx:id="lblRicavi"
    private Label lblRicavi; // Value injected by FXMLLoader

    @FXML // fx:id="lblMol"
    private Label lblMol; // Value injected by FXMLLoader

    @FXML // fx:id="lblValoreAggiunto"
    private Label lblValoreAggiunto; // Value injected by FXMLLoader

    @FXML // fx:id="lblRO"
    private Label lblRO; // Value injected by FXMLLoader

    @FXML // fx:id="lblRE"
    private Label lblRE; // Value injected by FXMLLoader

    @FXML // fx:id="lblCCN"
    private Label lblCCN; // Value injected by FXMLLoader

    @FXML // fx:id="lblKN"
    private Label lblKN; // Value injected by FXMLLoader

    @FXML // fx:id="lblROI"
    private Label lblROI; // Value injected by FXMLLoader

    @FXML // fx:id="lblROE"
    private Label lblROE; // Value injected by FXMLLoader

    @FXML // fx:id="lblROS"
    private Label lblROS; // Value injected by FXMLLoader

    @FXML // fx:id="lblGIV"
    private Label lblGIV; // Value injected by FXMLLoader

    @FXML // fx:id="lblLevFin"
    private Label lblLevFin; // Value injected by FXMLLoader

    @FXML // fx:id="lblLevOper"
    private Label lblLevOper; // Value injected by FXMLLoader

    @FXML // fx:id="lblLeverage"
    private Label lblLeverage; // Value injected by FXMLLoader

    @FXML // fx:id="lblMSP"
    private Label lblMSP; // Value injected by FXMLLoader

    @FXML // fx:id="lblMSS"
    private Label lblMSS; // Value injected by FXMLLoader

    @FXML // fx:id="lblCurrentRatio"
    private Label lblCurrentRatio; // Value injected by FXMLLoader

    @FXML // fx:id="lblAcidTest"
    private Label lblAcidTest; // Value injected by FXMLLoader

    @FXML // fx:id="lblIndLiqui"
    private Label lblIndLiqui; // Value injected by FXMLLoader

    @FXML // fx:id="lblInvRD"
    private Label lblInvRD; // Value injected by FXMLLoader

    @FXML // fx:id="lblDebVsBanche"
    private Label lblDebVsBanche; // Value injected by FXMLLoader

    @FXML // fx:id="lblOnFin"
    private Label lblOnFin; // Value injected by FXMLLoader

    @FXML // fx:id="lblRicAddet"
    private Label lblRicAddet; // Value injected by FXMLLoader

    @FXML // fx:id="lblVaAddetto"
    private Label lblVaAddetto; // Value injected by FXMLLoader

    @FXML // fx:id="lblReAddetto"
    private Label lblReAddetto; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostAddetto"
    private Label lblCostAddetto; // Value injected by FXMLLoader

    @FXML // fx:id="lblDurMedDeb"
    private Label lblDurMedDeb; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato16"
    private TextField txtfatturato16; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA16"
    private TextField txtVA16; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL16"
    private TextField txtMOL16; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO16"
    private TextField txtRO16; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE16"
    private TextField txtRE16; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN16"
    private TextField txtCCN16; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN16"
    private TextField txtKN16; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI16"
    private TextField txtROI16; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE16"
    private TextField txtROE16; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS16"
    private TextField txtROS16; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV16"
    private TextField txtGIV16; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin16"
    private TextField txtLevFin16; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp16"
    private TextField txtLevOp16; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage16"
    private TextField txtLeverage16; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP16"
    private TextField txtMSP16; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS16"
    private TextField txtMSS16; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio16"
    private TextField txtCurrentRatio16; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest16"
    private TextField txtAcidTest16; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita16"
    private TextField txtIndLiquidita16; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev16"
    private TextField txtIndIndebBrev16; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche16"
    private TextField txtDebBanche16; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin16"
    private TextField txtOnFin16; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto16"
    private TextField txtRicAddetto16; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto16"
    private TextField txtRisEsercAddeto16; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto16"
    private TextField txtValAggAddeto16; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto16"
    private TextField txtCostAddetto16; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti16"
    private TextField txtDurataMedCrediti16; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti16"
    private TextField txtDurataMedDebiti16; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD16"
    private TextField txtInvestimentiRD16; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato17"
    private TextField txtfatturato17; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA17"
    private TextField txtVA17; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL17"
    private TextField txtMOL17; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO17"
    private TextField txtRO17; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE17"
    private TextField txtRE17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN17"
    private TextField txtCCN17; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN17"
    private TextField txtKN17; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI17"
    private TextField txtROI17; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE17"
    private TextField txtROE17; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS17"
    private TextField txtROS17; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV17"
    private TextField txtGIV17; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin17"
    private TextField txtLevFin17; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp17"
    private TextField txtLevOp17; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage17"
    private TextField txtLeverage17; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP17"
    private TextField txtMSP17; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS17"
    private TextField txtMSS17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio17"
    private TextField txtCurrentRatio17; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest17"
    private TextField txtAcidTest17; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita17"
    private TextField txtIndLiquidita17; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev17"
    private TextField txtIndIndebBrev17; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato18"
    private TextField txtfatturato18; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA18"
    private TextField txtVA18; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL18"
    private TextField txtMOL18; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO18"
    private TextField txtRO18; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE18"
    private TextField txtRE18; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN18"
    private TextField txtCCN18; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN18"
    private TextField txtKN18; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI18"
    private TextField txtROI18; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE18"
    private TextField txtROE18; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS18"
    private TextField txtROS18; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV18"
    private TextField txtGIV18; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin18"
    private TextField txtLevFin18; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche17"
    private TextField txtDebBanche17; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin17"
    private TextField txtOnFin17; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp18"
    private TextField txtLevOp18; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP18"
    private TextField txtMSP18; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS18"
    private TextField txtMSS18; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto17"
    private TextField txtRicAddetto17; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto17"
    private TextField txtRisEsercAddeto17; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto17"
    private TextField txtValAggAddeto17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto17"
    private TextField txtCostAddetto17; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti17"
    private TextField txtDurataMedCrediti17; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti17"
    private TextField txtDurataMedDebiti17; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD17"
    private TextField txtInvestimentiRD17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio18"
    private TextField txtCurrentRatio18; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest18"
    private TextField txtAcidTest18; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita18"
    private TextField txtIndLiquidita18; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev18"
    private TextField txtIndIndebBrev18; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche18"
    private TextField txtDebBanche18; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin18"
    private TextField txtOnFin18; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto18"
    private TextField txtRicAddetto18; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto18"
    private TextField txtRisEsercAddeto18; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto18"
    private TextField txtValAggAddeto18; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto18"
    private TextField txtCostAddetto18; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti18"
    private TextField txtDurataMedCrediti18; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti18"
    private TextField txtDurataMedDebiti18; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD18"
    private TextField txtInvestimentiRD18; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage18"
    private TextField txtLeverage18; // Value injected by FXMLLoader

    @FXML // fx:id="lblIdAnno1"
    private Label lblIdAnno1; // Value injected by FXMLLoader

    @FXML // fx:id="lblRicavi1"
    private Label lblRicavi1; // Value injected by FXMLLoader

    @FXML // fx:id="lblMol1"
    private Label lblMol1; // Value injected by FXMLLoader

    @FXML // fx:id="lblValoreAggiunto1"
    private Label lblValoreAggiunto1; // Value injected by FXMLLoader

    @FXML // fx:id="lblRO1"
    private Label lblRO1; // Value injected by FXMLLoader

    @FXML // fx:id="lblRE1"
    private Label lblRE1; // Value injected by FXMLLoader

    @FXML // fx:id="lblCCN1"
    private Label lblCCN1; // Value injected by FXMLLoader

    @FXML // fx:id="lblKN1"
    private Label lblKN1; // Value injected by FXMLLoader

    @FXML // fx:id="lblROI1"
    private Label lblROI1; // Value injected by FXMLLoader

    @FXML // fx:id="lblROE1"
    private Label lblROE1; // Value injected by FXMLLoader

    @FXML // fx:id="lblROS1"
    private Label lblROS1; // Value injected by FXMLLoader

    @FXML // fx:id="lblGIV1"
    private Label lblGIV1; // Value injected by FXMLLoader

    @FXML // fx:id="lblLevFin1"
    private Label lblLevFin1; // Value injected by FXMLLoader

    @FXML // fx:id="lblLevOper1"
    private Label lblLevOper1; // Value injected by FXMLLoader

    @FXML // fx:id="lblLeverage1"
    private Label lblLeverage1; // Value injected by FXMLLoader

    @FXML // fx:id="lblMSP1"
    private Label lblMSP1; // Value injected by FXMLLoader

    @FXML // fx:id="lblMSS1"
    private Label lblMSS1; // Value injected by FXMLLoader

    @FXML // fx:id="lblCurrentRatio1"
    private Label lblCurrentRatio1; // Value injected by FXMLLoader

    @FXML // fx:id="lblAcidTest1"
    private Label lblAcidTest1; // Value injected by FXMLLoader

    @FXML // fx:id="lblIndLiqui1"
    private Label lblIndLiqui1; // Value injected by FXMLLoader

    @FXML // fx:id="lblDebVsBanche1"
    private Label lblDebVsBanche1; // Value injected by FXMLLoader

    @FXML // fx:id="lblOnFin1"
    private Label lblOnFin1; // Value injected by FXMLLoader

    @FXML // fx:id="lblRicAddet1"
    private Label lblRicAddet1; // Value injected by FXMLLoader

    @FXML // fx:id="lblVaAddetto1"
    private Label lblVaAddetto1; // Value injected by FXMLLoader

    @FXML // fx:id="lblReAddetto1"
    private Label lblReAddetto1; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostAddetto1"
    private Label lblCostAddetto1; // Value injected by FXMLLoader

    @FXML // fx:id="lblDurMedDeb1"
    private Label lblDurMedDeb1; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato161"
    private TextField txtfatturato161; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA161"
    private TextField txtVA161; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL161"
    private TextField txtMOL161; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO161"
    private TextField txtRO161; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE161"
    private TextField txtRE161; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN161"
    private TextField txtCCN161; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN161"
    private TextField txtKN161; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI161"
    private TextField txtROI161; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE161"
    private TextField txtROE161; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS161"
    private TextField txtROS161; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV161"
    private TextField txtGIV161; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin161"
    private TextField txtLevFin161; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp161"
    private TextField txtLevOp161; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage161"
    private TextField txtLeverage161; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP161"
    private TextField txtMSP161; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS161"
    private TextField txtMSS161; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio161"
    private TextField txtCurrentRatio161; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest161"
    private TextField txtAcidTest161; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita161"
    private TextField txtIndLiquidita161; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev161"
    private TextField txtIndIndebBrev161; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche161"
    private TextField txtDebBanche161; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin161"
    private TextField txtOnFin161; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto161"
    private TextField txtRicAddetto161; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto161"
    private TextField txtRisEsercAddeto161; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto161"
    private TextField txtValAggAddeto161; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto161"
    private TextField txtCostAddetto161; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti161"
    private TextField txtDurataMedCrediti161; // Value injected by FXMLLoader

    @FXML // fx:id="lblInvRD1"
    private Label lblInvRD1; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti161"
    private TextField txtDurataMedDebiti161; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD161"
    private TextField txtInvestimentiRD161; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato171"
    private TextField txtfatturato171; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA171"
    private TextField txtVA171; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL171"
    private TextField txtMOL171; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO171"
    private TextField txtRO171; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE171"
    private TextField txtRE171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN171"
    private TextField txtCCN171; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN171"
    private TextField txtKN171; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI171"
    private TextField txtROI171; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE171"
    private TextField txtROE171; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS171"
    private TextField txtROS171; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV171"
    private TextField txtGIV171; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin171"
    private TextField txtLevFin171; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp171"
    private TextField txtLevOp171; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage171"
    private TextField txtLeverage171; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP171"
    private TextField txtMSP171; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS171"
    private TextField txtMSS171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio171"
    private TextField txtCurrentRatio171; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest171"
    private TextField txtAcidTest171; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita171"
    private TextField txtIndLiquidita171; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev171"
    private TextField txtIndIndebBrev171; // Value injected by FXMLLoader

    @FXML // fx:id="txtfatturato181"
    private TextField txtfatturato181; // Value injected by FXMLLoader

    @FXML // fx:id="txtVA181"
    private TextField txtVA181; // Value injected by FXMLLoader

    @FXML // fx:id="txtMOL181"
    private TextField txtMOL181; // Value injected by FXMLLoader

    @FXML // fx:id="txtRO181"
    private TextField txtRO181; // Value injected by FXMLLoader

    @FXML // fx:id="txtRE181"
    private TextField txtRE181; // Value injected by FXMLLoader

    @FXML // fx:id="txtCCN181"
    private TextField txtCCN181; // Value injected by FXMLLoader

    @FXML // fx:id="txtKN181"
    private TextField txtKN181; // Value injected by FXMLLoader

    @FXML // fx:id="txtROI181"
    private TextField txtROI181; // Value injected by FXMLLoader

    @FXML // fx:id="txtROE181"
    private TextField txtROE181; // Value injected by FXMLLoader

    @FXML // fx:id="txtROS181"
    private TextField txtROS181; // Value injected by FXMLLoader

    @FXML // fx:id="txtGIV181"
    private TextField txtGIV181; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevFin181"
    private TextField txtLevFin181; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche171"
    private TextField txtDebBanche171; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin171"
    private TextField txtOnFin171; // Value injected by FXMLLoader

    @FXML // fx:id="txtLevOp181"
    private TextField txtLevOp181; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSP181"
    private TextField txtMSP181; // Value injected by FXMLLoader

    @FXML // fx:id="txtMSS181"
    private TextField txtMSS181; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto171"
    private TextField txtRicAddetto171; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto171"
    private TextField txtRisEsercAddeto171; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto171"
    private TextField txtValAggAddeto171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto171"
    private TextField txtCostAddetto171; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti171"
    private TextField txtDurataMedCrediti171; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti171"
    private TextField txtDurataMedDebiti171; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD171"
    private TextField txtInvestimentiRD171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrentRatio181"
    private TextField txtCurrentRatio181; // Value injected by FXMLLoader

    @FXML // fx:id="txtAcidTest181"
    private TextField txtAcidTest181; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndLiquidita181"
    private TextField txtIndLiquidita181; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndIndebBrev181"
    private TextField txtIndIndebBrev181; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebBanche181"
    private TextField txtDebBanche181; // Value injected by FXMLLoader

    @FXML // fx:id="txtOnFin181"
    private TextField txtOnFin181; // Value injected by FXMLLoader

    @FXML // fx:id="txtRicAddetto181"
    private TextField txtRicAddetto181; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisEsercAddeto181"
    private TextField txtRisEsercAddeto181; // Value injected by FXMLLoader

    @FXML // fx:id="txtValAggAddeto181"
    private TextField txtValAggAddeto181; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostAddetto181"
    private TextField txtCostAddetto181; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedCrediti181"
    private TextField txtDurataMedCrediti181; // Value injected by FXMLLoader

    @FXML // fx:id="txtDurataMedDebiti181"
    private TextField txtDurataMedDebiti181; // Value injected by FXMLLoader

    @FXML // fx:id="txtInvestimentiRD181"
    private TextField txtInvestimentiRD181; // Value injected by FXMLLoader

    @FXML // fx:id="txtLeverage181"
    private TextField txtLeverage181; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnnoAppalti"
    private Label lblAnnoAppalti; // Value injected by FXMLLoader

    @FXML // fx:id="lblAppVinti"
    private Label lblAppVinti; // Value injected by FXMLLoader

    @FXML // fx:id="lblPercAppaVinti"
    private Label lblPercAppaVinti; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotContApp"
    private Label lblTotContApp; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotContInteApp"
    private Label lblTotContInteApp; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppVinti16"
    private TextField txtAppVinti16; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppVinti17"
    private TextField txtAppVinti17; // Value injected by FXMLLoader

    @FXML // fx:id="txtPercAppVinti16"
    private TextField txtPercAppVinti16; // Value injected by FXMLLoader

    @FXML // fx:id="txtPercAppVinti17"
    private TextField txtPercAppVinti17; // Value injected by FXMLLoader

    @FXML // fx:id="txtFattAppalti16"
    private TextField txtFattAppalti16; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorAppaltInter16"
    private TextField txtValorAppaltInter16; // Value injected by FXMLLoader

    @FXML // fx:id="txtFattAppalti17"
    private TextField txtFattAppalti17; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppVinti18"
    private TextField txtAppVinti18; // Value injected by FXMLLoader

    @FXML // fx:id="txtPercAppVinti18"
    private TextField txtPercAppVinti18; // Value injected by FXMLLoader

    @FXML // fx:id="txtFattAppalti18"
    private TextField txtFattAppalti18; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorAppaltInter17"
    private TextField txtValorAppaltInter17; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorAppaltInter18"
    private TextField txtValorAppaltInter18; // Value injected by FXMLLoader

    @FXML // fx:id="txtAppVinti161"
    private TextField txtAppVinti161; // Value injected by FXMLLoader

    @FXML // fx:id="AppVinti171"
    private TextField txtAppVinti171; // Value injected by FXMLLoader

    @FXML // fx:id="PercAppVinti161"
    private TextField txtPercAppVinti161; // Value injected by FXMLLoader

    @FXML // fx:id="PercAppVinti171"
    private TextField txtPercAppVinti171; // Value injected by FXMLLoader

    @FXML // fx:id="FattAppalti161"
    private TextField txtFattAppalti161; // Value injected by FXMLLoader

    @FXML // fx:id="ValorAppaltInter161"
    private TextField txtValorAppaltInter161; // Value injected by FXMLLoader

    @FXML // fx:id="FattAppalti171"
    private TextField txtFattAppalti171; // Value injected by FXMLLoader

    @FXML // fx:id="AppVinti181"
    private TextField txtAppVinti181; // Value injected by FXMLLoader

    @FXML // fx:id="PercAppVinti181"
    private TextField txtPercAppVinti181; // Value injected by FXMLLoader

    @FXML // fx:id="FattAppalti181"
    private TextField txtFattAppalti181; // Value injected by FXMLLoader

    @FXML // fx:id="ValorAppaltInter171"
    private TextField txtValorAppaltInter171; // Value injected by FXMLLoader

    @FXML // fx:id="ValorAppaltInter181"
    private TextField txtValorAppaltInter181; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnnoProgett"
    private Label lblAnnoProgett; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostoTotProg"
    private Label lblCostoTotProg; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumProgett"
    private Label lblNumProgett; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostoTotProgRilievo"
    private Label lblCostoTotProgRilievo; // Value injected by FXMLLoader

    @FXML // fx:id="lblContrUE"
    private Label lblContrUE; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg16"
    private TextField txtCostTotProg16; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg17"
    private TextField txtCostTotProg17; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg16"
    private TextField txtNumProg16; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg17"
    private TextField txtNumProg17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile16"
    private TextField txtCostTotRile16; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE16"
    private TextField txtContributoUE16; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile17"
    private TextField txtCostTotRile17; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg18"
    private TextField txtCostTotProg18; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg18"
    private TextField txtNumProg18; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile18"
    private TextField txtCostTotRile18; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE17"
    private TextField txtContributoUE17; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE18"
    private TextField txtContributoUE18; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnnoProgett1"
    private Label lblAnnoProgett1; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostoTotProg1"
    private Label lblCostoTotProg1; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumProgett1"
    private Label lblNumProgett1; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostoTotProgRilievo1"
    private Label lblCostoTotProgRilievo1; // Value injected by FXMLLoader

    @FXML // fx:id="lblContrUE1"
    private Label lblContrUE1; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg161"
    private TextField txtCostTotProg161; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg171"
    private TextField txtCostTotProg171; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg161"
    private TextField txtNumProg161; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg171"
    private TextField txtNumProg171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile161"
    private TextField txtCostTotRile161; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE161"
    private TextField txtContributoUE161; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile171"
    private TextField txtCostTotRile171; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotProg181"
    private TextField txtCostTotProg181; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumProg181"
    private TextField txtNumProg181; // Value injected by FXMLLoader

    @FXML // fx:id="txtCostTotRile181"
    private TextField txtCostTotRile181; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE171"
    private TextField txtContributoUE171; // Value injected by FXMLLoader

    @FXML // fx:id="txtContributoUE181"
    private TextField txtContributoUE181; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumBack"
    private Label lblNumBack; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumBack"
    private TextField txtNumBack; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC1"
    private Hyperlink hypKeyC1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC2"
    private Hyperlink hypKeyC2; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC3"
    private Hyperlink hypKeyC3; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC4"
    private Hyperlink hypKeyC4; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC5"
    private Hyperlink hypKeyC5; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC6"
    private Hyperlink hypKeyC6; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC7"
    private Hyperlink hypKeyC7; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC8"
    private Hyperlink hypKeyC8; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC9"
    private Hyperlink hypKeyC9; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyC10"
    private Hyperlink hypKeyC10; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumBack1"
    private Label lblNumBack1; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumBack1"
    private TextField txtNumBack1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc1"
    private Hyperlink hypKeyCc1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc2"
    private Hyperlink hypKeyCc2; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc3"
    private Hyperlink hypKeyCc3; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc4"
    private Hyperlink hypKeyCc4; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc5"
    private Hyperlink hypKeyCc5; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc6"
    private Hyperlink hypKeyCc6; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc7"
    private Hyperlink hypKeyCc7; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc8"
    private Hyperlink hypKeyCc8; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc9"
    private Hyperlink hypKeyCc9; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCc10"
    private Hyperlink hypKeyCc10; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumArtRil1"
    private Label lblNumArtRil1; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumArtRil1"
    private TextField txtNumArtRil1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa1"
    private Hyperlink hypKeyCa1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa2"
    private Hyperlink hypKeyCa2; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa3"
    private Hyperlink hypKeyCa3; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa4"
    private Hyperlink hypKeyCa4; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa5"
    private Hyperlink hypKeyCa5; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa6"
    private Hyperlink hypKeyCa6; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa7"
    private Hyperlink hypKeyCa7; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa8"
    private Hyperlink hypKeyCa8; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa9"
    private Hyperlink hypKeyCa9; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCa10"
    private Hyperlink hypKeyCa10; // Value injected by FXMLLoader

    @FXML // fx:id="lblNumArtRil"
    private Label lblNumArtRil; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumArtRil"
    private TextField txtNumArtRil; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac1"
    private Hyperlink hypKeyCac1; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac2"
    private Hyperlink hypKeyCac2; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac3"
    private Hyperlink hypKeyCac3; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac4"
    private Hyperlink hypKeyCac4; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac5"
    private Hyperlink hypKeyCac5; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac6"
    private Hyperlink hypKeyCac6; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac7"
    private Hyperlink hypKeyCac7; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac8"
    private Hyperlink hypKeyCac8; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac9"
    private Hyperlink hypKeyCac9; // Value injected by FXMLLoader

    @FXML // fx:id="hypKeyCac10"
    private Hyperlink hypKeyCac10; // Value injected by FXMLLoader
    
    @FXML
    private ImageView chart1;

    @FXML
    private ImageView chart2;
    
    Model model;

    
    /*
     * Il metodo set setta come devono essere compilati i campi all'apertura della scena "Compara"
     */
    public void setModel(Model model) {
    	this.model = model;
    	Azienda azienda = model.getAzienda();
    	Azienda competitor = model.getCompetitor();
    	
    	
    	Bilancio bilancioAz2016 = model.getBilancioAziendaAnno(azienda, 2016);
    	Bilancio bilancioAz2017 = model.getBilancioAziendaAnno(azienda, 2017);
    	Bilancio bilancioAz2018 = model.getBilancioAziendaAnno(azienda, 2018);

    	Bilancio bilancioComp2016 = model.getBilancioAziendaAnno(competitor, 2016);
  	    Bilancio bilancioComp2017 = model.getBilancioAziendaAnno(competitor, 2017);
	  	Bilancio bilancioComp2018 = model.getBilancioAziendaAnno(competitor, 2018);

    	
    	lblAziendaComp.setText(azienda.getNomeAzienda());
    	btnCompetitorComp.setText(competitor.getNomeAzienda());
    	
        /*
         * Il blocco seguente compila la scena "Compara" con i dati del bilancio
         */
    	txtfatturato16.setText(String.valueOf(bilancioAz2016.getRicavi()));
    	txtVA16.setText(String.valueOf(bilancioAz2016.getValoreAggiunto()));
    	txtMOL16.setText(String.valueOf(bilancioAz2016.getMOL()));
    	txtRO16.setText(String.valueOf(bilancioAz2016.getRedditoOperativo()));
    	txtRE16.setText(String.valueOf(bilancioAz2016.getRisultatoEsercizio()));
    	txtCCN16.setText(String.valueOf(bilancioAz2016.getCapitaleCircNetto()));
    	txtKN16.setText(String.valueOf(bilancioAz2016.getPatrimonioNetto()));
    	txtROI16.setText(String.valueOf(bilancioAz2016.getROI()));
    	txtROE16.setText(String.valueOf(bilancioAz2016.getROE()));
    	txtROS16.setText(String.valueOf(bilancioAz2016.getROS()));
    	txtGIV16.setText(String.valueOf(bilancioAz2016.getGIV()));
    	txtLevFin16.setText(String.valueOf(bilancioAz2016.getLevaFinanziaria()));
    	txtLevOp16.setText(String.valueOf(bilancioAz2016.getLevaOperativa()));
    	txtLeverage16.setText(String.valueOf(bilancioAz2016.getLeverage()));
    	txtMSP16.setText(String.valueOf(bilancioAz2016.getMargineStrutturaPrimario()));
    	txtMSS16.setText(String.valueOf(bilancioAz2016.getMargineStrutturaSecondario()));
    	txtCurrentRatio16.setText(String.valueOf(bilancioAz2016.getCurrentRatio()));
    	txtAcidTest16.setText(String.valueOf(bilancioAz2016.getAcidTest()));
    	txtIndLiquidita16.setText(String.valueOf(bilancioAz2016.getIndiceLiquidita()));
    	txtIndIndebBrev16.setText(String.valueOf(bilancioAz2016.getIndiceIndebBreve()));
    	txtDebBanche16.setText(String.valueOf(bilancioAz2016.getDebBancheFatturato()));
    	txtOnFin16.setText(String.valueOf(bilancioAz2016.getOfFatturato()));
    	txtRicAddetto16.setText(String.valueOf(bilancioAz2016.getRicaviAddetto()));
    	txtRisEsercAddeto16.setText(String.valueOf(bilancioAz2016.getReAddetto()));
    	txtValAggAddeto16.setText(String.valueOf(bilancioAz2016.getVaAddetto()));
    	txtCostAddetto16.setText(String.valueOf(bilancioAz2016.getCost_lav_addetto()));
   		txtDurataMedCrediti16.setText(String.valueOf(bilancioAz2016.getDurataMediaCrediti()));
   		txtDurataMedDebiti16.setText(String.valueOf(bilancioAz2016.getDurataMediaDebiti()));
   		txtInvestimentiRD16.setText(String.valueOf(bilancioAz2016.getInvestimentiReD()));
   		
   		txtfatturato17.setText(String.valueOf(bilancioAz2017.getRicavi()));
   		txtVA17.setText(String.valueOf(bilancioAz2017.getValoreAggiunto()));
   		txtMOL17.setText(String.valueOf(bilancioAz2017.getMOL()));
   		txtRO17.setText(String.valueOf(bilancioAz2017.getRedditoOperativo()));
   		txtRE17.setText(String.valueOf(bilancioAz2017.getRisultatoEsercizio()));
   		txtCCN17.setText(String.valueOf(bilancioAz2017.getCapitaleCircNetto()));
   		txtKN17.setText(String.valueOf(bilancioAz2017.getPatrimonioNetto()));
   		txtROI17.setText(String.valueOf(bilancioAz2017.getROI()));
   		txtROE17.setText(String.valueOf(bilancioAz2017.getROE()));
   		txtROS17.setText(String.valueOf(bilancioAz2017.getROS()));
   		txtGIV17.setText(String.valueOf(bilancioAz2017.getGIV()));
   		txtLevFin17.setText(String.valueOf(bilancioAz2017.getLevaFinanziaria()));
   		txtLevOp17.setText(String.valueOf(bilancioAz2017.getLevaOperativa()));
   		txtLeverage17.setText(String.valueOf(bilancioAz2017.getLeverage()));
   		txtMSP17.setText(String.valueOf(bilancioAz2017.getMargineStrutturaPrimario()));
   		txtMSS17.setText(String.valueOf(bilancioAz2017.getMargineStrutturaSecondario()));
   		txtCurrentRatio17.setText(String.valueOf(bilancioAz2017.getCurrentRatio()));
   		txtAcidTest17.setText(String.valueOf(bilancioAz2017.getAcidTest()));
   		txtIndLiquidita17.setText(String.valueOf(bilancioAz2017.getIndiceLiquidita()));
   		txtIndIndebBrev17.setText(String.valueOf(bilancioAz2017.getIndiceIndebBreve()));
   		txtDebBanche17.setText(String.valueOf(bilancioAz2017.getDebBancheFatturato()));
   		txtOnFin17.setText(String.valueOf(bilancioAz2017.getOfFatturato()));
   		txtRicAddetto17.setText(String.valueOf(bilancioAz2017.getRicaviAddetto()));
   		txtRisEsercAddeto17.setText(String.valueOf(bilancioAz2017.getReAddetto()));
   		txtValAggAddeto17.setText(String.valueOf(bilancioAz2017.getVaAddetto()));
   		txtCostAddetto17.setText(String.valueOf(bilancioAz2017.getCost_lav_addetto()));
   		txtDurataMedCrediti17.setText(String.valueOf(bilancioAz2017.getDurataMediaCrediti()));
   		txtDurataMedDebiti17.setText(String.valueOf(bilancioAz2017.getDurataMediaDebiti()));
   		txtInvestimentiRD17.setText(String.valueOf(bilancioAz2017.getInvestimentiReD()));
   		
   		txtfatturato18.setText(String.valueOf(bilancioAz2018.getRicavi()));
   		txtVA18.setText(String.valueOf(bilancioAz2018.getValoreAggiunto()));
   		txtMOL18.setText(String.valueOf(bilancioAz2018.getMOL()));
   		txtRO18.setText(String.valueOf(bilancioAz2018.getRedditoOperativo()));
   		txtRE18.setText(String.valueOf(bilancioAz2018.getRisultatoEsercizio()));
   		txtCCN18.setText(String.valueOf(bilancioAz2018.getCapitaleCircNetto()));
   		txtKN18.setText(String.valueOf(bilancioAz2018.getPatrimonioNetto()));
   		txtROI18.setText(String.valueOf(bilancioAz2018.getROI()));
   		txtROE18.setText(String.valueOf(bilancioAz2018.getROE()));
   		txtROS18.setText(String.valueOf(bilancioAz2018.getROS()));
   		txtGIV18.setText(String.valueOf(bilancioAz2018.getGIV()));
   		txtLevFin18.setText(String.valueOf(bilancioAz2018.getLevaFinanziaria()));
   		txtLevOp18.setText(String.valueOf(bilancioAz2018.getLevaOperativa()));
   		txtLeverage18.setText(String.valueOf(bilancioAz2018.getLeverage()));
   		txtMSP18.setText(String.valueOf(bilancioAz2018.getMargineStrutturaPrimario()));
   		txtMSS18.setText(String.valueOf(bilancioAz2018.getMargineStrutturaSecondario()));
   		txtCurrentRatio18.setText(String.valueOf(bilancioAz2018.getCurrentRatio()));
   		txtAcidTest18.setText(String.valueOf(bilancioAz2018.getAcidTest()));
   		txtIndLiquidita18.setText(String.valueOf(bilancioAz2018.getIndiceLiquidita()));
   		txtIndIndebBrev18.setText(String.valueOf(bilancioAz2018.getIndiceIndebBreve()));
   		txtDebBanche18.setText(String.valueOf(bilancioAz2018.getDebBancheFatturato()));
   		txtOnFin18.setText(String.valueOf(bilancioAz2018.getOfFatturato()));
   		txtRicAddetto18.setText(String.valueOf(bilancioAz2018.getRicaviAddetto()));
   		txtRisEsercAddeto18.setText(String.valueOf(bilancioAz2018.getReAddetto()));
   		txtValAggAddeto18.setText(String.valueOf(bilancioAz2018.getVaAddetto()));
   		txtCostAddetto18.setText(String.valueOf(bilancioAz2018.getCost_lav_addetto()));
   		txtDurataMedCrediti18.setText(String.valueOf(bilancioAz2018.getDurataMediaCrediti()));
   		txtDurataMedDebiti18.setText(String.valueOf(bilancioAz2018.getDurataMediaDebiti()));
   		txtInvestimentiRD18.setText(String.valueOf(bilancioAz2018.getInvestimentiReD()));
   		
   		txtfatturato161.setText(String.valueOf(bilancioComp2016.getRicavi()));
   		txtVA161.setText(String.valueOf(bilancioComp2016.getValoreAggiunto()));
   		txtMOL161.setText(String.valueOf(bilancioComp2016.getMOL()));
   		txtRO161.setText(String.valueOf(bilancioComp2016.getRedditoOperativo()));
   		txtRE161.setText(String.valueOf(bilancioComp2016.getRisultatoEsercizio()));
   		txtCCN161.setText(String.valueOf(bilancioComp2016.getCapitaleCircNetto()));
   		txtKN161.setText(String.valueOf(bilancioComp2016.getPatrimonioNetto()));
   		txtROI161.setText(String.valueOf(bilancioComp2016.getROI()));
   		txtROE161.setText(String.valueOf(bilancioComp2016.getROE()));
   		txtROS161.setText(String.valueOf(bilancioComp2016.getROS()));
   		txtGIV161.setText(String.valueOf(bilancioComp2016.getGIV()));
   		txtLevFin161.setText(String.valueOf(bilancioComp2016.getLevaFinanziaria()));
   		txtLevOp161.setText(String.valueOf(bilancioComp2016.getLevaOperativa()));
   		txtLeverage161.setText(String.valueOf(bilancioComp2016.getLeverage()));
   		txtMSP161.setText(String.valueOf(bilancioComp2016.getMargineStrutturaPrimario()));
   		txtMSS161.setText(String.valueOf(bilancioComp2016.getMargineStrutturaSecondario()));
   		txtCurrentRatio161.setText(String.valueOf(bilancioComp2016.getCurrentRatio()));
   		txtAcidTest161.setText(String.valueOf(bilancioComp2016.getAcidTest()));
   		txtIndLiquidita161.setText(String.valueOf(bilancioComp2016.getIndiceLiquidita()));
   		txtIndIndebBrev161.setText(String.valueOf(bilancioComp2016.getIndiceIndebBreve()));
   		txtDebBanche161.setText(String.valueOf(bilancioComp2016.getDebBancheFatturato()));
   		txtOnFin161.setText(String.valueOf(bilancioComp2016.getOfFatturato()));
   		txtRicAddetto161.setText(String.valueOf(bilancioComp2016.getRicaviAddetto()));
   		txtRisEsercAddeto161.setText(String.valueOf(bilancioComp2016.getReAddetto()));
   		txtValAggAddeto161.setText(String.valueOf(bilancioComp2016.getVaAddetto()));
   		txtCostAddetto161.setText(String.valueOf(bilancioComp2016.getCost_lav_addetto()));
   		txtDurataMedCrediti161.setText(String.valueOf(bilancioComp2016.getDurataMediaCrediti()));
   		txtDurataMedDebiti161.setText(String.valueOf(bilancioComp2016.getDurataMediaDebiti()));
   		txtInvestimentiRD161.setText(String.valueOf(bilancioComp2016.getInvestimentiReD()));

   		txtfatturato171.setText(String.valueOf(bilancioComp2017.getRicavi()));
   		txtVA171.setText(String.valueOf(bilancioComp2017.getValoreAggiunto()));
   		txtMOL171.setText(String.valueOf(bilancioComp2017.getMOL()));
   		txtRO171.setText(String.valueOf(bilancioComp2017.getRedditoOperativo()));
   		txtRE171.setText(String.valueOf(bilancioComp2017.getRisultatoEsercizio()));
   		txtCCN171.setText(String.valueOf(bilancioComp2017.getCapitaleCircNetto()));
   		txtKN171.setText(String.valueOf(bilancioComp2017.getPatrimonioNetto()));
   		txtROI171.setText(String.valueOf(bilancioComp2017.getROI()));
   		txtROE171.setText(String.valueOf(bilancioComp2017.getROE()));
   		txtROS171.setText(String.valueOf(bilancioComp2017.getROS()));
   		txtGIV171.setText(String.valueOf(bilancioComp2017.getGIV()));
   		txtLevFin171.setText(String.valueOf(bilancioComp2017.getLevaFinanziaria()));
   		txtLevOp171.setText(String.valueOf(bilancioComp2017.getLevaOperativa()));
   		txtLeverage171.setText(String.valueOf(bilancioComp2017.getLeverage()));
   		txtMSP171.setText(String.valueOf(bilancioComp2017.getMargineStrutturaPrimario()));
   		txtMSS171.setText(String.valueOf(bilancioComp2017.getMargineStrutturaSecondario()));
   		txtCurrentRatio171.setText(String.valueOf(bilancioComp2017.getCurrentRatio()));
   		txtAcidTest171.setText(String.valueOf(bilancioComp2017.getAcidTest()));
   		txtIndLiquidita171.setText(String.valueOf(bilancioComp2017.getIndiceLiquidita()));
   		txtIndIndebBrev171.setText(String.valueOf(bilancioComp2017.getIndiceIndebBreve()));
   		txtDebBanche171.setText(String.valueOf(bilancioComp2017.getDebBancheFatturato()));
   		txtOnFin171.setText(String.valueOf(bilancioComp2017.getOfFatturato()));
   		txtRicAddetto171.setText(String.valueOf(bilancioComp2017.getRicaviAddetto()));
   		txtRisEsercAddeto171.setText(String.valueOf(bilancioComp2017.getReAddetto()));
   		txtValAggAddeto171.setText(String.valueOf(bilancioComp2017.getVaAddetto()));
   		txtCostAddetto171.setText(String.valueOf(bilancioComp2017.getCost_lav_addetto()));
   		txtDurataMedCrediti171.setText(String.valueOf(bilancioComp2017.getDurataMediaCrediti()));
   		txtDurataMedDebiti171.setText(String.valueOf(bilancioComp2017.getDurataMediaDebiti()));
   		txtInvestimentiRD171.setText(String.valueOf(bilancioComp2017.getInvestimentiReD()));
   		
   		txtfatturato181.setText(String.valueOf(bilancioComp2018.getRicavi()));
   		txtVA181.setText(String.valueOf(bilancioComp2018.getValoreAggiunto()));
   		txtMOL181.setText(String.valueOf(bilancioComp2018.getMOL()));
   		txtRO181.setText(String.valueOf(bilancioComp2018.getRedditoOperativo()));
   		txtRE181.setText(String.valueOf(bilancioComp2018.getRisultatoEsercizio()));
   		txtCCN181.setText(String.valueOf(bilancioComp2018.getCapitaleCircNetto()));
   		txtKN181.setText(String.valueOf(bilancioComp2018.getPatrimonioNetto()));
   		txtROI181.setText(String.valueOf(bilancioComp2018.getROI()));
   		txtROE181.setText(String.valueOf(bilancioComp2018.getROE()));
   		txtROS181.setText(String.valueOf(bilancioComp2018.getROS()));
   		txtGIV181.setText(String.valueOf(bilancioComp2018.getGIV()));
   		txtLevFin181.setText(String.valueOf(bilancioComp2018.getLevaFinanziaria()));
   		txtLevOp181.setText(String.valueOf(bilancioComp2018.getLevaOperativa()));
   		txtLeverage181.setText(String.valueOf(bilancioComp2018.getLeverage()));
   		txtMSP181.setText(String.valueOf(bilancioComp2018.getMargineStrutturaPrimario()));
   		txtMSS181.setText(String.valueOf(bilancioComp2018.getMargineStrutturaSecondario()));
   		txtCurrentRatio181.setText(String.valueOf(bilancioComp2018.getCurrentRatio()));
   		txtAcidTest181.setText(String.valueOf(bilancioComp2018.getAcidTest()));
   		txtIndLiquidita181.setText(String.valueOf(bilancioComp2018.getIndiceLiquidita()));
   		txtIndIndebBrev181.setText(String.valueOf(bilancioComp2018.getIndiceIndebBreve()));
   		txtDebBanche181.setText(String.valueOf(bilancioComp2018.getDebBancheFatturato()));
   		txtOnFin181.setText(String.valueOf(bilancioComp2018.getOfFatturato()));
   		txtRicAddetto181.setText(String.valueOf(bilancioComp2018.getRicaviAddetto()));
   		txtRisEsercAddeto181.setText(String.valueOf(bilancioComp2018.getReAddetto()));
   		txtValAggAddeto181.setText(String.valueOf(bilancioComp2018.getVaAddetto()));
   		txtCostAddetto181.setText(String.valueOf(bilancioComp2018.getCost_lav_addetto()));
   		txtDurataMedCrediti181.setText(String.valueOf(bilancioComp2018.getDurataMediaCrediti()));
   		txtDurataMedDebiti181.setText(String.valueOf(bilancioComp2018.getDurataMediaDebiti()));
   		txtInvestimentiRD181.setText(String.valueOf(bilancioComp2018.getInvestimentiReD()));

   		/*
   		 * Il blocco seguente compila la sezione riguardante gli appalti della scena "Compara"
   		 */
   		List<Appalto> appaltiAzienda = model.getAppaltiAzienda(azienda);
   		List<Appalto> appaltiCompetitor = model.getAppaltiAzienda(competitor);
   		
   		int vinti16 = 0;
	   	int vinti17 = 0;
	   	int vinti18 = 0;
	   	int totAzienda16 = 0;
	   	int totAzienda17 = 0;
	   	int totAzienda18 = 0;
	   	double totValoreAzienda16 = 0;
		double totValoreAzienda17 = 0;
		double totValoreAzienda18 = 0;
		double valoreRilievo = 20000;
		int valoreRilievoAzienda16=0;
		int valoreRilievoAzienda17=0;
		int valoreRilievoAzienda18=0;
		
		
   		for (Appalto appalto : appaltiAzienda) {
   			if(appalto.getDataScadenza().endsWith("16") ) {
   				totAzienda16++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					vinti16++;
   					totValoreAzienda16+=appalto.getValoreContratto();
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoAzienda16++;
   					}
   				}
   			}
   			if(appalto.getDataScadenza().endsWith("17") ) {
   				totAzienda17++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					vinti17++;
   					totValoreAzienda17+=appalto.getValoreContratto();
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoAzienda17++;
   					}
   				}
   			}
   			if(appalto.getDataScadenza().endsWith("18")){
   				totAzienda18++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					vinti18++;
   					totValoreAzienda18+=appalto.getValoreContratto();
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoAzienda18++;
   					}
   				}
   			}
   		}
		txtAppVinti16.setText(String.valueOf(vinti16));
		txtAppVinti17.setText(String.valueOf(vinti17));
   		txtAppVinti18.setText(String.valueOf(vinti18));
   		txtPercAppVinti16.setText(String.valueOf((double)vinti16/totAzienda16));
   		txtPercAppVinti17.setText(String.valueOf((double)vinti17/totAzienda17));
   		txtPercAppVinti18.setText(String.valueOf((double)vinti18/totAzienda18));
   		txtFattAppalti16.setText(String.valueOf(totValoreAzienda16));
   		txtFattAppalti17.setText(String.valueOf(totValoreAzienda17));
   		txtFattAppalti18.setText(String.valueOf(totValoreAzienda18));
   		txtValorAppaltInter16.setText(String.valueOf(valoreRilievoAzienda16));
   		txtValorAppaltInter17.setText(String.valueOf(valoreRilievoAzienda17));
   		txtValorAppaltInter18.setText(String.valueOf(valoreRilievoAzienda18));


   		int vintiCompetitor16 = 0;
	   	int vintiCompetitor17 = 0;
	   	int vintiCompetitor18 = 0;
	   	int totCompetitor16 = 0;
	   	int totCompetitor17 = 0;
	   	int totCompetitor18 = 0;
	   	double totValoreCompetitor16 = 0;
		double totValoreCompetitor17 = 0;
		double totValoreCompetitor18 = 0;
		int valoreRilievoCompetitor16=0;
		int valoreRilievoCompetitor17=0;
		int valoreRilievoCompetitor18=0;
		
   		for (Appalto appalto : appaltiCompetitor) {
   			if(appalto.getDataScadenza().endsWith("16") ) {
   				totCompetitor16++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					totValoreCompetitor16+= appalto.getValoreContratto();
   					vintiCompetitor16++;
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoCompetitor16++;
   					}
   				}
   			}
   			if(appalto.getDataScadenza().endsWith("17") ) {
   				totCompetitor17++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					totValoreCompetitor17+= appalto.getValoreContratto();
   					vintiCompetitor17++;
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoCompetitor17++;
   					}
   				}
   			}
   			if(appalto.getDataScadenza().endsWith("18")){
   				totCompetitor18++;
   				if(appalto.getEsito().compareTo("vinto")==0) {
   					totValoreCompetitor18+= appalto.getValoreContratto();
   					vintiCompetitor18++;
   					if(appalto.getValoreContratto()>valoreRilievo) {
   						valoreRilievoCompetitor18++;
   					}
   				}
   			}
   		}
   		txtAppVinti161.setText(String.valueOf(vintiCompetitor16));
   		txtAppVinti171.setText(String.valueOf(vintiCompetitor17));
   		txtAppVinti181.setText(String.valueOf(vintiCompetitor18));
   		txtPercAppVinti161.setText(String.valueOf((double)vintiCompetitor16/totCompetitor16));
   		txtPercAppVinti171.setText(String.valueOf((double)vintiCompetitor17/totCompetitor17));
   		txtPercAppVinti181.setText(String.valueOf((double)vintiCompetitor18/totCompetitor18));
   		txtFattAppalti161.setText(String.valueOf(totValoreCompetitor16));
   		txtFattAppalti171.setText(String.valueOf(totValoreCompetitor17));
   		txtFattAppalti181.setText(String.valueOf(totValoreCompetitor18));
   		txtValorAppaltInter161.setText(String.valueOf(valoreRilievoCompetitor16));
   		txtValorAppaltInter171.setText(String.valueOf(valoreRilievoCompetitor17));
   		txtValorAppaltInter181.setText(String.valueOf(valoreRilievoCompetitor18));
   		
   		
   		/*
   		 * nella sezione seguente viene compilata la parte relativa ai progetti della scena "Compara"
   		 */
    	
   		List<Progetto> progettiAzienda = model.getProgettiAzienda(azienda);
   		List<Progetto> progettiCompetitor = model.getProgettiAzienda(competitor);
   		
   		double totProgettiAz16 = 0;
   		double totProgettiAz17 = 0;
   		double totProgettiAz18 = 0;
   		int numProgAz16 = 0;
   		int numProgAz17 = 0;
   		int numProgAz18 = 0;
   		double progIntAz16 = 0;
   		double progIntAz17 = 0;
   		double progIntAz18 = 0;
   		double valoreRilievoprog = 20000;
   		double contrUEAz16 = 0;
   		double contrUEAz17 = 0;
   		double contrUEAz18 = 0;
   		
   		for (Progetto progetto: progettiAzienda) {
   		
   			if(progetto.getEndDate().endsWith("16") ) {
   				totProgettiAz16+=progetto.getTotalCost();
   				numProgAz16++;
   				contrUEAz16+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntAz16+=progetto.getTotalCost();
   				}
   			}
   			if(progetto.getEndDate().endsWith("17") ) {
   				totProgettiAz17+=progetto.getTotalCost();
   				numProgAz17++;
   				contrUEAz17+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntAz17+=progetto.getTotalCost();
   				}
   			}
   			if(progetto.getEndDate().endsWith("17") ) {
   				totProgettiAz18+=progetto.getTotalCost();
   				numProgAz18++;
   				contrUEAz18+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntAz18+=progetto.getTotalCost();
   				}
   			}
   		}
   		txtCostTotProg16.setText(String.valueOf(totProgettiAz16));
   		txtCostTotProg17.setText(String.valueOf(totProgettiAz17));
   		txtCostTotProg18.setText(String.valueOf(totProgettiAz18));
   		txtNumProg16.setText(String.valueOf(numProgAz16));
   		txtNumProg17.setText(String.valueOf(numProgAz17));
   		txtNumProg18.setText(String.valueOf(numProgAz18));
   		txtCostTotRile16.setText(String.valueOf(progIntAz16));
   		txtCostTotRile17.setText(String.valueOf(progIntAz17));
   		txtCostTotRile18.setText(String.valueOf(progIntAz18));
   		txtContributoUE16.setText(String.valueOf(contrUEAz16));
   		txtContributoUE17.setText(String.valueOf(contrUEAz17));
   		txtContributoUE18.setText(String.valueOf(contrUEAz18));
   		
   		double totProgettiComp16 = 0;
   		double totProgettiComp17 = 0;
   		double totProgettiComp18 = 0;
   		int numProgComp16 = 0;
   		int numProgComp17 = 0;
   		int numProgComp18 = 0;
   		double progIntComp16 = 0;
   		double progIntComp17 = 0;
   		double progIntComp18 = 0;
   		double contrUEComp16 = 0;
   		double contrUEComp17 = 0;
   		double contrUEComp18 = 0;
   		
   		for (Progetto progetto: progettiCompetitor) {
   		
   			if(progetto.getEndDate().endsWith("16") ) {
   				totProgettiComp16+=progetto.getTotalCost();
   				numProgComp16++;
   				contrUEComp16+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntComp16+=progetto.getTotalCost();
   				}
   			}
   			if(progetto.getEndDate().endsWith("17") ) {
   				totProgettiComp17+=progetto.getTotalCost();
   				numProgComp17++;
   				contrUEComp17+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntComp17+=progetto.getTotalCost();
   				}
   			}
   			if(progetto.getEndDate().endsWith("17") ) {
   				totProgettiComp18+=progetto.getTotalCost();
   				numProgComp18++;
   				contrUEComp18+=progetto.getEcContributionTotal();
   				if(progetto.getTotalCost()>valoreRilievoprog) {
   					progIntComp18+=progetto.getTotalCost();
   				}
   			}
   		}
   		txtCostTotProg161.setText(String.valueOf(totProgettiComp16));
   		txtCostTotProg171.setText(String.valueOf(totProgettiComp17));
   		txtCostTotProg181.setText(String.valueOf(totProgettiComp18));
   		txtNumProg161.setText(String.valueOf(numProgComp16));
   		txtNumProg171.setText(String.valueOf(numProgComp17));
   		txtNumProg181.setText(String.valueOf(numProgComp18));
   		txtCostTotRile161.setText(String.valueOf(progIntComp16));
   		txtCostTotRile171.setText(String.valueOf(progIntComp17));
   		txtCostTotRile181.setText(String.valueOf(progIntComp18));
   		txtContributoUE161.setText(String.valueOf(contrUEComp16));
   		txtContributoUE171.setText(String.valueOf(contrUEComp17));
   		txtContributoUE181.setText(String.valueOf(contrUEComp18));
   		
   		/*
   		 * numero backink e articoli
   		 */
   		
   		List<Articolo> articoliAz = model.getArticoliAzienda(azienda);
   		List<Articolo> articoliComp = model.getArticoliAzienda(competitor);
   		
   		int backlinkAz16 = 0;
   		int backlinkAz17 = 0;
   		int backlinkAz18 = 0;
   		for (Articolo art: articoliAz) {
   			if(art.getDate().endsWith("16") ) {
   				backlinkAz16++;
   			}
   			if(art.getDate().endsWith("17") ) {
   				backlinkAz17++;
   			}
   			if(art.getDate().endsWith("18") ) {
   				backlinkAz18++;
   			}
   		}
   		
   		
   		this.drawChart1();
   		this.drawChart2();
   		
    }
    
    
    private void drawChart1 () {
    	
    	String[] labels = {"ROE", "ROI", "Leva Op.", "Leva Fin.", "ROS"};
    	SpiderChart chart = new SpiderChart(labels);
    	float[] values1 = {Float.parseFloat(this.txtROE18.getText()),
    				Float.parseFloat(this.txtROI18.getText()),
    				Float.parseFloat(this.txtLevOp18.getText()),
    				Float.parseFloat(this.txtLevFin18.getText()),
    				Float.parseFloat(this.txtROS18.getText())};
    	float[] values2 = {Float.parseFloat(this.txtROE181.getText()),
				Float.parseFloat(this.txtROI181.getText()),
				Float.parseFloat(this.txtLevOp181.getText()),
				Float.parseFloat(this.txtLevFin181.getText()),
				Float.parseFloat(this.txtROS181.getText())};
    	
    	chart.insertDataSeries(lblAziendaComp.getText(), values1);
    	chart.insertDataSeries(btnCompetitorComp.getText(), values2);
    	
    	this.chart1.setImage(chart.drawChart());
    }
    
private void drawChart2 () {
    	
    	String[] labels = {"Fatturato", "Reddito Op.", "Margine Str. Pr.", "R&D", "Risultato Es."};
    	SpiderChart chart = new SpiderChart(labels);
    	float[] values1 = {Float.parseFloat(this.txtfatturato18.getText()),
    				Float.parseFloat(this.txtRO18.getText()),
    				Float.parseFloat(this.txtMSP18.getText()),
    				Float.parseFloat(this.txtInvestimentiRD18.getText()),
    				Float.parseFloat(this.txtRE18.getText())};
    	float[] values2 = {Float.parseFloat(this.txtfatturato181.getText()),
				Float.parseFloat(this.txtRO181.getText()),
				Float.parseFloat(this.txtMSP181.getText()),
				Float.parseFloat(this.txtInvestimentiRD181.getText()),
				Float.parseFloat(this.txtRE181.getText())};
    	
    	chart.insertDataSeries(lblAziendaComp.getText(), values1);
    	chart.insertDataSeries(btnCompetitorComp.getText(), values2);
    	
    	this.chart2.setImage(chart.drawChart());
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
	
//		Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
//		Scene goToHome = new Scene(parent);
		Scene goToHome = new Scene(root);
		Stage windowHome = (Stage)((Node)event.getSource()).getScene().getWindow();
		windowHome.setScene(goToHome);
		windowHome.show();
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
    void doEstraiBilancio(ActionEvent event) {

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
    void doPgnCompetitor(ActionEvent event) throws IOException {
    	model.setAziendaSelezionata(model.getCompetitor());
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
    void doOpenLinkArC(ActionEvent event) {

    }

    @FXML
    void doOpenLinkArt(ActionEvent event) {

    }

    @FXML
    void doOpenLinkBr(ActionEvent event) {

    }

    @FXML
    void doOpenLinkBrC(ActionEvent event) {

    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert imgComparaang != null : "fx:id=\"imgComparaang\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndBilanc != null : "fx:id=\"btnIndBilanc\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndProgetti != null : "fx:id=\"btnIndProgetti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndAppalti != null : "fx:id=\"btnIndAppalti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndBrevetti != null : "fx:id=\"btnIndBrevetti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndProdotti != null : "fx:id=\"btnIndProdotti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndArticoli != null : "fx:id=\"btnIndArticoli\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnIndNews != null : "fx:id=\"btnIndNews\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAziendaComp != null : "fx:id=\"lblAziendaComp\" was not injected: check your FXML file 'Compara.fxml'.";
        assert btnCompetitorComp != null : "fx:id=\"btnCompetitorComp\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblIdAnno != null : "fx:id=\"lblIdAnno\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRicavi != null : "fx:id=\"lblRicavi\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMol != null : "fx:id=\"lblMol\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblValoreAggiunto != null : "fx:id=\"lblValoreAggiunto\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRO != null : "fx:id=\"lblRO\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRE != null : "fx:id=\"lblRE\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCCN != null : "fx:id=\"lblCCN\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblKN != null : "fx:id=\"lblKN\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROI != null : "fx:id=\"lblROI\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROE != null : "fx:id=\"lblROE\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROS != null : "fx:id=\"lblROS\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblGIV != null : "fx:id=\"lblGIV\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLevFin != null : "fx:id=\"lblLevFin\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLevOper != null : "fx:id=\"lblLevOper\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLeverage != null : "fx:id=\"lblLeverage\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMSP != null : "fx:id=\"lblMSP\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMSS != null : "fx:id=\"lblMSS\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCurrentRatio != null : "fx:id=\"lblCurrentRatio\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAcidTest != null : "fx:id=\"lblAcidTest\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblIndLiqui != null : "fx:id=\"lblIndLiqui\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblInvRD != null : "fx:id=\"lblInvRD\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblDebVsBanche != null : "fx:id=\"lblDebVsBanche\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblOnFin != null : "fx:id=\"lblOnFin\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRicAddet != null : "fx:id=\"lblRicAddet\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblVaAddetto != null : "fx:id=\"lblVaAddetto\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblReAddetto != null : "fx:id=\"lblReAddetto\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostAddetto != null : "fx:id=\"lblCostAddetto\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblDurMedDeb != null : "fx:id=\"lblDurMedDeb\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato16 != null : "fx:id=\"txtfatturato16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA16 != null : "fx:id=\"txtVA16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL16 != null : "fx:id=\"txtMOL16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO16 != null : "fx:id=\"txtRO16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE16 != null : "fx:id=\"txtRE16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN16 != null : "fx:id=\"txtCCN16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN16 != null : "fx:id=\"txtKN16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI16 != null : "fx:id=\"txtROI16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE16 != null : "fx:id=\"txtROE16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS16 != null : "fx:id=\"txtROS16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV16 != null : "fx:id=\"txtGIV16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin16 != null : "fx:id=\"txtLevFin16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp16 != null : "fx:id=\"txtLevOp16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage16 != null : "fx:id=\"txtLeverage16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP16 != null : "fx:id=\"txtMSP16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS16 != null : "fx:id=\"txtMSS16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio16 != null : "fx:id=\"txtCurrentRatio16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest16 != null : "fx:id=\"txtAcidTest16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita16 != null : "fx:id=\"txtIndLiquidita16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev16 != null : "fx:id=\"txtIndIndebBrev16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche16 != null : "fx:id=\"txtDebBanche16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin16 != null : "fx:id=\"txtOnFin16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto16 != null : "fx:id=\"txtRicAddetto16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto16 != null : "fx:id=\"txtRisEsercAddeto16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto16 != null : "fx:id=\"txtValAggAddeto16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto16 != null : "fx:id=\"txtCostAddetto16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti16 != null : "fx:id=\"txtDurataMedCrediti16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti16 != null : "fx:id=\"txtDurataMedDebiti16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD16 != null : "fx:id=\"txtInvestimentiRD16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato17 != null : "fx:id=\"txtfatturato17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA17 != null : "fx:id=\"txtVA17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL17 != null : "fx:id=\"txtMOL17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO17 != null : "fx:id=\"txtRO17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE17 != null : "fx:id=\"txtRE17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN17 != null : "fx:id=\"txtCCN17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN17 != null : "fx:id=\"txtKN17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI17 != null : "fx:id=\"txtROI17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE17 != null : "fx:id=\"txtROE17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS17 != null : "fx:id=\"txtROS17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV17 != null : "fx:id=\"txtGIV17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin17 != null : "fx:id=\"txtLevFin17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp17 != null : "fx:id=\"txtLevOp17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage17 != null : "fx:id=\"txtLeverage17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP17 != null : "fx:id=\"txtMSP17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS17 != null : "fx:id=\"txtMSS17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio17 != null : "fx:id=\"txtCurrentRatio17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest17 != null : "fx:id=\"txtAcidTest17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita17 != null : "fx:id=\"txtIndLiquidita17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev17 != null : "fx:id=\"txtIndIndebBrev17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato18 != null : "fx:id=\"txtfatturato18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA18 != null : "fx:id=\"txtVA18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL18 != null : "fx:id=\"txtMOL18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO18 != null : "fx:id=\"txtRO18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE18 != null : "fx:id=\"txtRE18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN18 != null : "fx:id=\"txtCCN18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN18 != null : "fx:id=\"txtKN18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI18 != null : "fx:id=\"txtROI18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE18 != null : "fx:id=\"txtROE18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS18 != null : "fx:id=\"txtROS18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV18 != null : "fx:id=\"txtGIV18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin18 != null : "fx:id=\"txtLevFin18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche17 != null : "fx:id=\"txtDebBanche17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin17 != null : "fx:id=\"txtOnFin17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp18 != null : "fx:id=\"txtLevOp18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP18 != null : "fx:id=\"txtMSP18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS18 != null : "fx:id=\"txtMSS18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto17 != null : "fx:id=\"txtRicAddetto17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto17 != null : "fx:id=\"txtRisEsercAddeto17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto17 != null : "fx:id=\"txtValAggAddeto17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto17 != null : "fx:id=\"txtCostAddetto17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti17 != null : "fx:id=\"txtDurataMedCrediti17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti17 != null : "fx:id=\"txtDurataMedDebiti17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD17 != null : "fx:id=\"txtInvestimentiRD17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio18 != null : "fx:id=\"txtCurrentRatio18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest18 != null : "fx:id=\"txtAcidTest18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita18 != null : "fx:id=\"txtIndLiquidita18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev18 != null : "fx:id=\"txtIndIndebBrev18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche18 != null : "fx:id=\"txtDebBanche18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin18 != null : "fx:id=\"txtOnFin18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto18 != null : "fx:id=\"txtRicAddetto18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto18 != null : "fx:id=\"txtRisEsercAddeto18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto18 != null : "fx:id=\"txtValAggAddeto18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto18 != null : "fx:id=\"txtCostAddetto18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti18 != null : "fx:id=\"txtDurataMedCrediti18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti18 != null : "fx:id=\"txtDurataMedDebiti18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD18 != null : "fx:id=\"txtInvestimentiRD18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage18 != null : "fx:id=\"txtLeverage18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblIdAnno1 != null : "fx:id=\"lblIdAnno1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRicavi1 != null : "fx:id=\"lblRicavi1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMol1 != null : "fx:id=\"lblMol1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblValoreAggiunto1 != null : "fx:id=\"lblValoreAggiunto1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRO1 != null : "fx:id=\"lblRO1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRE1 != null : "fx:id=\"lblRE1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCCN1 != null : "fx:id=\"lblCCN1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblKN1 != null : "fx:id=\"lblKN1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROI1 != null : "fx:id=\"lblROI1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROE1 != null : "fx:id=\"lblROE1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblROS1 != null : "fx:id=\"lblROS1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblGIV1 != null : "fx:id=\"lblGIV1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLevFin1 != null : "fx:id=\"lblLevFin1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLevOper1 != null : "fx:id=\"lblLevOper1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblLeverage1 != null : "fx:id=\"lblLeverage1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMSP1 != null : "fx:id=\"lblMSP1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblMSS1 != null : "fx:id=\"lblMSS1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCurrentRatio1 != null : "fx:id=\"lblCurrentRatio1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAcidTest1 != null : "fx:id=\"lblAcidTest1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblIndLiqui1 != null : "fx:id=\"lblIndLiqui1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblDebVsBanche1 != null : "fx:id=\"lblDebVsBanche1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblOnFin1 != null : "fx:id=\"lblOnFin1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblRicAddet1 != null : "fx:id=\"lblRicAddet1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblVaAddetto1 != null : "fx:id=\"lblVaAddetto1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblReAddetto1 != null : "fx:id=\"lblReAddetto1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostAddetto1 != null : "fx:id=\"lblCostAddetto1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblDurMedDeb1 != null : "fx:id=\"lblDurMedDeb1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato161 != null : "fx:id=\"txtfatturato161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA161 != null : "fx:id=\"txtVA161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL161 != null : "fx:id=\"txtMOL161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO161 != null : "fx:id=\"txtRO161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE161 != null : "fx:id=\"txtRE161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN161 != null : "fx:id=\"txtCCN161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN161 != null : "fx:id=\"txtKN161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI161 != null : "fx:id=\"txtROI161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE161 != null : "fx:id=\"txtROE161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS161 != null : "fx:id=\"txtROS161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV161 != null : "fx:id=\"txtGIV161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin161 != null : "fx:id=\"txtLevFin161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp161 != null : "fx:id=\"txtLevOp161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage161 != null : "fx:id=\"txtLeverage161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP161 != null : "fx:id=\"txtMSP161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS161 != null : "fx:id=\"txtMSS161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio161 != null : "fx:id=\"txtCurrentRatio161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest161 != null : "fx:id=\"txtAcidTest161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita161 != null : "fx:id=\"txtIndLiquidita161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev161 != null : "fx:id=\"txtIndIndebBrev161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche161 != null : "fx:id=\"txtDebBanche161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin161 != null : "fx:id=\"txtOnFin161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto161 != null : "fx:id=\"txtRicAddetto161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto161 != null : "fx:id=\"txtRisEsercAddeto161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto161 != null : "fx:id=\"txtValAggAddeto161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto161 != null : "fx:id=\"txtCostAddetto161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti161 != null : "fx:id=\"txtDurataMedCrediti161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblInvRD1 != null : "fx:id=\"lblInvRD1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti161 != null : "fx:id=\"txtDurataMedDebiti161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD161 != null : "fx:id=\"txtInvestimentiRD161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato171 != null : "fx:id=\"txtfatturato171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA171 != null : "fx:id=\"txtVA171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL171 != null : "fx:id=\"txtMOL171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO171 != null : "fx:id=\"txtRO171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE171 != null : "fx:id=\"txtRE171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN171 != null : "fx:id=\"txtCCN171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN171 != null : "fx:id=\"txtKN171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI171 != null : "fx:id=\"txtROI171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE171 != null : "fx:id=\"txtROE171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS171 != null : "fx:id=\"txtROS171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV171 != null : "fx:id=\"txtGIV171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin171 != null : "fx:id=\"txtLevFin171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp171 != null : "fx:id=\"txtLevOp171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage171 != null : "fx:id=\"txtLeverage171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP171 != null : "fx:id=\"txtMSP171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS171 != null : "fx:id=\"txtMSS171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio171 != null : "fx:id=\"txtCurrentRatio171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest171 != null : "fx:id=\"txtAcidTest171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita171 != null : "fx:id=\"txtIndLiquidita171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev171 != null : "fx:id=\"txtIndIndebBrev171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtfatturato181 != null : "fx:id=\"txtfatturato181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtVA181 != null : "fx:id=\"txtVA181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMOL181 != null : "fx:id=\"txtMOL181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRO181 != null : "fx:id=\"txtRO181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRE181 != null : "fx:id=\"txtRE181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCCN181 != null : "fx:id=\"txtCCN181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtKN181 != null : "fx:id=\"txtKN181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROI181 != null : "fx:id=\"txtROI181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROE181 != null : "fx:id=\"txtROE181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtROS181 != null : "fx:id=\"txtROS181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtGIV181 != null : "fx:id=\"txtGIV181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevFin181 != null : "fx:id=\"txtLevFin181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche171 != null : "fx:id=\"txtDebBanche171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin171 != null : "fx:id=\"txtOnFin171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLevOp181 != null : "fx:id=\"txtLevOp181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSP181 != null : "fx:id=\"txtMSP181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtMSS181 != null : "fx:id=\"txtMSS181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto171 != null : "fx:id=\"txtRicAddetto171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto171 != null : "fx:id=\"txtRisEsercAddeto171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto171 != null : "fx:id=\"txtValAggAddeto171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto171 != null : "fx:id=\"txtCostAddetto171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti171 != null : "fx:id=\"txtDurataMedCrediti171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti171 != null : "fx:id=\"txtDurataMedDebiti171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD171 != null : "fx:id=\"txtInvestimentiRD171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCurrentRatio181 != null : "fx:id=\"txtCurrentRatio181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAcidTest181 != null : "fx:id=\"txtAcidTest181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndLiquidita181 != null : "fx:id=\"txtIndLiquidita181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtIndIndebBrev181 != null : "fx:id=\"txtIndIndebBrev181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDebBanche181 != null : "fx:id=\"txtDebBanche181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtOnFin181 != null : "fx:id=\"txtOnFin181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRicAddetto181 != null : "fx:id=\"txtRicAddetto181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtRisEsercAddeto181 != null : "fx:id=\"txtRisEsercAddeto181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValAggAddeto181 != null : "fx:id=\"txtValAggAddeto181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostAddetto181 != null : "fx:id=\"txtCostAddetto181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedCrediti181 != null : "fx:id=\"txtDurataMedCrediti181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtDurataMedDebiti181 != null : "fx:id=\"txtDurataMedDebiti181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtInvestimentiRD181 != null : "fx:id=\"txtInvestimentiRD181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtLeverage181 != null : "fx:id=\"txtLeverage181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAnnoAppalti != null : "fx:id=\"lblAnnoAppalti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAppVinti != null : "fx:id=\"lblAppVinti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblPercAppaVinti != null : "fx:id=\"lblPercAppaVinti\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblTotContApp != null : "fx:id=\"lblTotContApp\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblTotContInteApp != null : "fx:id=\"lblTotContInteApp\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti16 != null : "fx:id=\"txtAppVinti16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti17 != null : "fx:id=\"txtAppVinti17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti16 != null : "fx:id=\"txtPercAppVinti16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti17 != null : "fx:id=\"txtPercAppVinti17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti16 != null : "fx:id=\"txtFattAppalti16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter16 != null : "fx:id=\"txtValorAppaltInter16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti17 != null : "fx:id=\"txtFattAppalti17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti18 != null : "fx:id=\"txtAppVinti18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti18 != null : "fx:id=\"txtPercAppVinti18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti18 != null : "fx:id=\"txtFattAppalti18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter17 != null : "fx:id=\"txtValorAppaltInter17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter18 != null : "fx:id=\"txtValorAppaltInter18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti161 != null : "fx:id=\"txtAppVinti161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti171 != null : "fx:id=\"AppVinti171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti161 != null : "fx:id=\"PercAppVinti161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti171 != null : "fx:id=\"PercAppVinti171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti161 != null : "fx:id=\"FattAppalti161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter161 != null : "fx:id=\"ValorAppaltInter161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti171 != null : "fx:id=\"FattAppalti171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtAppVinti181 != null : "fx:id=\"AppVinti181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtPercAppVinti181 != null : "fx:id=\"PercAppVinti181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtFattAppalti181 != null : "fx:id=\"FattAppalti181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter171 != null : "fx:id=\"ValorAppaltInter171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtValorAppaltInter181 != null : "fx:id=\"ValorAppaltInter181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAnnoProgett != null : "fx:id=\"lblAnnoProgett\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostoTotProg != null : "fx:id=\"lblCostoTotProg\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumProgett != null : "fx:id=\"lblNumProgett\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostoTotProgRilievo != null : "fx:id=\"lblCostoTotProgRilievo\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblContrUE != null : "fx:id=\"lblContrUE\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg16 != null : "fx:id=\"txtCostTotProg16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg17 != null : "fx:id=\"txtCostTotProg17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg16 != null : "fx:id=\"txtNumProg16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg17 != null : "fx:id=\"txtNumProg17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile16 != null : "fx:id=\"txtCostTotRile16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE16 != null : "fx:id=\"txtContributoUE16\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile17 != null : "fx:id=\"txtCostTotRile17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg18 != null : "fx:id=\"txtCostTotProg18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg18 != null : "fx:id=\"txtNumProg18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile18 != null : "fx:id=\"txtCostTotRile18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE17 != null : "fx:id=\"txtContributoUE17\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE18 != null : "fx:id=\"txtContributoUE18\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblAnnoProgett1 != null : "fx:id=\"lblAnnoProgett1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostoTotProg1 != null : "fx:id=\"lblCostoTotProg1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumProgett1 != null : "fx:id=\"lblNumProgett1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblCostoTotProgRilievo1 != null : "fx:id=\"lblCostoTotProgRilievo1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblContrUE1 != null : "fx:id=\"lblContrUE1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg161 != null : "fx:id=\"txtCostTotProg161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg171 != null : "fx:id=\"txtCostTotProg171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg161 != null : "fx:id=\"txtNumProg161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg171 != null : "fx:id=\"txtNumProg171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile161 != null : "fx:id=\"txtCostTotRile161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE161 != null : "fx:id=\"txtContributoUE161\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile171 != null : "fx:id=\"txtCostTotRile171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotProg181 != null : "fx:id=\"txtCostTotProg181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumProg181 != null : "fx:id=\"txtNumProg181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtCostTotRile181 != null : "fx:id=\"txtCostTotRile181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE171 != null : "fx:id=\"txtContributoUE171\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtContributoUE181 != null : "fx:id=\"txtContributoUE181\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumBack != null : "fx:id=\"lblNumBack\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumBack != null : "fx:id=\"txtNumBack\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumBack1 != null : "fx:id=\"lblNumBack1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumBack1 != null : "fx:id=\"txtNumBack1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumArtRil1 != null : "fx:id=\"lblNumArtRil1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumArtRil1 != null : "fx:id=\"txtNumArtRil1\" was not injected: check your FXML file 'Compara.fxml'.";
        assert lblNumArtRil != null : "fx:id=\"lblNumArtRil\" was not injected: check your FXML file 'Compara.fxml'.";
        assert txtNumArtRil != null : "fx:id=\"txtNumArtRil\" was not injected: check your FXML file 'Compara.fxml'.";

    }
}
