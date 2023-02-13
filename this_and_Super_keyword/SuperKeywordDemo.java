package this_and_Super_keyword;

class SuperKeywordDemo1
{
	int val = 10;
	
}
class SuperKeywordDemo2 extends SuperKeywordDemo1
{
	int val = 20;

	void display()
	{
		System.out.println("the value of val:::" +val);
		System.out.println("the value of val:::" +super.val);
		/**CONCEPT : Here we can see that difference after writing super.if 
		 * u use super then parent value assigned will be called. 
		 * 
		 */
		
	}
}

public class SuperKeywordDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordDemo2 obj = new SuperKeywordDemo2();
		obj.display();
		
		
		
	}

}
