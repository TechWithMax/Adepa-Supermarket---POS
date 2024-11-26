module com.example.adepa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adepa to javafx.fxml;
    exports com.example.adepa;
}