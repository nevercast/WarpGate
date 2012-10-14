package eldertrolls.warpgate.client.model;

import org.lwjgl.opengl.GL11;

import eldertrolls.warpgate.common.core.Constants;
import eldertrolls.warpgate.common.tile.TileWarpGate;
import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;
import net.minecraftforge.client.ForgeHooksClient;

public class ModelWarpGate extends ModelBase
{
	
	public float scale = 1.0f / 16f;
	
  //fields
    ModelRenderer WarpPlate;
    ModelRenderer FootLeft;
    ModelRenderer FootRight;
  
  public ModelWarpGate()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      WarpPlate = new ModelRenderer(this, 0, 0);
      WarpPlate.addBox(2F, 0F, 2F, 12, 1, 12);
      WarpPlate.setRotationPoint(0F, /*23F*/0F, 0F);
      WarpPlate.setTextureSize(64, 32);
      WarpPlate.mirror = false;
      setRotation(WarpPlate, 0F, 0F, 0F);
      FootLeft = new ModelRenderer(this, 0, 13);
      FootLeft.addBox(0F, 0F, -6F, 2, 1, 12);
      FootLeft.setRotationPoint(1F, -0.98F, 8F);
      FootLeft.setTextureSize(64, 32);
      FootLeft.mirror = false;
      setRotation(FootLeft, 0F, 0F, 0.5235988F);
      FootRight = new ModelRenderer(this, 0, 13);
      FootRight.addBox(-2F, 0F, -6F, 2, 1, 12);
      FootRight.setRotationPoint(15F, -0.98F, 8F);
      FootRight.setTextureSize(64, 32);
      FootRight.mirror = false;
      setRotation(FootRight, 0F, 0F, -0.5235988F);
  }
  
  public void render(TileWarpGate entity, double x, double y, double z){
	  	  
	  GL11.glPushMatrix();
     // GL11.glDisable(GL11.GL_LIGHTING);

      GL11.glTranslated(x, y, z);
      ForgeHooksClient.bindTexture(Constants.Rendering.WARPGATE_TEXTURE, 0);
      
      render(scale);

      GL11.glEnable(GL11.GL_LIGHTING);
      GL11.glPopMatrix();
  }
  
  public void render(float scale){
      WarpPlate.render(scale);
	    FootLeft.render(scale);
	    FootRight.render(scale);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
