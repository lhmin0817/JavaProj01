package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*<문제> Scanner
			1월 ~ 12월 까지 월을 인풋을 받아 해당 월의 일수를 출력
			출력 : 1월은 31일 입니다.
		 		  2월은 28일 입니다. 3월31 4월30 5월31 6월30 7월31 8월31 9월30 10월31 11월30 12월31
		 		  month 월은 day일 입니다.
		 		  switch 문으로 작성 
		 */
		Scanner sc = new Scanner(System.in);
		int month;
		int day =30;
		
		System.out.println("알고 싶은 일수의 달을 입력해주세요.");
		month =sc.nextInt();
		+*
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월의 일수는 " + ++day + "일 입니다.");
			break;
		case 2: 
			System.out.println(month + "월의 일수는 " + (day-2) + "일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월의 일수는 " + day + "일 입니다.");
			break;
		default:
			System.err.println("입력하실 월을 정확하게 입력해주세요.");
		}
		
		
	}
}
