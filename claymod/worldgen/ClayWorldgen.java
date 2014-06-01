package claymod.worldgen;

import java.util.Random;

import claymod.init.ClayParts;
import claymod.main.ClayMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBeach;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;


public class ClayWorldgen implements IWorldGenerator {
	
	int spawn;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}

	}

	private void generateNether(Random random, int i, int j, World world) {

		
        

	}

	private void generateEnd(Random random, int i, int j, World world) {

	}

	private void generateSurface(Random random, int i, int j, World world) {	
		addMudGen(ClayParts.mudBlock, Blocks.dirt, Blocks.gravel, Blocks.grass, random, world, i, j, 10, 100, 5, 20, 30);

	}
	private void addMudGen(Block block, Block blockSpawn, Block blockSpawn1,Block blockSpawn2, Random random,
			World world, int posX, int posZ, int minY, int maxY,
			int minVeinSize, int maxVeinSize, int spawnChance) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(posX ,posZ);
		if(biome instanceof BiomeGenJungle){
			for (int i = 0; i < spawnChance; i++) {
				int defaultChunkSize = 16;
				int xPos = posX + random.nextInt(defaultChunkSize);
				int yPos = minY + random.nextInt(maxY - minY);
				int zPos = posZ + random.nextInt(defaultChunkSize);
				
				new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
				new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
				new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
			}
		}if(biome instanceof BiomeGenOcean){
				for (int i = 0; i < spawnChance; i++) {
					int defaultChunkSize = 16;
					int xPos = posX + random.nextInt(defaultChunkSize);
					int yPos = minY + random.nextInt(maxY - minY);
					int zPos = posZ + random.nextInt(defaultChunkSize);
					
					new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
					new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
					new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
				}
		}if(biome instanceof BiomeGenRiver){
					for (int i = 0; i < spawnChance; i++) {
						int defaultChunkSize = 16;
						int xPos = posX + random.nextInt(defaultChunkSize);
						int yPos = minY + random.nextInt(maxY - minY);
						int zPos = posZ + random.nextInt(defaultChunkSize);
						
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
					}
		}if(biome instanceof BiomeGenBeach){
					for (int i = 0; i < spawnChance; i++) {
						int defaultChunkSize = 16;
						int xPos = posX + random.nextInt(defaultChunkSize);
						int yPos = minY + random.nextInt(maxY - minY);
						int zPos = posZ + random.nextInt(defaultChunkSize);
						
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
					}
		}if(biome instanceof BiomeGenSwamp){
					for (int i = 0; i < spawnChance; i++) {
						int defaultChunkSize = 16;
						int xPos = posX + random.nextInt(defaultChunkSize);
						int yPos = minY + random.nextInt(maxY - minY);
						int zPos = posZ + random.nextInt(defaultChunkSize);
						
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
					}
		}if(biome instanceof BiomeGenPlains){
					for (int i = 0; i < spawnChance; i++) {
						int defaultChunkSize = 16;
						int xPos = posX + random.nextInt(defaultChunkSize);
						int yPos = minY + random.nextInt(maxY - minY);
						int zPos = posZ + random.nextInt(defaultChunkSize);
						
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn2).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn1).generate(world, random, xPos, yPos, zPos);
						new WorldGenMinable(block,(minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
				}
			}		
		}	
	}

			
	
	
