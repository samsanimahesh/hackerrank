package com.mahesh.hackerrank;

import java.util.Scanner;

public class SecondDay {
	public static void main(String[] args) {
		System.out.println("Enter the price of the meal");
		System.out.println(1f/2f);
		Scanner scanner = new Scanner(System.in);
		double mealPrice = scanner.nextDouble();
		int tip = scanner.nextInt();
		int tax = scanner.nextInt();
		double tipPercent = (mealPrice)*(tip*0.01);
		double taxPercent = (mealPrice)*(tax*0.01);
		int totalCost = (int)Math.round(mealPrice+taxPercent+tipPercent);
		System.out.println("The total meal cost is "+totalCost+" dollars.");
		scanner.close();
	}

}