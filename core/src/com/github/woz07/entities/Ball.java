package com.github.woz07.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

import java.util.Random;

public class Ball extends MovableObject {
    private Integer hp;
    
    public Ball(int width, int height, int speed, Vector2 position, Sprite sprite, Integer hp) {
        super(width, height, speed, position, sprite);
        this.hp = hp;
        sprite.setScale(4f);
        
        // Todo:
        //  - Work on ball.java
        //  - Get it working the same as pang where the ball curves before it drops
    }
    
    /**
     * Method to move ball
     * @param delta The delta time
     */
    public void move(float delta) {
    
    }
    
    /**
     * This is the method used to adjust the Ball
     * based on its hp
     */
    private void adjust() {
    
    }
    
    /**
     * This is the method used to let the ball know
     * that it's been hit
     */
    public void hit() {
        this.hp -= 25;
        adjust();
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
}
