package eldertrolls.warpgate.common.items;

import net.minecraft.src.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import eldertrolls.warpgate.common.blocks.BlockWarpGate;
import eldertrolls.warpgate.common.core.Constants;

public class ItemHandler {
	
	public static Item ItemTachyonCrystal;
	public static Item ItemTachyonCatalyst;
	public static Item ItemTachyonCrystalCharged;
	public static Item ItemTachyonIngot;
	
	public static void init(){
				
		ItemTachyonCrystal = new ItemTachyonCrystal(Constants.Items.TachyonCrystal, false).setIconCoord(2,0).setItemName(Constants.Items.TachyonCrystalName);
		ItemTachyonCatalyst = new ItemTachyonCatalyst(Constants.Items.TachyonCatalyst).setIconCoord(0, 0).setItemName(Constants.Items.TachyonCatalystName);
		ItemTachyonCrystalCharged = new ItemTachyonCrystal(Constants.Items.TachyonCrystalCharged, true).setIconCoord(1, 0).setItemName(Constants.Items.TachyonCrystalName);
		ItemTachyonIngot = new ItemTachyonCrystal(Constants.Items.TachyonIngot, false).setIconCoord(3,0).setItemName(Constants.Items.TachyonIngotName);
	}
}
