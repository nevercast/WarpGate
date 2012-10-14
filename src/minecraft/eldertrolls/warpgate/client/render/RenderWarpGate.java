package eldertrolls.warpgate.client.render;

import org.lwjgl.opengl.GL11;

import eldertrolls.warpgate.client.model.ModelWarpGate;
import eldertrolls.warpgate.common.tile.TileWarpGate;

import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelSign;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntitySpecialRenderer;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderWarpGate extends TileEntitySpecialRenderer {

	ModelWarpGate model;
	
	public RenderWarpGate(){
		model = new ModelWarpGate();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		if(!(tileEntity instanceof TileWarpGate)) return;
		
		model.render((TileWarpGate) tileEntity, x, y, z);
	}

}
