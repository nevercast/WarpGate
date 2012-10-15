package eldertrolls.warpgate.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.Block;

public class BlockHandler {

	public static Block warpGate;
	public static Block catalystOre;
	
	public static void init(){
		
		warpGate = new BlockWarpGate(Constants.Blocks.WarpGate).setBlockName(Constants.Blocks.WarpGateName);
		catalystOre = new BlockCatalystOre(Constants.Blocks.CatalystOre).setBlockName(Constants.Blocks.CatalystOreName);
		GameRegistry.registerBlock(catalystOre);
		GameRegistry.registerBlock(warpGate);
	}
}
