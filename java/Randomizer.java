import java.util.Random;

public class Randomizer {
	
	private static Random random = new Random();
<<<<<<< HEAD

=======
	
>>>>>>> fe5653b7d4503b45128fc920a0ccd8fa8468d798
	public static double getX(PlayableArea area) {
		double x = ((Math.random() * (area.getMaxX() - area.getMinX())) + area.getMinX());
		return x;
	}
	public static double initialVelocity() {
		return random.nextBoolean() ? 1.0 : -1.0;
	}
	public static double getY(PlayableArea area) {
		double y = ((Math.random() * (area.getMaxY() - area.getMinY())) + area.getMinY());
		return y;
	}
<<<<<<< HEAD

=======
	
	public static double setV() {
		return random.nextBoolean() ? 1 : -1;
	}
>>>>>>> fe5653b7d4503b45128fc920a0ccd8fa8468d798
}
