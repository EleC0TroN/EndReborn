package endreborn.proxy;

import endreborn.util.handlers.EventsHandler;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent event)
    {
		MinecraftForge.EVENT_BUS.register(new EventsHandler());
    }
	public void registerItemRenderer(Item item, int meta, String id) {}	
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
}

