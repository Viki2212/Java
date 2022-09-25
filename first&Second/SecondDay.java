package selenium;

public class SecondDay {

	public	String carDetails() {
		String CarModel = "Maruthi Swift";
				return CarModel;
	}
	
	public int carPrice() {
		int CarPrice = 150000;
		int insurance = 40000;
		int total = (CarPrice + insurance);
		return total;
	}

	public void carAvailable () {
		System.out.println("Yes this model is available");
	}
	
	public boolean carDamage() {
		System.out.println("No damages");
		return true;
	}
	
	public int a = 10;
	public int b = 20;
}
