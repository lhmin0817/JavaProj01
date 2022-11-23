package chapter10.ex03;

class Fruit{	//Fruit의 메소드를 오버라이딩 해서 출력. Apple, Banana, Orange
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit {
	@Override
	void eat() {
		System.out.println("사과는 빨갑니다.");
	}
}
class Banana extends Fruit{
	@Override
	void eat() {
		System.out.println("바나나는 깁니다.");
	}
}
class Orange extends Fruit {
	@Override
	void eat() {
		System.out.println("오렌지는 쉽니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Fruit f1=new Apple();
		Fruit f2=new Banana();
		Fruit f3=new Orange();
		
		f1.eat();
		f2.eat();
		f3.eat();
		
		
		
	}
}
