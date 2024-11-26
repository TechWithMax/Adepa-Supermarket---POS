package com.example.adepa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CeoViewController implements Initializable {
    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private BarChart <String, Number> barChart;

    // creating button handler
    @FXML
    private void handleDashboard(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/dashboard-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleEmployees(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/employees-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleSales(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/sales-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleStocks(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/stocks-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleExpenses(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/dashboard-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleSettings(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/settings.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSuppliers(ActionEvent event) {
        try {
            // Load the ChildAnchorPane.fxml
            AnchorPane childPane = FXMLLoader.load(getClass().getResource("CEO/suppliers-view.fxml"));

            // Clear the parentPane and add the new child AnchorPane
            mainAnchor.getChildren().clear();
            mainAnchor.getChildren().add(childPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
