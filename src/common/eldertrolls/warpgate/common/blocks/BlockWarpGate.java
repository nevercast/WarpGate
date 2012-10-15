package eldertrolls.warpgate.common.blocks;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import eldertrolls.warpgate.common.core.Constants.Rendering;
import eldertrolls.warpgate.common.tile.TileWarpGate;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockWarpGate extends BlockETBase {

	protected BlockWarpGate(int id){
		super(id, Material.rock);
		setBlockBounds(2f/16f,0f,2f/16f,14f/16f,2f/16f,14f/16f);
		setHardness(3.5f);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileWarpGate();
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return Rendering.WARPGATE_RENDER;
	}

	@Override
	public int getBlockTextureFromSide(int par1) {
		return 1;
	}
	
	/* Only place the Warp Gate on solid blocks */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return par1World.isBlockSolidOnSide(par2, par3-1, par4, ForgeDirection.UP);
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y,
			int z, int par4) {
		
		/* Check that we are still on a solid block */
		if(!world.isBlockSolidOnSide(x, y-1, z, ForgeDirection.UP)){
			this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
			world.setBlockWithNotify(x, y, z, 0);
		}
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return blockID;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return 1;
	}

}
