package encapsulation;

/**concept:::In encapsulation in a class we use private variable that is accessible within class 
 * after that we genrate seter and getter method.
 * 
 * Now in another class we can access this variable by only using getter and setter method
 * which help in encapsulating thing from normal view.
 * 
 * set method is used to write or take value of variable;
 * get method used to read or diplay value of variable;
 * 
 * 
 *
 */
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setRollno(11235);
		obj.setName("Naveenkumar");
		obj.setMarks(95);
		obj.setGrade('A');
		obj.setAadharno(880256455);
		obj.setStatus(true);
		obj.setPhoneno(903546555);
	System.out.println("ROLL NO WILL::" +obj.getRollno());
	System.out.println("Name WILL::" +obj.getName(null));
	System.out.println("Aadhar NO WILL::" +obj.getAadharno());
	System.out.println("marks::" +obj.getMarks());
	System.out.println("grade:::" +obj.getGrade());
	System.out.println("status::" +obj.getStatus());
	System.out.println("phone no ::" +obj.getPhoneno());
	
	
		

	}

}
