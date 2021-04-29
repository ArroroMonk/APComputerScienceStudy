class basicClass
{
	static int intValue = 0;
	
	basicClass(int num)
	{
		intValue = num;
	}
	
	public String toString()
	{
		String str = ""; 
		str += intValue;
		return str;
	}
}

public class whatIsStatic 
{

	public static void main(String[] args) 
	{
		basicClass classA = new basicClass(10);
		basicClass classB = new basicClass(20);
		basicClass classC = new basicClass(30); //this object changes the value for all the other objects
                                            //  as the static variable applies to the entire class,
                                            //  rather then to a specific object
		System.out.println( "Class A: "+classA.toString());
		System.out.println( "Class B: "+classB.toString());
		System.out.println( "Class C: "+classC.toString());
	}

}
