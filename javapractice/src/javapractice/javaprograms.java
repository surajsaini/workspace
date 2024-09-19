package javapractice;

import java.util.Map.Entry;
import java.util.*;

class Animal {
	int legs = 4;
	int speak;

	public void walk() {
		System.out.println("walking on " + legs);
	}
}

class Dog extends Animal {
	public void walk() {
		int legs = 2;
		System.out.println("dog walking on " + legs);
		super.walk();
	}
}

public class javaprograms {

	public void test() {

		int[] nums = { 3, 30, 34, 5, 9 };
		String[] ab = new String[nums.length];
		// Convert the integer array to a String array
		String[] numStrs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numStrs[i] = String.valueOf(nums[i]);
		}

		// Sort the array using a custom comparator
		Arrays.sort(numStrs, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				// Compare based on concatenated strings in both possible orders
				String order1 = a + b;
				String order2 = b + a;
				return order2.compareTo(order1); // Sort in descending order
			}
		});

		// If the largest number is '0', return '0' (edge case)
		if (numStrs[0].equals("0")) {
			System.out.println("0");
			;
		}

		// Build the final result
		StringBuilder largestNumber = new StringBuilder();
		for (String numStr : numStrs) {
			largestNumber.append(numStr);
		}

		System.out.println(largestNumber.toString());
	}

	public static void main(String[] args) {

		javaprograms j = new javaprograms();

		j.test();
	}
}
