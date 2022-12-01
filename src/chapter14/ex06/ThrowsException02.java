package chapter14.ex06;

// 예외 처리 : 1. try ~ catch : 내가 직접 처리, 2. throws : 예외를 전가
	// 예외를 무한히 전가하는 경우 : main메소드에서 예외 발생되며 멈춘다.

class Aaa{
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException { // 예외 전가 
		cde();
	} 
	void cde() throws InterruptedException {// cde()를 호출하는 곳에서 예ㅗ이를 처리하도록 전가
		Thread.sleep(1000);
	}// 일반 예외 : 반드시 예외 처리가 되어야함	
}


public class ThrowsException02 {
	public static void main(String[] args) throws InterruptedException {
		// 객체 생성 후 abc() 메소드 호출 
		Aaa a1=new Aaa();
		try {
			a1.abc();
		}catch(InterruptedException e) {
			
		}
		
		
		
		
		
	}
}
