package fourthDay;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Orange","Banana","Cherry","Mango", "Guva"};
		
		System.out.println(Arrays.toString(fruits));
		System.out.println(fruits.length);
		System.out.println(fruits[fruits.length-1]);
		System.out.println(fruits[0]);
		
		int[] doorNumbers = new int[5];
		doorNumbers[0] = 330;
		doorNumbers[1] = 331;
		doorNumbers[2] = 332;
		doorNumbers[3] = 333;
		doorNumbers[4] = 334;
		
		System.out.println(doorNumbers[2]);
		System.out.println(Arrays.toString(doorNumbers));
		
	}
}
