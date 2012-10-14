package eldertrolls.warpgate.client.core;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import eldertrolls.warpgate.client.render.RenderItemWarpGate;
import eldertrolls.warpgate.client.render.RenderWarpGate;
import eldertrolls.warpgate.common.core.CommonProxy;
import eldertrolls.warpgate.common.core.Constants;
import eldertrolls.warpgate.common.tile.TileWarpGate;

public class ClientProxy extends CommonProxy {

	@Override
	public void initRenderingAndTextures() {
		Constants.Rendering.WARPGATE_RENDER = RenderingRegistry.getNextAvailableRenderId();
		
		MinecraftForgeClient.registerItemRenderer(Constants.Blocks.WARPGATE, new RenderItemWarpGate());

	}
	
	@Override
	public void initTileEntities() {
		super.initTileEntities();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileWarpGate.class, new RenderWarpGate());
	}
}
