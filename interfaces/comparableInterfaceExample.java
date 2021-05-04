class exampleClass implements Comparable
{
	private int number; 
	
	exampleClass(int n)
	{
		number = n; 
	}
	
	//gets the number saved
	public int getNumber()
	{
		return number;
	}
	
	//using the comparable interface to include the compareTo method
	//we implement it here 
	public int compareTo(Object arg0) 
	{
		int n = 0;
		n = number - ((exampleClass) arg0).getNumber();
		return n;
	}
	
}

public class CompareTooInterface
{
	public static void main(String[] args) 
	{
		exampleClass a = new exampleClass(10); 
		exampleClass b = new exampleClass(1); 
		
		System.out.println(a.compareTo(b)); //will result in 9
	}
}
