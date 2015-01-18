package tests.parser;

import static org.junit.Assert.*;

import java.util.List;

import metrics.IMetrics;
import metrics.IMetricsCollection;

import org.junit.Test;

import parser.SimpleClassParser;

public class SimpleClassParserTests
{
	@Test (expected=NullPointerException.class)
	public void parseTest_nullMetrics_shouldReadFromFile_emptyMetricsString()
	{
		IMetricsCollection metricsCollection = new SimpleClassParser(true).parse("");
		List<? extends IMetrics> metrics = metricsCollection.getMetrics(); 
		
		assertEquals(metrics, null);
	}
	
	@Test (expected=NullPointerException.class)
	public void parseTest_nullMetrics_shouldReadFromFile_nullMetricsString()
	{
		IMetricsCollection metricsCollection = new SimpleClassParser(true).parse(null);
		List<? extends IMetrics> metrics = metricsCollection.getMetrics(); 
		assertEquals(metrics, null);
	}
	
	@Test (expected=NullPointerException.class)
	public void parseTest_nullMetrics_shouldNotReadFromFile_nullMetricsString()
	{
		IMetricsCollection metricsCollection = new SimpleClassParser(false).parse(null);
		List<? extends IMetrics> metrics = metricsCollection.getMetrics(); 
		assertEquals(metrics, null);
	}
	
	@Test (expected=NullPointerException.class)
	public void parseTest_nullMetrics_shouldNotReadFromFile_emptyMetricsString()
	{
		IMetricsCollection metricsCollection = new SimpleClassParser(false).parse("");
		List<? extends IMetrics> metrics = metricsCollection.getMetrics(); 
		assertEquals(metrics, null);
	}
	
	//@Test
	public void parseTest_sweetHomeMetrics_shouldReadFromFile_sweetHomeFilenameMetricsString()
	{
		IMetricsCollection metricsCollection = new SimpleClassParser(true).parse("sources/SweetHomeStructure.xml");
		List<? extends IMetrics> metrics = metricsCollection.getMetrics(); 
		assertEquals(metrics, null);
	}

}
