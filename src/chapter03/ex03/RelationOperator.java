package chapter03.ex03;

public class RelationOperator {
	public static void main(String[] args) {
		//크기 비교 연산 / 등가비교 연산자
		
		//1. 크기비교 연산(<, >, <=, >=) ==> true, false
		System.out.println(5>2);	//t
		System.out.println(5<2);	//f
		
		System.out.println(5>=5);	//t
		System.out.println(5<=5);	//t
		
		System.out.println("=============================================");
		//3./등가비교 연산자(==, !=)	==> true, false
			// == : 값이 같을 때 true 다를 땐 false
			// != : 값이 같을 때 false 다를 땐 true	
			//값이 같은지 다른지를 비교하는 연산자
			//stack 메모리의 값을 비교
			//stack의 값이 저장되는 것은 기본 자료형
		int a=5;
		int b=2;
		int c=5;
		
		System.out.println(a==b);	//f
		System.out.println(a!=b);	//t
		
		System.out.println(a==c);	//t
		System.out.println(a!=c);	//f
		
		System.out.println("=============================================");
		//참조 자료형일 때 (Heap영역에 값이 저장, stack영역에는 Heap의 번지수가 들어있다.
		
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
			//stack영역의 값을 비교 : ==
		System.out.println(str1==str2);	//f
		//참조 영역에서 값을 비교 할때 ? .equals()를 사용해서 값을 비교
			//Heap 영역의 값을 비쇼 할떄 .equals를 사용
			
			//객체변수1.equals(객체변수2) : Heap영역 값을 비교
		System.out.println(str1.equals(str2));	//t
		
		
	}
}
