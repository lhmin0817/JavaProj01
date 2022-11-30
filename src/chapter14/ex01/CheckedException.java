package chapter14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A{	//A객체를 복사 throws : 예외를 전가함, 메소드를 호출하는 곳에서 예외를 처리
	// throws CloneNotSupportedException :예외에 대한 전가
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CheckedException {
	public static void main(String[] args) {
		//예외(Exception) : 프로그램 작성 시 문제가 발생이 될었을 때 , 프로드램이 종료되지 않도록 처리
			// 1. 일반 예외 (Checked Exception) - 컴파일 단계에서 체크, 이클립스에서 예외알림
			// 2. 실행 예외 (Unchecked Exception, RunTime Exception)  
			//			컴파일 단계에서 체크가 안되고 실행시에 발생되는 예외
		
		// 일반 예외 
		
		// 1. InterrupedException : 인터럽트가 발생했을 때 예외처리
//		Thread.sleep(1000);	// 쓰레드를 멈춘다.
		
		
		// 2. ClassNotFiundException : 클래스를 찾지 못했을 때 발갱하는 Exception
//		Class cls = Class.forName("Java.lang.Object");
		
		// 3. IOException : Inout outouo 시 발생되는 예외
		// 객체의 참조 변수선언
		InputStreamReader in=new InputStreamReader(System.in);
		// 예외 발생
//		in.read();
		
		// 4. FileNotundException : 파일을 찾을 수 없을 때 발생되는 예외
//		FileInputStream fis=new FileInputStream("test.txt");
		
		// 5, CloneNotSupportedException : 객체를 클론(복사)할 수 없는 예외발생
		A a1=new A();
//		A a2 = (A)a1.clone(); //a1객체를 복사해서 a2객체로 생성
		
	}
}
