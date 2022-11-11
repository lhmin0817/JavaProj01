package chapter03.ex06;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		//<문제> : Scanner로 정수 값을 인풋 받고 인풋 받은 정수값이 홀수이면 "홀수"라고 표현 
		// 짝수 이면 짝수라고 표현
		//<삼항 연산자를 사용>
		// 11시 20분 까지 p.jangwoo@gmail.com
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력");
		int a = sc.nextInt();
		System.out.println(a + "은" + (a % 2==0 ? "짝수 입니다." : "홀수 입니다."));
	}
}
