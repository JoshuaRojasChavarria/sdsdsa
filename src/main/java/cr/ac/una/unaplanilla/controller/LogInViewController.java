/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.unaplanilla.controller;

import cr.ac.una.unaplanilla.util.AppContext;
import cr.ac.una.unaplanilla.util.FlowController;
import cr.ac.una.unaplanilla.util.Mensaje;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author devcr
 */
public class LogInViewController extends Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView BackgroundImage;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private MFXButton btnSignIn;

    @FXML
    private MFXPasswordField psfPassword;

    @FXML
    private AnchorPane root;

    @FXML
    private MFXTextField txfUser;

    @FXML
    void onActionBtnCancel(ActionEvent event) {
        new Mensaje().show(Alert.AlertType.INFORMATION, "Usuario",AppContext.getInstance().get("Usuario").toString());
    }

    @FXML
    void onActionBtnSignIn(ActionEvent event) {
        AppContext.getInstance().set("Usuario", txfUser.getText());
        AppContext.getInstance().set("Contraseña", psfPassword.getText());
        
        
        FlowController.getInstance().goMain();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BackgroundImage.fitHeightProperty().bind(root.heightProperty());
        BackgroundImage.fitWidthProperty().bind(root.widthProperty());
    }    

    @Override
    public void initialize() {
        
    }
    
}
