package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
		public static void main(String[] args) {
		//<문제>do while 사용해서 무한 루프를 돌립니다.
		//Scanner에서 정수1를 넣으면 평균 출력 
		//Scanner에서 정수2를 넣으면 합계 출력.......
		//4번을 넣으면 do while 문을 빠져나옴 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("====================================================");
		System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
		System.out.println("====================================================");
		System.out.println(" 위 번호를 선택하세요 >>>>>");
		
		int i;			
		do {
			i=sc.nextInt();
			if (i==1){
				System.out.println("평균 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
			}else if(i==2){
				System.out.println("합계 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
			 }else if(i==3){
			 	System.out.println("이름 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
			 }else if(i==4){
			 	System.out.println("프로그램 종료");
			 	break;
			 }else{
			 System.err.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요.");
			 }
			
		}while(true);
		
		/*
		 
		 switch(i) {
			case 1:
				System.out.println("평균 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
				break;
			case 2:
				System.out.println("합계 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
				break;
			case 3:
				System.out.println("이름 출력");
				System.out.println("====================================================");
				System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("====================================================");
				System.out.println(" 위 번호를 선택하세요 >>>>>");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default :
				System.err.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요.");
				break;
			}
		 */
		
				
	}
}

