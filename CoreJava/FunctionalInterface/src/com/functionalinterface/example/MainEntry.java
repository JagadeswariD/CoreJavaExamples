package com.functionalinterface.example;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int i = 0;
		int[] value = null;
		int exit = 0;
		while (exit != -1) {
			System.out.println("Enter -1 to exit the loop");
			System.out.println(" 1--> Addition\n 2--> Subtraction\n 3--> Multiplication\n 4-->Division");
			switch (myObj.nextInt()) {
			case 1:
				System.out.println("Enter 4 numbers to add:");

				value = new int[4];
				i = 0;

				while (i < 4) {
					value[i] = myObj.nextInt();
					i++;

				}
				Calc add = new Calc() {

					@Override
					public void compute(int[] a) {
						int result = 0;
						for (int j : a) {
							result = result + j;
						}
						System.out.println("Sum of Numbers:" + result);

					}
				};
				add.compute(value);
				break;
			case 2:
				System.out.println("Enter 2 numbers to Subtract:");

				value = new int[2];
				i = 0;

				while (i < 2) {
					value[i] = myObj.nextInt();
					i++;

				}
				Calc sub = new Calc() {

					@Override
					public void compute(int[] a) {
						int result = 0;
						int max, min;
						if (a[0] > a[1]) {
							max = a[0];
							min = a[1];
						} else {
							max = a[1];
							min = a[0];
						}

						result = max - min;
						System.out.println("Difference of Numbers:" + result);

					}
				};
				sub.compute(value);
				break;
			case 3:
				System.out.println("Enter 2 numbers to Multiply:");

				value = new int[2];
				i = 0;

				while (i < 2) {
					value[i] = myObj.nextInt();
					i++;

				}
				Calc mul = new Calc() {

					@Override
					public void compute(int[] a) {
						int result = 0;
						result = a[0] * a[1];
						System.out.println("Product of Numbers:" + result);

					}
				};
				mul.compute(value);
				break;

			case 4:
				System.out.println("Enter 2 numbers to Divide:");

				value = new int[2];
				i = 0;

				while (i < 2) {
					value[i] = myObj.nextInt();
					i++;

				}
				Calc div = new Calc() {

					@Override
					public void compute(int[] a) {
						int result = 0;
						if (a[1] == 0)
							System.out.println("Divisor cannot be Zero ");
						else {
							result = a[0] / a[1];
							System.out.println("Dividend:" + result);
						}

					}
				};
				div.compute(value);
				break;
			case -1:
				exit = -1;
				break;

			}
		}

	}

}