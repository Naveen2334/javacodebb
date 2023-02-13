package exceptionalhandling;

public class Program2 {
	public static void main(String[] args)
	{
		
		try {	
		try {
		int arr[] = new int[5];
		
		arr[5] = 50;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("e");
		}
		
		//try {
			
		
		int a = 20/0; 
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("e");
//		}
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		
	}
}
