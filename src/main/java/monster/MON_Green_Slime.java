package monster;

import java.util.Random;

import entity.Entity;
import main.GamePanel;
import object.OBJ_COIN_BRONZE;
import object.OBJ_HEART;
import object.OBJ_MANACRYSTAL;
import object.OBJ_ROCK;

public class MON_Green_Slime extends Entity {
	GamePanel gp;

	public MON_Green_Slime(GamePanel gp) {
		super(gp);
		
		this.gp = gp;
		
		type = type_monster;
		name = "Green Slime";
		speed = 1;
		maxLife = 4;
		life = maxLife;
		attack = 5;
		defense = 0;
		exp = 2;
		projectile = new OBJ_ROCK(gp);
		
		solidArea.x = 3;
		solidArea.y = 18;
		solidArea.width = 42;
		solidArea.height = 30;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		
		getImage();
	}
	public void getImage() {
		up1 = setup("/monster/greenslime_down_1", gp.tileSize, gp.tileSize);
		up2 = setup("/monster/greenslime_down_2", gp.tileSize, gp.tileSize);
		down1 = setup("/monster/greenslime_down_1", gp.tileSize, gp.tileSize);
		down2 = setup("/monster/greenslime_down_2", gp.tileSize, gp.tileSize);
		left1 = setup("/monster/greenslime_down_1", gp.tileSize, gp.tileSize);
		left2 = setup("/monster/greenslime_down_2", gp.tileSize, gp.tileSize);
		right1 = setup("/monster/greenslime_down_1", gp.tileSize, gp.tileSize);
		right2 = setup("/monster/greenslime_down_2", gp.tileSize, gp.tileSize);
	}
	public void setAction() {
		actionLockCounter++;
		
		if(actionLockCounter == 120) {
		Random random = new Random();
		int i = random.nextInt(100)+1; // pick a number from 1 to 100
		
		if (i <= 25) {
			direction = "up";
		}
		if (i > 25 && i <= 50) {
			direction = "down";
		}
		if (i > 50 && i <= 75) {
			direction = "left";
		}
		if (i > 75 && i <= 100) {
			direction = "right";
		}
		actionLockCounter = 0;
		}
		int i = new Random().nextInt(100)+1;
		if(i > 99 && projectile.alive == false && shotAvailableCounter == 30) {
			projectile.set(worldX, worldY, direction, true, this);
			gp.projectileList.add(projectile);
			shotAvailableCounter = 0;
		}
	}
	public void damageReaction() {
		actionLockCounter = 0;
		direction = gp.player.direction;
	}
	public void checkDrop() {
		
		// CAST A DIE
		int i = new Random().nextInt(100) + 1;
		
		// SET THE MONSTER DROP
		if(i < 50) {
			dropItem(new OBJ_COIN_BRONZE(gp));
		}
		if (i >= 50 && i < 75) {
			dropItem(new OBJ_HEART(gp));
		}
		if (i >= 75 && i < 100) {
			dropItem(new OBJ_MANACRYSTAL(gp));
		}
	}
}
