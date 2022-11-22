package chapter07.ex05;

class A{
	//필드 => Heap영역의 저장
	int m;
	int n;
	
	//메소드 : 정수값 2개를 받음, this 키를 생략하는 경우
	void init(int m, int b) {	//메소드 내의 : a, b, c <== 지역 변수  / stack영역의 저장
		int c;
		c=3;
		this.m=m;	///인풋매개변수, 실행블락에 매개변수, 필드의 변수
		n=b;		//this.n 생략 : 기본적으론 this 키가 생략
	}
	
	//this 키를 명시해야 하는 경우
	void init2(int m, int n) {
		this.m=m;
		this.n=n;
	}
	
	void work() {
		init(2,3);	//this : 자신의 객체의 필드나 메소드 호출 / 생략
		System.out.println(m+" "+n);
	}
}


public class This_keyword {
	public static void main(String[] args) {
		// this 	: 자기 자신 객체의 필드나 메소드 <== 필드, 메소드에 적용
		// this() 	: 자신 객체의 다른 생성자 호출 시 사용
		// super 	: 상속에서 부모의 객체의 필드, 메소드를 사용할 때 사용 
		// super()	: 부모클래스의 생성자 호출할 때 사용
		A a=new A();
		a.work();
	}
}
