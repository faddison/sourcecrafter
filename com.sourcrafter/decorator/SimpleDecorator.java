package decorator;

import metrics.IMetricsCollection;
import core.City;

public class SimpleDecorator implements IDecorator
{
	@Override
	public City decorate(City city, IMetricsCollection metrics) 
	{
		return null;
	}

}
