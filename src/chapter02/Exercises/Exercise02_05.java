package chapter02.Exercises;

import java.util.Scanner;

public class Exercise02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		System.out.println("The gratuity is $" + gratuityRate * subtotal / 100. + " and total is $" + (subtotal * (100 + gratuityRate) / 100.));
	}
}
