module cows.bulls {
    requires javafx.controls;
    //exports cab to javafx.graphics;
    requires javafx.fxml;
    exports cab to javafx.graphics, javafx.fxml;
    opens cab to javafx.fxml, javafx.base;
}