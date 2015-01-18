package decorator;

import metrics.IMetricsCollection;
import core.City;

public interface IDecorator 
{
	City decorate(City city, IMetricsCollection metrics);
}
