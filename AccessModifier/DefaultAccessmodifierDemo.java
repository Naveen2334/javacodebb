
package AccessModifier;
class DefaultAccessmodifierDemo1
{
	 int val =10;
	 void display()
	{
		System.out.println("this public display of another class");
	}
}

public class DefaultAccessmodifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method of public class where program execute");
		DefaultAccessmodifierDemo1 obj = new DefaultAccessmodifierDemo1();
		obj.val+=10;
		System.out.println("value of variable of class default AccessmodifierDemo1 will be ::::"+obj.val);
		obj.display();
		/*if there is no any declaration then it is called as default access modifier where method and variable call can be
		 possible only within same packageoutside package it will give compile time error here you can see that there is no problem in execution of default variable and method they can be
		  accessible any where with just making obj of class and call that method and variable within package only*/
	}

}
