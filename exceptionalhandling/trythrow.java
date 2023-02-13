package exceptionalhandling;

//import java.util.Scanner;


public class trythrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc = new Scanner(System.in);
		//System.out.println("enter the withdrawlamount");
		//int withdrawlamount = sc.nextInt();
		//System.out.println("enter availableamount");
		//int availableamount = sc.nextInt();
		int withdrawlamount = 5000;
		
		int availableamount = 4000;
		if(withdrawlamount>availableamount)
		{
			System.out.println("your account has not sufficient balance");
		}
		else
		{
			availableamount = availableamount-withdrawlamount;
			
			System.out.println("balance ="+availableamount);
		}
		
		

	}

}
