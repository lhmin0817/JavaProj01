package chapter05.ex04;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//배열
		
		//1. 배열 선언 - 동일한 데이터 타입을 저장. 방의 크기가 지정되면 수정이 불가
		int[]arr1;												//선언
		arr1 = new int[500];									//방 크기를 정의
		
		//배열에 저장된 기본 값을 출력	: Heap 강제 초기 값을 할당됨 0
		System.out.println("배열의 초기 값 출력");
		for(int i=0; i<arr1.length; i++) {						//arr1.length : 배열의 방의 갯수
			System.out.println(arr1[i]+" ");					//0 ~ 499 번 방까지 출력
		}
		System.out.println();
		
		//2. 배열의 값을 저장(for문을 사용해서 저장)
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
		}
		
		//3. 배열의 각 방에 저장된 내용을 출력 : for, Enhanced for, Arrays.String(arr1)
		System.out.println("=====for문을 사용해서 배열의 각 방의 내용을 출력=====");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("=====Enhanced for문을 사용해서 배열의 각 방의 내용을 출력=====");
		//0번 방부터 마지막 방까지 순환하면서 전체 출력 for문 보다는 구문이 짧다.
		for(int d : arr1) {
			System.out.print(d+" ");
		}
		
		System.out.println();
		System.out.println("===== Arrays.String(arr1)을 사용해서 배열의 각 방의 내용을 출력=====");
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
