package templates;

import core.City;
import mapper.IMapper;
import metrics.IMetricsCollection;
import decorator.IDecorator;
import designer.IDesigner;
import parser.IParser;
import planner.IPlanner;

public abstract class AbstractTemplate implements ITemplate {

	protected IParser parser;
	protected IDesigner designer;
	protected IDecorator decorator;
	protected IPlanner planner;
	protected IMapper mapper;
	protected String rawMetricsData;
	
	public AbstractTemplate(IParser parser, IDesigner designer,
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
		IMetricsCollection metrics = parser.parse(rawMetricsData);
		City city = designer.design(metrics);
		city = decorator.decorate(city, metrics);
		city = planner.plan(city, metrics);
		mapper.map(city);
	}

}
