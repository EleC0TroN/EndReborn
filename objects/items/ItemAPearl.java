package endreborn.objects.items;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemAPearl extends Item implements IHasModel
{
    public ItemAPearl(String name)
    {
    	setUnlocalizedName(name);
    	setRegistryName(name);
        this.maxStackSize = 32;
    	setCreativeTab(RebornofEnd.endertab);
    	
    	ItemInit.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        playerIn.getCooldownTracker().setCooldown(this, 1);

        if (!worldIn.isRemote)
        {
            EntityEnderPearl entityenderpearl = new EntityEnderPearl(worldIn, playerIn);
            entityenderpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityenderpearl);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
