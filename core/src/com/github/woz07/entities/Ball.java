package com.github.woz07.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

public class Ball extends MovableObject {
    private int hp;
    public Ball(int width, int height, int speed, Vector2 position, Sprite image, int hp) {
        super(width, height, speed, position, image);
        this.hp = hp;
    }
}
