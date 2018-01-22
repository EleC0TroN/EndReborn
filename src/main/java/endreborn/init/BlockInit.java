package endreborn.init;

import java.util.ArrayList;
import java.util.List;

import endreborn.objects.blocks.BlockBase;
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

}
