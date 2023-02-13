package this_and_Super_keyword;

public class ThiskeywordDemo2 {
	void display()
	{
		System.out.println("welcome to disply");
		this.print();// used to call one method in another method
	}
void print()
{
	System.out.println("ready to print");
}
	
	public ThiskeywordDemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeywordDemo2 obj = new ThiskeywordDemo2();
		obj.display();

	}

}
