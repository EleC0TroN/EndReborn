package endreborn.util.handlers;

import java.io.File;

import endreborn.mod.RebornofEnd;
import endreborn.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
 public static Configuration config;
 
 public static boolean spawnEssenceOre;
 public static boolean spawnWolframiumOre;
 public static boolean spawnObservatory;
 public static boolean spawnEndIsland;
 public static boolean spawnLormyte;
 public static boolean panorama;
 public static boolean teleporterEnd;
 public static boolean decoratorEnd;
 public static int islandRare = 2;

 public static void init(File file)
 {
	 config = new Configuration(file);
	 
	 String category;
	 category = "Configuration";
	 config.addCustomCategoryComment(category, "Structures and ores");
	 spawnEssenceOre = config.getBoolean("Essence Ore", category, true, "Allows to spawn");
	 spawnWolframiumOre = config.getBoolean("Wolframium Ore", category, true, "Allows to spawn");
	 spawnEndIsland = config.getBoolean("EndIsland", category, true, "Allows to spawn");
	 spawnObservatory = config.getBoolean("Observatory", category, true, "Allows to spawn");
	 spawnLormyte = config.getBoolean("Lormyte", category, true, "Allows to spawn");
	 decoratorEnd = config.getBoolean("End Magma, Enropy End Stone", category, true, ", Enropy End Stone");
	 
	 panorama = config.getBoolean("Panorama", category, true, "Panorama");
	 teleporterEnd = config.getBoolean("End Void Teleporter", category, true, "End Void Teleporter");
	 islandRare = config.getInt("Island Rarity", category, 200, 50, 1000, "If <200 That Island More Rare");
	 
	 config.save();
 }
 public static void registerConfig(FMLPreInitializationEvent event) 
 {
	 RebornofEnd.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
	 RebornofEnd.config.mkdirs();
	 init(new File(RebornofEnd.config.getPath(), Reference.MODID + ".cfg"));
 }
}
