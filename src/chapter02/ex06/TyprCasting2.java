package chapter02.ex06;

public class TyprCasting2 {
	public static void main(String[] args) {
		//자동 타입 변환 (업캐스팅) / 수동 타입 변환 (다운캐스팅) 차이점;
		//1. 자동 타입 변환 (업캐스팅 : 낮은 자료형에서 높은 자료형으로 자동으로 변환);
			//byte => short => int => long => float => double;
		
		float value1 = 3;	//int => float 으로 자동 업캐스팅 되어 들어감;
						//(float) 3; 으로 안해도 자동 업캐스팅 된다.;
		long value2 = 4;	//int => long 으로 자동으로 업캐스팅;
		double value3 =7; //int => double 으로 자동 업캐스팅;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("=======================================");
		//2.수동 타입 변환 (다운 캐스팅: 높은 자료형에서 낮은 자료형으로 변환);
		int value4 = (int)3.5;	//double => int 다운 캐스팅;
		float value5 = 7.8f;		//double => float 다운 캐스팅;
						//정수 long은 값 뒤에 l, L을 적거나 앞에 (long)를 적는다.;
						//실수 float은 값 뒤에 f, F을 적거나 앞에 (float)를 적는다.;
		System.out.println(value4);
		System.out.println(value5);
		
		
	}
}
