package instanceIntializationofblock;
class InstanceIntializationofBlock1
{
	{
		System.out.println("this is InstanceIntializationofBlock1 class block-1");
	}
	InstanceIntializationofBlock1()
	{
		System.out.println("this is InstanceIntializationofBlock1 constructor");
	}
	{
		System.out.println("this is InstanceIntializationofBlock1 class block-2");
	}
	
	//block execute first then constructor
	
}
public class InstanceIntializationofBlock extends InstanceIntializationofBlock1
//public class InstanceIntializationofBlock // both give same result
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceIntializationofBlock1 obj = new InstanceIntializationofBlock1();	
	}

}
