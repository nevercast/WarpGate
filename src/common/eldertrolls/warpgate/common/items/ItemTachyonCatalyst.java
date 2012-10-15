package eldertrolls.warpgate.common.items;

import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonCatalyst extends ItemETBase
{
    public ItemTachyonCatalyst(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}