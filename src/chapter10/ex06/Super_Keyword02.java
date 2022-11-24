package chapter10.ex06;

class Aa{
	void abc() {
		System.out.println("Aa class abc Method");
	}
	void ab() {
		System.out.println("Aa class ab Method");
	}
}

class Bb extends Aa{
	@Override
	void abc() {
		System.out.println("Bb class abc Method");
	}
	void bcd() {
		//abc(); 	this.abc();		자기자신의 abc() 를 호출
		abc();				// 자신의 클래스의 abc()를 호출
	}
	void cde() {
		super.abc();		//부모 클래스의 abc()
	}
	void def() {
		super.ab();			//부모 클래스의 ab()
	}
}

public class Super_Keyword02 {
	public static void main(String[] args) {
		//1. 객체생성
		//Bb : Aa, Bb가 내포 되어 있고 타입을 Bb타입으로 지정
		Bb bb=new Bb();
		
		//2. 메소드 호출
		bb.bcd();
		bb.cde();
		bb.def();
		
		
		
		
	}
}
