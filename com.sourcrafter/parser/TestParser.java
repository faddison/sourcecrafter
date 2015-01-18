package parser;

import org.xml.sax.helpers.DefaultHandler;

import metrics.IMetricsCollection;

public class TestParser implements IParser 
{
	@Override
	public IMetricsCollection parse(String metrics) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getShouldReadMetricsFromFile() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DefaultHandler getDefaultHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
