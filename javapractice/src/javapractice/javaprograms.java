package javapractice;

import java.util.*;
import java.util.Scanner;

public class javaprograms {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        // Input the buying price
		        System.out.print("Enter the buying price: ");
		        double buyingPrice = scanner.nextDouble();

		        // Input the selling price
		        System.out.print("Enter the selling price: ");
		        double sellingPrice = scanner.nextDouble();

		        // Input the investment amount
		        System.out.print("Enter the investment amount: ");
		        double investmentAmount = scanner.nextDouble();

		        // Calculate the number of shares bought
		        int numberOfShares = (int) (investmentAmount / buyingPrice);

		        // Calculate the profit
		        double profit = (sellingPrice - buyingPrice) * numberOfShares;

		        // Output the profit
		        System.out.println("Your profit is: $" + profit);

		        scanner.close();
		    }
}