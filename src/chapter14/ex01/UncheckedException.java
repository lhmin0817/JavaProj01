package chapter14.ex01;

class Aa{}			//부모 클래스
class B extends Aa{}	//자식 클래스


public class UncheckedException {
	public static void main(String[] args) {
		// 실행 예외 : 컴파일 단계에서 체크 하지 않는다. 실행 시 예외가 발생됨
		// Unchecked Exception. RunTime Exception
		
		// 1. ArithmeticExecption : 정수를 0으로 나누었을 때 발생하는 예외
			// 모든 프로그램에서 숫자를 0으로 나누면 오류발생
//		System.out.println(3/0);
		
		// 2. ClassCastExecption : 다운 캐스팅 타입이 존재하지 않는 경우 발생
		Aa a=new Aa(); 		//부모 클래스를 객체화함
//		B b=(B)a;			// a 객체는 B타입을 포함하지 않는다. 실행 시 문제 발생
		
		
		// 3. ArrayIndexOutOfBoundExecption : 배열의 방번호를 넘겼을 때 발생하는 예외
		int[]arr=new int [] {1,2,3};
		
//		System.out.println(arr[3]);	//배열의 방의 번로를 넘김
		
		// 4. NumberFormatExecption : 문자타입의 값을 정수(int), 실수(double)변환예외
//		int num=Integer.parseInt("10!");
//		double num2=Double.parseDouble("10.22!");
//		System.out.println(num2);
		
		// 제일 많이 발생되는 예외
		//5. NullPointExecption : 참조주소의 값이 null, 메소드를 호출하는 경우
		String str=null;
//		System.out.println(str.charAt(2));	//문자열이 저장된 경우, 2번 방의 문자열 출력
		
	}
}
