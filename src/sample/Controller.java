package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea myTextArea;
    @FXML
    TextField myTextField;

    public void btnClick(ActionEvent actionEvent){
        writeText(actionEvent);
    }
    public void writeText(ActionEvent actionEvent){
        myTextArea.appendText(myTextField.getText()+ '\n');
        myTextField.clear();
    }
}
