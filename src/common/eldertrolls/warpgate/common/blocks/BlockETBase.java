package eldertrolls.warpgate.common.blocks;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public abstract class BlockETBase extends BlockContainer {

	protected BlockETBase(int id, Material mat) {
		super(id, mat);

		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public String getTextureFile() {
		return Constants.Reference.BLOCKTEXTURE;
	}
}
