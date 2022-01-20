package sample.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import sample.gui.util.Alerts;

public class ViewController {

    @FXML
    private Button btMyButton;

    @FXML
    public void onMyButtonClick(){
        Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);

    }
}
