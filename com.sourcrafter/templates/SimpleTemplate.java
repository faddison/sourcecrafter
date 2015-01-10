package templates;

import mapper.SimpleMapper;
import parser.SimpleClassParser;
import planner.SimplePlanner;
import decorator.SimpleDecorator;
import designer.SimpleDesigner;

public class SimpleTemplate extends AbstractTemplate 
{

	public SimpleTemplate(String metrics) 
	{
		super(new SimpleClassParser(false), 
			  new SimpleDesigner(), 
			  new SimpleDecorator(), 
			  new SimplePlanner(), 
			  new SimpleMapper(), metrics);
	}

}
