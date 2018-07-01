package prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddressForm extends Application {

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    private TextField nameTextField;
    private TextField streetTextField;
    private TextField cityTextField;
    private TextField stateTextField;
    private TextField zipTextField;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AddressForm");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        //top, right, bottom, left
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Label name = new Label("Name");
        gridPane.add(name, 0, 0);
        nameTextField = new TextField();
        gridPane.add(nameTextField, 0, 1, 2, 1);

        Label street = new Label("Street");
        gridPane.add(street, 2, 0);
        streetTextField = new TextField();
        gridPane.add(streetTextField, 2, 1, 2, 1);

        Label city = new Label("City");
        gridPane.add(city, 4, 0);
        cityTextField = new TextField();
        gridPane.add(cityTextField, 4, 1, 2, 1);

        Label state = new Label("State");
        gridPane.add(state, 1, 2);
        stateTextField = new TextField();
        gridPane.add(stateTextField, 1, 3, 2, 1);

        Label zip = new Label("Zip");
        gridPane.add(zip, 3, 2);
        zipTextField = new TextField();
        gridPane.add(zipTextField, 3, 3, 2, 1);

        Button submitBtn = new Button("Submit");
        HBox hbxBtn = new HBox(10);
        hbxBtn.setAlignment(Pos.BASELINE_CENTER);
        hbxBtn.getChildren().add(submitBtn);
        gridPane.add(hbxBtn, 2, 7, 2, 1);

        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                storeAddressInfo();
                displayAddressInfo();
            }
        });

        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void storeAddressInfo() {

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
