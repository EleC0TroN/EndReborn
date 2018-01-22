package endreborn.mod;

import endreborn.proxy.CommonProxy;
import endreborn.tabs.EndReborn;
import endreborn.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class RebornofEnd 
{
	public static final CreativeTabs endertab = new EndReborn("endertab");
	
	@Instance
	public static RebornofEnd instance;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
    
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
   
    }
}
