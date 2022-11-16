package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//<문제>
		/*
		 	2차원 배열 변수 : arr1
		 	arr1[0] 		<== 2의 배수만 저장
		 	arr2[1]			<== 5의 배수만 저장
		 	arr3[2]			<== 3의 배수와 8배수를 저장
		 	arr4[3]			<== 1씩 증가 7의 배수 제외
		 	
		 	행의 갯수 4개
		 	열의 갯수 100개
		 	
		 	 1.for, 2.Enhanced for, 3.Arrays toString() 
		 */
		
		int[][]arr1 = new int[4][100];
		/*(for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[i].length; j++) {
				arr1[0][j]=(j+1)*2;
				System.out.print(arr1[i][j]+" ");
			}
			for(int j=0; j<arr1[i].length; j++) {
				arr1[1][j]=(j+1)*5;
			}
			
			for(int a=0, l=1; a<arr1[i].length; a++, l++) {
					if(l%3==0||l%8==0) {
						arr1[i][a]=l;
						continue;
					}
					a--;
				}
				
				
			}
			for(int q=0; q<arr1[i].length; q++) {
				while(true) {
					q++;
					if(q%7!=0) {
						arr1[3][q]=q;
						break;
					}
				}
			}
			System.out.println();
		}
		*/
		for(int i=0; i<arr1.length; i++) {
			if(i==0) {
				for(int a=0; a<arr1[i].length; a++) {
					arr1[i][a]=(a+1)*2;
				}
				
			}else if(i==1) {	
				for(int a=0; a<arr1[i].length; a++) {
					arr1[i][a]=(a+1)*5;
				}
				
			}else if(i==2) {
				for(int a=0, b=1; a<arr1[i].length; a++, b++) {
					if(b%3==0||b%8==0) {
						arr1[i][a]=b;
						continue;
					}
					a--;
				}	
				
			}else if(i==3) {
				for(int a=0, b=0; a<arr1[i].length; a++) {
					while(true) {
						b++;
						if(b%7!=0) {
							arr1[i][a]=b;
							break;
						}
					}	
				}	
			}
		}
		
		System.out.println("=========for================");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("=====Enhanced for 문을 사용해서 츨력=====");
		for(int[]arr2 : arr1) {
			for(int k : arr2) {
				System.out.print(k+" ");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println("=====Arrays.toString()를 사용해서 츨력=====");
		for(int[] arr3 : arr1) {
			System.out.println(Arrays.toString(arr3));
		}
		
		
		
	}
}

		
	

