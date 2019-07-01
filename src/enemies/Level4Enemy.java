package enemies;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.Random;

import extras.Images;
import gameCore.Game;
import gameCore.GameObject;
import gameCore.HUD;
import gameCore.Handler;
import gameCore.ID;

import javax.swing.*;

public class Level4Enemy extends Enemy {

	public Level4Enemy(double xt, double yt, ID id, Handler handler, int velX, int velY, HUD hud) {
		super(0, 0, id);
		x = (random.nextInt(20) - 5) * 150;
		if (x <= 0 || x >= Game.w)
			y = random.nextInt(10) * 85;
		else
			y = random.nextInt(2) * Game.h;image = Images.getImage("enemy4");
		targetX = xt;
		targetY = yt;
		health = 8;
		this.velX = velX;
		this.velY = velY;
		this.handler = handler;
		eggSpeed = 6;
		eggProbability = 20d;
		this.hud = hud;
		score = 100;
	}

	public void tick() {
		super.tick();
	}


	public void render(Graphics g) {
		super.render(g);

	}

	public Rectangle getBounds() {
		return super.getBounds();
	}
}
