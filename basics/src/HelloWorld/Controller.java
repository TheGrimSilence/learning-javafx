package HelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField userName;

  public void handleHello() {
    System.out.printf("Hello there! %s! %n", userName.getText());
  }
}
