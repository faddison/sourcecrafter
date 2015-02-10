package parser;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import metrics.EclipsePluginMetrics.EclipsePluginMetrics;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import util.FileHelper;

public class EclipsePluginMetricsParser
{
	public boolean getShouldReadMetricsFromFile() 
	{
		return true;
	}
	
	public EclipsePluginMetrics parse(String metricsSource)
	{
		if (getShouldReadMetricsFromFile() && metricsSource != null)
			metricsSource = FileHelper.readFile(metricsSource);
		
		return parseXml(metricsSource);
	}
	
	private EclipsePluginMetrics parseXml(String metricsSource) 
	{
		EclipsePluginMetrics metrics = null;
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try 
		{
			SAXParser saxParser = factory.newSAXParser();
			InputSource inputSource = new InputSource( new StringReader( metricsSource ) );
			EclipsePluginMetricsParserHandler handler = new EclipsePluginMetricsParserHandler();
			saxParser.parse(inputSource, handler);
			metrics = handler.getEclipsePluginProjectMetrics();
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
		
		return metrics;
	}

}
