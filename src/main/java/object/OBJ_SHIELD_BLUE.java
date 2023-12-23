package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SHIELD_BLUE extends Entity{
	public OBJ_SHIELD_BLUE(GamePanel gp) {
		super(gp);
	
		type = type_shield;
		name = "Blue Shield";
		down1 = setup("/objects/shield_blue", gp.tileSize, gp.tileSize);
		defenseValue = 2;
		description = "[" + name + "]\nA shiny blue shield.";
	}
}
