package sample.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.gui.util.Alerts;
import sample.gui.util.Constraints;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

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

    public void initialize(URL url, ResourceBundle resourceBundle){
        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber2);
        Constraints.setTextFieldInteger(txtNumber1);
        Constraints.setTextFieldInteger(txtNumber2);
        Constraints.setTextFieldMaxLength(txtNumber1, 12);
        Constraints.setTextFieldMaxLength(txtNumber2, 12);
    }

}
