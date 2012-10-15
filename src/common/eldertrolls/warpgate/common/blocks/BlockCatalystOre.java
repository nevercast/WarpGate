package eldertrolls.warpgate.common.blocks;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockCatalystOre extends BlockETBase {

	protected BlockCatalystOre(int id) {
		super(id, Material.rock);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return null;
	}
	
	@Override
	public int getBlockTextureFromSide(int side) {
		return Constants.Blocks.CatalystOreTexture;
	}

}
