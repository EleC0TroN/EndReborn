package endreborn.init;

import endreborn.entity.render.RenderEGuard;
import endreborn.entity.render.RenderWatcher;
import endreborn.entity.EntityEGuard;
import endreborn.entity.EntityWatcher;
import endreborn.mod.RebornofEnd;
import endreborn.util.Reference;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitiesInit {

    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "endguard"), EntityEGuard.class, "endguard", id++, RebornofEnd.instance, 64, 3, false, 9654933, 11237052);
        EntityRegistry.addSpawn(EntityEGuard.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.SKY);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "watcher"), EntityWatcher.class, "watcher", id++, RebornofEnd.instance, 64, 3, false, 461076, 2236447);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.HELL);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.PLAINS);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.DESERT);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.MESA);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.SAVANNA);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.TAIGA);
        EntityRegistry.addSpawn(EntityWatcher.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.EXTREME_HILLS);
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityEGuard.class, RenderEGuard.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityWatcher.class, RenderWatcher.FACTORY);
    }
}

