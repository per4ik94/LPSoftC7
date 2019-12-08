package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * Startet die Applikation.
 *
 * @author Sergej Cerkasin m17574
 * @version HA_E1.2
 * @since 2019/12/31
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));  //Quelle der XML
        primaryStage.setTitle("Hello World");// Fenster Titel.
        primaryStage.setScene(new Scene(root, 300, 275)); // Main Fenster Groesse festlegen
        primaryStage.show(); // Startet die Applikation
    }


    public static void main(String[] args) {
        launch(args);
    }
}
