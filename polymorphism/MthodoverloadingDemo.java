package polymorphism;
class MthodoverloadingDemo1
{
	public void mul(int a,int b)
	{
		System.out.println("product:::"+(a*b));
	}
	public void mul(double a,double b,double c)
	//public void mul(int a,int b,int c)
	{
		System.out.println("product ::"+(a*b*c));
	}
}


public class MthodoverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthodoverloadingDemo1 obj =new MthodoverloadingDemo1();
		obj.mul(2,3);
		obj.mul(20, 30,10);
		

	}

}
