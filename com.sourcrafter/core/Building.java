package core;

import java.util.List;

public class Building 
{
	private List<Block> blocks;
	private BuildingData buildingData;
	
	public Building(List<Block> blocks, BuildingData buildingData) 
	{
		this.blocks = blocks;
		this.buildingData = buildingData;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public BuildingData getBuildingData() {
		return buildingData;
	}

	public void setBuildingData(BuildingData buildingData) {
		this.buildingData = buildingData;
	}
	
}
