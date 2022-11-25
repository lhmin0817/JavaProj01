package chapter11.ex04;

abstract class Animal { // 추상 클래스, 추상 메소드가 1개라도 있으면 추상 클래스가 된다.
	abstract void eat();

	abstract void run();

	abstract void cry();
}

class Cat extends Animal { // 콘크리트 클래스 : 추상 메소드를 모두 구현한 클래스
	@Override
	void eat() {
		System.out.println("고양이는 야옹");
	}

	@Override
	void cry() {
		System.out.println("고양이는 먹는다.");
	}

	@Override
	void run() {
		System.out.println("고양이는 달린다.");
	}
}

abstract class Dog extends Animal { // 추상클래스의 추상 메소드를 일부만 구현한 경우 : 추상 클래스
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}

	@Override
	void eat() {
		System.out.println("개는 먹는다.");
	}
}

class DogChild extends Dog {
	@Override
	void run() {
		System.out.println("강아지는 달린다.");
	}
}

public class Abstract_Method {
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못 한다. 타입으로 지정은 가능하다.
		// Ainmal, Dog 는 추상 클래스이므로 객체 생성이 안된다.

		// 1. Animal 객체 생성
//		Animal a1 = new Animal();//오류 : 추상 클래스는 객체화 하지 못한다.
		//Cat() 객체화 해서 Animal타입으로 정의
		//Animal의 메소드 호출시 오버라이딩된 Cat()메소드호출
		Animal a2=new Cat();
		a2.eat();
		a2.run();
		a2.eat();

		System.out.println("================");
		
		//Cat객체화 해서 Cat타입 지정
		Cat c1=new Cat();
		c1.cry();
		c1.run();
		c1.eat();
		System.out.println("================");
		//Dog는 추상클래스이므로 객체화 할 수 없다.
//		Dog d1=new Dog();
		
		//DogChild를 객체화 해서 Animal타입으로 지정
		Animal a3=new DogChild();
		a3.cry();
		a3.run();
		a3.eat();
		
		System.out.println("===============");
		
		//DogChild를 객체화해서 Dog타입으로 지정
		Dog d1=new DogChild();
		d1.cry();
		d1.run();
		d1.eat();
		
		System.out.println("===============");
		
		//DogChild를 객체화해서 DogChild타입으로 지정 
		DogChild d2=new DogChild();
		d2.cry();
		d2.run();
		d2.eat();
		
	}
}
