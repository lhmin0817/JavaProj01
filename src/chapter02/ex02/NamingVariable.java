package chapter02.ex02;

public class NamingVariable {
	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당할 수 있다.
		//변수 이름 지정하기 
		// 	- 변수 명은 소문자로 시작(권장), 클래스 이름은 대문자로 시작(필수)
		//	- 변수 명을 한글로 쓸 수 있지만 권장하지 않음
		//  - 변수 명으로 특수문자는 _, $ 만 사용가능
		//	- 변수 명으로 숫자를 사용 가능 하나 첫자리에서 사용 불가
		//	- 변수 명으로 자바에서 사용하는 예약어,(package, class, public ....)
		
		
		//자료형  변수명
		boolean aBcD;	// true, false 변수만 넣을 수 있다.
		aBcD=true;		// true
		aBcD=false;		// false
		//aBcD=10;		오류
		byte 가나다라;		// byte : 1byte 의 데이터만 저장 가능
		short _abcd;	// Short : _, $ 를 사용할 수 있다.
		boolean $_abcd; // 
		//boolean %abcd; _, $ 이외의 특수문자는 변수명으로 사용 불가능
		char a1b2c3d4;		// 
		long abcd3;		
		//double private;	자바에선 사용되는 예약어는 사용할 수 없다.
		//int my work; 		변수명으로 공백은 올 수 없다.
		int MyWork;			//변수명은 처음자는 소문자, 이어서 여러단어를 적용할 땐 대문자
		String MyClassName;	//권장사항
		
		// 상수 : 값을 넣으면 그 값을 변화하지 못하도록 설정
		// 상수명은 전체를 대문자로 지정(권장)
		
		double PI=3.141592;	// 변수자료형 앞에 final가 붙으면 상수가 된다. 
		//변수 : PI변수에 값을 변화 시켜줄 수 있다.
		System.out.println(PI);	//3.141592
		PI=123.22;	//
		System.out.println(PI);	//123.22
		
		final double PI2 = 3.22222222;
		System.out.println(PI2);	//상수는 값이 할당이 되면 값을 수정할 수 없다.
		
		//PI2=123.123;				//상수임으로 다른 값을 넣을 수 없다.
		//System.out.println(PI2);
		final int MY_DATE=10;	
		System.out.println(MY_DATE);
		final float my_Date;	//권고사항 위배
		
	}
}
