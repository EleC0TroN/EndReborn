package endreborn.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import endreborn.objects.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockInit 
{
  public static final List<Block> BLOCKS = new ArrayList<Block>();
  
	public static final Block BLOCK_ENDORIUM = new BlockBase("block_endorium", Material.IRON);
}
