package com.github.woz07.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

public class Ball extends MovableObject {
    private Integer hp;
    public Ball(int width, int height, int speed, Vector2 position, Sprite sprite, Integer hp) {
        super(width, height, speed, position, sprite);
        this.hp = hp;
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
}
