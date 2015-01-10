package planner;

import metrics.IMetrics;
import core.City;

public interface IPlanner 
{
	City plan(City city, IMetrics metrics);
}
