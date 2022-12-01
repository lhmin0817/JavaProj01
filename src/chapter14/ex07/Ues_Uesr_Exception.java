package chapter14.ex07;

// 사용자 정의 예외
// 1. 정수가 음수이면 예외를 발생 시키는 사용자 정의 예외
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

// 2. 정수가 100점을 초과하는 경우 사용자 정의 예외
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

// 사용자 정의 예외를 처리할 클래스 
class Aa{
	
	void checkScore(int score) throws MinusException, OverException {
		if(score <0) {
			throw new MinusException("예외 발생 : 음수 값 입력 불가");
		}else if(score >100) {
			throw new OverException("예외 발생 : 100을 초과 값 입력 불가");
		}else {
			System.out.println("정상 값");
		}
	}
}


public class Ues_Uesr_Exception {
	public static void main(String[] args) {
	
		Aa a1=new Aa();
		try {
			a1.checkScore(-20);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		
		
		
	}
}
