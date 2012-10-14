package eldertrolls.warpgate.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.Block;

public class BlockHandler {

	public static Block warpGate;
	
	public static void init(){
		warpGate = new BlockWarpGate(Constants.Blocks.WARPGATE).setBlockName(Constants.Blocks.WARPGATE_NAME);
		
		GameRegistry.registerBlock(warpGate);
	}
}
