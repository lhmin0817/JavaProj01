package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<문제> Scanner 등록 하고 
		// 어머니이름, 이버지이름, 형제이름, 자신이름;
		// 어머니나이, 아버지나이, 형제나이, 자신나이;
		
		//콘솔에서 인풋받은 이름은 모두 출력;
		//나이의 합계(sum)와 평균(avg)을 출력;
		
		//완료시간 : 15:45분
		Scanner sc = new Scanner(System.in);
		
		String name1, name2, name3, name4;
		int mo, p, b, m;
		
		System.out.println("어머니의 이름을 입력");
		name1 = sc.next();
		
		System.out.println("아버지의 이름을 입력");
		name2 = sc.next();
		
		System.out.println("형제의 이름을 입력");
		name3 = sc.next();
		
		System.out.println("자신의 이름을 입력");
		name4 =sc.next();
		
		System.out.println("어머니의 나이를 입력");
		mo = sc.nextInt();	
		
		System.out.println("아버지의 나이를 입력");
		p = sc.nextInt();
		
		System.out.println("형제의 나이를 입력");
		b = sc.nextInt();
		
		System.out.println("자신의 나이를 입력");
		m = sc.nextInt();
		
		int sum = mo+p+b+m;
		double vag = sum/4.;
		
		System.out.println("가족의 나이 합은 "+sum);
		System.out.println("가족의 나이 평균은"+vag);
	}
}
