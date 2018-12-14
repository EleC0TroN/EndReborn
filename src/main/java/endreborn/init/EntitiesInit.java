package endreborn.init;

import endreborn.entity.render.RenderAngryEnder;
import endreborn.entity.render.RenderEGuard;
import endreborn.entity.render.RenderLord;
import endreborn.entity.render.RenderWatcher;
import endreborn.entity.EntityAngryEnder;
import endreborn.entity.EntityEGuard;
import endreborn.entity.EntityLord;
import endreborn.entity.EntityWatcher;
import endreborn.mod.RebornofEnd;
import endreborn.util.Reference;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityEndermite;
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
        EntityRegistry.addSpawn(EntityEndermite.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.SKY);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "endlord"), EntityLord.class, "endlord", id++, RebornofEnd.instance, 64, 3, false, 461076, 681365);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "angry_enderman"), EntityAngryEnder.class, "angry_enderman", id++, RebornofEnd.instance, 64, 3, false, 461076, 660033);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.HELL);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.PLAINS);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.DESERT);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.MESA);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.SAVANNA);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.TAIGA);
        EntityRegistry.addSpawn(EntityAngryEnder.class, 3, 0, 1, EnumCreatureType.MONSTER, Biomes.EXTREME_HILLS);
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityEGuard.class, RenderEGuard.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityWatcher.class, RenderWatcher.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityLord.class, RenderLord.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryEnder.class, RenderAngryEnder.FACTORY);
    }
}

