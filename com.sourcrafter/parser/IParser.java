package parser;

import metrics.IMetrics;

public interface IParser 
{
	IMetrics parse(String rawMetricsData);
}
