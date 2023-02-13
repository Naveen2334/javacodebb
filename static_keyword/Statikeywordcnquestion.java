package static_keyword;

public class Statikeywordcnquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("value of x :::"+x);

	}
	static {
		int x = 0;
		System.out.println(x+10);
//concept----vvi		//here we get compilation error because it will not use main method value of x but reverse means if variable declared in block can be used in main and block will execut first then main it is concept.
	}

}
