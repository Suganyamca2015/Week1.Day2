package week1.day2;

import java.util.Arrays;

public class FinsSecondLargestNumber {

	public static void main(String[] args) {

		int[] numbers= {3,2,5,7,10,11,17,21};

		Arrays.sort(numbers);
		System.out.println("The SecondLargest Number is:" + numbers[numbers.length-2]);
	}

}
