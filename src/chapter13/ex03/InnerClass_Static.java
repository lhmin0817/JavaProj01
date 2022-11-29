package chapter13.ex03;

/*
 Static Inner Class : 외부 클래스에서 인스턴스필드, 인스턴스 메소드는 static inner class 블락에 올 수 없다.
 	외부 클래스의 정적 필드, 정적 메소드만 static inner class 블락에 올 수 있다.
 
 인스턴스 필드, 인스턴스 메소드는 객체 생성 후에 사용 가능
 정적 필드, 정적 메소드는 객체 생성 없이 사용 가능, 객체 생서 이루에도 사용가능 
 
 */
class A {
	// 외부 클래스에서 필드 선언
	int a=3; 				//인스턴스 필드
	static int b=4;			//정적 필드
	
	// 외부 클래스에서 메소드 선언
	void method1() {		//인스턴스 메소드
		System.out.println("Instance Method");
	}
	static void method2() {// 정적 메소드 
		System.out.println("Static Method");
	}
	
	static class B{//static 이너 클래스 static 필드, static메소드만 올 수 있다.
		void bcd() {
			// 1. 외부 클래스의 인스턴스 필드, 메소드 : 접근 불가
//			System.out.println(a);	//인스턴스 필드
			System.out.println(b);	// 정적 필드
			
//			method1();	// 인스턴스 메소드 : 접근 불가
			method2();	// 정적 메소드
			
		}
	}
}
public class InnerClass_Static {
	public static void main(String[] args) {
		// static 이너 클래스의 객체 생성 : 외부 클래스를 생성하지 않고도 바로 객체 생성이 가능
		
		// static 이너 클래스의 객체 생성
		A.B b = new A.B();
		b.bcd();
		
		
	}
}
