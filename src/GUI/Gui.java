package GUI;


import javax.swing.text.html.CSS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends javafx.application.Application{

	@Override
    public void start(final Stage primaryStage) {
 
		/// BUTTON EXAMPLE ///
        Button button = new Button();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Button button = (Button) e.getSource();
            }
        });
        /*
        button.setText("Open a New Window");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            }
        }); */
 
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 1280, 720);
        scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }

}
