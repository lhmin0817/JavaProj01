package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		//<문제> 
		//배열 선언 4가지 방법
		//1. 배열 변수 이름 : array1 정수로 방 3개로 지정, 40, 50, 60 넣고 출력 1번 방법
		//2. 배열 변수 이름 : array2 실수로 방 5개로 지정, 44.0, 55.0, 60... 넣고 출력 2번 방법 
		//3. 배열 변수 이름 : array3 문자열 방 3개, "오늘""날씨""흐림" 3번 방법
		//4. 배열 변수 이름 : array4 문자 3, 'A''B''C' 4번방법
		
		int[]array1 = new int[3];
		array1[0]=40;
		array1[1]=50;
		array1[2]=60;
				
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		double array2[]; 
		array2 = new double[5];
		array2[0]=44.;
		array2[1]=55.;
		array2[2]=66.;
		array2[3]=77.;
		array2[4]=88.;
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		System.out.println(array2[4]);
		
		
		String[] array3 = new String[] {"오늘", "날씨", "흐름"};
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		
		int[]array4 = {'A', 'B', 'C'};
		System.out.println(array4[0]);
		System.out.println(array4[1]);
		System.out.println(array4[2]);
		
		
	}
}
