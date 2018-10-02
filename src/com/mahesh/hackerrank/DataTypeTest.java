package com.mahesh.hackerrank;

import java.util.Scanner;

public class DataTypeTest {
	public static void main(String[] args) {
		int i =4;
		double d = 4.0;
		String s = "HackerRank ";
		System.out.println("Enter the input");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		double e = scanner.nextDouble();
		scanner.nextLine();
		String t = scanner.nextLine();
		scanner.close();
		System.out.println(i+j);
		System.out.println(d+e);
		System.out.println(s.concat(t));
	}

}
