package prob2;

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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StringUtilityForm extends Application {

    private Label inputLabel;
    private TextField inputTextField;

    private Label outputLabel;
    private TextField outputTextField;

    private Button letterCounterBtn;
    private Button letterReverseBtn;
    private Button removeDuplicateLettersBtn;

    private StringBuilder reversedOutput = new StringBuilder();
    private StringBuilder duplicateRemovedOutput = new StringBuilder();



    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("String Utility");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        //top, right, bottom, left
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        letterCounterBtn = new Button("Count Letters");
        letterCounterBtn.setPrefSize(200, 20);
        letterCounterBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                countCharacters(inputTextField.getText());
            }
        });

        letterReverseBtn = new Button("Reverse Letters");
        letterReverseBtn.setPrefSize(200, 20);
        letterReverseBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                reverseCharacters(inputTextField.getText());
            }
        });

        removeDuplicateLettersBtn = new Button("Remove Duplicates");
        removeDuplicateLettersBtn.setPrefSize(200, 20);
        removeDuplicateLettersBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                removeDuplicateCharacters(inputTextField.getText());
            }
        });

        VBox vbxBtn = new VBox(10);
        vbxBtn.setAlignment(Pos.BASELINE_CENTER);
        vbxBtn.getChildren().addAll(letterCounterBtn, letterReverseBtn, removeDuplicateLettersBtn);
        gridPane.add(vbxBtn, 0, 0);

        inputLabel = new Label("input");
        gridPane.add(inputLabel, 0, 0);
        inputTextField = new TextField();
        gridPane.add(inputTextField, 0, 1);

        outputLabel = new Label("output");
        gridPane.add(outputLabel, 0, 2);
        outputTextField = new TextField();
        gridPane.add(outputTextField, 0, 3);

        VBox vbx1 = new VBox(2);
        vbx1.setAlignment(Pos.BASELINE_LEFT);
        vbx1.getChildren().addAll(inputLabel, inputTextField, outputLabel, outputTextField);
        gridPane.add(vbx1, 1, 0);

        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void countCharacters(String input) {

        int characterCount = input.length();
        outputTextField.setText("");
        outputTextField.setText(String.valueOf(characterCount));
    }

    private void reverseCharacters(String input) {
        String reversedOutput = reverseString(input);
        outputTextField.setText("");
        outputTextField.setText(reversedOutput);
    }

    private String reverseString(String input) {

        if (0 == input.length()) {
            return reversedOutput.toString();
        }
        reversedOutput.append(input.charAt(input.length() - 1));
        input = input.substring(0, input.length() - 1);

        return reverseString(input);
    }

    private void removeDuplicateCharacters(String input) {

        String outputText = removeDuplicateChars(input);
        outputTextField.setText("");
        outputTextField.setText(outputText);
    }

    private String removeDuplicateChars(String input) {

        if (input.length() == 0) {
            return duplicateRemovedOutput.toString();
        }

        if (duplicateRemovedOutput.toString().indexOf(input.charAt(0)) == -1) {
            duplicateRemovedOutput.append(input.charAt(0));
        }
        input = input.substring(1);
        return removeDuplicateChars(input);
    }
}
