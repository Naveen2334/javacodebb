package AccessModifier;
class ProtectedAccessmodifierDemo1
{
	protected int val =10;
	protected static void display()
	{
		System.out.println("this public display of another class");
	}
}

public class ProtectedAccessmodifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method of protected class where program execute");
		ProtectedAccessmodifierDemo1 obj = new ProtectedAccessmodifierDemo1();
		obj.val+=10;
		System.out.println("value of variable of class PublicAccessmodifierDemo1 will be ::::"+obj.val);
		obj.display();
		/* here you can see that there is no problem in execution of protected variable and method they can be
		 * accessible any where within package just making obj of class and call that method and variable but if you want to acll in another package then 
		 * by the help of inheritance we perform */
	}

}
