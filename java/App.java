import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
	private Stage stage;
	private StackPane rootPane;

	/* Furkan USUL 150125042
	 * Load the config file before the start() method
	 */
	@Override
	public void init() {
		Config.loadConfig();
	}
	
	public void start(Stage stage) {
		this.stage = stage;
		Image icon = new Image("file:icon.png");
		stage.getIcons().add(icon);
		showMainMenu();
		stage.show();
	}
	
	public void showMainMenu() {
		MainMenu mainMenu = new MainMenu(this);
		stage.setScene(new Scene(mainMenu , 1500 , 900));
	}
	
	public void showLevelSelectMenu() {
		LevelSelect levelSelect = new LevelSelect(this);
		stage.setScene(new Scene(levelSelect));
	}
	
	public void startLevel(int levelNum) {
		ImageView background = new ImageView("file:" + levelNum + ".png");
		GameScreen gameScreen = new GameScreen(levelNum , this , background);

		rootPane = new StackPane();
		rootPane.getChildren().add(gameScreen);

		Scene scene = new Scene(rootPane, 1500 , 900);
		stage.setScene(scene);
		
		gameScreen.initLevel(scene);
		gameScreen.startGame();
	}

	/** Furkan USUL 150125042
	 * Show lose screen on whole screen, levelNum is needed for restarting the same level and score is needed for displaying it
	 */
	public void showLoseScene(int score, int levelNum) {
		LosePane losePane = new LosePane(this, score, levelNum);
		stage.setScene(new Scene(losePane, 1500, 900));
	}

	/** Furkan USUL 150125042
	 * Show win screen on top of the level, levelNum is needed for navigating to the next level
	 */
	public void showWinScene(int levelNum) {
		WinPane winPane = new WinPane(this, levelNum);
		winPane.setMaxSize(500, 300);

		rootPane.getChildren().add(winPane);
	}

	/** Furkan USUL 150125042
	 * Quit the application
	 */
	public void exit(){
		Platform.exit();
	}
	
    public static void main(String[] args) {
        launch(args);
    }
}
