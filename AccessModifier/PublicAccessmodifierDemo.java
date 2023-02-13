package AccessModifier;
class PublicAccessmodifierDemo1
{
	public int val =10;
	public static void display()
	{
		System.out.println("this public display of another class");
	}
}

public class PublicAccessmodifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method of public class where program execute");
		PublicAccessmodifierDemo1 obj = new PublicAccessmodifierDemo1();
		obj.val+=10;
		System.out.println("value of variable of class PublicAccessmodifierDemo1 will be ::::"+obj.val);
		obj.display();
		/* here you can see that there is no problem in execution of public variable and method they can be
		 * accessible any where with just making obj of class and call that method and variable */
	}

}
