package javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class surajabc {

	public static void suraj(int a) {

		if (a > 10)
			System.out.print(true);
		else
			System.out.print(false);
	}

	public static void suraj1() {

		int n1 = 0, n2 = 1, n3;

		System.out.println(n1 + " " + n2);

		for (int i = 1; i < 10; i++) {

			n3 = n1 + n2;
			System.out.print(n3 + " ");

			n1 = n2;
			n2 = n3;
		}
	}

	public static void primenumber(int o) {

		int n = 8 % 2;
		int m = 8 / 2;
		int z=0;

		for (int i = 2; i < o; i++) {

			if (o % i == 0) {
				z = 6;
			}
		}

		if (z == 6) {
			System.out.print("it is not");
		} else

		{
			System.out.print("it is ");
		}
	}

	public static void starsquare(int n, int m) {

		int i;
		int j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < m; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
					System.out.print("* ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void startriangle() {

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 10; j++) {

				if (j == 5) {

					System.out.println("*");
				}

				else {

					System.out.print(" ");
				}

				System.out.println();

			}
		}
	}

	public static void reverseastring(String n) {

		String b = "";

		for (int i = n.length() - 1; i >= 0; i--) {

			b = b + n.charAt(i);

		}

		System.out.print(b);
	}

	public static void RASarray(String b) {

		char[] ab = b.toCharArray();

		for (int i = b.length() - 1; i >= 0; i--) {

			System.out.print(ab[i]);
		}

	}

	public static void ArrayConsecutive() {

		int[] ab = { 1, 2, 5, 4, 5, 6, 7, 65, 4, 3 };

		int count = 0;
		int max = 0;

		for (int i = 0; i < ab.length - 1; i++) {

			if (ab[i] + 1 == ab[i + 1]) {

				count++;
			}

			else {
				count = 0;
			}

			max = Math.max(max, count + 1);
		}

		System.out.println(max);
	}

	public static void CountCapitalAlphabet() {

		String ab = "SuRajSaIniGZB";
		int count = 0;
		String ac = "";

		for (int i = 0; i <= ab.length() - 1; i++) {

			if (ab.charAt(i) >= 'A' && ab.charAt(i) <= 'Z') {

				count++;

				ac = ac + ab.charAt(i);
			}

		}
		System.out.print(count);
		System.out.print(ac);

	}

	public static void ReverseArray() {

		char[] abc = { 's', 'u', 'r', 'a', 'j' };

		int right = abc.length - 1;
		int left = 0;

		while (left < right) {

			char c = abc[right];
			abc[right] = abc[left];
			abc[left] = c;

			right--;
			left++;

		}

		System.out.print(abc);

	}

	public static void ReverseString() {

		String ab = "SuRaj";
		String bc = "";

		for (int i = ab.length() - 1; i >= 0; i--) {

			bc = bc + ab.toUpperCase().charAt(i);

		}

		System.out.print(bc);

	}

	public static void LargestElementinArray() {

		int[] ab = { 3, 5, 12, 22, 0, 3, 29 };
		int bc = 0;

		for (int i = 0; i < ab.length; i++) {

			if (bc < ab[i]) {

				bc = ab[i];

			}
		}
		System.out.print(bc);
	}

	public static void Palindroma() {

		String abc = "qwertyTrewq";

		String cba = "";
		for (int i = abc.length() - 1; i >= 0; i--) {

			cba = cba + abc.charAt(i);

		}

		if (cba.equals(abc)) {

			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not");
		}
		System.out.println(cba);
		System.out.println(abc);

	}

	public static void SecondLargestElementinArray() {

		int[] ab = { 8, 4, 5, 1, 9, 2, -1, 8, 3 };

		int FL = 0;
		int SL = 0;

		for (int i = 0; i < ab.length; i++) {
			if (ab[i] > FL) {
				SL = FL;
				FL = ab[i];
			} else if (ab[i] > SL && ab[i] != FL) {
				SL = ab[i];
			}
		}
		System.out.print("FL =" + FL + " and SL =" + SL);

	}

	public static void ReordedArray() {

		int[] ab = { 8, 4, -5, -1, 9, 2, -1, 8, -3 };
		ArrayList<Integer> bc = new ArrayList<>();
		ArrayList<Integer> cd = new ArrayList<>();

		for (int i = 0; i < ab.length; i++) {

			if (ab[i] < 0) {

				bc.add(ab[i]);

			}

			else {
				cd.add(ab[i]);

			}

		}
		bc.addAll(cd);
		System.out.println(bc);
		System.out.println(bc.get(5));
	}

	public static void TargetSum() {

		int[] ab = { 3, 5, 7, 4, 6 };
		int TS = 9;

		for (int j = 0; j < ab.length; j++) {
			for (int i = j + 1; i < ab.length; i++) {

				if (ab[j] + ab[i] == TS) {

					System.out.println(j + "and" + i);

				}

			}
		}
	}

	public static void TargetSum(int TS) {

		int[] ab = { 3, 5, 7, 4, 6 };

		Map<Integer, Integer> numMap2 = new HashMap<>();

		for (int i = 0; i < ab.length; i++) {

			int diff = TS - ab[i];

			if (numMap2.containsKey(diff)) {

				System.out.println(numMap2.get(diff) + "and" + i);

			}

			numMap2.put(ab[i], i);

		}
	}

	public static void CountAlphabet() {

		String ab = "aaabbbbcaaccaadd";

		Map<Character, Integer> CA = new HashMap<>();
		for (int i = 0; i < ab.length(); i++) {
			char ch = ab.charAt(i);

			if (CA.containsKey(ch)) {

				CA.put(ch, CA.get(ch) + 1);
			} else {
				CA.put(ch, 1);
			}
		}

		System.out.println(CA);
		for (Map.Entry<Character, Integer> entry : CA.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void ConvertNumricToChar() {

		String ab = "a4d3v2";

		for (int i = 0; i < ab.length(); i++) {

			if (Character.isAlphabetic(ab.charAt(i))) {

				System.out.print(ab.charAt(i));

			} else {
				int a = Character.getNumericValue(ab.charAt(i));

				for (int j = 1; j < a; j++) {

					System.out.print(ab.charAt(i - 1));
				}
			}
		}
	}

	public static void ProductArrayExpectSelf() {

		int[] ab = { 3, 4, 1, 9 };
		int n = ab.length;

		int[] rightab = new int[n];
		int[] leftab = new int[n];
		int[] outputab = new int[n];

		leftab[0] = 1;
		rightab[n - 1] = 1;

		for (int i = 1; i < n; i++) {
			leftab[i] = ab[i - 1] * leftab[i - 1];
		}

		for (int j = n - 2; j >= 0; j--) {

			rightab[j] = ab[j + 1] * rightab[j + 1];
		}

		for (int m = 0; m < n; m++) {
			// System.out.println(leftab[m] + "L");
			// System.out.println(rightab[m] + "R");
			// outputab[m] = leftab[m] * rightab[m];
			System.out.println(leftab[m] * rightab[m]);

		}
	}

	public static void SortAnArray() {
		int[] ab = { 7, 1, 0, 2 };

		int bc = 0;
		for (int j = 0; j < ab.length; j++) {
			for (int i = j + 1; i < ab.length; i++) {

				if (ab[j] > ab[i]) {

					bc = ab[j];
					ab[j] = ab[i];
					ab[i] = bc;

				}
			}
		}
		for (int j = 0; j < ab.length; j++) {
			System.out.print(ab[j]);
		}
	}

	public static void test() {
		
		int[] ab = {7,8,3,9};
		int bc;
		for(int j=0;j<ab.length;j++) {
		for(int i=j+1;i<ab.length;i++) {
			
			if(ab[j]>ab[i]) {
				bc=ab[i];
				ab[i]=ab[j];
				ab[j]=bc;
				
			}}}
			
			for (int j = 0; j < ab.length; j++) {
				System.out.print(ab[j]);
		}}
	

	public static void main(String[] args) {

		test();
	}

}
