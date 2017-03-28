package io.crocker.ucy.binaryseach;

public class BinarySearch {
	private int[] numbers;
	
	public BinarySearch(int[] numbers) {
		this.numbers = numbers;
	}
	
	private int getMiddle(int start, int end) {
		return ((int) Math.floor((start + end) / 2));
	}
	
	public int run(int target) {
		boolean running = true;
		
		int pointerStart = 0;
		int pointerEnd = this.numbers.length - 1;
		
		int middle;
		
		System.out.println("Target: " + target);
		System.out.println("");
		
		System.out.println("Starting Binary Search on the List:");
		Helper.printList(this.numbers, pointerStart, pointerEnd);
		
		while (running) {
			System.out.println("");
			
			middle = this.getMiddle(pointerStart, pointerEnd);
			
			System.out.print("Checking index " + middle + " | ");
			Helper.printList(this.numbers, pointerStart, pointerEnd);
			
//			System.out.println(pointerStart + "\t" + pointerEnd + "\t" + middle);
			
			int middleValue = this.numbers[middle];
			
			if (middleValue == target) {
				System.out.println("Found at " + middle);
				running = false;
				return middle;
			} else {
				if (pointerStart > pointerEnd) {
					System.out.println("Item not in list");
					running = false;
					return -1;
				}
			}
			
			if (middleValue < target) {
				pointerStart = middle + 1;
			} else {
				pointerEnd = middle - 1;
			}
		}
		
		return -1;
	}
}
