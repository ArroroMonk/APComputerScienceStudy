
class objectTestCase
{
	int intValue = 0;
	
	//Constructor method, takes a integer
	//	integer taken is then stored in intValue
	objectTestCase(int number)
	{
		this.intValue = number;
	}
	
	//Adds one to the currently stored integer value
	public void addOne()
	{
		this.intValue++;
	}
	
	//returns the saved integer value
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
