package designer;

import java.util.ArrayList;

import core.Block;
import core.BlockData;
import core.Building;
import core.Point3D;


public class HollowCubeDecorator implements ICubeDecorator
{

	@Override
	public Building decorate(Building building)
	{
		ArrayList<Block> newBlocks = new ArrayList<Block>();
		
		for (Block b : building.getBlockEntries())
		{
			int x = b.getPoint().getX();
			int y = b.getPoint().getY();
			int z = b.getPoint().getZ();
			
			Point3D point3D = new Point3D(x, y, z);
			if (x == 0 || x == building.getBuildingData().getLength() - 1 || z == 0 || z == building.getBuildingData().getWidth() - 1)
			{
				System.out.println("Adding point "+point3D.toString());
				BlockData blockData = new BlockData(b.getBlockData().getId());
				newBlocks.add(new Block(point3D, blockData));
			}
			else
				System.out.println("Skipping point "+point3D.toString());
		}
		// TODO Auto-generated method stub
		return null;
	}

}
