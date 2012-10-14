package eldertrolls.warpgate.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonFieldGen extends Item
{
    public ItemTachyonFieldGen(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}