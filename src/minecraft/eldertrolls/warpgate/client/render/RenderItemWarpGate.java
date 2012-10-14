package eldertrolls.warpgate.client.render;

import org.lwjgl.opengl.GL11;

import eldertrolls.warpgate.client.model.ModelWarpGate;
import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Tessellator;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemWarpGate implements IItemRenderer {

	ModelWarpGate warpGateModel = new ModelWarpGate();
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
			case ENTITY: renderWarpGate(-0.5F, 0.5F, -0.5F); break;
			case EQUIPPED: renderWarpGate(0F, 0.4F, 0F); break;
			case INVENTORY: renderWarpGate(1F, 0.65F, 1F); break;
		default: break;
	}

	}
	
	private void renderWarpGate(float x, float y, float z){
		Tessellator tesselator = Tessellator.instance;
		ForgeHooksClient.bindTexture(Constants.Rendering.WARPGATE_TEXTURE, 0);
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
		warpGateModel.render(0.0625f);
	    GL11.glPopMatrix(); //end

	}

}
