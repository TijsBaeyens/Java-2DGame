package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_MANACRYSTAL extends Entity {
	GamePanel gp;
	public OBJ_MANACRYSTAL(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		type = type_pickupOnly;
		name = "Mana crystal";
		value = 1;
		down1 = setup("/objects/manacrystal_full", gp.tileSize, gp.tileSize);
		image = setup("/objects/manacrystal_full", gp.tileSize, gp.tileSize);
		image2 = setup("/objects/manacrystal_blank", gp.tileSize, gp.tileSize);
	}
	public void use(Entity entity) {
		gp.playSE(2);
		gp.ui.addMessage("Mana " + value);
		entity.mana += value;
	}
}
