module com.eddy.gui2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eddy.gui2022 to javafx.fxml;
    exports com.eddy.gui2022;
}