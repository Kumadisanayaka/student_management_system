package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btnSubmit;

    @FXML
    private Button btnSubmit2;

    @FXML
    private Button btnSubmit3;

    @FXML
    void submit2OnAction(ActionEvent event) {

        System.out.println("sub2 clicked!");

    }

    @FXML
    void submit3OnAction(ActionEvent event) {

        System.out.println("sub3 clicked!");

    }

    @FXML
    void submitOnAction(ActionEvent event) {

        System.out.println("Submit clicked!");

    }

}
