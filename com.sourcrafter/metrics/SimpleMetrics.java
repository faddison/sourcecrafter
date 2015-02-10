package metrics;


public class SimpleMetrics
{

	private int numberOfClasses;
	private int numberOfMethodsPerClass;
	
	public SimpleMetrics(int numberOfClasses, int numberOfMethodsPerClass)
	{
		super();
		this.numberOfClasses = numberOfClasses;
		this.numberOfMethodsPerClass = numberOfMethodsPerClass;
	}
	
	public int getNumberOfClasses()
	{
		return numberOfClasses;
	}
	public void setNumberOfClasses(int numberOfClasses)
	{
		this.numberOfClasses = numberOfClasses;
	}
	public int getNumberOfMethodsPerClass()
	{
		return numberOfMethodsPerClass;
	}
	public void setNumberOfMethodsPerClass(int numberOfMethodsPerClass)
	{
		this.numberOfMethodsPerClass = numberOfMethodsPerClass;
	}
}
