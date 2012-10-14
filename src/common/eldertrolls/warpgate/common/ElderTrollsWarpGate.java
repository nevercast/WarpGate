package eldertrolls.warpgate.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import eldertrolls.warpgate.common.blocks.BlockHandler;
import eldertrolls.warpgate.common.core.CommonProxy;
import eldertrolls.warpgate.common.core.Constants;
import eldertrolls.warpgate.common.core.Constants.Reference;
import eldertrolls.warpgate.common.items.ItemHandler;

@Mod(modid=Reference.MOD_ID, name = Reference.MOD_NAME, version=Reference.MOD_VERSION)
@NetworkMod( channels = { Reference.NET_CHANNEL }, clientSideRequired = true, serverSideRequired = true)
public class ElderTrollsWarpGate {
	
	@Instance(Reference.MOD_ID)
	public static ElderTrollsWarpGate instance;
	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event){
		
		BlockHandler.init();
		
		ItemHandler.init();
		
		proxy.initRenderingAndTextures();
		
		proxy.initTileEntities();
		
		proxy.initLanguages();
		
		proxy.initRecipies();
	}

}
