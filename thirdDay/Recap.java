package thirdDay;

public class Recap {
	
	public Recap(){							//Constructor
		this.c = 230;
		this.e = 20;
	}
	
	int c; 									//instance Variable / Global variable
	int e;
	static int g = 20; 						// Static Variable
	
	public static int remain() { 			//Static Method
		int f = 20;
		int h = f + g;
		System.out.println(h);
		return h;
	}
	
	public int amount(int c) { 				//Non-Static method
		int a = 100;
		int b = 200;
		int d = a+b+this.c+c+g+e;
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) { //Main method
		Recap rp = new Recap();
		rp.amount(20); 						// Non-Static method calling
		remain(); 							// Static method calling
	}
}
