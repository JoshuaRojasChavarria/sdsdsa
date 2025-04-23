/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.unaplanilla.controller;

import cr.ac.una.unaplanilla.util.FlowController;
import io.github.palexdev.materialfx.controls.MFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import cr.ac.una.unaplanilla.util.AppContext;

/**
 * FXML Controller class
 *
 * @author devcr
 */
public class PrincipalViewController extends Controller implements Initializable {

    @FXML
    private MFXButton btnEmployers;
    @FXML
    private MFXButton btnPlanillaType;
    @FXML
    private MFXButton btnLogOut;
    @FXML
    private MFXButton btnExit;
    @FXML
    private Label lblUser;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         if(AppContext.getInstance().get("Usuario")==null){
         lblUser.setText("Sin iniciar");
         }else{
        lblUser.setText(AppContext.getInstance().get("Usuario").toString());
         }
 
    }    

    @FXML
    private void onActionEmployers(ActionEvent event) {
        FlowController.getInstance().goView("employeesView");
    }

    @FXML
    private void onActionPlanillaType(ActionEvent event) {
        FlowController.getInstance().goView("planillaTypeView");
    }

    @FXML
    private void onActionLogOut(ActionEvent event) {
        
        FlowController.getInstance().goViewInWindow("logInView");
        FlowController.getInstance().salir();
    }

    @FXML
    private void onActionBtnExit(ActionEvent event) {
        FlowController.getInstance().salir();
    }

    @Override
    public void initialize() {
    }

    
}
