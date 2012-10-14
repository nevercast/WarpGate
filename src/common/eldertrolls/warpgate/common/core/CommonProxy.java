package eldertrolls.warpgate.common.core;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import eldertrolls.warpgate.common.blocks.BlockHandler;
import eldertrolls.warpgate.common.tile.TileWarpGate;

public class CommonProxy {

	public void initRenderingAndTextures(){
		
	}
	
	public void initTileEntities(){
		GameRegistry.registerTileEntity(TileWarpGate.class, Constants.Blocks.WARPGATE_NAME);
	}
	
	public void initLanguages() {
		LanguageRegistry.addName(BlockHandler.warpGate, Constants.Blocks.WARPGATE_FRIENDLYNAME);
	}
}
