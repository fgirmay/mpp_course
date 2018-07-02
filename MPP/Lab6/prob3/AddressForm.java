package prob3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddressForm extends Application {

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField streetTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private TextField stateTextField;

    @FXML
    private TextField zipTextField;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("address_form.fxml"));
        Scene scene = new Scene(root, 800, 400);

        primaryStage.setTitle("AddressForm");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        storeAddressBookInfo();
        displayAddressInfo();
    }

    private void storeAddressBookInfo() {
        name = nameTextField.getText();
        street = streetTextField.getText();
        city = cityTextField.getText();
        state = stateTextField.getText();
        zip = zipTextField.getText();
    }

    private void displayAddressInfo() {
        System.out.println(name);
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
    }
}
