package parser;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import util.FileHelper;
import metrics.SimpleClassMetrics;

public class SimpleClassParser extends AbstractParser
{
	private ArrayList<SimpleClassMetrics> classes = new ArrayList<SimpleClassMetrics>();
	
	public SimpleClassParser(boolean shouldReadMetricsFromFile)
	{
		super(shouldReadMetricsFromFile);
	}

	@Override
	public SimpleClassMetrics parse(String metrics)
	{
		if (shouldReadMetricsFromFile)
			metrics = FileHelper.readFile(metrics);
		
		return null;
	}
	
	public ArrayList<SimpleClassMetrics> parseSimpleClassMetrics(String filename) {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = factory.newSAXParser();
			SimpleClassParserHandler handler = new SimpleClassParserHandler();
			saxParser.parse(filename, handler);
			classes = handler.getClassMetrics();
			
//			printMetrics();
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return classes;
	}
}
