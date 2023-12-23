package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_SWORD_NORMAL extends Entity{
	
	public OBJ_SWORD_NORMAL(GamePanel gp) {
		super(gp);
		
		type = type_sword;
		name = "Normal Sword";
		down1 = setup("/objects/sword_normal", gp.tileSize, gp.tileSize);
		attackValue = 1;
		description = "[" + name + "]\nAn old sword.";
		attackArea.width = 36;
		attackArea.height = 36;
	}
	
}
