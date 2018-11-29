package endreborn.objects.food;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;


public class FoodEnderFlesh extends ItemFood implements IHasModel
{
	public FoodEnderFlesh(String name) 
	{
		super(4, 0.4F, false);
		setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(RebornofEnd.endertab);
    	setPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 100, 1), 0.6F);
    	ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

