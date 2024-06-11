package com.github.woz07.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

public class Bullet extends MovableObject {
    public Bullet(int width, int height, int speed, Vector2 position, Sprite sprite) {
        super(width, height, speed, position, sprite);
    }
}
