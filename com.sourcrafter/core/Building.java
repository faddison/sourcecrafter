package core;

import java.util.ArrayList;

public class Building implements Comparable<Building>
{
	private ArrayList<Block> blockEntries;
	private BuildingData buildingData;
	public Building(ArrayList<Block> blockEntries, BuildingData buildingData) {
		super();
		this.blockEntries = blockEntries;
		this.buildingData = buildingData;
	}
	
	public ArrayList<Block> getBlockEntries() {
		return blockEntries;
	}
	public void setBlockEntries(ArrayList<Block> blockEntries) {
		this.blockEntries = blockEntries;
	}
	public BuildingData getBuildingData() {
		return buildingData;
	}
	public void setBuildingData(BuildingData buildingData) {
		this.buildingData = buildingData;
	}
	

	@Override
	public int compareTo(Building buildingEntity) 
	{	
		return buildingEntity.buildingData.getLength() - this.buildingData.getLength();
	}
	
}
