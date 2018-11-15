package endreborn.objects.items;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLegendary extends Item implements IHasModel
{
    public ItemLegendary(String name)
    {
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(RebornofEnd.endertab);
    	
    	ItemInit.ITEMS.add(this);
    }

	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
	    return EnumRarity.RARE;
	}
}
