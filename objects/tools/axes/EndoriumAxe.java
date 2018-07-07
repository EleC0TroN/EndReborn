package endreborn.objects.tools.axes;

import endreborn.init.ItemInit;
import endreborn.mod.RebornofEnd;
import endreborn.util.IHasModel;
import net.minecraft.item.ItemAxe;

public class EndoriumAxe extends ItemAxe implements IHasModel
{

	public EndoriumAxe(String name, ToolMaterial material) {
		super(material, 9f, -3.1f);
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
