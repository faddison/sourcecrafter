package metrics;

import java.util.List;

public interface IMetricCollection 
{
	List<? extends IMetric> getMetrics();
}