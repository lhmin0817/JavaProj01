package chapter10.ex05;

class A{
	int m=3;			//인스턴스 필드 : 오버라이딩 불가
}
class B extends A{
	int m=4;			//인스턴스 필드 : 오버라이딩 불가
}

public class Override_InstanceField {
	public static void main(String[] args) {
		//메소드 오버라이딩 [인스턴스 메소드 오버라이딩]
		//	- 인스턴스 필드		: 오버라이딩 불가	Heap공간에 값이 저장
		//	- 정적 필드		: 오버라이딩 불가	클래스 영역에 값이 저장
		//	- 인스턴스 메소드	: 오버라이딩 가능	인스턴스 메소드 영역에 메소드(소스)가 저장
		//	- 정적 메소드		: 오버라이딩 불가	클래스 영역에 메소드가 저장
		
		//1. 객체 생성
		A aa=new A();
		B bb=new B();
		A ab=new B();
		
		//2. 인스턴스 필드 정보 출력
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);		//<== 만약 오버라이딩이 된다면 4가 출력이 되어야 한다
		
		
	}
}
