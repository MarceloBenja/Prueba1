module com.example.labo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.labo3 to javafx.fxml;
    exports com.example.labo3;
}