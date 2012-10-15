package eldertrolls.warpgate.common.items;

import net.minecraft.src.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import eldertrolls.warpgate.common.blocks.BlockWarpGate;
import eldertrolls.warpgate.common.core.Constants;

public class ItemHandler {
	
	public static Item ItemTachyonCrystal;
	public static Item ItemTachyonCatalyst;
	
	public static void init(){
				
		ItemTachyonCrystal = new ItemTachyonCrystal(Constants.Items.TachyonCrystal).setIconIndex(1).setItemName(Constants.Items.TachyonCrystalName);
		ItemTachyonCatalyst = new ItemTachyonCatalyst(Constants.Items.TachyonCatalyst).setIconCoord(0, 0).setItemName(Constants.Items.TachyonCatalystName);
		
	}
}
