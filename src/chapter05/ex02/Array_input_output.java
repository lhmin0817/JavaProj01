package chapter05.ex02;

import java.util.Arrays;

public class Array_input_output {
	public static void main(String[] args) {
		//배열에 값을 넣고 출력
		System.out.println("=====1. 직접 값을 넣고 출력=====");
		//직접 배열 변수 선언 및 방 크기 초기화
		int[]arr1 = new int[5];
		
		//직접 해당 방 번로에 값을 할당
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		//직접 방의 번호를 출력
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2] + " " + arr1[3] + " " + arr1[4]);
		
		System.out.println("=====1. for문을 사용해서 대량으로 값을 넣고 출력=====");
		//arr2 의 방을 100개 선언,for을 사용해서 각 방에  1 씩증가해서 100번까지  
		int[]arr2 = new int[100];
		//for문을 사용해서 값 할당 : i :index(방번호)
		for(int i=0; i<100; i++) {	//i :0, 1, 2, .....99
			arr2[i]=i+1;			//각 방의 값을 자동으로 넣는다.
		}
		//for문을 사용해서 넣은 값을 출력
		for(int i=0; i<100; i++) {
			System.out.print(arr2[i] + ", ");
		}
		
		System.out.println();
		System.out.println("=====3. Enhanced for(향상된 for문)=====");
		//출력 시 Enhanced for : 배열의 각 방의 값을 출력할 때 쉽게 출력할 수 있다.
		//	- 0 ~ 마지막 발까지 한꺼번에 출력
		int[]arr3 = new int[100];
		// for문을 사용해서 7의 배수만 저장
		for(int i=0, j=7; i<100; i++, j+=7) {
			arr3[i]=j;
		}
		System.out.println("=====for문을 사용해서 출력=====");
		// 각 방의 내용을 for문을 사용해서 출력
		for(int i=0; i<100; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("=====향상된 for문 : Enhanced for을 사용해서 출력=====");
		//0번방 부터 마지막 방까지 모두 출력
		for(int k : arr3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("===== Array.toString(배열변수)=====");
		//Array.toString(arr3) : 배열 변수에 저장된 모든 값들을 출력
			//Array : 객체 
			//toString() : 메소드(함수) 
				//메소드 : 객체지향언어에서 함수를 메소드(method)라고 호칭
		System.out.println(Arrays.toString(arr3));	//배열 변수의 값을 출력
		
		System.out.println();
		System.out.println("======배열의 방의 갯수를 출력하는 메소드======");
		System.out.println(arr1.length);	//5
		System.out.println(arr2.length);	//100
		System.out.println(arr3.length);	//100
		
		System.out.println();
		System.out.println("====================================");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
}
