package chapter05.ex02;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q;
		q=sc.nextInt();
		
		int[]arr1 = new int[q];
		int[]arr2 = new int[q];
		for(int i=0, j=3; i<arr1.length; i++, j+=3) {
			arr1[i]=j;
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
