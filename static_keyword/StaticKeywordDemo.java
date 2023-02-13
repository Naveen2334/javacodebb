package static_keyword;

	 


public class StaticKeywordDemo {
	static int a =10;
	static int b;
	static int sum;//no need to intialize
	/*Here we have declared static variable val it once it declared within package it 
	 remain same until and unless it changed by calling object*/
	static {                             //static block 
		 b = a+20;
	}
	static void add()//static method can only call stsic method
	{
	 sum = a+52;
	 System.out.println("sum will be:::::"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("now the value of a:::"+a);
		
		System.out.println("now the value of b:::"+b);
		add();

	}

}
