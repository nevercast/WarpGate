package ElderTrolls.WarpGate;

import net.minecraft.src.Achievement;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Achievement;
import net.minecraft.src.AchievementList;

@Mod(modid = "YourName_ModName", name = "ModName", version = "Version number")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class WarpGate_Core 
{
 
	public static Item ItemTachyonCrystal;
	public static Item ItemTachyonPlate;
	public static Item ItemTachyonExtractor;
	public static Item ItemTachyonFieldGen;
 @Init
 public void load(FMLInitializationEvent event) 
 {

	 //ItemTachyonCrystal
	 ItemTachyonCrystal = new ItemTachyonCrystal(550).setIconIndex(1).setItemName("ItemTachyonCrystal");
	 LanguageRegistry.addName(ItemTachyonCrystal, "Tachyon Crystal");
	 GameRegistry.addRecipe(new ItemStack(ItemTachyonCrystal), new Object[]
			    {
			     "XZX", "ZYZ", "XZX", 'Z', Item.redstone, 'X', Item.lightStoneDust, 'Y', Item.diamond
			    });
	 
	//ItemTachyonPlate
	 ItemTachyonPlate = new ItemTachyonPlate(551).setIconIndex(2).setItemName("ItemTachyonPlate");
		 LanguageRegistry.addName(ItemTachyonPlate, "Containment Plate");
		 GameRegistry.addRecipe(new ItemStack(ItemTachyonPlate), new Object[]
				    {
				     "IRI", "RTR", "IRI", 'R', Item.redstone, 'I', Item.ingotIron, 'Z', ItemTachyonCrystal, 'T', Block.obsidian
				    });
		 
	 //ItemTachyonExtractor
	 ItemTachyonExtractor = new ItemTachyonExtractor(552).setIconIndex(3).setItemName("ItemTachyonExtractor");
	 LanguageRegistry.addName(ItemTachyonExtractor, "Tachyon Extractor");
	 GameRegistry.addRecipe(new ItemStack(ItemTachyonExtractor), new Object[]
			    {
			     "XRX", "RXR", "TYT", 'R', Item.redstone, 'P', ItemTachyonPlate,'Z', ItemTachyonCrystal, 'T', Block.obsidian
			    });
	 
	 //ItemTachyonFieldGen
	 ItemTachyonFieldGen = new ItemTachyonFieldGen(553).setIconIndex(4).setItemName("ItemTachyonFieldGen");
	 LanguageRegistry.addName(ItemTachyonFieldGen, "Tachyon Field Generator");
	 GameRegistry.addRecipe(new ItemStack(ItemTachyonFieldGen), new Object[]
			    {
			     "XZX", "ZXZ", "TYT", 'X', Item.ingotIron, 'Y', Item.redstone, 'Z', ItemTachyonCrystal, 'T', Block.obsidian
			    });	 
 }
 
}
