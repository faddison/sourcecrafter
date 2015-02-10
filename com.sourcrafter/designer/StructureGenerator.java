package designer;

import java.util.ArrayList;

import core.Block;
import core.BlockData;
import core.Point3D;


public class StructureGenerator
{
	public ArrayList<Block> generateCube(int length, int width, int height, int blockId)
	{
		ArrayList<Block> blocks = new ArrayList<Block>();
		
		for (int l = 0; l < length; l++)
		{
			for (int w = 0; w < width; w++)
			{
				for (int h = 0; h < height; h++)
				{
					Point3D point3D = new Point3D(l, w, h);
					BlockData blockData = new BlockData(blockId);
					blocks.add(new Block(point3D, blockData));
				}
			}
		}
		return blocks;
	}
	
	public ArrayList<Block> generateHollowCube(int dimension, int blockId)
	{
		System.out.println("Generating hollow cube of dimension "+dimension);
		ArrayList<Block> blocks = new ArrayList<Block>();
		
		for (int x = 0; x < dimension; x++)
		{
			for (int z = 0; z < dimension; z++)
			{
				for (int y = 0; y < dimension; y++)
				{
					Point3D point3D = new Point3D(x, y, z);
					if (x == 0 || x == dimension - 1 || z == 0 || z == dimension - 1)
					{
						System.out.println("Adding point "+point3D.toString());
						BlockData blockData = new BlockData(blockId);
						blocks.add(new Block(point3D, blockData));
					}
					else
						System.out.println("Skipping point "+point3D.toString());
				}
			}
		}
		
		System.out.println(blocks.size()+" points added to cube");
		
		return blocks;
	}
	
	public ArrayList<Block> generateHollowCubeNoBottom(int dimension, int blockId)
	{
		System.out.println("Generating hollow cube with no bottom of dimension "+dimension);
		ArrayList<Block> blocks = new ArrayList<Block>();
		
		for (int x = 0; x < dimension; x++)
		{
			for (int z = 0; z < dimension; z++)
			{
				for (int y = 0; y < dimension; y++)
				{
					Point3D point3D = new Point3D(x, y, z);
					if ((x == 0 || x == dimension - 1 || z == 0 || z == dimension - 1) && y > 0)
					{
						System.out.println("Adding point "+point3D.toString());
						BlockData blockData = new BlockData(blockId);
						blocks.add(new Block(point3D, blockData));
					}
					else
						System.out.println("Skipping point "+point3D.toString());
				}
			}
		}
		
		System.out.println(blocks.size()+" points added to cube");
		
		return blocks;
	}
	
	private boolean shouldGenerateHollowCubeNoBottom(int x, int y, int z, int dimension)
	{
		return ((x == 0 || x == dimension - 1 || z == 0 || z == dimension - 1) && y > 0)
	}
}
