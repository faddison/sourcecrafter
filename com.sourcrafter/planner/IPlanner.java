package planner;

import metrics.IMetricsCollection;
import core.City;

public interface IPlanner 
{
	City plan(City city, IMetricsCollection metrics);
}
