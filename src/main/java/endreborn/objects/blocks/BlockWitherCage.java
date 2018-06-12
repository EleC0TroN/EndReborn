package endreborn.objects.blocks;

import endreborn.init.BlockInit;
import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockWitherCage extends Block implements IHasModel
{

	public BlockWitherCage(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
        this.setResistance(6000001.0F);
		setRegistryName(name);
		setCreativeTab(RebornofEnd.endertab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
