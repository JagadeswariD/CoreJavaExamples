package com.eswari.castingexample;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int i = Integer.parseInt(scan.nextLine());
	        Double d =  Double.parseDouble(scan.nextLine());
	        String s = scan.nextLine();

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
	}

}