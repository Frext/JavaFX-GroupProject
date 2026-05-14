import java.util.ArrayList;

import javafx.geometry.Bounds;

public class Health { // Abdullah Derviş Kombıçak 150124009 set hunter's health
	public static double damage(double health, Hunter hunter, ArrayList<Entity> enemies) {
		boolean isDamaged = false;

		for(Entity e : enemies) {
			
			Bounds entityBounds = e.getView().localToScene(e.getView().getBoundsInLocal());
			
			if(hunter.hunterBounds().intersects(entityBounds)) {
				isDamaged = true;
				break;
			}
		}

		if (isDamaged){
			health -= 0.002;
			if (health < 0)
				health = 0;
		}

		hunter.applyDamageEffect(isDamaged);
		return health;
	}

	public static double token(double health) {
		return health;
	}
}
