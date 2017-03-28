package io.crocker.ucy.binaryseach;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		/*int[] numbers = new int[15];
		
		// Generate an array of 15 random integers
		Random generator = new Random(1);

		for (int i = 0; i < 15; i++) {
			numbers[i] = generator.nextInt(32);
			System.out.print(numbers[i] + ", ");
		}*/
		
		// TODO sort
		// For now, override
		
		int[] numbers = {1, 3, 4, 5, 6, 8, 10, 12, 15, 17, 20, 21, 23, 29, 30};
		

		BinarySearch bs = new BinarySearch(numbers);
		
		bs.run(4);
		
		
		
	}

}
