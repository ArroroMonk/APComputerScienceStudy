class IntegerClass
{
	int intValue = 0;
	static int staticIntValue = 0;
	
	IntegerClass(int value)
	{  
		this.intValue = value;
		staticIntValue = value;
	}
	
	public void changeIntValue(int newValue)
	{
		this.intValue = newValue;
	}
	
	public String toString()
	{
		String str = "";
		
		str += "Integer Value: " + this.intValue; 
		return str;
	}
}

public class exampleA 
{
	public static void main(String[] args)
	{
		IntegerClass x = new IntegerClass(10); 
		IntegerClass y = x; //alias of x
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		
		x.changeIntValue(22);
		//the above changes both x and y
		//since y is an alias of x
		System.out.println(x.toString());
		System.out.println(y.toString());
	}
}
