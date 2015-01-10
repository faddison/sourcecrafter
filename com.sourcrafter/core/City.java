package core;

import java.util.List;

public class City
{
	private List<Building> buildings;
	private CityData cityMetaData;
	
	public City(List<Building> buildings, CityData cityMetaData) 
	{
		this.buildings = buildings;
		this.cityMetaData = cityMetaData;
	}
	
	public List<Building> getBuildings() {
		return buildings;
	}
	
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	public CityData getCityMetaData() {
		return cityMetaData;
	}
	
	public void setCityMetaData(CityData cityMetaData) {
		this.cityMetaData = cityMetaData;
	}
	
	
}
