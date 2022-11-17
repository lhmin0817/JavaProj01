package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		//2차 정방형 배열
		
		//1. 배열의 선언
		int[][]arr1 = new int[5][100];		//5: 행의 갯수 100: 열의 갯수
		
		System.out.println(arr1.length);	//5, arr1.length : 행의 갯수
		System.out.println(arr1[0]);		//100, arr1[0].length : 0행의 열의 갯수
		
		//2. 2차원 배열의 값 넣기 : 2증 for문 (for - for)을 사용해서 값을 넣기
		int a=0;
		for(int i=0; i<arr1.length; i++) {
			//열를 정의 j <== 열의 방번호, arr1[i].length <== i행의 열의 갯수
			for(int j=0; j<arr1[i].length; j++, a++) {
				arr1[i][j]=a+1;
			}
		}
		//3. 배열의 값을 출력(for-for)
		for(int i=0; i<arr1.length; i++) {	//행을 루프
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===== Enhanced for문으로 출력 =====");
		
		//4. Enhanced for 문을 사용해서 값 출력
		for(int[] k: arr1) {				//arr1의 루프를 돌면서 행을 꺼내와서 k변수에 할당
			for(int b : k) {				//1차원 배열의 각 방의 값을 끄집어 와서 b 변수에 담는다.
			System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("===== Arrays.toString()을 사용해서 값 출력 =====");
		//5. Arrays.toString()을 사용해서 값 출력
		// arr1 : 2차원 배열 
		for(int[]k:arr1) {
			System.out.println(Arrays.toString(k));
		}
	}
}