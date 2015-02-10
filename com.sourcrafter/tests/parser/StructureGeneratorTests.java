package tests.parser;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import core.Block;
import core.BlockData;
import core.Point3D;
import designer.StructureGenerator;


public class StructureGeneratorTests
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void generateHollowCubeTest_DimensionIs0()
	{
		int dimension = 0;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCube(dimension, blockId);
		
		assertEquals(0, blocks.size());
	}
	
	@Test
	public void generateHollowCubeTest_DimensionIs1()
	{
		int dimension = 1;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCube(dimension, blockId);
		
		assertEquals(1, blocks.size());
		
		Block block = blocks.get(0);
		assertEquals(blockId, block.getBlockData().getId());
		assertEquals(0, block.getPoint().getX());
		assertEquals(0, block.getPoint().getY());
		assertEquals(0, block.getPoint().getZ());
	}
	
	@Test
	public void generateHollowCubeTest_DimensionIs2()
	{
		int dimension = 2;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCube(dimension, blockId);
//		assertEquals(1, blocks.size());
//		
//		Block block = blocks.get(0);
//		assertEquals(blockId, block.getBlockData().getId());
//		assertEquals(0, block.getPoint().getX());
//		assertEquals(0, block.getPoint().getY());
//		assertEquals(0, block.getPoint().getZ());
	}
	
	@Test
	public void generateHollowCubeTest_DimensionIs3()
	{
		int dimension = 3;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCube(dimension, blockId);
//		assertEquals(1, blocks.size());
//		
//		Block block = blocks.get(0);
//		assertEquals(blockId, block.getBlockData().getId());
//		assertEquals(0, block.getPoint().getX());
//		assertEquals(0, block.getPoint().getY());
//		assertEquals(0, block.getPoint().getZ());
	}
	
	@Test
	public void generateHollowCubeNoBottomTest_DimensionIs0()
	{
		int dimension = 0;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCubeNoBottom(dimension, blockId);
		
		assertEquals(0, blocks.size());
	}
	
	@Test
	public void generateHollowCubeNoBottomTest_DimensionIs1()
	{
		int dimension = 1;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCubeNoBottom(dimension, blockId);
		
		assertEquals(0, blocks.size());
	}
	
	@Test
	public void generateHollowCubeNoBottomTest_DimensionIs2()
	{
		int dimension = 2;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCubeNoBottom(dimension, blockId);
//		assertEquals(1, blocks.size());
//		
//		Block block = blocks.get(0);
//		assertEquals(blockId, block.getBlockData().getId());
//		assertEquals(0, block.getPoint().getX());
//		assertEquals(0, block.getPoint().getY());
//		assertEquals(0, block.getPoint().getZ());
	}
	
	@Test
	public void generateHollowCubeNoBottomTest_DimensionIs3()
	{
		int dimension = 3;
		int blockId = 0;
		StructureGenerator structureGenerator = new StructureGenerator();
		ArrayList<Block> blocks = structureGenerator.generateHollowCubeNoBottom(dimension, blockId);
//		assertEquals(1, blocks.size());
//		
//		Block block = blocks.get(0);
//		assertEquals(blockId, block.getBlockData().getId());
//		assertEquals(0, block.getPoint().getX());
//		assertEquals(0, block.getPoint().getY());
//		assertEquals(0, block.getPoint().getZ());
	}
}

