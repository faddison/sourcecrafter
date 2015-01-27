//package parser;
//
//import java.io.IOException;
//import java.io.StringReader;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//
//import metrics.IMetricCollection;
//import metrics.MetricCollection;
//import metrics.SimpleClassMetric;
//
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//
//import util.FileHelper;
//
//public class SimpleClassParser implements IParser
//{	
//	private boolean shouldReadMetricsFromFile;
//	
//	public SimpleClassParser(boolean shouldReadMetricsFromFile)
//	{
//		this.shouldReadMetricsFromFile = shouldReadMetricsFromFile;
//	}
//	
//	@Override
//	public boolean getShouldReadMetricsFromFile()
//	{
//		return this.shouldReadMetricsFromFile;
//	}
//
//	@Override
//	public IMetricCollection parse(String metricsSource)
//	{
//		if (shouldReadMetricsFromFile && metricsSource != null)
//			metricsSource = FileHelper.readFile(metricsSource);
//		
//		return parseSimpleClassMetrics(metricsSource);
//	}
//	
//	private IMetricCollection parseSimpleClassMetrics(String metricsSource) 
//	{
//		List<SimpleClassMetric> metricsList = new ArrayList<SimpleClassMetric>();
//		SAXParserFactory factory = SAXParserFactory.newInstance();
//		try 
//		{
//			SAXParser saxParser = factory.newSAXParser();
//			InputSource inputSource = new InputSource( new StringReader( metricsSource ) );
//			SimpleClassParserHandler handler = new SimpleClassParserHandler();
//			saxParser.parse(inputSource, handler);
//			metricsList = handler.getMetrics();
//		} 
//		catch (ParserConfigurationException e) 
//		{
//			e.printStackTrace();
//		} 
//		catch (SAXException e) 
//		{
//			e.printStackTrace();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		return new MetricCollection(metricsList);
//	}
//}
