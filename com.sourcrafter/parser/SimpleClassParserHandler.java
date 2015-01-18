package parser;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import metrics.SimpleClassMetrics;

public class SimpleClassParserHandler extends DefaultHandler implements IDefaultHandler {

	private ArrayList<SimpleClassMetrics> classes = new ArrayList<SimpleClassMetrics>();
	private SimpleClassMetrics scm = new SimpleClassMetrics();

	/* (non-Javadoc)
	 * @see parser.IDefaultHandler#getClassMetrics()
	 */
	@Override
	public ArrayList<SimpleClassMetrics> getClassMetrics() {
		return classes;
	}

	/* (non-Javadoc)
	 * @see parser.IDefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("CompilationUnit")) {

			String name = attributes.getValue("name");
			String pName = attributes.getValue("handle");
			String pName2 = pName.substring(pName.indexOf('<')+1,pName.indexOf('{'));

			scm = new SimpleClassMetrics();
			scm.setClassName(name);	
			scm.setPackageName(pName2);
		}

		if (qName.equalsIgnoreCase("Metric") && attributes.getValue("id").equals("NOM")) {

			String str = attributes.getValue("value");
			int numMethods = Integer.parseInt(str);
			scm.setNumMethods(numMethods);
		}

		if (qName.equalsIgnoreCase("Metric") && attributes.getValue("id").equals("NOF")) {

			String str = attributes.getValue("value");
			int numAttributes = Integer.parseInt(str);
			scm.setNumAttributes(numAttributes);
		}	

	}

	/* (non-Javadoc)
	 * @see parser.IDefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		if (qName.equalsIgnoreCase("CompilationUnit")) {
			classes.add(scm);
		}

	}

	/* (non-Javadoc)
	 * @see parser.IDefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length) {

	}
}