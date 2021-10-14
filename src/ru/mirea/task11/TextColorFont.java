package ru.mirea.task11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextColorFont extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Guessing.class.getResource("TextColorFont.fxml"));
        primaryStage.setTitle("TextColorFont");
        primaryStage.setScene(new Scene(fxmlLoader.load()));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
