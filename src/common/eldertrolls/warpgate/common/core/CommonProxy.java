package eldertrolls.warpgate.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import eldertrolls.warpgate.common.blocks.BlockHandler;
import eldertrolls.warpgate.common.items.ItemHandler;
import eldertrolls.warpgate.common.tile.TileWarpGate;

public class CommonProxy {

	public void initRenderingAndTextures(){
		
	}
	
	public void initTileEntities(){
		GameRegistry.registerTileEntity(TileWarpGate.class, Constants.Blocks.WarpGateName);
	}
	
	public void initLanguages() {
		LanguageRegistry.addName(BlockHandler.warpGate, Constants.Blocks.WarpGateFriendlyName);
		LanguageRegistry.addName(BlockHandler.catalystOre, Constants.Blocks.CatalystOreFriendlyName);
		
		LanguageRegistry.addName(ItemHandler.ItemTachyonCrystal, Constants.Items.TachyonCrystalFriendlyName);
		LanguageRegistry.addName(ItemHandler.ItemTachyonIngot, Constants.Items.TachyonIngotFriendlyName);
		LanguageRegistry.addName(ItemHandler.ItemTachyonCatalyst, Constants.Items.TachyonCatalystFriendlyName);
	}
	
	public void initRecipies(){
		 GameRegistry.addRecipe(new ItemStack(ItemHandler.ItemTachyonCrystal), new Object[]
				    {
				     "ICI", "CDC", "ICI", 'I', Item.ingotIron, 'C', ItemHandler.ItemTachyonCatalyst, 'D', Item.diamond
				    });
		 
	}
}
