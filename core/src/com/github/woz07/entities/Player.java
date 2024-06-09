package com.github.woz07.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

public class Player extends MovableObject {
    public Player(int width, int height, int speed, Vector2 position, Sprite image) {
        super(width, height, speed, position, image);
    }
}
