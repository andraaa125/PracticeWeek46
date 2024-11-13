module org.example.practiceweek46 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.practiceweek46 to javafx.fxml;
    exports org.example.practiceweek46;
}