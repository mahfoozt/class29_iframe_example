package polymorphism_quiz_41;

public class Main_Animal41 {
	public static void main(String[] args) {
		Animal obj;
		obj=new Dog();	
		obj.sound();
		
		Animal obj1;
		obj1=new Cat();
		obj1.sound();
		
		Animal obj2;
		obj2=new Duck();
		obj2.sound();
	}
}
