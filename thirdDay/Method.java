package thirdDay;

public class Method {
	
	int c;
	
	int num(){
		return 1;
	}
	
	public static void main(String[] args) {
		Method md = new Method();
		md.callMom(9095116415l);
		md.callMom("Mom");
		md.contactList(10); 
	}
	
	public void callMom(String name) {
		System.out.println("Call to " + name);
	}
	
	public long callMom(long number) {
		System.out.println("Call to " + number);
		return number;
	}
	 private int contactList(int nos) {
		 int a = 10;
		 int c = 5;
		 nos = (a+nos+this.num()+this.c+c);
		 System.out.println(nos);
		 return nos;
	 }

}
