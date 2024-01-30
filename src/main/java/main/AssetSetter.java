package main;

import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_Green_Slime;
import object.OBJ_AXE;
import object.OBJ_BOOTS;
import object.OBJ_CHEST;
import object.OBJ_COIN_BRONZE;
import object.OBJ_DOOR;
import object.OBJ_HEART;
import object.OBJ_KEY;
import object.OBJ_MANACRYSTAL;
import object.OBJ_POTION_RED;
import object.OBJ_SHIELD_BLUE;
import tile_interactive.IT_DRY_TREE;

public class AssetSetter {
	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	public void setObject() {
		int mapNum = 0;
		int i = 0;
		gp.obj[mapNum][i] = new OBJ_COIN_BRONZE(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*25;
		gp.obj[mapNum][i].worldY = gp.tileSize*23;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_HEART(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*21;
		gp.obj[mapNum][i].worldY = gp.tileSize*19;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_POTION_RED(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*26;
		gp.obj[mapNum][i].worldY = gp.tileSize*21;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_AXE(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*29;
		gp.obj[mapNum][i].worldY = gp.tileSize*21;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_SHIELD_BLUE(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*28;
		gp.obj[mapNum][i].worldY = gp.tileSize*21;
		i++;
		
		gp.obj[mapNum][i] = new OBJ_MANACRYSTAL(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*22;
		gp.obj[mapNum][i].worldY = gp.tileSize*19;
		i++;
		
	}
	public void setNPC() {
		int mapNum = 0;
		int i = 0;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*21;
		gp.npc[mapNum][i].worldY = gp.tileSize*21;
		i++;
		
		mapNum = 1;
		i = 0;
		gp.npc[mapNum][i] = new NPC_Merchant(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*12;
		gp.npc[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
	}
	public void setMonster() {
		int mapNum = 0;
		int i = 0;
		gp.monster[mapNum][i] = new MON_Green_Slime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] = new MON_Green_Slime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		gp.monster[mapNum][i] = new MON_Green_Slime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		gp.monster[mapNum][i] = new MON_Green_Slime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*25;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		gp.monster[mapNum][i] = new MON_Green_Slime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*38;
		i++;
	}
	public void setInteractiveTile() {
		int mapNum = 0;
		int i = 0;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 27, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 28, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 29, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 30, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 31, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 32, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 33, 12);i++;
		gp.iTile[mapNum][i] = new IT_DRY_TREE(gp, 30, 20);i++;
	}
}
