package finalkeyword;
//case1 variavle is final 
//case2 method is final
//case3 class is final

//class FinalKeywordDemo1//case -3 if class declared final it cannot be extended
class FinalKeywordDemo1
{
	/*case-2 part -1: if method is declared as final then you cannot modify that method call in child class.
	 * 
	 * 
	 * 
	 final void add()
	{
		
		System.out.println("sum"+(10+78));
	}
}*/

public class FinalKeywordDemo extends FinalKeywordDemo1 {
	/*case1: concept : if variable declared final then it value remain same.it canoot be changed
	  if u change it in any where it will give compile time error
	final val =50;
	void display() {
		 val = 100;
		System.out.println("value ::::"+val);
	}
   */
	/* case-2 part-2
	void add()
	{
		
		System.out.println("sum"+(5+7));
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* case 2 part 3	FinalKeywordDemo obj = new FinalKeywordDemo();
		obj.add();
     */
	}

}
