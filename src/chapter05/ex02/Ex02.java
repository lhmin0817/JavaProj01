package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//<문제> 
		// 배열의 변수 : arr1 배열의 방 갯수 : 500개
		// 배열방에 3의 배수 또는 5의 배수 저장
		// 출력 : 1. for  2.Enhanced for  3. Arrays.toString()을 사용해서 출력
		// 14:45분 
		
		int[]arr1 = new int[500];
		for(int i=0, j=1; i<500; i++, j++) {
			if((j%3==0)||(j%5==0)){
			arr1[i]=j;
			}else {
				i--;
			}
		}
		for(int i=0; i<500; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		for(int k:arr1) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println();
		
	
		
		
		
	}
}
