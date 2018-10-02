package com.mahesh.hackerrank;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");	
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int[] array = new int[i];
		for(int j=0;j<i;j++){
			System.out.println("Enter the element "+j);
			array[j] = scanner.nextInt();
		}
		for(int j=array.length-1;j>=0;j--){
			System.out.print(array[j]+" ");
		}
		scanner.close();
	}

}
