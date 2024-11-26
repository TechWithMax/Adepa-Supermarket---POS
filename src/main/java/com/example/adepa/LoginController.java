package com.example.adepa;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    @FXML
    private  Button btn_signin;



    public void handleSignInButton(ActionEvent event) throws IOException {
        try{
            // ---- Loading Layout
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Manager/manager-view.fxml"));
            Parent root = loader.load();

            // ---- Creating a new Scene
            Scene scene = new Scene(root);

            // ----- Settings up the Stage
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.centerOnScreen();
            stage.setResizable(true);
            stage.setWidth(1440);
            stage.setHeight(1000);

            // ---- Applying an animation (Fade Transition)
            FadeTransition ft = new FadeTransition(Duration.millis(1000), root);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();

            // ----- Show the new stage
            stage.show();

            // ---- Optionally, hide the current window
            ((Stage) btn_signin.getScene().getWindow()).hide();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // ------- overriding from active control
        Platform.runLater(() -> btn_signin.requestFocus());

    }
}