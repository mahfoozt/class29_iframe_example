package polymorphism_quiz_39;

public class Main_Car {
	public static void main(String[] args) {
		Car obj;
		obj=new Maruti();
		Car obj2;
		obj2=new Breeza();
		Car obj3;
		obj3=new Alto();
		
		System.out.println("Maruti car has a speed of "+obj.speed()+" km/h");
		System.out.println("Brezza car has a speed of "+obj2.speed()+" km/h");
		System.out.println("Alto car has a speed of "+obj3.speed()+" km/h");
	}
}
