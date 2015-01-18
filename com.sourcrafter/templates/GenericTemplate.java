package templates;

import mapper.IMapper;
import parser.IParser;
import planner.IPlanner;
import decorator.IDecorator;
import designer.IDesigner;

public class GenericTemplate extends AbstractTemplate
{

	public GenericTemplate(IParser parser, IDesigner designer,
			IDecorator decorator, IPlanner planner, IMapper mapper, String metrics) {
		super(parser, designer, decorator, planner, mapper, metrics);
	}

}
