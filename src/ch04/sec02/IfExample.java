package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {

		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다. ");
			System.out.println("등급은 A입니다.");
		}//if
		
		if(score < 90) {
			System.out.println("점수가 90보다 잡습니다.");
			System.out.println("등급은 B입니다. ");
		}//if
		
	}//main

}//class
