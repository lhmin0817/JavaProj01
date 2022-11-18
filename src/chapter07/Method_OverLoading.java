package chapter07;

class MethodOverLoading{
	
	//메소드 오버로딩 : 동일한 이름의 메소드이지만 시그니처에 따라서 다른 메소드를 호출
		//시그니처 : 매개변수 갯수, 인툿되는 타입이 다를 경우 다른 메소드로 식별
	
	void print() {				//print() : 인풋 매개변수가 없는 메소드
		System.out.println("데이터가 없습니다.");
	}
	void print(int a) {			//print(int a):인풋 매개변수에 정수하나를 인풋받는 매소드
		System.out.println("int "+a);
	}
	void print(double a) {
		System.out.println("double "+a);
	}
	void print(int a, int b) {
		System.out.println("int 2EA : " + a +""+ b);
	}
	void print(double a, int b) {
	System.out.println("double : "+a+" int : "+b);	
	}
	
	void print (int a, double b) {
		
	}
	/*메소드 오버로딩의 위배
	
	void print(double c, int k) {
		
	}
	
	*/
}
public class Method_OverLoading {
	public static void main(String[] args) {
		// 메소드 오버로딩 : 동일한 이름의 메소드를 시그니처에 따라서 다른 메소드를 호출
			//시그니처		: 메소드의 인풋 매개변수 갯수, 인풋되는 타입이 다를 경우 다른 메소드로 식별
		// 메소드 오버라이딩 : 상속에서만 적용
			//부모클래스에서 선언된 메소드를 자식클래스에서 재정의 해서 사용하는 것
		
		MethodOverLoading mo = new MethodOverLoading();
		
		//1. 매개변수가 없는 메소드 호출
		mo.print();
		
		//2. 매개변수가 한개 있는 정수 메소드 호출
		mo.print(10);
		
		//3. 매개변수가 한개 있는 실수 메소드 호츌
		mo.print(50.);
		
		//4. 매개변수가 두개 있는 정수 메소드 호출
		mo.print(30, 70);
		
		//5. 매개변수가 정수 1개 실수 1개 가 있는 메소드 호출
		mo.print(55.5, 40);
		
	}
}
