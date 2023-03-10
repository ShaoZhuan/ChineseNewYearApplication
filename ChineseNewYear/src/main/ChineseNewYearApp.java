package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ChineseNewYearApp extends Application {

    Stage mainStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        Scene scene = new Scene(root,1026,600);
        
        mainStage = stage;
        mainStage.setScene(scene);
        mainStage.setTitle("Chinese New Year Decorator");
        mainStage.setResizable(false);
        mainStage.setMaximized(false);
        mainStage.show();
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
