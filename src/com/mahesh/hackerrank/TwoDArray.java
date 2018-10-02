package com.mahesh.hackerrank;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("Entering the 2D array problem");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of colums");
		int columns = scanner.nextInt();
		int[][] twoDArray = new int[rows][columns];
		for(int i =0 ;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println("Enter the "+i+"th row "+j+" th column element");
				twoDArray[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		int threeDrow = 0;
		int threeDcolumn = 0;
		int sumOfArray = 0;
		int maxSum = 0;
		for (int i = 0; i < rows; i++) {
			if (threeDrow < 3) {
				for (int j = 0; j < columns; j++) {
					if (threeDcolumn < 3) {
						if ((threeDrow == 1 || threeDcolumn == 2)) {
							sumOfArray += twoDArray[i][j];
							threeDcolumn++;
						}
					} else {
						threeDcolumn = 0;
					}
				}
				threeDrow++;
			}else{
				threeDrow = 0;
				if(sumOfArray > maxSum){
					maxSum = sumOfArray;
							
				}
			}
		}
		System.out.println("MaxSum is "+maxSum);
	}

}
