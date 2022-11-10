package chapter02.ex04;

public class PrimaryDateType1 {
	public static void main(String[] args) {
		
		//자료형 : 변수명 앞에 반드시 선언, 변수의 어떤 값을 넣을지 지정(Java, c, c++)
		//	- 기본 자료형 : boolean, byte, short, int, long, float, double, char)
			// 메모리의 Stack 공간에 저장, (변수명 : 값) 
		
		//  - 참조 자료형 : String, 배열, 객체 ...... 무한대로 생성가능
			// 메모리의 Heap 공간에 변수의 값이 저장, 
				// Stack 공간에는 변수명과 Heap에 값의 주소값을 가지고 있다.
		
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴
		
		//1. boolean
			// - true, false 만 
		boolean bool1=true; // 선언과 동시에 변수에 값을 할당
		boolean bool2;		// 선언 후
		bool2 = false;		// 값 할당
		
		System.out.println(bool1);	//true
		System.out.println(bool2);	//false
		
		System.out.println("=================================");
		//2. 정수 (byte, short, int, long)
			// - byte : 1byte(8bit)	 : -2^7 ~ 2^7-1 (-128 ~ + 127)
		byte value1 = -128; 
		byte value2 = 127;
		System.out.println(value1);
		System.out.println(value2);
		
			// - short : 2byte(16bit): -2^15 ~ 2^15-1 ( -32,768 ~ 32,767 )
		short value3 = -32768;
		short value4 = 32767;
		System.out.println(value3);
		System.out.println(value4);
		
			// - int : 4byte(32bit)  : -2^31 ~ 2^31-1 (-2,147,483,648 ~ 2,147,483,647)
		int value5 = -2147483648;
		int value6 = 2147483647;
		System.out.println(value5);
		System.out.println(value6);

			// - long : 8byte(64bit) : -2^63 ~ 2^63-1 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
				//long 의 변수에 값을 할당 할때는 l, L 을 붙여 줘야 한다.
						//붙여주지 않으면 기본적으로 int 형으로 값이 저장됨
		long value7 = -100L;
		long value8 = 99L;
		System.out.println(value7);
		System.out.println(value8);
		
		System.out.println("=================================");
		//3. 실수 (float, double) 실수의 기본은 double
			// - float : 정밀도 7자리 (4byte) float지정된 변수의 값을 할당할 때 리터럴에 f, F 명시
		float value9 = 1.1234567f;
		System.out.println(value9);
		
			// - double : 정밀도 15자리 (8byte)
		double value10 = 1.123456789123456;
		System.out.println(value10);
		
		System.out.println("=================================");
		//4. 문자 (char)
			// - char : 영문/한글/일어...숫자, 특수문자 한 글자
				// 변수의 값을 할당할 리터럴에 ' '
					//1. chat 자료형 변수에 직접 문자로 저장하는 방법 (영문/한글/일어)
		char value11 = 'A';
		char value12 = 'a';
		char value13 = '가';
		char value14 = '1';
		char value15 = '#';
		
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		System.out.println(value15);
		
					//2. 정수값으로 문자를 저장하는 방법 : 아스키 코드 값으로 문자를 저장
						// 0x : 16진수, 0: 8진수, 0b : 2진수 
		char value16 = 65;		//A
		char value17 = 0xac00; 	//가
		char value18 = 51; 		//3
		System.out.println(value16);
		System.out.println(value17);
		System.out.println(value18);
		
		System.out.println("=================================");
		
					//3. 유니코드로 저장하는 방법 : 전세계의 글자를 3byte로 저장
						//(16진수)
		char value19 = '\u0041';	//A
		char value20 = '\uac00';	//가
		char value21 = '\u0033';	//3
		System.out.println(value19);
		System.out.println(value20);
		System.out.println(value21);
		
		/*
		  <문제> 구글에 검색을 해서 자신의 이름의 유니코드를 찾아서 변수에 할당
		 */
		char aa='\uC774';	//성					이
		char bb='\uD658';	//이름의 첫 글자		환
		char cc='\uBBFC';	//이름의 두번째 글자		민
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		System.out.println("=================================");
		//5. 문자열 (String)
				//기본자료형이 아니다. 참조자료형 (객체)
			// - String : 여러 글자를 넣을 수 있다.
				// 변수의 값을 할당할 리터럴에 " "
		String value22 ="안녕하세요. 오늘의 날씨는 매우 맑습니다.";
		System.out.println(value22);
		
		
		
	}
}
