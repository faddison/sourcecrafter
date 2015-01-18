package metrics;

import java.util.List;

public interface IMetricsCollection 
{
	List<? extends IMetrics> getMetrics();
}