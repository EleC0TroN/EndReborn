package endreborn.objects.blocks;

import endreborn.init.BlockInit;
import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class EnderCropBase extends BlockCrops implements IHasModel
{

	public EnderCropBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RebornofEnd.endertab);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	protected Item getSeed() 
	{
		return null;
	}

	@Override
	protected Item getCrop() 
	{
		return Items.ENDER_PEARL;
	}

	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}