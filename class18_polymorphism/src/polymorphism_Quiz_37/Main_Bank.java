package polymorphism_Quiz_37;

public class Main_Bank {
	public static void main(String[] args) {
		Bank obj;
		obj=new SBI();
		obj.getRateOfInterest((float) 8.4);
		
		Bank obj1;
		obj1=new ICICI();
		obj1.getRateOfInterest((float) 7.3);
		
		Bank obj2;
		obj2=new AXIS();
		obj2.getRateOfInterest((float) 9.7);

	}

}
/* SBI Rate of Interest: 8.4%
ICICI Rate of Interest: 7.3%
AXIS Rate of Interest: 9.7%

*/