package core;

import java.util.ArrayList;

public class City
{
	private ArrayList<Building> building;
	private CityData cityData;
	
	public City(ArrayList<Building> buildingEntries, CityData cityData) {
		super();
		this.building = buildingEntries;
		this.cityData = cityData;
	}

	public ArrayList<Building> getBuildingEntries() {
		return building;
	}
	public void setBuildingEntries(ArrayList<Building> buildingEntries) {
		this.building = buildingEntries;
	}
	public CityData getCityData() {
		return cityData;
	}
	public void setCityData(CityData cityData) {
		this.cityData = cityData;
	}
}
