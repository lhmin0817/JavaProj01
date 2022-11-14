package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<문제> scanner 로 인풋 받은 값을 선택시 해당 내용을 이중 for문을 사용해서 출력하세요
		//4. 프로그램 종료시까지 무한 루프를 돌려서 작동
		// 1 ~ 4 이외 번호를 선택시 "잘못되 입력입니다. 1 ~ 4 까지만 넣어주세요.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("====================================================");
		System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7의 배수단만  | 4. 프로그램 종료");
		System.out.println("====================================================");
		System.out.println(" 위 번호를 선택하세요 >>>>>");
		int i;
				
		do {
			i=sc.nextInt();
			switch(i) {
				case 1: 
					for(int a=1; a<10; a++) {
						for(int b=1; b<10; b++) {
							System.out.println(a + " × " + b + " = " + a*b);
						}
					}
					break;
				
				case 2: 
					for(int c=1; c<20; c++) {
						for(int d=1; d<20; d++) {
							System.out.println(c + " X " + d + " = " + c*d);
				
						}
					}
					break;
				
				case 3:
					for(int e=1; e<20; e++) {
						if (e%7==0) {
							for(int f=1; f<20; f++) {
								System.out.println(e + " X " + f + " = " + e*f);
							}
						}
					}
					break;
				
				case 4: 
					System.out.println("프로그램 종료");
					break;
				
				default :
					System.err.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요.");
					break;
			}
		}while(i !=4);
	}
}
