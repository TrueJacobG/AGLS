package com.github.truejacobg.agls;

import com.github.truejacobg.agls.base.Area;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("App name");
        stage.setScene(scene);
        stage.show();

        new Area(10, 5);
    }

    public static void main(String[] args) {
        launch();
    }
}