package com.github.woz07;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.github.woz07.entities.Player;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		player = new Player(32, 32, 50, new Vector2(640, 360), new Sprite(new Texture("player.png")));
//		player.getSprite().flip(true, true);  Can be used for rotating the player when moved
		// Todo:
		//  - Find right scale for player
		// 	- Work on player movement
		//  - Use player::getSprite()::flip(bool, bool) for movement turning
		//  - Create player facing up, for when player shoots it'll change to that image
	}

	@Override
	public void render() {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		player.getSprite().draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose() {
		batch.dispose();
	}
}
