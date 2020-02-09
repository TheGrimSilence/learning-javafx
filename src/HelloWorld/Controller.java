package HelloWorld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField userName;

  public void handleHello(ActionEvent actionEvent) {
    System.out.printf("Hello there! %s! %n", userName.getText());
  }
}
