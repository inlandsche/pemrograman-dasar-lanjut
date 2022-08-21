module LastOOP {
    requires javafx.controls;
    requires javafx.fxml;

    opens Interfaces.fxmlFiles;
    opens Interfaces.Main;
    opens Interfaces.Controller;
}