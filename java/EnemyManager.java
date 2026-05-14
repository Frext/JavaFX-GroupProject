import java.util.ArrayList;

public class EnemyManager {
	
	private ArrayList<Entity> enemies;
	private PlayableArea area;
	
	public EnemyManager(int levelNum , PlayableArea area) {
		this.area = area;
		this.enemies = new ArrayList<>();
		
		//getting the numbers of entities from Config class Emir Aydın 150124001
		int ghostNum = Config.get("level_" + levelNum + "_ghosts");
		int ripperNum = Config.get("level_" + levelNum + "_rippers");
		int wispNum = Config.get("level_" + levelNum + "_wisps");
		
		//spawning the entities regarding their number Emir Aydın 150124001
		for(int i = 0 ; i < ghostNum ; i++) {
			Ghost ghost = new Ghost(Randomizer.getX(area) , Randomizer.getY(area) , false);
			enemies.add(ghost);
			area.getChildren().add(ghost.getView());
		}
		
		for(int i = 0 ; i < ripperNum ; i++) {
			Ripper ripper = new Ripper(Randomizer.getX(area) , Randomizer.getY(area) , false);
			enemies.add(ripper);
			area.getChildren().add(ripper.getView());
		}
		
		for(int i = 0 ; i < wispNum ; i++) {
			Wisp wisp = new Wisp(Randomizer.getX(area) , Randomizer.getY(area) , false);
			enemies.add(wisp);
			area.getChildren().add(wisp.getView());
		}
	}
	//in AnimationTimer , starting the movement of all the entities in the enemies arrayList Emir Aydın 150124001
	public void moveAll(double minX, double minY, double maxX, double maxY) {
		for(Entity e : enemies) {
			e.move(minX, minY, maxX, maxY);
		}
	}
	
	//return the arrayList for the method or constructor which take enemies arraylist as a parameter Emir Aydın 150124001
	public ArrayList<Entity> getEnemies() {
		return this.enemies;
	}
}
