package com.github.woz07;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.github.woz07.entities.Player;

import java.util.Objects;

public class Game extends ApplicationAdapter {
	private SpriteBatch batch;
	private Player player;
	// Player movement per tick
	// Used to prevent multi key processing, which leads to multi direction movement which we don't want
	private Boolean moved = false;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		player = new Player(
				32,
				32,
				250,
				new Vector2(640, 360),
				new Sprite(new Texture("player-front.png"))
		);
	}

	@Override
	public void render() {
		ScreenUtils.clear(0.5f, 0.5f, 0.5f, 1);
		batch.begin();
		player.getSprite().setPosition(player.getPosition().x, (int) player.getSprite().getScaleY() * 10 + 8);
		player.getSprite().draw(batch);
		batch.end();
		
		moved = false;
		
		// Player shooting
		if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && !moved) {
			if (!Objects.equals(player.getSprite().getTexture(), player.getBackTexture())) {
				player.getSprite().setTexture(player.getBackTexture());
			}
			moved = true;
		}
		
		// Player movement
		// If shooting, halt all movements
		if (!moved) {
			// Left arrow key/ A key
			if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
				if (player.getPosition().x - player.getWidth() > 0) {
					player.getPosition().x -= player.getSpeed() * Gdx.graphics.getDeltaTime();
					if (!Objects.equals(player.getSprite().getTexture(), player.getSideTexture())) {
						player.getSprite().setTexture(player.getSideTexture());
					}
					// If flipped, then flip, as left key/ A key are associated with left movement
					// and image can get flipped
					if (player.getSprite().isFlipX()) {
						player.getSprite().flip(true, false);
					}
					moved = true;
				}
			}
			// Right arrow key/ D key
			if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
				if (player.getPosition().x + player.getWidth() * 2 < Gdx.graphics.getWidth()) {
					player.getPosition().x += player.getSpeed() * Gdx.graphics.getDeltaTime();
					if (!Objects.equals(player.getSprite().getTexture(), player.getSideTexture())) {
						player.getSprite().setTexture(player.getSideTexture());
					}
					// If not flipped, then flip, as right key/ D key are associated with right movement
					// and default 'player-side' is always facing left
					if (!player.getSprite().isFlipX()) {
						player.getSprite().flip(true, false);
					}
					moved = true;
				}
			}
			
			// Player idle if no keys pressed then make player idle
			if (!moved) {
				player.getSprite().setTexture(player.getFrontTexture());
			}
		}

	}
	
	@Override
	public void dispose() {
		batch.dispose();
		
		// Player
		player.dispose();
	}
}
