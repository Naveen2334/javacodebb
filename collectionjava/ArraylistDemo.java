package collectionjava;
import java.util.ArrayList;
public class ArraylistDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();
		//add element
		animals.add("dog");
		animals.add("cat");
		animals.add("lion");
		animals.add("monkey");
		animals.add("tiger");
		System.out.println("arraylist:::" +animals);
		//to get value at that index
	//	String str = animals.get(1);
		String str = animals.get(2); //one time one inde you can access
		System.out.println("the value at index ::: "+ str);
		//to set new element at given index
		animals.set(1,"elephant");
		animals.set(3, "goat");
		System.out.println("modified arraylist"+animals);
		//to remove element in arraylist
		String str1 = animals.remove(0);//make variable every time while get and remove
		System.out.println("new array list"+animals);
	    
		

	}

}
