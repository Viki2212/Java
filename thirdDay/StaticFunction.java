package thirdDay;

public class StaticFunction {

	public StaticFunction() {
		this.c = 10;
	}
	
	int c;
	static int a = 10;
	
	public void eat() {
		System.out.println("Eating time is = " + c);
		System.out.println("Sleeping Time is = " + a);
	}
	
	public static void Sleep() {
		System.out.println("Sleeping Time is = " + a);
	}
	
	public static void main(String[] args) {
		StaticFunction sf = new StaticFunction();
		sf.eat();
		Sleep();
	}
}
