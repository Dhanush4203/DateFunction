package programtask;
 
	class Cat{
		public void MakeSound() {
			System.out.println("Animals sound");
		}
	}
	public class Animal extends Cat{
		public void MakeSound() {
			System.out.println("Cat Sound is Meow");
		}

		public static void main(String[] args) {
			
			Animal obj1=new Animal();
			Cat obj2=new Cat();
			obj1.MakeSound();
			obj2.MakeSound();
			
		}

		

	}

