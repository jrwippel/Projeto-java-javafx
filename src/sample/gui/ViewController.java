package sample.gui;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import sample.gui.util.Alerts;
import sample.gui.util.Constraints;
import sample.model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;
    @FXML
    private Button btAll;
    private ObservableList<Person>observableList;
    @FXML
    public void onComboBoxPersonAction(){
        Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }
    @FXML
    public void onBtAllAction(){
        for (Person person : comboBoxPerson.getItems()){
            System.out.println(person);
        }
    }
    public void initialize(URL url, ResourceBundle resourceBundle){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Maria", "maria@gmail.com"));
        personList.add(new Person(2, "Jackson", "jackson@gmail.com"));
        personList.add(new Person(3, "Davi", "davi@gmail.com"));

        observableList = FXCollections.observableArrayList(personList);
        comboBoxPerson.setItems(observableList);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>(){
            @Override
            protected void updateItem(Person item, boolean empty){

                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());

            }
        };

        comboBoxPerson.setCellFactory(factory);
        comboBoxPerson.setButtonCell(factory.call(null));


    }

}
