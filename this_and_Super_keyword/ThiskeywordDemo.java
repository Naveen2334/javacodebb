package this_and_Super_keyword;

public class ThiskeywordDemo {
  int a;
  int b;
  
	

	public ThiskeywordDemo(int a, int b) {
	
	this.a = a;
	this.b = b;
}
void show() {
	System.out.println("a::"+a +"   b::"+b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeywordDemo obj = new ThiskeywordDemo(2,3);
		obj.show();

	}

}
