package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_AXE extends Entity{
	
	public OBJ_AXE(GamePanel gp) {
		super(gp);
		
		type = type_axe;
		name = "Woodcutter's Axe";
		down1 = setup("/objects/axe", gp.tileSize, gp.tileSize);
		attackValue = 2;
		attackArea.width = 30;
		attackArea.height = 30;
		description = "[Woodcutter's axe]\nA bit rusty but still \ncan cut some trees.";
	}
}
