package this_and_Super_keyword;

class SuperKeywordDemo12
{
	void message()
	{
		System.out.println("i am parent class message method");
	}
}
class SuperKeywordDemo13 extends SuperKeywordDemo12
{
	void message()
	{
		System.out.println("i am child class message method");
	}
	void display()
	{
		message();
		super.message();
		//here we can see that by just writing super u can see change that is super call parent class method.
	}
}



public class SuperKeywordDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordDemo13 obj = new SuperKeywordDemo13();
		obj.display();

	}

}
