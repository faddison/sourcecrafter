package parser;

import metrics.IMetrics;

public abstract class AbstractParser implements IParser
{
	protected boolean shouldReadMetricsFromFile;
	
	public AbstractParser(boolean shouldReadMetricsFromFile)
	{
		super();
		this.shouldReadMetricsFromFile = shouldReadMetricsFromFile;
	}

	@Override
	public abstract IMetrics parse(String metrics);

}
