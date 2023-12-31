package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_POTION_RED extends Entity{
	
	GamePanel gp;

	public OBJ_POTION_RED(GamePanel gp) {
		super(gp);
		
		this.gp = gp;

		type = type_consumable;
		name = "Red Potion";
		value = 5;
		down1 = setup("/objects/potion_red", gp.tileSize, gp.tileSize);
		description = "[Red Potion]\nHeals your life by " + value + ".";
	}
	public void use(Entity entity) {
		gp.gameState = gp.dialogueState;
		gp.ui.currentDialogue = "You drink the " + name + "!\n" +
				"Your life has been recovered by " + value + ".";
		entity.life += value;
		if(gp.player.life > gp.player.maxLife) {
			gp.player.life = gp.player.maxLife;
		}
		gp.playSE(2);
		
	}

}
