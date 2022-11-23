package chapter10.ex01;

class Animal{
	String name;		//Animal 클래스를 상속해서 Tiger, Eagle, Lion를 생성
							//자식 클래스에서 필드 1개 메소드 1개 생성
							//LionChild클래스는 Lion클래스를 상속해서 필드 1개 메소드 1개 생성
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
}
class Tiger extends Animal{
	int animalNo;
	
	void tiger(){
		System.out.println("줄무늬가 있습니다.");
	}
}
class Eagle extends Animal{
	int animalNo2;
	
	void eagle() {
		System.out.println("하늘을 납니다.");
	}
}
class Lion extends Animal{
	int animalNo3;
	
	void lion() {
		System.out.println("갈기가 있습니다.");
	}
}
class LionChild extends Lion{
	int animalNo4;
	
	void lionChild() {
		System.out.println("사자의 새끼입니다.");
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println("=====동물 상속 받은 호랑이 필드 메소드=====");
		Tiger t1=new Tiger();
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
		t1.eat();
		t1.sleep();
		
		System.out.println("=====호랑이 필드 메소드=====");
		System.out.println(t1.animalNo);
		t1.tiger();
		
		System.out.println("=====동물 상속 받은 독수리 필드 메소드=====");
		Eagle e1=new Eagle();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.color);
		e1.eat();
		e1.sleep();
		
		System.out.println("=====독수리 필드 메소드=====");
		System.out.println(e1.animalNo2);
		e1.eagle();
		
		System.out.println("=====동물 상속 받은 사자 필드 메소드=====");
		Lion l1=new Lion();
		System.out.println(l1.name);
		System.out.println(l1.age);
		System.out.println(l1.color);
		l1.eat();
		l1.sleep();
		
		System.out.println("=====사자 필드 메소드=====");
		System.out.println(l1.animalNo3);
		l1.lion();
		
		System.out.println("=====동물 상속받은 새끼사자 필드 메소드=====");
		LionChild l2=new LionChild();
		System.out.println(l2.name);
		System.out.println(l2.age);
		System.out.println(l2.color);
		l2.eat();
		l2.sleep();
		
		System.out.println("=====사자 상속받은 새끼사자 필드 메소드=====");
		System.out.println(l2.animalNo3);
		l2.lion();
		
		System.out.println("=====새끼 사자 필드 메소드=====");
		System.out.println(l2.animalNo4);
		l2.lionChild();
		
	}
}
