package eldertrolls.warpgate.common.items;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonCrystal extends ItemETBase
{
	private boolean charged;
	
    public ItemTachyonCrystal(int i, boolean charged)
    {
        super(i);
        this.charged = charged;
        if(charged){
        	maxStackSize = 1;
        }else{
        	maxStackSize = 64;
        }
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

	private boolean isCharged() {
		return charged;
	}
    
}