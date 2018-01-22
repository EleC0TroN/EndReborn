package endreborn.objects.food;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class FoodEnderFlesh extends ItemFood implements IHasModel
{
	private PotionEffect[] effects;

	public FoodEnderFlesh(String name,
			PotionEffect... potionEffects) 
	{
		super(4, 0.4F, false);
		setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(RebornofEnd.endertab);
    	setPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 100, 0), 0.6F);
    	effects = potionEffects;
    	
    	ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		for (PotionEffect effect : this.effects) {
			player.addPotionEffect(new PotionEffect(effect));
		}
}
}

