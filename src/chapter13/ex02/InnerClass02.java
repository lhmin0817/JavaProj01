package chapter13.ex02;

import java.nio.file.spi.FileSystemProvider;

// 이너 클래스에서 외부 클래스의 필드와 메소드 접근
// 메소드 오버라이딩 
//		1. 반드시 상속 관계가 있어야 한다.
//		2. 인스턴스 메소드만 오버라이딩
//		3. 인스턴스 필드, 정적필드, 정적메소드는 오버라이딩 되지 않는다.

class A{	//outer class
	int a=3;
	int b=4;
	int c=33;
	int d=44;
	
	//메소드 
	void abc() {	// 오버라이딩 되지 않다.
		System.out.println("A클래스의 메소드 abc()");
	}
	void def() {
		System.out.println("A 클래스의 메소드 def()");
	}
	// 이너 클래스 
	class B{
		int a=5;
		int b=6;
		
		//이너 클래스의 메소드 : 중복 메소드
		void abc() {	// 오버라이딩 되지 않는다.
			System.out.println("B클래스의 abc()");
		}
		
		void bcd() {
			//필드의 값 호출
			System.out.println(a);	//this.a  5
			System.out.println(b);	//this.b  6
			
			System.out.println("===========");
			
			// 이너 클래스에서 outer class 필드 호출
			System.out.println(A.this.a);	//outer class A의 필드 : 3
			System.out.println(A.this.b);	//outer class A의 필드 : 4
			
			//메소드 호출 : 중복된 메소드 호출
			abc();			//this.abc() : 이너 클래스의 메소드
			A.this.abc();	//outer class의 abc()
			
			//이너 클래스와 아웃터 클래스에서 중복 되지 않는 필드 호출
			System.out.println(c);			//outer class 필드 : 
			System.out.println(d);
			
			//외부의 중복되지 않는 메소드 
			def();
		}
	}	
}
public class InnerClass02 {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		
		b.bcd();
		
	}
}
