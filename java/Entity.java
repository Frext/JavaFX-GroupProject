package com.group1.groupproject;

public abstract class Entity {
    protected double x,y;
    protected double speedX, speedY;
    protected boolean isVisible = true;

    public Entity(double x, double y, boolean isVisible){
        this.x = x;
        this.y = y;
        this.isVisible = isVisible;

        draw();
    }
    public abstract void move(double minX, double maxX, double minY, double maxY);

    public abstract void draw();
}
