class objectToString
{
	String str = "";
	objectToString(Object x)
	{
		this.str = (String) x; 
	}
}

public class Example 
{

	public static void main(String[] args) 
	{
		Object obj = new Object();
		System.out.println(obj);
	}

}
