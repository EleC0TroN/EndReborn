package endreborn.init;

import java.util.ArrayList;
import java.util.List;

import endreborn.objects.armour.ArmourBase;
import endreborn.objects.food.FoodEnderFlesh;
import endreborn.objects.items.ItemBase;
import endreborn.objects.items.ItemHammer;
import endreborn.objects.tools.axes.EndoriumAxe;
import endreborn.util.Reference;
import endreborn.objects.tools.ToolHoe;
import endreborn.objects.tools.ToolPickaxe;
import endreborn.objects.tools.ToolShovel;
import endreborn.objects.tools.ToolSword;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Materials
    public static final ToolMaterial TOOL_ENDORIUM = EnumHelper.addToolMaterial("tool_endorium", 4, 1024, 5.5F, 4.0F, 13);
    public static final ToolMaterial TOOL_HAMMER = EnumHelper.addToolMaterial("tool_hammer", 2, 300, 1.0F, 4.0F, 9);
    public static final ArmorMaterial ARMOUR_OBSIDIAN = EnumHelper.addArmorMaterial("armour_obsidian", Reference.MODID + ":obsidian", 33, new int[]{4, 7, 8, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
    
    //Items
    public static final Item INGOT_ENDORIUM = new ItemBase("item_ingot_endorium");
    public static final Item SHARD_OBSIDIAN = new ItemBase("item_shard_obsidian");
    public static final Item RAW_ENDORIUM = new ItemBase("item_raw_endorium");
    
    //Tools
    public static final Item PICKAXE_ENDORIUM = new ToolPickaxe("tool_pickaxe_endorium", TOOL_ENDORIUM);
    public static final Item SWORD_ENDORIUM = new ToolSword("tool_sword_endorium", TOOL_ENDORIUM);
    public static final Item HOE_ENDORIUM = new ToolHoe("tool_hoe_endorium", TOOL_ENDORIUM);
    public static final Item AXE_ENDORIUM = new EndoriumAxe("tool_axe_endorium", TOOL_ENDORIUM);
    public static final Item SHOVEL_ENDORIUM = new ToolShovel("tool_shovel_endorium", TOOL_ENDORIUM);
    public static final Item HAMMER_IRON = new ItemHammer("tool_hammer_iron");
    
    //Armors
    public static final Item HELMET_ENDORIUM = new ArmourBase("armour_helmet_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_ENDORIUM = new ArmourBase("armour_chestplate_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_ENDORIUM = new ArmourBase("armour_leggings_obsidian", ARMOUR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_ENDORIUM = new ArmourBase("armour_boots_obsidian", ARMOUR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
    
    //Food
    public static final Item ENDER_FLESH = new FoodEnderFlesh("food_ender_flesh", new PotionEffect(MobEffects.NIGHT_VISION, 450, 1));
    
}


