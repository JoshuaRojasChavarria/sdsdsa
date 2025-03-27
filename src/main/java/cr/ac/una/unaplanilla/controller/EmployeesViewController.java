/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.unaplanilla.controller;

import cr.ac.una.unaplanilla.model.EmployeeDto;
import cr.ac.una.unaplanilla.util.Mensaje;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author devcr
 */
public class EmployeesViewController extends Controller implements Initializable {

    @FXML
    private MFXTextField txfID;
    @FXML
    private MFXTextField txfName;
    @FXML
    private MFXTextField txfLastName;
    @FXML
    private MFXTextField txfSecondLastName;
    @FXML
    private MFXTextField txfDocument;
    @FXML
    private MFXRadioButton rbMale;
    @FXML
    private ToggleGroup genderOption;
    @FXML
    private MFXRadioButton rbFemale;
    @FXML
    private MFXCheckbox cbAdmin;
    @FXML
    private MFXCheckbox cbActive;
    @FXML
    private MFXDatePicker dpEntryDate;
    @FXML
    private MFXDatePicker dpDeparture;
    @FXML
    private MFXTextField txfMail;
    @FXML
    private MFXTextField txfUser;
    @FXML
    private MFXPasswordField txpPassword;
    @FXML
    private MFXButton btnNew;
    @FXML
    private MFXButton btnSearch;
    @FXML
    private MFXButton btnDelete;
    @FXML
    private MFXButton btnSave;

    EmployeeDto employee;
    ObjectProperty<EmployeeDto> employeeProperty = new SimpleObjectProperty<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bindEmployee();
        // TODO
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnNew(ActionEvent event) {
    }

    @FXML
    private void onActionBtnSearch(ActionEvent event) {
    }

    @FXML
    private void onActionBtnDelete(ActionEvent event) {
    }

    @FXML
    private void onActionBtnSave(ActionEvent event) {
    }

    private void bindEmployee() {
        try {
            employeeProperty.addListener((obs, oldVal, newVal) -> {
                if (oldVal != null) {
                    txfName.textProperty().unbindBidirectional(oldVal.getNameProperty());
                    txfID.textProperty().unbindBidirectional(oldVal.getIdProperty());
                    txfLastName.textProperty().unbindBidirectional(oldVal.getLastName1Property());
                    txfSecondLastName.textProperty().unbindBidirectional(oldVal.getLastName2Property());
                    txfDocument.textProperty().unbindBidirectional(oldVal.getNationalIdProperty());
                    cbAdmin.selectedProperty().unbindBidirectional(oldVal.getIsAdminProperty());
                    cbActive.selectedProperty().unbindBidirectional(oldVal.getIsActiveProperty());
                    dpEntryDate.valueProperty().unbindBidirectional(oldVal.getEntryDateProperty());
                    dpDeparture.valueProperty().unbindBidirectional(oldVal.getExitDateProperty());
                    txfUser.textProperty().unbindBidirectional(oldVal.getUsernameProperty());
                    txfMail.textProperty().unbindBidirectional(oldVal.getEmailProperty());
                    txpPassword.textProperty().unbindBidirectional(oldVal.getPasswordProperty());
                }
                if (newVal != null) {
                    txfName.textProperty().bindBidirectional(newVal.getNameProperty());
                    txfID.textProperty().bindBidirectional(newVal.getIdProperty());
                    txfLastName.textProperty().bindBidirectional(newVal.getLastName1Property());
                    txfSecondLastName.textProperty().bindBidirectional(newVal.getLastName2Property());
                    txfDocument.textProperty().bindBidirectional(newVal.getNationalIdProperty());
                    cbAdmin.selectedProperty().bindBidirectional(newVal.getIsAdminProperty());
                    cbActive.selectedProperty().bindBidirectional(newVal.getIsActiveProperty());
                    dpEntryDate.valueProperty().bindBidirectional(newVal.getEntryDateProperty());
                    dpDeparture.valueProperty().bindBidirectional(newVal.getExitDateProperty());
                    txfUser.textProperty().bindBidirectional(newVal.getUsernameProperty());
                    txfMail.textProperty().bindBidirectional(newVal.getEmailProperty());
                    txpPassword.textProperty().bindBidirectional(newVal.getPasswordProperty());
                }
            });

        } catch (Exception ex) {
            new Mensaje().showModal(
                    Alert.AlertType.ERROR,
                    "Error al realizar el bindeo",
                    getStage(),
                    "Ocurrió un error al realizar el bindeo."
            );
        }
    }
}
