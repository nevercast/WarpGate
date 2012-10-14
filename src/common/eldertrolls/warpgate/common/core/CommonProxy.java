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
		
		LanguageRegistry.addName(ItemHandler.ItemTachyonCrystal, Constants.Items.TachyonCrystalFriendlyName);
		LanguageRegistry.addName(ItemHandler.ItemTachyonPlate, Constants.Items.TachyonPlateFriendlyName);
		LanguageRegistry.addName(ItemHandler.ItemTachyonExtractor, Constants.Items.TachyonExtractorFriendlyName);
		LanguageRegistry.addName(ItemHandler.ItemTachyonFieldGen, Constants.Items.TachyonFieldGenFriendlyName);
	}
	
	public void initRecipies(){
		 GameRegistry.addRecipe(new ItemStack(ItemHandler.ItemTachyonCrystal), new Object[]
				    {
				     "XZX", "ZYZ", "XZX", 'Z', Item.redstone, 'X', Item.lightStoneDust, 'Y', Item.diamond
				    });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemHandler.ItemTachyonPlate), new Object[]
				    {
				     "IRI", "RTR", "IRI", 'R', Item.redstone, 'I', Item.ingotIron, 'Z', ItemHandler.ItemTachyonCrystal, 'T', Block.obsidian
				    });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemHandler.ItemTachyonExtractor), new Object[]
				    {
				     "XRX", "RXR", "TYT", 'R', Item.redstone, 'P', ItemHandler.ItemTachyonPlate,'Z', ItemHandler.ItemTachyonCrystal, 'T', Block.obsidian
				    });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemHandler.ItemTachyonFieldGen), new Object[]
				    {
				     "XZX", "ZXZ", "TYT", 'X', Item.ingotIron, 'Y', Item.redstone, 'Z', ItemHandler.ItemTachyonCrystal, 'T', Block.obsidian
				    });	 
	}
}
