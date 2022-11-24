package chapter10.ex08;

class Animal{
	void run() {
		System.out.println("모든 동물들은 달립니다.");
	}
}
class Man extends Animal{
	@Override
	void run() {
		System.out.println("남자는 달립니다.");
	}
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println("여자는 달립니다.");
	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println("사자는 달립니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println("고양이는 달립니다.");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
}
class DogChild extends Dog{
	@Override
	void run() {
		System.out.println("강아지는 달립니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Animal : 부모 클래스 run() 정의
		// 자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog DogChild <== 다형성
		//	- 부모의 run 메소드를 재정의 
		//	- arr 배열에 저장 후 
		//	- for문 / Enhanced For 문으로 출력 run()메소드 출력
		
		Animal a=new Animal();
		Man m=new Man();
		Woman w=new Woman();
		Lion l=new Lion();
		Tiger t=new Tiger();
		Cat c=new Cat();
		Dog d=new Dog();
		DogChild dc=new DogChild();
		
		a.run();
		m.run();
		w.run();
		l.run();
		t.run();
		c.run();
		d.run();
		dc.run();
		
		System.out.println();
		System.out.println("=====배열 For문 출력=====");
		
		Animal[] arr=new Animal[] {a,m,w,l,t,c,d,dc};
		for(int i=0; i<arr.length; i++) {
			arr[i].run();
		}
		
		System.out.println();
		System.out.println("=====배열 Enhanced For문 출력=====");
		
		for(Animal k : arr) {
			k.run();
		}
		
		
	}
}
