package this_and_Super_keyword;
class SuperKeywordDemo22
{
	SuperKeywordDemo22()
	{
		System.out.println("i am parent class constructor");
	}
}
class SuperKeywordDemo23 extends SuperKeywordDemo22
{
	SuperKeywordDemo23()
	{
		super();// ye aap likhoge aur construction of parent class call ho jaiega.
		System.out.println("i am child class constructor");
		//vvi concept//super();//wrong because Constructor call must be the first statement in a constructor
	}
}


public class SuperKeywordDemo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordDemo23 obj =  new SuperKeywordDemo23();
	}

}
