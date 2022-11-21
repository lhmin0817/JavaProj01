package chapter07.ex02;

import java.util.Arrays;

public class Ex002 {
	public static void main(String[] args) {
		int[]a=new int[300/4];
		for(int i=0, j=4; i<a.length; i++, j+=4) {
			a[i]=j;
		}
		System.out.println(a.length);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[]b=new int[300/5];
		for(int i=0, j=5; i<b.length; i++, j+=5) {
			b[i]=j;
		}
		System.out.println(b.length);
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println(a[59]);
		System.out.println(b[59]);
		
		
		arraySum(a,b);
	}
	public static void arraySum(int[]a, int[]b) {
		int []c=new int [75];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(i>59) {
					c[i]=a[i]+0;
				}
				if(i==j) {
					c[i]=a[i]+b[j];
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
	
}
