package chapter07.ex01;

public class Ex01 {
	public static void main(String[] args) {
		//객체 생성, 메소드 호출 : Main Method에서 호출 
		//ab, bc 객체 생성 없이 바로 호출 : static 메소드
		ab(3,4,5);
		int a=ab(3,4,5);
		System.out.println(a);
		System.out.println(ab(10, 20, 30));
		
		System.out.println("=============");
		System.out.println(bc(1.3,2.4,3.5));
		
		System.out.println("=============");
		Ex01 abcd = new Ex01();
		String q = abcd.cd("삼성", 10, 1000);
		System.out.println(q);
		
	}
	//정수값 3개를 인풋 받아 더한 값을 정수 리턴하는 메소드 (static)
	public static int ab(int a, int b, int c) {
		return a+b+c;
	}
	
	//실수 3개를 인풋 받아 더한값으로 실수 리턴하는 메소드(static)
	public static double bc(double a, double b, double c) {
		return a+b+c;
	}
	
	//문자열 연결해서 출력하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드)
	//"제품이름" , "제품수량" , "제춤가격"
	//객체를 생성해서 
	public String cd(String a, int b, int c) {
		System.out.println("제품이름 : "+a);
		System.out.println("제품 수량 : "+b);
		System.out.println("제품 가격 : "+c);
		return a+b+c ;
	}
}

