package polymorphism_quiz_44;

public class Main_Test {
	public static void main(String[] args) {
		Test t;
		t=new Test();
		t.fun(10);
		t.fun(2, 2);
		t.fun('S');
		t=new Base();
		t.fun(20);
		t=new Derived();
		t.fun(50);		
	}
}
