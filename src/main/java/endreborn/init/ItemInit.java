package endreborn.init;

import java.util.ArrayList;
import java.util.List;

import endreborn.objects.armour.ArmourBase;
import endreborn.objects.armour.ArmourModel;
import endreborn.objects.food.FoodChorusSoup;
import endreborn.objects.food.FoodDragonBerries;
import endreborn.objects.food.FoodEnderFlesh;
import endreborn.objects.items.ItemAPearl;
import endreborn.objects.items.ItemBase;
import endreborn.objects.items.ItemDeather;
import endreborn.objects.items.ItemDragonSeeds;
import endreborn.objects.items.ItemEnderBow;
import endreborn.objects.items.ItemEnderSword;
import endreborn.objects.items.ItemHammer;
import endreborn.objects.items.ItemLegendary;
import endreborn.objects.items.ItemWorldMirror;
import endreborn.objects.tools.axes.EndoriumAxe;
import endreborn.util.Reference;
import endreborn.objects.tools.ToolHoe;
import endreborn.objects.tools.ToolPickaxe;
import endreborn.objects.tools.ToolShovel;
import endreborn.objects.tools.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Materials
    public static final ToolMaterial TOOL_ENDORIUM = EnumHelper.addToolMaterial("tool_endorium", 4, 1024, 5.5F, 4.0F, 13);
    public static final ToolMaterial TOOL_MAGNIFIER = EnumHelper.addToolMaterial("tool_magnifier", 4, 256, 5.5F, 1.0F, 13);
    public static final ToolMaterial TOOL_END = EnumHelper.addToolMaterial("tool_end", 5, 1024, 6.5F, 11.0F, 14);
    public static final ToolMaterial TOOL_HAMMER = EnumHelper.addToolMaterial("tool_hammer", 2, 300, 1.0F, 4.0F, 9);
    public static final ToolMaterial TOOL_WOLFRAMIUM = EnumHelper.addToolMaterial("tool_wolframium", 3, 512, 5.5F, 2.5F, 11);
    public static final ArmorMaterial ARMOUR_OBSIDIAN = EnumHelper.addArmorMaterial("armour_obsidian", Reference.MODID + ":obsidian", 33, new int[]{4, 7, 8, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
    public static final ArmorMaterial ARMOUR_HELMET = EnumHelper.addArmorMaterial("armour_helmet", Reference.MODID + ":helmet", 33, new int[]{4, 7, 8, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
    
    //Items
    public static final Item INGOT_ENDORIUM = new ItemBase("item_ingot_endorium");
    public static final Item SHARD_OBSIDIAN = new ItemBase("item_shard_obsidian");
    public static final Item RAW_ENDORIUM = new ItemBase("item_raw_endorium");
    public static final Item DRAGONITE_SEEDS = new ItemDragonSeeds("item_dragonite_seeds", 0, false);
    public static final Item ADVANCED_PEARL = new ItemAPearl("item_advanced_ender_pearl");
    public static final Item END_ESSENCE = new ItemBase("item_end_essence");
    public static final Item END_SHARD = new ItemBase("item_end_shard");
    public static final Item END_RUNE = new ItemLegendary("item_end_rune");
    public static final Item LORMYTE_CRYSTAL = new ItemBase("item_lormyte_crystal");
    public static final Item INGOT_WOLFRAMIUM = new ItemBase("item_ingot_wolframium");
    public static final Item ENDER_STRING = new ItemLegendary("item_ender_string");
    public static final Item WORLD_MIRROR = new ItemWorldMirror("item_world_mirror");
    
    //Tools
    public static final Item PICKAXE_ENDORIUM = new ToolPickaxe("tool_pickaxe_endorium", TOOL_ENDORIUM);
    public static final Item SWORD_ENDORIUM = new ToolSword("tool_sword_endorium", TOOL_ENDORIUM);
    public static final Item HOE_ENDORIUM = new ToolHoe("tool_hoe_endorium", TOOL_ENDORIUM);
    public static final Item AXE_ENDORIUM = new EndoriumAxe("tool_axe_endorium", TOOL_ENDORIUM);
    public static final Item SHOVEL_ENDORIUM = new ToolShovel("tool_shovel_endorium", TOOL_ENDORIUM);
    public static final Item HAMMER_IRON = new ItemHammer("tool_hammer_iron");
    public static final Item ENDER_BOW = new ItemEnderBow("ender_bow");
    public static final Item ENDER_SWORD = new ItemEnderSword("ender_sword", TOOL_END);
    public static final Item ENDER_HOOK = new ItemDeather("tool_magnifier", TOOL_MAGNIFIER);
    public static final Item PICKAXE_WOLFRAMIUM = new ToolPickaxe("tool_pickaxe_wolframium", TOOL_WOLFRAMIUM);
    public static final Item SWORD_WOLFRAMIUM = new ToolSword("tool_sword_wolframium", TOOL_WOLFRAMIUM);
    public static final Item HOE_WOLFRAMIUM = new ToolHoe("tool_hoe_wolframium", TOOL_WOLFRAMIUM);
    public static final Item AXE_WOLFRAMIUM = new EndoriumAxe("tool_axe_wolframium", TOOL_WOLFRAMIUM);
    public static final Item SHOVEL_WOLFRAMIUM = new ToolShovel("tool_shovel_wolframium", TOOL_WOLFRAMIUM);
    
    //Armors
    public static final Item CHESTPLATE_ENDORIUM = new ArmourBase("armour_chestplate_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_ENDORIUM = new ArmourBase("armour_leggings_obsidian", ARMOUR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_ENDORIUM = new ArmourBase("armour_boots_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
    public static final Item HELMET_TEST = new ArmourModel("armour_helmet_helmet", ARMOUR_HELMET, 1, EntityEquipmentSlot.HEAD);

    
    //Food
    public static final Item ENDER_FLESH = new FoodEnderFlesh("food_ender_flesh");
    public static final Item DRAGONITE_BERRIES = new FoodDragonBerries("food_dragonite_berries");
    public static final Item CHORUS_SOUP = new FoodChorusSoup(5, "food_chorus_soup");
    
}



