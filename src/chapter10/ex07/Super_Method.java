package chapter10.ex07;

class A{
	A(){System.out.println("A 생성자");}
}
class B extends A{
	B(){
		super();	//생략 / 컴파일러가 자동으로 추가함
		System.out.println("B 생성자");
		
	}
}
class C{
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends C{

	D(int a) {
		super(a);
		System.out.println("D 생성자");
	}
}

public class Super_Method {
	public static void main(String[] args) {
		// super method : 부모클래스의 생성자 호출
		//		- 자식 클래서 생성자는 기본적으로 super(); 생략 / 부모클래스의 기본 생성자 호출
		
		//1. A 객체 생성
		A aa=new A();	//A 생성자
		
		System.out.println("========");
		//2. B 객체 생성
		B bb=new B();
		
		//D dd=new D();
		
		
	}
}
