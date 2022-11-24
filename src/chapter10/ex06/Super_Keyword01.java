package chapter10.ex06;

class A{
	int a;
	
	//상속 관계에서 부모 클래스이 생성자가 존재 할 경우 기본 생성장를 반드시 명시
	A(){}
	//부모 클래스의 생성자가 존재함
	A(int a){
		this.a=a;
	}
}
class B extends A{	
		// 자식 클래스의 생서자에는 기본적으로 super() 생략
		// 자식 클래스는 생성자 첫 라인에 <super():생략>, <this()>  
	
	//B() {super();}
	
	//B(int a) {
		//super(a);
		
	//}
	
}

public class Super_Keyword01 {
	public static void main(String[] args) {
		/*
		 	this keyword	: 자신의 객체의 필드와 메소드
		 	this()			: 생성자의 첫 라인에 위치 / 자신의 객체에서 다른 생성자를 호출할 때 사용
		 		
		 	super keyword	: 부모객체의 필드와 메소드를 호출할 때 사용
		 	super()			: 생성자의 첫 라인에 위치에서 부모객체에 있는 생성자를 호출할 때 사용		 
		 		- 모든 자식 클래스의 생서자는 반드시 첫 라인에 this(), super()가 와야한다.
		 		- 자식 클래스의 생성자는 기본적으로 super()가 생략 되어 있다.
		 		- 자식 클래스는 기본적으로 부모의 기본 생성자를 호출 
		 
		 */
	}
}
