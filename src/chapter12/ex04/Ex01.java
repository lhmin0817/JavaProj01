package chapter12.ex04;

interface Animal1{
	void cry();
}
interface Animal2{
	void run();
}
interface Animal3{
	void eat();
}

class Animal implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		
	}
	@Override
	public void eat() {
		
	}
	@Override
	public void run() {
		
	}
}
//Cat, Tiger - cry, run 만 구현
//Dog, Lion  - run, eat 만 구현
//Eagle      - cry, run, eat 구현

//배열에 넣어서 오버라이디된 메소드 출력
	// instanceof 를 사용해서 객체 내부에 Cat, Tiger, 타입이 존재하면 cry(), run() 
	// instanceof 를 사용해서 객체 내부에 Cat, Tiger, 타입이 존재하면 cry(), run()
	// instanceof 를 사용해서 객체 내부에 Eagle, 타입이 존재하면 cry(), run(), eat()

class Cat extends Animal implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("야옹하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
		
	}
}
class Tiger extends Animal implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("어흥 하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");	
	}
}
class Dog extends Animal implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("멍멍하고 웁니다.");
	}
	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
}
class Lion extends Animal implements Animal2, Animal3{
	@Override
	public void run() {
		System.out.println("크헝하고 웁니다.");
	}
	@Override
	public void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}
}
class Eagle extends Animal implements Animal1, Animal2, Animal3{
	@Override
	public void cry() {
		System.out.println("끼오오하고 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 먹이를 먹습니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Cat a1 = new Cat();
		a1.cry(); a1.run();
		
		System.out.println("===================");
		
		Tiger a2 = new Tiger();
		a2.cry(); a2.run();
		
		System.out.println("===================");
		
		Dog a3 = new Dog();
		a3.run(); a3.eat();
		
		System.out.println("===================");
		
		Lion a4 = new Lion();
		a4.run(); a4.eat();
		
		System.out.println("===================");
		
		Eagle a5 = new Eagle();
		a5.cry(); a5.run(); a5.eat();
		
		System.out.println("===================");
		
		Animal arr[] = new Animal[] {a1, a2, a3, a4,a5};
		for(int i=0; i<arr.length; i++) {
			arr[i].cry(); arr[i].run(); arr[i].eat();
			if(i==0) {
				System.out.println(arr[i]instanceof Cat);
				System.out.println();
			}else if(i==1) {
				System.out.println(arr[i]instanceof Tiger);
				System.out.println();
			}else if(i==2) {
				System.out.println(arr[i]instanceof Dog);
				System.out.println();
			}else if(i==3) {
				System.out.println(arr[i]instanceof Lion);
				System.out.println();
			}else if(i==4) {
				System.out.println(arr[i]instanceof Eagle);
				System.out.println();
			}
		}
		
		
		
		
		
		
	}
}
