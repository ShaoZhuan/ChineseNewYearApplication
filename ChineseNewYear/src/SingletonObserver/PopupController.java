/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonObserver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopupController implements Observer {

    @Override
    public void update(Achievement achievement) {
        try {
            Label messageLabel = new Label("Achievement Unlocked: " + achievement.getName() + " - " + achievement.getDescription());
            Button closeButton = new Button("Close");
            closeButton.setOnAction(event -> {
                Stage stage = (Stage) closeButton.getScene().getWindow();
                stage.close();
            });
            VBox layout = new VBox(10);
            layout.setAlignment(Pos.CENTER);
            layout.getChildren().addAll(messageLabel, closeButton);

            Stage stage = new Stage();
            Scene scene = new Scene(layout, 400, 100);
            stage.setTitle("Achievement Unlocked!");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setMaximized(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void closePopup(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
