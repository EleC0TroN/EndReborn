package endreborn.init;

import java.util.ArrayList;
import java.util.List;

import endreborn.objects.blocks.BlockBase;
import endreborn.objects.blocks.BlockEssenceOre;
import endreborn.objects.blocks.BlockPhantom;
import endreborn.objects.blocks.DragonBush;
import endreborn.objects.blocks.EnderCropBase;
import endreborn.objects.blocks.LampBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_ENDORIUM = new BlockBase("block_endorium", Material.IRON);
	public static final Block END_STONE_SMOOTH = new BlockBase("block_end_stone_smooth", Material.ROCK);
	public static final Block END_STONE_PILLAR = new BlockBase("block_end_stone_pillar", Material.ROCK);
	public static final Block PURPUR_LAMP = new LampBase("block_purpur_lamp", Material.ROCK);
	public static final Block ENDER_FLOWER = new EnderCropBase("crop_ender_flower");
	public static final Block DRAGON_BUSH = new DragonBush("crop_dragonite");
	public static final Block ESSENCE_ORE = new BlockEssenceOre("block_essence_ore", Material.ROCK);
	public static final Block PHANTOM_BLOCK = new BlockPhantom("block_phantom", Material.BARRIER, false);
}
