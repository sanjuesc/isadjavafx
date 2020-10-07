package ehu.isad.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField erabText;

    @FXML
    private PasswordField erabPass;

    @FXML
    void sartu(ActionEvent event) {
        erabText.clear();
        erabPass.clear();

    }

}
