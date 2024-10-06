package ch04.sec08;

import java.util.Iterator;

public class ContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}//if
			System.out.println( i + " ");
		}//FOR
		
	}//main

}//class
