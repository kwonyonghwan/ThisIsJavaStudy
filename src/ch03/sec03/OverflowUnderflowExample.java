package ch03.sec03;

import java.util.Iterator;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
		}//for 
		
		System.out.println("---------------------------");
		
		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}//for
		
	}//main

}//class
