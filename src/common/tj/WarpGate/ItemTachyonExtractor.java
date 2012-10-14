package ElderTrolls.WarpGate;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTachyonExtractor extends Item
{
    public ItemTachyonExtractor(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}