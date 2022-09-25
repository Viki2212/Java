package thirdDay;

public class Static {

	int x = 0;
	static int y = 0;
	
	public void counter() {
		x++;
		y++;
		System.out.println("Non-Static X = " + x +" "+"Static Y = "+ y);
	}
	
	public static void main(String[] args) {
		Static st = new Static();
		st.counter();
		st.counter();
		System.out.println("New Class");
		Static st1 = new Static();
		st1.counter();
		st1.counter();
		System.out.println("New Class");
		Static st2 = new Static();
		st2.counter();
		st2.counter();
		StaticFunction nf = new StaticFunction();
		nf.eat();
		StaticFunction.Sleep();
	}
}
