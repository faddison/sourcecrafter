package metrics;

import java.util.List;

public class SimpleClassMetricsCollection implements IMetricsCollection
{
	List<SimpleClassMetrics> metricsList;

	public SimpleClassMetricsCollection(List<SimpleClassMetrics> metricsList)
	{
		this.metricsList = metricsList;
	}
	
	@Override
	public List<SimpleClassMetrics> getMetrics() 
	{
		return this.metricsList;
	}
}
