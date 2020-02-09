package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();

        StackPane layout = new StackPane();

        TextField nameFld = new TextField();

        Button btn = new Button("Submit");
        btn.setOnAction(event-> System.out.printf("Hello, there! %s!%n", nameFld.getText()));

        VBox section = new VBox();
        section.getChildren().addAll(nameFld, btn);
        root.getChildren().add(section);

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
