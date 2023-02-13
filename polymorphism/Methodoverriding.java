package polymorphism;
class Methodoverriding1
{
	public void show()
	{
		System.out.println("i am Methodoverriding1 class method call of show");
	}
}
class Methodoverriding2 extends Methodoverriding1
{
	public void show()
	{
		System.out.println("i am Methodoverriding2 class method call of show");
	}
}
class Methodoverriding3 extends Methodoverriding1
{
	public void show()
	{
		System.out.println("i am Methodoverriding3 class method call of show");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*make two object fo calling method of two class
		 * Methodoverriding1 p =new Methodoverriding2();
		Methodoverriding1 p1 =new Methodoverriding3();
		p.show();
		p1.show();*/
		Methodoverriding1 p;//make one place object then call it below step
		
		p =new Methodoverriding1();
		p.show();
		p =new Methodoverriding2();
		p.show();
		p =new Methodoverriding3();
		p.show();
		
		

	}

}
