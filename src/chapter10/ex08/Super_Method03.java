package chapter10.ex08;

class A{
	A(){
		this(3);	//자신 객체의 정수 1개인 생성자 호출 
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}
class B extends A{	//자식 클래스는 생성자 첫 라인에 <super() :생략 >, this() 
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		System.out.println("B 생성자 2");
	}
}

public class Super_Method03 {
	public static void main(String[] args) {
		
		//1. 객체 생성 후 출력
		A aa=new A();
		System.out.println("========");
		
		//2. 
		A aa2=new A(3);
		System.out.println("========");
		
		//3. B 생성자 호출
		B bb=new B();
		
		System.out.println("========");
		B bb2=new B(3);
		
	}
}
