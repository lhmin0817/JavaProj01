package chapter02.ex07;

public class Operation_Date_Type {
	public static void main(String[] args) {
		//같은 자료형 간의 연산 / 다른 자료형 간의 연산;
		
		//1. 같은 자료형 간의 연산;
		int value1 = 3+5;	//8
		int value2 = 8/5;	//1		int/int =int;
		//double value2 = 8/5; => 1.0;
		System.out.println(value1);
		System.err.println(value2);
		
		float data1 = 3.0f + 5.0f;
		System.out.println(data1);	//8.0;
		
		double data2 = 8.0/ 5.0;
		System.out.println(data2);	//1.6;
		
		double data3 = 8/5;			//int/int =int(1);
		System.out.println(data3);	//1.0	<= 정수/ 정수 값;
		
		double data4 = 8/5.0;		//정수 8이 실수 double형으로 업캐스팅 후 연산;
		System.out.println(data4);	//1.6;
		
		//주의 : 평균을 산출할때 double; 
		
		System.out.println("==========================================");
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅 자동으로 일어나고 연산);
		
		//int data5 = 5+3.5;	오류 발생
		int data =(int)5+(int)3.5;	
		double data6 =5+3.5;		//5 => 5.0 / 5.0+3.5;
		int data7 =5+ (int)3.5;		//8;
		int data8 = (int)(5+3.5);	//8;	
		double data9 = 5/2.0;		//5 => 5.0 / 2.5;
		
		System.out.println(data);
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);
		System.out.println(data9);
		
		double data10 = 5/2;		//2.0;
		System.out.println(data10);
		
		System.out.println("===========================================");
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) => data11 (double);
		System.out.println(data11+data12);		//int => double;
		//업캐스팅 : data11 (int) => data11 (double);
		System.out.println(data11/data12);		//int => double;
		//다운 캐스팅 : data11(double) => data12(int);
		System.out.println(data11/(int)data12); //double => int;
		
		System.out.println("===========================================");
		//<문제>
		//국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99 ;
		// 각 과목의 점수를 int에 변수를 만들어서 저장 후 학계(sum), 평균(avg)값을 출력
		
		int a=90, b=88, c=77, d=90, e=99, sum=a+b+c+d+e;
		double vag= sum/5.0;
		
		System.out.println("합계 = "+sum+" 점");
		System.out.println("평균 = "+vag+" 점");
		
	}
}
