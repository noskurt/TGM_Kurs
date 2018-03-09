package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    public TextField usernameField;
    public PasswordField pwField;
    public Button loginBtn;
    public Label message;

    public void login(ActionEvent actionEvent) throws Exception {
        if (usernameField.getText().equals("TGM")) {
            if (pwField.getText().equals("123")) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("HelloView.fxml"));
                AnchorPane pane = loader.load();
                Scene scene = new Scene(pane, 500, 375);

                HelloController helloController = loader.getController();
                helloController.message.setText("TGM hoşgeldin!");

                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(scene);
            } else {
                message.setDisable(false);
                message.setText("Şifre yanlış!");
                message.setStyle("-fx-background-color: red");
            }
        } else {
            message.setDisable(false);
            message.setText("Kullanıcı adı yanlış!");
            message.setStyle("-fx-background-color: red");
        }
    }
}
