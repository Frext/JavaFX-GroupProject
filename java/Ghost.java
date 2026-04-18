package myjavaFXprograms;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Ghost extends Entity implements Enemy{
<<<<<<< HEAD
	private double Vx = Randomizer.initialVelocity();
	private double Vy = Randomizer.initialVelocity();
=======
	
	private double Vx;
	private double Vy;
	
>>>>>>> fe5653b7d4503b45128fc920a0ccd8fa8468d798
    public Ghost(double x, double y, boolean isVisible) {
        super(x, y, isVisible);
        this.Vx = Randomizer.setV();
        this.Vy = Randomizer.setV();
        
    }

    @Override
    public void applyScannerEffect(boolean isInsideTriangle) {
        // TODO
    }
    
    @Override
    public void move(double minX, double minY, double maxX, double maxY) {
<<<<<<< HEAD
    	view.setLayoutX(view.getLayoutX() + Vx);
        view.setLayoutY(view.getLayoutY() + Vy);
        Bounds bounds = view.getBoundsInParent();
    	if (bounds.getMinX() <= minX || bounds.getMaxX() >= maxX) {
    		Vx = -Vx;
          }
          if (bounds.getMinY() <= minY || bounds.getMaxY() >= maxY) {
    		Vy = -Vy;
          }
=======
    	
    	double tempX = this.x;
    	double tempY = this.y;
    	
    	tempX += Vx;
    	tempY += Vy;
    	
    	if(tempX < minX) {
    		tempX = minX;
    		Vx *= -1;
    	}
    	if(tempY < minY) {
    		tempY = minY;
    		Vy *= -1;
    	}
    	if(tempX > maxX) {
    		tempX = maxX;
    		Vx *= -1;
    	}
    	if(tempY > maxY) {
    		tempY = maxY;
    		Vy *= -1;
    	}
    	
    	this.x = tempX;
    	this.y = tempY;
    	
    	this.view.setLayoutX(this.x);
    	this.view.setLayoutY(this.y);
>>>>>>> fe5653b7d4503b45128fc920a0ccd8fa8468d798
    }
    
    @Override
    public Group implementView() {
        Circle face = new Circle(0,0, 15);
        Circle rightEye = new Circle(-6, -2, 3);
        Circle rightPupil = new Circle(-6, -2, 1);
        Circle leftEye = new Circle(6,-2,3);
        Circle leftPupil = new Circle(6,-2,1);
        Rectangle bottomRectangle = new Rectangle(-15,0, 30, 15);

        face.setFill(Color.WHITE);
        face.setOpacity(.5);
        rightEye.setFill(Color.WHITE);
        leftEye.setFill(Color.WHITE);
        rightPupil.setFill(Color.BLACK);
        leftPupil.setFill(Color.BLACK);
        bottomRectangle.setFill(Color.WHITE);
        bottomRectangle.setOpacity(.5);

        Group group = new Group();
        group.getChildren().addAll(bottomRectangle, face, rightEye, leftEye, rightPupil, leftPupil);

        return group;
    }
}
