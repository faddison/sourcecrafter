package tests.parser;

import static org.junit.Assert.*;
import metrics.SimpleClassMetrics;

import org.junit.Test;

import parser.SimpleClassParser;

public class SimpleClassParserTests
{
	@Test
	public void ParseTest_NullMetrics_ShouldReadFromFile_EmptyMetricsString()
	{
		SimpleClassMetrics metrics = new SimpleClassParser(true).parse("");
		assertEquals(metrics, null);
	}
	
	@Test
	public void ParseTest_NullMetrics_ShouldReadFromFile_NullMetricsString()
	{
		SimpleClassMetrics metrics = new SimpleClassParser(true).parse(null);
		assertEquals(metrics, null);
	}
	
	@Test
	public void ParseTest_NullMetrics_ShouldNotReadFromFile_NullMetricsString()
	{
		SimpleClassMetrics metrics = new SimpleClassParser(false).parse(null);
		assertEquals(metrics, null);
	}
	
	@Test
	public void ParseTest_NullMetrics_ShouldNotReadFromFile_EmptyMetricsString()
	{
		SimpleClassMetrics metrics = new SimpleClassParser(false).parse("");
		assertEquals(metrics, null);
	}

}
