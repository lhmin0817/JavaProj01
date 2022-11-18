package chapter07;

class A{	//A클래스 : 객체를 생성하기 위한 틀 
	
	//필드 : 객체 생성 시 Heap영역의 필드의 값이 저장
		//Heap 변수[필드]의 값이 비어있을 경우 강제 초기화
	int a;			//0
	boolean b;		//false
	double c;		//0.0
	String d;		//null
	
	//생성자 : A(){} 	: 기본생성자 생략
	
	//필드의 기본값을 출력하는 메소드
	void defaultValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class B{
	//필드 선언	: Heap영역의 저장
	int m=3;
	int n=4;
	
	//기본 생성자 생략 B(){}
	
	//메소드 선언
	void woek1() {
		int k=5;	//지역 변수 : Stack 저장
		System.out.println(k);
		work2(3);			//메소드 호출 (work2(3))
	}	
	void work2(int i) {
		int j=4;
		System.out.println(i+j);
	}
}

public class Field_Component {
	public static void main(String[] args) {
		//클래스 내부 구성요소
		//Field : 필드
		//Method : 메소드
		//Constructor : 생성자
		
		//메소드 내부에서 선언된 변수의 값은 Stack영역의 저장
		int e;	//메소드 내부에 선언된 변수는 Stack에 변수와 값이 저장됨
		
		//1. 객체 생성
		A abc = new A();		//new A() : 기본 생성자 호출
		
		abc.defaultValue();		//메소드 호출
		
		System.out.println("===========");
		A bcd = new A();
		bcd.defaultValue();
		
		System.out.println("==========");
		
		B b= new B();
		b.woek1();
	}
}
