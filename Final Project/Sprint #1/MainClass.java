
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordon
 */
public class MainClass extends Application{
    public static void main(String[] args){
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        System.out.println("hi");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("calculator.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
