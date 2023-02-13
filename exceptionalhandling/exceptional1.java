package exceptionalhandling;



public class exceptional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int a=10;
		int b=0;
		int result=0;
		try {
		result=a/b;
		System.out.println("result"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("end");
		}
		
		
		
		

	}

}
