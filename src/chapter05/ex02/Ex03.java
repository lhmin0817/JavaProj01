package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//<문제>Scanner 배열의 방번호를 인풋 
		//	배열 변수 : arr1 2의 배수를 저장 후 출력 인풋 enhanced for문 사용 출력
		//	배열 변수 : arr2 3의 배수를 저장 후 출력 인풋 for문 사용 출력
		//	arr1.length
		
		Scanner sc = new Scanner(System.in);
		int i;
		i=sc.nextInt();
		
		
		int[]arr1 = new int[i];
		int[]arr2 = new int[i];
		for(int o=0; o<arr1.length; o++) {
			arr1[o]=(o+1)*2;
			arr2[o]=(o+1)*3;
		}
		System.out.println("2배수");
		for(int k : arr1) {
			System.out.print(k + ", ");
		}
		System.out.println("\n" + " 3배수");
		for(int k : arr2) {
			System.out.print(k + ", ");
		}
		
	}
}