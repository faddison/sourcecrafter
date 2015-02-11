package designer;

import java.util.ArrayList;

import core.Block;
import core.BlockData;
import core.Building;
import core.BuildingData;
import core.Point3D;


public class CubeGenerator
{
	public Building generate(int length, int width, int height, int blockId)
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
		return new Building(blocks, new BuildingData(length, width, height));
	}
	
	public Building generate(int dimension, int blockId)
	{
		return generate(dimension, dimension, dimension, blockId);
	}
}
