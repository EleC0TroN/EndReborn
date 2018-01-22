package endreborn.objects.blocks;

import endreborn.init.BlockInit;
import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class LampBase extends Block implements IHasModel
{
    public LampBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RebornofEnd.endertab);
		setLightLevel(1.0F);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Override
	public void registerModels() 
	{
		RebornofEnd.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
