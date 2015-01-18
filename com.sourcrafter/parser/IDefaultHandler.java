package parser;

import java.util.ArrayList;
import java.util.List;

import metrics.IMetrics;
import metrics.SimpleClassMetrics;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public interface IDefaultHandler {

	public abstract List<IMetrics> getMetrics();

	public abstract void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException;

	public abstract void endElement(String uri, String localName, String qName)
			throws SAXException;

	public abstract void characters(char[] ch, int start, int length);

}