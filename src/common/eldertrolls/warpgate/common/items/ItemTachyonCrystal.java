package eldertrolls.warpgate.common.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import eldertrolls.warpgate.common.core.Constants;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class ItemTachyonCrystal extends ItemETBase
{
	private boolean charged;
	
    public ItemTachyonCrystal(int i, boolean charged)
    {
        super(i);
        this.charged = charged;
        if(charged){
        	setMaxDamage(10);
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