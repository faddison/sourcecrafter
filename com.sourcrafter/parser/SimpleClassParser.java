package parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import metrics.IMetrics;
import metrics.IMetricsCollection;
import metrics.MetricsCollection;
import metrics.SimpleClassMetrics;
import metrics.SimpleClassMetricsCollection;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import util.FileHelper;

public class SimpleClassParser implements IParser
{	
	private boolean shouldReadMetricsFromFile;
	private IDefaultHandler parserHandler;
	
	public SimpleClassParser(IDefaultHandler parserHandler, boolean shouldReadMetricsFromFile)
	{
		this.parserHandler = parserHandler;
		this.shouldReadMetricsFromFile = shouldReadMetricsFromFile;
	}
	
	@Override
	public boolean getShouldReadMetricsFromFile()
	{
		return this.shouldReadMetricsFromFile;
	}

	@Override
	public IMetricsCollection parse(String metricsSource)
	{
		if (shouldReadMetricsFromFile && metricsSource != null)
			metricsSource = FileHelper.readFile(metricsSource);
		
		return parseSimpleClassMetrics(metricsSource);
	}

	@Override
	public IDefaultHandler getDefaultHandler() 
	{
		return parserHandler;
	}
	
	private IMetricsCollection parseSimpleClassMetrics(String metricsSource) 
	{
		List<? extends IMetrics> metricsList = new ArrayList<SimpleClassMetrics>();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try 
		{
			SAXParser saxParser = factory.newSAXParser();
			InputSource inputSource = new InputSource( new StringReader( metricsSource ) );
			saxParser.parse(inputSource, (DefaultHandler) parserHandler);
			metricsList = parserHandler.getMetrics();
		} 
		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return new SimpleClassMetricsCollection(metricsList);
	}
}
