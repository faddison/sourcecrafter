package metrics;

import java.io.Serializable;

public class SimpleClassMetric implements IMetric, Serializable
{
	private static final long serialVersionUID = 1L;

	private int numMethods;
	private int numAttributes;
	private String className;
	private String packageName;
	
	public SimpleClassMetric() {
		
	}
	
	public SimpleClassMetric(String className, int numMethods, int numAttributes) {
		this.className = className;
		this.numMethods = numMethods;
		this.numAttributes = numAttributes;
	}

	public int getNumMethods() {
		return numMethods;
	}

	public void setNumMethods(int numMethods) {
		this.numMethods = numMethods;
	}

	public int getNumAttributes() {
		return numAttributes;
	}

	public void setNumAttributes(int numAttributes) {
		this.numAttributes = numAttributes;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

}