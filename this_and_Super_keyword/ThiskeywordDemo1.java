/**
 * 
 */
package this_and_Super_keyword;


public class ThiskeywordDemo1 {
	int a;
	int b;
	

	public ThiskeywordDemo1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("this is parameterised constructor");
	}


	public ThiskeywordDemo1() {
		// TODO Auto-generated constructor stub
		this(10,20);
		System.out.println("this is default constructor");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeywordDemo1 obj =new ThiskeywordDemo1();
	}

}
