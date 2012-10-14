package eldertrolls.warpgate.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonCatalyst extends Item
{
    public ItemTachyonCatalyst(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}