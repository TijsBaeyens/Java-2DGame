package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_KEY extends Entity {
	public OBJ_KEY(GamePanel gp) {
		super(gp);
		
		name = "Key";
		down1 = setup("/objects/key", gp.tileSize, gp.tileSize);
		description = "[" + name + "]\nOpens a door.";
	}
}
