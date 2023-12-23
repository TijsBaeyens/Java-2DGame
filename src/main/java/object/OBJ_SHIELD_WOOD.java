package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SHIELD_WOOD extends Entity{

	public OBJ_SHIELD_WOOD(GamePanel gp) {
		super(gp);
		
		type = type_shield;
		name = "Wood Shield";
		down1 = setup("/objects/shield_wood", gp.tileSize, gp.tileSize);
		defenseValue = 1;
		description = "[" + name + "]\nMade by wood.";
	}

}
