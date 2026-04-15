package com.group1.groupproject;
import javafx.scene.layout.Pane;

public class MainMenu extends Pane{

	public MainMenu() {
		Pane pane = new Pane();
		pane.setPrefSize(800, 600);
		
		ButtonPane startButton = new ButtonPane("START GAME");
		ButtonPane selectLevelButton = new ButtonPane("SELECT LEVEL");
		ButtonPane exitButton = new ButtonPane("EXIT");
		
		pane.getChildren().add(exitButton);
		pane.getChildren().add(selectLevelButton);
		pane.getChildren().add(startButton);
		
		startButton.setLayoutX(100);
		startButton.setLayoutY(400);
		
		selectLevelButton.setLayoutX(100);
		selectLevelButton.setLayoutY(460);
		
		exitButton.setLayoutX(100);
		exitButton.setLayoutY(520);
		
		// Image homeImage = new Image("");
		// ImageView homeImageView = new ImageView(homeImage);
		
		// Image iconImage = new Image("");
		//İcon unutma!!! stage.getIcons().add(iconImage);
		
		this.getChildren().add(pane);
	}
}
