package AccessModifier;

class privateAccessmodifierDemo1
{
	private int val = 10;
	private void display()
	{
		System.out.println("this is pivate method");
	}
}

public class privateAccessmodifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateAccessmodifierDemo1 obj = new privateAccessmodifierDemo1();
	//	obj.val + = 10; //private member variable cannot accissible another class
	//	obj.display();//private method of another class cannot be accissible
		

	}

}
