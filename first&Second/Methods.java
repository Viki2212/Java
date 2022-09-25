package selenium;

public class Methods {
	public static void main(String[] args) {
		SecondDay sd = new SecondDay();
		String print = sd.carDetails();
		System.out.println(print);
		
		int Price = sd.carPrice();
		System.out.println(Price);
		
		sd.carAvailable();
		
		sd.carDamage();
		
		int one = sd.a;
		int two = sd.b;	
		int three = (one+two);
		System.out.println(three);
	}

}
