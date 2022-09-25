package thirdDay;

public class Constructor {
	
	public Constructor(int x) {
		this.c = x;
	}
	
	public Constructor(int x, String y) {
		this.c = x;
		this.name = y;
	}
	
	public Constructor(int x, String y, char z, float v) {
		this.c = x;
		this.name = y;
		this.d = z;
		this.a = v;
		this.w = true;
	}
	
	int c;
	String name;
	char d;
	float a;
	boolean w;
	
	public void disply() {
		int c = 10;
		System.out.println(c + this.c + " >> " + d +" " + name + " "+ a+ " "+ w);
	}

	public static void main(String[] args) {
		Constructor ct = new Constructor(10, "vikii");
		ct.disply();
		Constructor ct1 = new Constructor(23, "Viki");
		ct1.disply();
		Constructor ct2 = new Constructor(23, "Viki", 's', 12.27f);
		ct2.disply();
		Constructor ct3 = new Constructor(27);
		ct3.disply();
	}
}
