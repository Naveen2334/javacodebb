package exceptionalhandling;
public class Exceptional {
	private String name;
	private int marks[];
	private int avg;
	private int averageMarks;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public int getAvg() {
		return avg;
	}


	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	class Tester
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptional sc =new Exceptional();
		int marks[] = {45,55,56};
		sc.setMarks(marks);
		sc.calculateAverageMarks();
		

	}
	}


public void calculateAverageMarks() {
	int sum = 0;
	int totalSubjects = 0;
	for (int i = 0; i < marks.length; i++) {
		sum += marks[i];
	}
	this.averageMarks = sum / totalSubjects;// Calculating averageMarks
	System.out.println("Average Marks : " + this.averageMarks);
}
}
