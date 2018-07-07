package endreborn.objects.items;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemEnderBow extends ItemBow implements IHasModel
{
    public ItemEnderBow(String name)
    {
    	setUnlocalizedName(name);
        setMaxDamage(1024);
    	setRegistryName(name);
    	setCreativeTab(RebornofEnd.endertab);
    	
    	ItemInit.ITEMS.add(this);
    }
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 152000;
    }
	public static float getArrowVelocity(int charge)
    {
        float f = (float)charge / 30.0F;
        f = (f * f + f * 3.0F) / 4.0F;

        if (f > 1.0F)
        {
            f = 1.0F;
        }

        return f;
    }
	
                
	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}

}