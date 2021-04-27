public class exampleA 
{

	private static String name;
	public static void main(String[] args)
	{
		System.out.println(name.length());
    //this creates an error, as name does not exist and cannot have a length value
    //spits out an error called the NullPointerException
	}
}
