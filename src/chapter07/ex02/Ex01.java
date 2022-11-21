package chapter07.ex02;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		//메소드 매개 변수로 배열을 Argument호 인풋
		// 1 ~ 100까지 3의 배수의 배열을 생성 후 메소드 호출, 정수 : 5 호출 
		int[] ab = new int[100/3];
		for(int i=0; i<ab.length; i++) {
			ab[i]=(i+1)*3;
		}
		printArray(5, ab);
		
		int[] bc = new int[100/7];
		for(int i=0; i<bc.length; i++) {
			bc[i]=(i+1)*7;
		}
		printArray(2, bc);
		
		System.out.println();
		//int[]c = new M(200, 9);
		
		/*int[]a=new int[100/3];
		qo(a);
		// 1 ~ 100까지 7의 배수 배열을 생성 후 정수 : 2 
		 int[] a= new int[100];
		 for(int i=0, j=3; iMa.length; i++, j+=3){	i:방번호 j: 3의 배수 저장
		 	a[i]=j;
		 }
		 
		 
		 for(int i=0; i<a.length; I==){
		 	System.out.print(a[i] + " ");
		 }
		 
		 
		*/
		
	}
	//메소드 : static 매개변수 정수 1개와 배열를 인풋받아서 
	//		각 방의 배열의 값을 인풋받은 정수를 곱해서 출력하는 배열
	/*public static void qo(int []a) {
		for(int i=0, j=1; i<a.length; i++, j++) {
			if(j%3==0) {
				a[i]=j;
				System.out.print(j*5+" ");
			}
			
		}
		System.out.println();
		for(int i=0, j=1; i<a.length; i++, j++) {
			if(j%7==0) {
				a[i]=j;
				System.out.print(j*2+" ");
			}
			
		}
		*/
	public static void printArray(int a, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]*=a;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void pr(int[]a, int b) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]*b+" ");
		}
		System.out.println();
	}
	//방의 갯수에 따라 배수를 저장하는 배열을 리턴 시켜주는 메소드
		 // ma : 100까지
		 // mu : 배수를 저장하는 변수
	public static int[] M(int ma, int mu){
		 int[]a = new int[ma/mu];
		 for(int i=0, j=1; i<a.length; j++){// j배수를 저장하는 변수
		 	if(j%mu==0){	//j/mu ==0;	mu  배수일때만 j값을 배열 a에 저장
		 		a[i]=j;
		 		i++;
		 	}
		 }
		 return a;		
		 
	}
	
}
