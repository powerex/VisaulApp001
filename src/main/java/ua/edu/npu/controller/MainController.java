package ua.edu.npu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    Label labelHello;

    @FXML
    CheckBox checkboxAgree;

    @FXML
    Button agreeButton;

    private int i = 0;

    public void buttonPressed(ActionEvent actionEvent) {
        i++;
        labelHello.setText("Button hello was pressed " + i + " time(s)");
    }

    public void switchAgree(ActionEvent actionEvent) {
        if (checkboxAgree.isSelected()) {
            agreeButton.setDisable(false);
        } else {
            agreeButton.setDisable(true);
        }
    }
}
