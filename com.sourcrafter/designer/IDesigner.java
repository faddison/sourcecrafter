package designer;

import core.City;
import metrics.IMetricsCollection;

public interface IDesigner 
{
	City design(IMetricsCollection metrics);
}
