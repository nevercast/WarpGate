package eldertrolls.warpgate.common.items;

import net.minecraft.src.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import eldertrolls.warpgate.common.blocks.BlockWarpGate;
import eldertrolls.warpgate.common.core.Constants;

public class ItemHandler {
	
	public static Item ItemTachyonCrystal;
	public static Item ItemTachyonPlate;
	public static Item ItemTachyonExtractor;
	public static Item ItemTachyonFieldGen;
	
	public static void init(){
				
		ItemTachyonCrystal = new ItemTachyonCrystal(550).setIconIndex(1).setItemName("ItemTachyonCrystal");
		ItemTachyonPlate = new ItemTachyonPlate(551).setIconIndex(2).setItemName("ItemTachyonPlate");
		ItemTachyonExtractor = new ItemTachyonExtractor(552).setIconIndex(3).setItemName("ItemTachyonExtractor");
		ItemTachyonFieldGen = new ItemTachyonFieldGen(553).setIconIndex(4).setItemName("ItemTachyonFieldGen");
	}
}
