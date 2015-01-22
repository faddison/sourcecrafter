package parser;

import java.util.List;

import metrics.IMetrics;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public interface IDefaultHandler 
{

	public abstract List<? extends IMetrics> getMetrics();

	public abstract void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException;

	public abstract void endElement(String uri, String localName, String qName)
			throws SAXException;

	public abstract void characters(char[] ch, int start, int length);

}