package HelloWorld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
    root.getId();
        /*Group root = new Group();

        StackPane layout = new StackPane();

        Label label = new Label("Name:");
        label.setFont(new Font("Papyrus", 16));
        TextField nameFld = new TextField();
        GridPane grid = new GridPane();
        Button btn = new Button("Submit");
        btn.setOnAction(event-> System.out.printf("Hello, there! %s!%n", nameFld.getText()));
        grid.add(label, 0,0);
        grid.add(nameFld,1,0);
        grid.add(btn, 1, 1);
        grid.setHgap(20);
        grid.setGridLinesVisible(true);

        VBox section = new VBox();
        section.getChildren().addAll(grid);
        root.getChildren().add(section);*/

//      Stage setup
    Scene scene = new Scene(root, 400, 200);
    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
