package decorator;

import metrics.IMetrics;
import core.City;

public class SimpleDecorator implements IDecorator
{
	@Override
	public City decorate(City city, IMetrics metrics) 
	{
		return null;
	}

}
