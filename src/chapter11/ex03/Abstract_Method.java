package chapter11.ex03;

abstract class Animal {	//클래스 내부에 추상 메소드가 1개라도 존재를 하면 추상 클래스를 되어야 하낟.
	int a;
	int b;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	//추상 메소드 : 실행블락이 존재하지 않는 메소드
		//반드시 자식 클래스에서 오버라이딩해서 구현부를 만드어야 한다.
		// 프로젝트 설계 시 메소드 이름을 다른 이름으로 사용하지 못하도록할 수 있다.
		// 부모클래스에서는 메소드 이름을 선언만 하며, 자식클래스에서 구현하도록 함
		// 자식 클래스에서는 메소드 이름을 변경할 수 없다.
	abstract void run();	//구현부가 없는 선언만 된 메소드 : 추상 메소드
}
class Cat extends Animal{	//콘크리트 클래스, 부모의 추상 메소드를 모두 구현한 클래스
	//부모 클래스에서 추상 메소드가 존재할 경우 자식에서는 추상 메소드를 오버라이딩해서 구현해야 함
	//부모의 클래스의 추사 메소그를 구현하지 않는 경우는 자신도 추상 클래스가 되어야함
	
	@Override
	void run() {
		System.out.println("고양이는 달립니다."); 
	}
	
}
class Dog extends Animal {
	@Override
	void run() {
		System.out.println("개도 달립니다.");		
	}
}
public class Abstract_Method {
	public static void main(String[] args) {
		
	}
}
