package chapter11.ex01;

class Aaa{
	int m;
	final int n;
	
	Aaa(){
		n=10;
	}
	
	Aaa(int n){
		this.n=n;
	}
	void run() {
		System.out.println("Aaa class run Method");
	}
}
final class Bbb extends Aaa{	//상속이 불가한 클래스
	
	
}
//상속 불가 : 부모 클래스 이름에 final 키가 할당됨
//class Ccc extends Bbb{}


public class Final_Class {
	public static void main(String[] args) {
		
	}
}
