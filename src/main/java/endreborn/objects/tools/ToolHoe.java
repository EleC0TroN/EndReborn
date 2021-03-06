package endreborn.objects.tools;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
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
