package decorator;

import metrics.IMetrics;
import core.City;

public interface IDecorator 
{
	City decorate(City city, IMetrics metrics);
}
