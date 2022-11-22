package chapter07.ex02;

import java.lang.reflect.Array;

public class Ex02 {
	public static void main(String[] args) {
		
		//두 배열의 각 방의 내용을 더해서 출력 하는 메소드 생성
		//배열 a : 4의 배수를 1 ~ 300까지 
		//배열 b : 5의 배수를 1 ~ 300까지
		
		//두 배열의 각 방의 값을 더해서 출력
		
		int[]a = new int[100/4];
		for(int i=0, j=4; i<a.length; i++, j+=4) {
			a[i]=j;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int[]b = new int[100/5];
		for(int i=0, j=5; i<b.length; i++, j+=5) {
			b[i]=j;
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("========================================================================");
		
		//int[]arr=new addArray 
		
		
	}
	
	
		//두개의 배열을 인풋 받아서 각 방의 값을 더해서 출력
	public static int[]addArray(int[]a, int[]b){
		int big;
		int bbb=0;
		if(a.length < b.length) {
			big=b.length;
			bbb=1;
		}else {
			big=a.length;
		}
		int[]arr=new int[big];
		for(int i=0; i<arr.length; i++) {
			if(bbb==1) {
				if(i<a.length) {
				arr[i]=a[i]+b[i];
			}else {
				arr[i]=b[i];
			}
			}else {
				if(i<b.length) {
					arr[i]=a[i]+b[i];
				}else {
					arr[i]=a[i];
				}
			}
		}
			
		return arr;
		
		
		
	}
}
