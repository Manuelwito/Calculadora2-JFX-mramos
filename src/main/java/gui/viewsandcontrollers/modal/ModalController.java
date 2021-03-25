package gui.viewsandcontrollers.modal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ModalController {

    @FXML
    private Label label;

    @FXML
    public Button closeButton;

    @FXML
    void handleCloseButtonAction(ActionEvent event) throws IOException {
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    }
    
    
    
    

}