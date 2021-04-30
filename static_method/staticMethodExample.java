class basicClass
{
	static int intValue = 0;
	//constructor, takes an integer and saves it
	basicClass(int num)
	{
		intValue = num;
	}
	
  //turns the saved value to a string and returns it
	public String toString()
	{
		String str = ""; 
		str += intValue;
		return str;
	}
	
  //example of a static method,
  //able to be referenced by refering to a class rather then an object
	public static void thisIsAStaticMethod()
	{
		System.out.println("This is a static Method");
	}
}

public class whatIsStatic 
{

	public static void main(String[] args) 
	{
		basicClass classA = new basicClass(10);
		
		basicClass.thisIsAStaticMethod(); //this will not cause an error, as this method is static.
		basicClass.toString(); //this will cause an error, as toString is a non-static method and is getting referenced by the class.
    
    classA.toString(); //this will not cause an error as an object is referencing a non-static method.
	}

}
