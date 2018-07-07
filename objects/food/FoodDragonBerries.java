package endreborn.objects.food;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.ItemFood;


public class FoodDragonBerries extends ItemFood implements IHasModel
{

	public FoodDragonBerries(String name) 
	{
		super(1, 0.1F, false);
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

}


