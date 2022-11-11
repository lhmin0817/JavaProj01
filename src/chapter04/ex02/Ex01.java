package chapter04.ex02;


import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> switch 문을 사용하여 프로그램을 하세요.
		// Scanner 정수 1를 인풋 받으면 "금메달 입니다. "출력
		// 		   정수 2를 인풋 받으면 "은메달 입니다. " 출력
		// 		   정수 3를 인풋 받으면 "동메달 입니다. " 출력
		// 		   그 외를 인풋 받으면 " 메달이 없습니다." 출력
		// <문제> switch 문을 사용하여 프로그램을 하세요.
			// Scanner gold를 인풋 받으면 "금메달 입니다. "출력
			// 		  silver 2를 인풋 받으면 "은메달 입니다. " 출력
			// 		   bronze 3를 인풋 받으면 "동메달 입니다. " 출력
			// 		   그 외를 인풋 받으면 " 메달이 없습니다." 출력
		int medal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("순위를 입력해주세요.");
		medal =sc.nextInt();
		
		switch(medal) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
		}
		
		String medal2;
		System.out.println("메달의 색을 영문으로 입력해주세요.");
		medal2 = sc.next();
		
		switch(medal2) {
		case "gold":
			System.out.println("금메달 입니다.");
			break;
		case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		sc.close();
		
	}
}
