package endreborn.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeOcean;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Arrays;
import java.util.List;

public class WorldGenCustomStructures implements IWorldGenerator

{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator generator,
			IChunkProvider provider)
	{
		switch(world.provider.getDimension())
		{
			case 1:
				generateStructure2(new WorldGenStructure("lormyte_crystal"), world, rand, chunkX, chunkZ, 50, Blocks.END_STONE, BiomeEnd.class);
				
				break;

			case 0:
				generateStructure(new WorldGenStructure("end_island"), world, rand, chunkX, chunkZ, 100, Blocks.AIR, BiomePlains.class);
				generateStructure(new WorldGenStructure("end_island"), world, rand, chunkX, chunkZ, 100, Blocks.AIR, BiomeForest.class);
				generateStructure(new WorldGenStructure("end_island"), world, rand, chunkX, chunkZ, 100, Blocks.AIR, BiomeDesert.class);
				generateStructure(new WorldGenStructure("end_island"), world, rand, chunkX, chunkZ, 100, Blocks.AIR, BiomeOcean.class);
				generateStructure(new WorldGenStructure("end_island"), world, rand, chunkX, chunkZ, 100, Blocks.AIR, BiomeSavanna.class);
				generateStructure2(new WorldGenStructure(""), world, rand, chunkX, chunkZ, 1000, Blocks.STONE, Biome.class);
				break;

			case -1:

				break;

			case -64:

			
		}
	}

	private void generateStructure(WorldGenerator generator, World world, Random rand, 

			int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)

	{
		List<Class<?>> classesList = Arrays.asList(classes);

		int x = (chunkX * 16) + rand.nextInt(15);
		int z = (chunkZ * 16) + rand.nextInt(15);
		int y = 100;

		BlockPos pos = new BlockPos(x, y, z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();

		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(rand.nextInt(chance) == 0)
				{
					generator.generate(world, rand, pos);
				}
			}
		}
	}
	
	private void generateStructure2(WorldGenerator generator, World world, Random rand, 
			int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		List<Class<?>> classesList = Arrays.asList(classes);
		
		int x = (chunkX * 16) + rand.nextInt(15);
		int z = (chunkZ * 16) + rand.nextInt(15);
		int y = 57;

		BlockPos pos = new BlockPos(x, y, z);
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();

		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(rand.nextInt(chance) == 0)
				{
					generator.generate(world, rand, pos);
				}
			}
		}
	}
}
