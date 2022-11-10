package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<실습>	완료시간 18:10분 제출 : p.jangwoo@gmali.com Ex01.java
		// 정수 2개를 Scanner로 인풋 받고 두 값이 같으면 true로 출력 다르면 false 출력
		// 이름 2개를 Scanner로 인풋 박고 구 값이 같으면 true로 출력 다르면 faㅣse 출력
			// 등가연산자 사용
		
		//기본자료형 : ==
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("정수 a 입력");
		a = sc.nextInt();
		
		System.out.println("정수 b 입력");
		b= sc.nextInt();
		
		
		//참조자료형 : aNema.equals(bName)
		String aName;
		String bName;
		
		System.out.println("aName 입력");
		aName=sc.next();
		
		System.out.println("bName 입력");
		bName=sc.next();
		
		System.out.println(a==b);
		System.out.println(aName.equals(bName));
		
	}
}
