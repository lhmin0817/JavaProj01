package chapter12.ex03;

interface Animal1{
	void cry();
}

interface Animal2{
	void run();
}

interface Animal3{
	void eat();
}
// interface extends interface
// 앞의 타입과 뒤의 타입이 동일할때는 extends 
interface K extends Animal1, Animal2, Animal3{
	//cry(), run(), eat()
}

class G implements K{
	@Override
	public void cry() { }
	@Override
	public void eat() { }
	@Override
	public void run() { }


class Aa{	//일반 클래스 : 모든 메소드는 실행부가 존재해야함
	void abc() {
		System.out.println("Aa의 abc()");
	}
}
abstract class Bb {	// 추상 클래스 : 추상 메소드가 하나라도 존재하면 abstract 
	abstract void bcd();
}

//extends 다음에는 1개의 클래스만 올 수 있다. 다중 상속 불가
	//일반클래스, 추상클래스
//implements 다음에는 여러개의 인터페이스가 올 수 있다. 다중 상속 가능
//extends 먼저 오고 implements가 다음으로 와야 한다. : 순서가 바뀌면 안됨
class Cc extends Aa implements Animal1, Animal2, Animal3 {

	@Override
	public void cry() {	}
	@Override
	public void eat() { }
	@Override
	public void run() { }
}


public static class Interface_Test2 {
	public static void main(String[] args) {
		
		
		
		
	}
}
}
