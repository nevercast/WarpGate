package eldertrolls.warpgate.common.blocks;

import java.util.Random;

import eldertrolls.warpgate.common.core.Constants;
import eldertrolls.warpgate.common.items.ItemHandler;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockCatalystOre extends BlockETOre {

	protected BlockCatalystOre(int id) {
		super(id, Constants.Blocks.CatalystOreTexture);
		setHardness(2);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.ItemTachyonCatalyst.shiftedIndex;	
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return 2 + random.nextInt(2);
	}


}
