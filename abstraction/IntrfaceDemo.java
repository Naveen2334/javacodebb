package abstraction;
interface InterfaceExample 
		{
			// public, static and final data member
			int val = 10;
			// public and abstract method
			void show();
		}
			public class IntrfaceDemo implements InterfaceExample {
			// Overriding the abstract method
			public void show()
			{
			System.out.println("Coding Ninjas");
			}
			public static void main(String args[]) {
			IntrfaceDemo t = new IntrfaceDemo();
			t.show();
			System.out.println(val);
		}
		}

	

