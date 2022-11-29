package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}
class B{
	Animal a=new A();
	void ani1() {
		a.cry(); a.fly();
	}
	class A implements Animal{
		@Override
		public void cry() {
			System.out.println("1. Animal을 구현한 inner클래스를 생성 후 메소드 출력 cry()");
		}
		@Override
		public void fly() {
			System.out.println("1. Animal을 구현한 inner클래스를 생성 후 메소드 출력 fly()");
		}
	}
}
class C{
	Animal a1=new Animal() {
		@Override
		public void cry() {
			System.out.println("2. Animal을 익명 클래스로 생성해서 출력 cry()");
		}
		@Override
		public void fly() {
			System.out.println("2. Animal을 익명 클래스로 생성해서 출력 fly()");
		}
	};
	void cc() {
		a1.cry(); a1.fly();
	}
}

class D {
	void dd(Animal a) {
		a.cry(); a.fly();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//인터페이스를 사용해서 4가지 형태로 출력
		// 1. Animal을 구현한 inner클래스를 생성 후 메소드 출력
		// 2. Animal을 익명 클래스로 생성해서 출력
		// 3. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 생성 
		// 4. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 없이
		
		B b=new B();
		b.ani1();
		
		System.out.println("================================================");
		
		C c=new C();
		c.cc();
		
		System.out.println("================================================");
		
		D d=new D();
		Animal a2=new Animal() {
			@Override
			public void cry() {
				System.out.println("3. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 생성 cry()");
			}
			@Override
			public void fly() {
				System.out.println("3. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 생성 fly()");
			}
		};
		d.dd(a2);
		
		System.out.println("================================================");
		
		d.dd(new Animal() {
			@Override
			public void cry() {
				System.out.println("4. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 없이 cry()");
			}
			@Override
			public void fly() {
				System.out.println("4. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 없이 fly()");
			}
		});
		
		
	}
}
