package eldertrolls.warpgate.common.tile;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;

public class TileWarpGate extends TileETBase implements IInventory {

	private ItemStack[] warpGateInventory = new ItemStack[1];
	
	@Override
	public int getSizeInventory() {
		return warpGateInventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return warpGateInventory[var1];
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInvName() {
		return "container." + Constants.Blocks.WarpGateName;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}

	
}
