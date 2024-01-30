package entity;

import main.GamePanel;
import object.OBJ_AXE;
import object.OBJ_KEY;
import object.OBJ_POTION_RED;

public class NPC_Merchant extends Entity {
		public NPC_Merchant(GamePanel gp) {
			super(gp);
			
			direction = "down";
			speed = 0;
			
			getImage();
			setDialogue();
		}
		public void getImage() {	
			up1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
			up2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
			
			down1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
			down2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
			
			left1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
			left2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
			
			right1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
			right2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
		}
		
		public void setDialogue() {
			dialogues[0] = "You have finaly found me. \nI have some good stuff.\nDo you want to trade ?";
		}
		
		public void setItems() {
			inventory.add(new OBJ_POTION_RED(gp));
			inventory.add(new OBJ_KEY(gp));
			inventory.add(new OBJ_AXE(gp));
		}
		public void speak() {
			super.speak();
			gp.gameState = gp.tradeState;
			gp.ui.npc = this;
		}
}
