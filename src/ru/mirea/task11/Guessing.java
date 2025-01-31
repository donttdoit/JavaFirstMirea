package ru.mirea.task11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Guessing extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Guessing.class.getResource("Guessing.fxml"));
        primaryStage.setTitle("Guessing");
        primaryStage.setScene(new Scene(fxmlLoader.load()));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
