package designer;

import core.City;
import metrics.IMetrics;

public interface IDesigner 
{
	City design(IMetrics metrics);
}
