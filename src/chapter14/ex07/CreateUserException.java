package chapter14.ex07;
//1. 상요자 정의 일반 예외 (Checked Exception)
class MyException extends Exception{		//Exception 하위 클래스 : 일반 예외
	// 사용자 정의 예왼느 Exception 클랴스를 상속해서 만들어야 한다.
	// 2개의 메소드 정의
	public MyException(){	//기본 생성자
		super();		// Exception 객체의 기본 생성자 호출
	}
	public MyException(String message) {
		super(message);
	}
}
//2. 사용자 정의 실행 예외 (Unchecked Exception, RunTime Exception)
	// RunTime Exception 을 상속해서 실행예외를 만듬
class MyRunTimeException extends RuntimeException{
	public MyRunTimeException() {
		super();
	}
	public MyRunTimeException(String message) {
		super(message);
	}
}
//사용자 정의 예외를 테스트 하는 클래스 
class A {
	//1. 사용자 정의 예외 객체 생성
	MyException me1=new MyException();
	MyException me2=new MyException("예외 메시지 : MyException");
	
	MyRunTimeException mt1=new MyRunTimeException();
	MyRunTimeException mt2=new MyRunTimeException("예외 메시지 : MyRunTimeException");
	
	//2. 예외 던지기(throw) : 던진 시점에서 예외발생
		// throws : 에외를 전가
		// throw : 예외를 발생
	// 예외를 내가 직접 처리 : Try  ~ catch
	
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상 작동");
			}else {
				//throw me1; //예외를 강제로 발동
				throw me2;
			}
		}catch(Exception e) {
			System.out.println("사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage());
		}
	}
	void bcd_1(){
		abc_1(65);
	}
	void abc_2(int num)throws MyException{
		if(num > 70) {
			System.out.println("정상 작동");
		}else {
			//throw me1;
			throw mt2;
		}
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("사용자 정의 예외2가 처리됨");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
}
public class CreateUserException {
	public static void main(String[] args) {
		// 사용자 정의 Exception : 자신이 직접 생성한 예외. 예) 점수가 70점 이하면 예외 실행
		// Exceotion 을 상속해서 자신의 예외를 생성할 수 있다. 
		
		A a=new A();
		a.bcd_1();
		a.bcd_2();
		
	}
}
