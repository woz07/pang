package com.github.woz07.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.github.woz07.abstracts.MovableObject;

public class Player extends MovableObject {
    private final Texture front = new Texture("player-front.png");
    private final Texture back = new Texture("player-back.png");
    private final Texture side = new Texture("player-side.png");
    public Player(int width, int height, int speed, Vector2 position, Sprite sprite) {
        super(width, height, speed, position, sprite);
        sprite.setScale(4f);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        front.dispose();
        back.dispose();
        side.dispose();
    }
    
    public Texture getFrontTexture() {
        return front;
    }
    
    public Texture getBackTexture() {
        return back;
    }
    
    public Texture getSideTexture() {
        return side;
    }
}
