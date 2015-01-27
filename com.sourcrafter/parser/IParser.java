package parser;

import metrics.IMetric;
import metrics.IMetricCollection;

public interface IParser 
{
	IMetric parse(String rawMetricsData);
	boolean getShouldReadMetricsFromFile();
}
