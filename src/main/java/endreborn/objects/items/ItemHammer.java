package endreborn.objects.items;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item implements IHasModel
{
    public ItemHammer(String name)
    {
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(RebornofEnd.endertab);
    	setMaxStackSize(1);
    	
    	ItemInit.ITEMS.add(this);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) 
    {
    	return true;
    }
    
    @Override
    public ItemStack getContainerItem(ItemStack stack) 
    {
		return new ItemStack(ItemInit.HAMMER_IRON);
        
    }
    
	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
