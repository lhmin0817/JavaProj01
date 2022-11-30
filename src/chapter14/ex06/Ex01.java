package chapter14.ex06;

// 예외 발생할 때 각 메소드 내부에서 예외를 직접 처리
class Aa{
	void abc() {	//bcd()메소드 호출 
		bcd();
	}
	void bcd() {	// 메소드 블락 내에서 직접 처리
		try {
		System.out.println(3/0);
		
		int[]arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		
		Thread.sleep(1000);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | InterruptedException e) {
			System.out.println("메소드 내부에서 예외 직접 처리");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb{
	void abc() {
		//bcd() 메소드 호출 : 예외처리
		try {
			bcd();
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | InterruptedException e) {
			System.out.println("예외 전가 : 메소드를 호출하는 쪽에서 예외 처리하도록");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException {	//예외를 전가 : throws
		
		System.out.println(3/0);
		
		int[]arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		
		Thread.sleep(1000);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("======================= 1. 문제 ========================");
		Aa a = new Aa();
		a.abc();
		System.out.println();
		System.out.println("======================= 2. 문제 ========================");
		Bb b = new Bb();
		b.abc();
	}
}
