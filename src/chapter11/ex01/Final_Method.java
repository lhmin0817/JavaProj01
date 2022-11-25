package chapter11.ex01;

class Aa {

	// 생략된 생성자
	Aa(){
		
	}

	void print() {
		System.out.println("Aa class print Method");
	}

	// 자식 클래스에서 재정의할 수 없도록 설정한 메소드 : 아주 중요한 메소드
	final void run() {
		System.out.println("Aa class run Method");
	}
}

class Bb extends Aa {

	// 생략된 생성자 출력
	Bb(){
		super();
	}

	@Override
	void print() {
		System.out.println("Bb class Overriding");
	}

//	@Override
//	final void run() {	}
}

public class Final_Method {
	public static void main(String[] args) {

		Aa a1 = new Bb();
		a1.print();

	}
}
