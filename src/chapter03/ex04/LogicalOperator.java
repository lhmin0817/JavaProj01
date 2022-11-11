package chapter03.ex04;

import javax.annotation.processing.SupportedSourceVersion;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자 / 비트 연산자 를 이용한 논리 연산
		//1. 논리 연산자 (AND(&&), OR(||), XOR(^), NOT(!)) 
			// 쇼트 서킷이 발생 (&&, ||)
		//1-1. AND(&&)
			//true && True 		==> true
			//false && true 	==> false
			//true && false 	==> false
			//false && false 	==> false
		System.out.println(true && true);			//true
		System.out.println(false && true);			//false
		System.out.println(true && false);			//false
		System.out.println(false && false);			//false
		
		
		System.out.println("==================");
		//1-2. OR(||)
			//true || true		==> true
			//true || false		==> true
			//false || true		==> true
			//false || false	==> false
		System.out.println(true || true);			//true
		System.out.println(true || false);			//true
		System.out.println(false || true);			//true
		System.out.println(false || false);			//false
		
		System.out.println("==================");
		//1-3. XOR(^)	: 두 값이 같을 때, false 다를 때 true
			//true ^ true		==> false
			//true ^ false		==> true
			//false ^ true		==> true
			//false ^ false		==> false
		System.out.println(true ^ true);			//false
		System.out.println(true ^ false);			//true
		System.out.println(false ^ true);			//true
		System.out.println(false ^ false);			//false
		
		System.out.println("==================");
		//1-4. NOT (!)	: true 일 때 false. false 일 때 true
		System.out.println(!true);					//false
		System.out.println(!false);					//true
		
		System.out.println("==================");
		System.out.println(false ^ (5<2));			//false
		System.out.println((10>20) ^ (30>20));		//true
		System.out.println(false || (5<3));			//false
		System.out.println(false || !(5<3));		//true
		System.out.println(!false || !(5<3));		//true
		
		System.out.println("=================");
		//2. 비트 연산자로 논리 연산이 가능 <== 쇼트 서킷을 발생하지 않도록 처리
		//	AND(&), OR(|), XOR(^), NOT(~)
		System.out.println(true & true);		//true
		System.out.println(true | false);		//true
		System.out.println(true | (5<3));		//true
		System.out.println(true ^ true);		//false
		System.out.println(!true);				//false
		//System.out.println(~true);			오류 발생
		
		System.out.println("=================");
		//3. 쇼트 서킷 : 논리 연산자에서 앞에 내용으로 뒤의 값의 유무없이 식별이 가능하면 뒤의 값은 처리 하지 않는다.
		System.out.println(true && true);		//쇼트 서킷 발생X 뒤의 값을 반드시 확인
		System.out.println(false && true);		//쇼트 서킷 발생
			//AND 연산자에서는 처음 값이 false 가 오게되면 뒤의 값이 어떤 값이 있더라도 false출력
		
		System.out.println(true || true);		//쇼트 서킷 발생
		System.out.println(false || true);		//쇼트 서킬 발생X
		//OR 연산자에서 처음 값이 true 이면 쇼트 서킷 발생
		
		System.out.println("=======AND 연산에서 쇼트 서킷 발생 및 방지=======");
		int value1 =3;
		System.out.println(false && ++value1 >6);	//쇼트 서킷 발생 (논리연산자 : &&)
		System.out.println(value1);					//3
		
		int value2 =3;
		System.out.println(false & ++value2 >6);	//쇼트 서킷 발생X(비트연산자 :&)
		System.out.println(value2);					//4
		
		System.out.println("=======OR 연산에서 쇼트 서킷 발생 및 방지=======");
		int value3 =3;
		System.out.println(true || ++value3 >6);	//쇼트 서킷 발생 (논리연산자 : ||)
		System.out.println(value3);					//3
		
		int value4 =3;
		System.out.println(true | ++value4 >6);		//쇼트 서킷 발생X(비트연산자 :|)
		System.out.println(value4);					//4
		
		//XOR (^) : 논리 연산, 비트 연산 <== 뒤에 값을 반드시 확인해야 결과를 알 수 있으므로 쇼트 서킷 발생X
		//앞뒤가 같으면 false 다르면 true
		
		System.out.println(true ^ true);			//false
		System.out.println(true ^ false);			//true
		
		
	}
}
