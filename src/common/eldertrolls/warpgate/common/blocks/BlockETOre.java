package eldertrolls.warpgate.common.blocks;

import java.util.Random;

import eldertrolls.warpgate.common.core.Constants;

import net.minecraft.src.BlockOre;

public abstract class BlockETOre extends BlockOre {

	public BlockETOre(int id, int texture) {
		super(id, texture);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public abstract int idDropped(int par1, Random par2Random, int par3);
	
	
	public String getTextureFile() {
		return Constants.Reference.BLOCKTEXTURE;
	}

}
