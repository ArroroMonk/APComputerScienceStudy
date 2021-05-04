interface animals
{
	public void eat(); //we cannot define the methods in the interface 
	public void travel();//we need to implement them in something else first before
						 // we can define them
}

public class interfacesInJava implements animals 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
  
  //if we do not include the abstract methods eat and travel, the program will return an error
	public void eat() {
		
	}

	public void travel() {
		
	}

}
