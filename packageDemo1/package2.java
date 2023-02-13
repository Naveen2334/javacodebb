package packageDemo1;
//import packageDemo.*;
/*Here we have imported packageDemo so all information in packageDemo will be imported
what are the point we need to remember 
1.package which which is going to be imported that may and may not have main method means main method
will be & will not have in one package where it get imported.no problem even you can call main of other package also.
2.we make class object of other package in main method of other package where import is going
on then you have to call method of other package by help of object created.
3.Most important i.e you have to write just below package name i.e import importpackagename.*;
*/
public class package2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is package2");
		//package1 obj = new package1();
		packageDemo.package1 obj = new packageDemo.package1();//WITHOUT WRITING IMPORT STEMENT IN TOP
		obj.display();
		obj.main(args);
	}

}
