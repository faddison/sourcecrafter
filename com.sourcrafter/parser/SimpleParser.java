package parser;

import metrics.SimpleMetrics;


public class SimpleParser
{

	public SimpleMetrics parse(String rawMetricsData)
	{
		String[] projectMetrics = rawMetricsData.split(",");
		int numberOfClasses = Integer.parseInt(projectMetrics[0].trim());
		int numberOfMethodsPerClass = Integer.parseInt(projectMetrics[1].trim());
		
		return new SimpleMetrics(numberOfClasses, numberOfMethodsPerClass);
	}

}
