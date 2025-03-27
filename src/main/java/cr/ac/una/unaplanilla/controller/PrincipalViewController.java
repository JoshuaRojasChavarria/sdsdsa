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

/**
 * FXML Controller class
 *
 * @author devcr
 */
public class PrincipalViewController implements Initializable {

    @FXML
    private MFXButton btnEmployers;
    @FXML
    private MFXButton btnPlanillaType;
    @FXML
    private MFXButton btnLogOut;
    @FXML
    private MFXButton btnExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        
    }

    @FXML
    private void onActionBtnExit(ActionEvent event) {
        FlowController.getInstance().salir();
    }
    
}
