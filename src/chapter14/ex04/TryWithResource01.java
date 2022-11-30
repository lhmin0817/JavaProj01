package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {
	public static void main(String[] args) {
		// try 구문에서 리소스 자동해제, 객체를 사용 후에 반드시 그 객체를 제정(clods())해서 메모리를 최적화
		//	객체를 사용 후 finally 블락에서 객체를 제거
		
		System.out.println("문자를 입력하세요");
		
		//1. 리소스 수동 해제 : finally 블락에서 객체를 close()메소드를 호출해서 객체를 메모리에서 제거
		//	콘송을 사용해서 문자열을 입력받도록 하는 클래스 : InputSteramReader
		InputStreamReader ir1 = null;
		
		// 일반예외(Catched Exception) : 프로그램 작성 시 컴파일 단계에서 오류
			// 1. 예외를 남에게 전가		: throws를 사용해서 호출하는 쪽에서 처리하도록 미루는 방법
				// 메소드 블락에서 적용됨, 메소드를 호출하느 ㄴ곳에서 예외 처리를 해야함 
			// 2. 예외를 내가 처리		: try - catch 블락을 만들어서 내가 처리
		
		ir1 = new InputStreamReader(System.in);
		try {
			char input = (char)ir1.read();	//예외처리가 되어야함. 일반예외 : IOException
			System.out.println("입력한 글자는 : "+ input);
		}catch(IOException e) {
			
			System.out.println("IOException 이 발생 되었습니다. 하나의 문자만 넣어주세요.");
			e.printStackTrace();
		}finally {
			// 일반적으로 객체를 사용 후 finally 블락에서 객체를 제거
				// 객체를 제거할 때도 예외처리가 되어야 한다.
			if(ir1 !=null) {	// 객체가 null일때는 제거하지 않고 null아닌 경우 제거한다.
				try {
					ir1.close();	// 일반 예외 : 반드시 예외처리를 해야함
				} catch (IOException e) {
					System.out.println("객체 제거 시 예외 발생");
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}
}
