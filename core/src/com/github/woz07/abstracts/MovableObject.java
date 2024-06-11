package com.github.woz07.abstracts;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public abstract class MovableObject {
    private Integer width, height;
    private Integer speed;
    private Vector2 position;
    private Sprite sprite;
    
    public MovableObject(Integer width, Integer height, Integer speed, Vector2 position, Sprite sprite) {
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.position = position;
        this.sprite = sprite;
    }
    
//    /**
//     * Method to move object
//     * @param delta The delta time
//     * @param directionX The X direction to move to
//     * @param directionY The Y direction to move to
//     */
//    public void move(float delta, int directionX, int directionY) {
//        getPosition().x += (directionX * delta);
//        getPosition().y += (directionY * delta);
//    }
    
    /**
     * Method to dispose properly
     */
    public void dispose() {
        width = null;
        height = null;
        speed = null;
        position = null;
        sprite.getTexture().dispose();
        sprite = null;
    }
    
    // Setters & Getters
    
    public Integer getWidth() {
        return width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    public Integer getSpeed() {
        return speed;
    }
    
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    
    public Vector2 getPosition() {
        return position;
    }
    
    public void setPosition(Vector2 position) {
        this.position = position;
    }
    
    public Sprite getSprite() {
        return sprite;
    }
    
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
