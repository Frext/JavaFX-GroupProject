package com.group1.groupproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void init() throws Exception {
        super.init();

        Config.loadConfig();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO: Replace with below line to see main menu
        // MainMenu screen = new MainMenu();

        GameScreen screen = new GameScreen();
        screen.updateVacuum(Config.get("maximum_vacuum"));
        screen.updateHealth(Config.get("maximum_health"));
        screen.updateScore(0);
        screen.updateTime("00:00");

        Scene homeScene = new Scene(screen, 800, 600);
        stage.setScene(homeScene);
        stage.setTitle("Ghost Hunter Inc.");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
