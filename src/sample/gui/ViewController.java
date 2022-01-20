package sample.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.gui.util.Alerts;

import java.util.Locale;

public class ViewController {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btCalculateSum;

    @FXML
    public void onBtCalculateSum() {
        try {
            Locale.setDefault(Locale.US);
            double first = Double.parseDouble(txtNumber1.getText());
            double second = Double.parseDouble(txtNumber2.getText());
            double sum = first + second;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);
        }

    }

}
