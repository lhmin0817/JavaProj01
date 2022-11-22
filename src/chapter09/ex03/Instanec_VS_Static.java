package chapter09.ex03;

class A{
	int a=1;				//인스턴스 필드 : 객체를 생성 후 사용가능
	int b=2;		
	
	void print() {			//인스턴스 메소드 : 객체를 생성 후 사용가능 
		System.out.println(a+" "+b);
	}
}
class B{
	static int a=3;			//static(정적)필드 : 객체생성 없이 클래스 이름으로 호출가능 객체생성 후 사용 가능 
	static int b=4;
	
	static void print() {	//static(정적)메소드: 객체생성 없이 클래스 이름으로 호출 간으 객체생서 후 사용가능
		System.out.println(a+" "+b);
	}
}

public class Instanec_VS_Static {
	public static void main(String[] args) {
		//A class 인스턴스 필드, 인스턴스 메소드 < 객체화 후 사용
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.print();
		
		//B class static필드, static메소드 < 클래스 이름으로 사용가능, 객체생성 후에도 사용가능
		//객체 생성 없이 클래스 이름으로 필드와 메소드 호출 
		System.out.println(B.a);
		System.out.println(B.b);
		B.print();
		
		//객체 생성 후 필드와 메소드 호출
		B b1=new B();		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.print();
		
		
	}
}
