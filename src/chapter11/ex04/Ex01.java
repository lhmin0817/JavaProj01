package chapter11.ex04;

abstract class Car{//트럭 자가용 굴삭기 <== 추상 멧소드를 구현한 클래서 생성
	abstract void run();
	abstract void eat();
}
class T extends Car{
	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다.");
		
	}
	@Override
	void run() {
		System.out.println("트럭은 고속도로를 달립니다.");
		
	}
}
abstract class J extends Car{
	@Override
	void run() {
		System.out.println("자가용은 도로를 달립니다.");
	}
}
class K extends Car{
	@Override
	void eat() {
		System.out.println("굴삭기는 휘발류를 먹습니다.");
	}
	@Override
	void run() {
		System.out.println("굴삭기를 공사장을 달립니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Car c1=new T();
		c1.eat();
		c1.run();
		System.out.println();
		
		T t1=new T();
		t1.eat();
		t1.run();
		System.out.println();
		
		Car c2=new K();
		c2.eat();
		c2.run();
		System.out.println();
		
		K k1=new K();
		k1.eat();
		k1.run();
		
	}
}
