package eldertrolls.warpgate.common.blocks;

import net.minecraft.src.BlockContainer;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public abstract class BlockETBase extends BlockContainer {

	protected BlockETBase(int id, Material mat) {
		super(id, mat);
	}
}
