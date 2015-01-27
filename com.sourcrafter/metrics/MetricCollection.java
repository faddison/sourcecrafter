package metrics;

import java.util.List;

public class MetricCollection implements IMetricCollection
{

	List<? extends IMetric> metricsList;

	public MetricCollection(List<? extends IMetric> metricsList)
	{
		this.metricsList = metricsList;
	}
	
	@Override
	public List<? extends IMetric> getMetrics() 
	{
		return this.metricsList;
	}
}
