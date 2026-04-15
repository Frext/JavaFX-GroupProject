package com.group1.groupproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        // TODO: Replace with below line to see main menu
        // MainMenu screen = new MainMenu();

        GameScreen screen = new GameScreen();
        screen.updateVacuum(1);
        screen.updateHealth(.5);
        screen.updateScore(10);
        screen.updateTime("01:19");

        Scene homeScene = new Scene(screen, 800, 600);
        stage.setScene(homeScene);
        stage.setTitle("Ghost Hunter Inc.");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
