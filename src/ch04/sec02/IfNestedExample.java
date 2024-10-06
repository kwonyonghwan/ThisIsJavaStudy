package ch04.sec02;

import java.util.Iterator;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81 ;
		
		System.out.println("점수 : "  + score);
		
		String grade;
		 
		if (score>= 90) {
			if (score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}//secondIfElse
		}else {
			if (score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}//secondIfElse
		}//firstIfElse
		
		System.out.println("학점 : " + grade);
		
	}//main

}//class
