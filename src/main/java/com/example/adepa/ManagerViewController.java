package com.example.adepa;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ManagerViewController implements Initializable {
// Button Navigation (Product Man, Employee Man, Sales, Stocks and Sales)

    // Reference the Main Anchor Panel
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label lblsupermarket;

    @FXML
    // Dashboard Button Handler
    private void handleDashboard(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/dashboard-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Product Button handler
    @FXML
    private void handleProductManagement(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/product-management-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Employee Button handler
    public void handleEmployementManagement(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/employement_management.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Sales button handler
    public void handleSales(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/sales-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void handleExpenses(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/dashboard-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleStocks(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/stocks-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handlePopularItems(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/popularItems-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleSuppliers(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/suppliers-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handlePromo(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/promo-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleChart(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/chart-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleReport(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/report-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleUsers(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("Manager/users-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainPane.getChildren().clear();
            mainPane.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // logout function
    @FXML
    private void handleLogoutAction(ActionEvent event) {
        // Display a confirmation dialog
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout Confirmation");
        //alert.setHeaderText("You are about to log out.");
        alert.setContentText("Do you want to Log-out?");

        // Wait for user confirmation
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // If "OK" is clicked, load the login scene
            try {
                //Parent loginScene = FXMLLoader.load(getClass().getResource("login-view.fxml"));

                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-view.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(fxmlLoader.load(), 900, 660);
                stage.setTitle("ADEPA SUPERMARKET");
                stage.setResizable(false);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // ------- overriding from active control
        Platform.runLater(() -> lblsupermarket.requestFocus());

    }
}
