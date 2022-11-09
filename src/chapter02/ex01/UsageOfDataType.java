package chapter02.ex01;

public class UsageOfDataType {
	public static void main(String[] args) {
		
		//변수 선언 및 값 대입을 위한 두 가지 방법
		
		//1. 변수를 선언하고, 이후 값을 대입
			//JAVA는 변수를 선언하면 값이 비어 있다.
		int a;		// 변수 선언 (1번만 선언)
		//System.out.println(a); 	오류
		a=3;		// 변수의 값 대입
		System.out.println(a);	//3
		a=4;
		System.out.println(a);	//4
		a=5;
		System.out.println(a);	//5
		
		//2. 선언과 동시에 값을 대입
		int b =3;	//변수 선언과 동시에 값을 할당. 
		System.out.println(b);
		b=4;
		System.out.println(b);
		b=5;
		System.out.println(b);
		
	}
}
