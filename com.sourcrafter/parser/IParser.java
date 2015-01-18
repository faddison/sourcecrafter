package parser;

import metrics.IMetricsCollection;

public interface IParser 
{
	IMetricsCollection parse(String rawMetricsData);
	boolean getShouldReadMetricsFromFile();
	IDefaultHandler getDefaultHandler();
}
