package io.crocker.ucy.binaryseach;

public class Helper {
	public static void printList(int[] list, int startIndex, int endIndex) {
		for (int i = 0; i <= endIndex; i++) {
			if (i == endIndex) {
				System.out.println(list[i]);
			} else {
				System.out.print(list[i] + ", ");
			}
		}
	}
}
