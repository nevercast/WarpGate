package eldertrolls.warpgate.common.items;

import net.minecraft.src.Item;
import eldertrolls.warpgate.common.core.Constants;

public class ItemETBase extends Item {

	
    protected ItemETBase(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	public String getTextureFile() {
    	return Constants.Items.TextureFile;
    }
}
