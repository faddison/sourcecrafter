package metrics;

import java.util.List;

public class MetricsCollection implements IMetricsCollection
{

	List<? extends IMetrics> metricsList;

	public MetricsCollection(List<? extends IMetrics> metricsList)
	{
		this.metricsList = metricsList;
	}
	
	@Override
	public List<? extends IMetrics> getMetrics() 
	{
		return this.metricsList;
	}
}
