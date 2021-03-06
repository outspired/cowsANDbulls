package cab;

import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        // write your code here
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = FXMLLoader.load(getClass().getResource("/cab/MainFXML.fxml"));
//        Pane root = new VBox();
//
////        Button btn = new Button("KNOPKA NAH");
//        Label lbl = new Label("label test");
//        TextField txtfld = new TextField("text");
//
////        lbl.textProperty().bind(Bindings.concat("Hello, ", txtfld.textProperty(), "!"));
//
////        btn.setOnAction(e -> {
////                    System.out.println("hello, " + txtfld.getText() + "!!!!");
////                });
//
//        root.getChildren().addAll(lbl, txtfld);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Bulls and Cows");
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
