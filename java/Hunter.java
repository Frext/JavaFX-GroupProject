package com.group1.groupproject;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;

public class Hunter extends Entity {
    public Group implementView(){
        Group group = new Group();
        Circle circle = new Circle(15);
        circle.setFill(Color.ORANGE);

        Polygon triangle = new Polygon();

        // Triangle points right which is 0 degree
        triangle.getPoints().addAll(0.0,0.0, -100.0, -30.0, -100.0, 30.0);
        triangle.setFill(Color.RED);
        triangle.setOpacity(.5);

        group.getChildren().addAll(triangle, circle);

        group.parentProperty().addListener((observable,  oldValue, parent) -> {
            if (parent != null){
                parent.setOnMouseMoved(e->  {
                    // TODO: Change rotation for triangle
                });
            }
        });

        return group;
    }

    public Hunter(double x, double y) {
        super(x, y, true);
    }

    @Override
    public void move(double minX, double maxX, double minY, double maxY) {
        // TODO: implement WASD Movement
    }
}
