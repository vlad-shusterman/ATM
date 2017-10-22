
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static java.lang.Integer.valueOf;

public class Main extends Application {

    static Stage stage;
    static Stage stage1;
    static Stage stage2;
    static Stage stage3;
    static Stage stage4;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Autorisation");
        stage = primaryStage;
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();

    }

    public void start1(Stage primaryStage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        primaryStage.setTitle("BelarusBank");
        stage1 = primaryStage;
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();

    }

    public void start2(Stage primaryStage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        stage2 = primaryStage;
        primaryStage.setTitle("BelarusBank");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }

    public void start3(Stage primaryStage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        stage3 = primaryStage;
        primaryStage.setTitle("BelarusBank");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();

    }

    public void start4(Stage primaryStage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        stage4 = primaryStage;
        primaryStage.setTitle("BelarusBank");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

