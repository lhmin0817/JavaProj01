package chapter02.ex05;

public class TypeCasting1 {
	public static void main(String[] args) {
		// 타입 변환 (캐스팅)
		//1. 캐스팅 방법1 
				
				//정수의 기본은 int형으로 저장
		int value1 = (int)5.123;	//value1 에는 정수 값만 넣을 수 있다.
		//캐스팅을 통해 정수값만 출력을 할 수 있게 할 수 있다.
		long value2 = (long)10.123;		//정수 값만 출력
		
			//실수의 기본은 double
		float value3 = (float)5.8;		//캐스팅 필요
		double value4 = 10.5;
		
		System.out.println(value1);	//5
		System.out.println(value2);	//10
		System.out.println(value3);	//5.8
		System.out.println(value4); //10.5
		
		System.out.println("===========================================");
		
		//2. 캐스팅 ( l, L / f, F ) : long / float
			//long, float 읜 정의된 변수에 값을 할당할 땐 캐스팅해서 넣어야 한다.
			//정수 : int 		실수 : double
		
		long value5 = 10L;
		long value6 = 20l;
		
		float value7 = 5.8f;
		float value8 = 5.8F;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
	}
}
