package chapter13.ex05.a;

interface A{
	void cry();
	void fly();
}
class B{	
	A a=new C();
	void abc() {
		a.cry();
		a.fly();
	}
	//이너 클래스 : 외부 파일에 별도로 생성하지 않고 클래스 내부에 생성 후 바로 사용
	class C implements A{
		@Override
		public void cry() {
			System.out.println("운다");
		}
		@Override
		public void fly() {
			System.out.println("난다.");
		}	
	}	
}
public class AnonymousClass01 {
	public static void main(String[] args) {
		// B Class abc()  Method 호출 시 C class 구현된 매소드 출력
		
		B b=new B();
		b.abc();
		
	}
}
