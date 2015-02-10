package designer;

import java.util.ArrayList;

import core.Building;
import core.BuildingData;
import core.City;
import core.CityData;
import metrics.SimpleMetrics;


public class SimpleDesigner
{
	public City design(SimpleMetrics simpleMetrics)
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		StructureGenerator structureGenerator = new StructureGenerator();
		
		for (int i = 0; i < simpleMetrics.getNumberOfClasses(); i++)
		{
			int dimension = simpleMetrics.getNumberOfMethodsPerClass();
			Building building = new Building(structureGenerator.generateHollowCube(dimension, 1), new BuildingData());
			buildings.add(building);
		}
		
		City city = new City(buildings, new CityData());
		return city;
	}
}
