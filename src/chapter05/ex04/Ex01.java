package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<문제> : 오늘까지 
		
		
		System.out.println("======================================================================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력");
		System.out.println("4. 프로드램 종료");
		System.out.println("======================================================================");
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		do {
			a=sc.nextInt();
			switch(a) {
				case 1:
					System.out.println("======================================================================");
					System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
					System.out.println("======================================================================");
					b=sc.nextInt();
				
					int[]arr1 = new int[b];
					int[]arr2 = new int[b];
					for(int i=0; i<arr1.length; i++) {
						arr1[i]=(i+1)*7;
						arr2[i]=(i+1)*8;
					}
					System.out.println("7의 배수");
					for(int k : arr1) {
						System.out.print(k + ", ");
					}
					System.out.println("\n" + "8의 배수");
					for(int k : arr2) {
						System.out.print(k + ", ");
					}
					System.out.println("\n"+"======================================================================");
					System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
					System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력");
					System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력");
					System.out.println("4. 프로드램 종료");
					System.out.println("======================================================================");
					break;
					
				case 2: 
					System.out.println("======================================================================");
					System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력");
					System.out.println("======================================================================");
					c=sc.nextInt();
				
					int[]arr3 = new int[c];
					for(int i=0, j=1; i<arr3.length; i++, j++) {
						arr3[i]=j;
						if((j)%4==0 && j !=0) {
							i--;
						}
					}
					for(int k : arr3) {
						System.out.print(k+ ", ");
					}
					System.out.println("\n"+"======================================================================");
					System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
					System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력");
					System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력");
					System.out.println("4. 프로드램 종료");
					System.out.println("======================================================================");
					break;
								
				case 3:
					System.out.println("======================================================================");
					System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력");
					System.out.println("======================================================================");
					d=sc.nextInt();
					int[]arr4 = new int[d];
					for(int i=0, j=1; i<arr4.length; i++, j++) {
						arr4[i]=j*3;
						if(arr4[i]%6==0 && j !=0) {
							i--;
						}
					}
					for(int k : arr4) {
						System.out.print(k+ ", ");
					}
					break;
			}
		}while(a !=4);
		System.out.println("프로그램 종료!");
		
	}
}
