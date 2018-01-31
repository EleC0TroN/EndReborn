package endreborn.init;

import endreborn.entity.EntityInfZombie;
import endreborn.mod.RebornofEnd;
import endreborn.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	
	private static final EntityInit Instance = new EntityInit();
	private static int modEntities = 0;
	
	public static EntityInit instance()
	{
		return Instance;
	}
	
	public static void registerEntities()
	{
		register(EntityInfZombie.class, "infzombie", 0x000000, 0x252525);
	}
	
	public static void register(Class<EntityInfZombie> EntityClass, String entityNameIn, int solidColorIn, int spotColorIn)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + entityNameIn), EntityClass, entityNameIn, ++modEntities, RebornofEnd.mod, 64, 1, true, solidColorIn, spotColorIn);
	}
}

