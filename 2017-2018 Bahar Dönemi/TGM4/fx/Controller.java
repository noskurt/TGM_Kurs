package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {

    public Button btn;
    public Label labelTxt;
    public DatePicker datePick;

    public void clickBtn(ActionEvent actionEvent) {
        labelTxt.setText(datePick.getValue().toString());
    }
}
