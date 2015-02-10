package tests.parser;

import static org.junit.Assert.assertEquals;
import metrics.SimpleMetrics;

import org.junit.Before;
import org.junit.Test;

import parser.SimpleParser;


public class SimpleParserTests
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void test()
	{
		String metricsSource = "1, 1";
		SimpleParser simpleParser = new SimpleParser();
		
		SimpleMetrics simpleMetrics = (SimpleMetrics) simpleParser.parse(metricsSource);

		assertEquals(1, simpleMetrics.getNumberOfClasses());
		assertEquals(1, simpleMetrics.getNumberOfMethodsPerClass());
		
	}

}
