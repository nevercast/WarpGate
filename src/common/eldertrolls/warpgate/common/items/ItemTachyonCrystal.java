package eldertrolls.warpgate.common.items;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonCrystal extends ItemETBase
{
    public ItemTachyonCrystal(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    
}