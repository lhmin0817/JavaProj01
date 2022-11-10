package chapter03.ex02;

public class BitwiseOperatior {
	public static void main(String[] args) {
		//다양한 진법 표현과 비트 연산자
		//1.자바 코드를 사용해서 진법 변환 (2진수, 8진수, 10진수, 16진수)
		int data=13;
		System.out.println(Integer.toBinaryString(data));	//2진수로 변환
		System.out.println(Integer.toOctalString(data));	//8진수로 변환
		System.out.println(Integer.toHexString(data));      //16진수로 변환
		
		System.out.println("=============================================");
		//2.2진수, 8진수, 16진수 ==> 10진수로 변환
		System.out.println(Integer.parseInt("1101", 2));	//2진수를 10진수로 변환
		System.out.println(Integer.parseInt("15",8));		//8진수를 10진수로 변환
		System.out.println(Integer.parseInt("d",16));		//16진수를 10진수로 변환
		
		System.out.println("=============================================");
		//3. 다양한 진법 표현 ( 0b : 2진수, 0 : 8진수, 0x : 16진수)
		System.out.println(0b1101); //2진수 13
		System.out.println(015);	//8진수 13
		System.out.println(0xd);	//16진수 13
		
		System.out.println("=============================================");
		//4. 비트 연산자 : 모두 2진법으로 변환해서 각 비트를 연산
			//4-1, AND (&) ( 0&0=0,	1&0=0,	0&1=0	1&1=1)
			//3(0011) & 10(1010)
			// 0011 (3)
			// 1010	(10)
			//=========
			// 0010 (2)
			System.out.println(3&10);			//2 (2진수)
			System.out.println(0b0011&0b1010);	//2	(8진수)
			System.out.println(0x03&0x0a);		//2	(16진수)
		

			//4-2, OR (|) (0|0=0,	1|0=1,	0|1=1,	1|1=1)
			//3(0011) | 10(1010)
			//0011 (3)
			//1010 (10)
			//========
			//1011 (11)
			System.out.println(3|10);
					
			
			//4-3, XOR (^) 두 값이 같을 때는 0. 두값이 다를 때는 1
			//0011 (3)
			//1010 (10)
			//========
			//1001 (9)
			System.out.println(3^10);
		
		
			//4-4, NOT (~) 
			//0011 (3)
			//========
			//1100 (-4)	맨 숫자가 1이면 -, 0이면 +
			System.out.println(~3);		//-4
			//첫 번쨰 비트는 부호 비트 (0:양수, 1:음수)
			//음수일 때는 0을 기준으로 처리 +1
			
			System.out.println(~10);	//-11
			//음수 0
	}
}
