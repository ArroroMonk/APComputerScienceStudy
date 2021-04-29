
class objectTestCase
{
	int intValue = 0;
	objectTestCase(int number)
	{
		this.intValue = number;
	}
	
	public void addOne()
	{
		this.intValue++;
	}
	
	public int getValue()
	{
		return this.intValue;
	}
}

public class Example 
{

	public static void main(String[] args) 
	{
		objectTestCase otc = new objectTestCase(10);
		
		System.out.println(getValueFromObjectParam(otc));
	}
	
	public static int getValueFromObjectParam(objectTestCase test)
	{   //an object of class objectTestCase is passed through
		//this method uses a method of the test object to return
		//	the value of the value
		int num = test.getValue();
		return num;
	}
}
