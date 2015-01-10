package templates;

import core.City;
import mapper.IMapper;
import metrics.IMetrics;
import decorator.IDecorator;
import designer.IDesigner;
import parser.AbstractParser;
import planner.IPlanner;

public abstract class AbstractTemplate implements ITemplate {

	protected AbstractParser parser;
	protected IDesigner designer;
	protected IDecorator decorator;
	protected IPlanner planner;
	protected IMapper mapper;
	protected String rawMetricsData;
	
	public AbstractTemplate(AbstractParser parser, IDesigner designer,
			IDecorator decorator, IPlanner planner, IMapper mapper, String rawMetricsData) 
	{
		this.parser = parser;
		this.designer = designer;
		this.decorator = decorator;
		this.planner = planner;
		this.mapper = mapper;
		this.rawMetricsData = rawMetricsData;
	}
	
	@Override
	public void run() 
	{
		IMetrics metrics = parser.parse(rawMetricsData);
		City city = designer.design(metrics);
		city = decorator.decorate(city, metrics);
		city = planner.plan(city, metrics);
		mapper.map(city);
	}

}
