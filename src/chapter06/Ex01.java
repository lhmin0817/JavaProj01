package chapter06;

class Man {
	//필드
	String name="홍길동";
	int age=30;
	String phone="010-1111-1234";
	String addr="서울 종로구 인사동";
	double weight=70.5;
	
	//기본 생성자 생략 : A() { }
	//메소드 :
	void add1() {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한 값을 출력
		System.out.println("2의 배수 출력");
		int sum=0; 		
		for(int i=2; i<=100; i+=2) {
			System.out.print(i+" ");
			sum +=i;
		}
		System.out.println();
		System.out.println("2의 배수 더한 값");
		System.out.println(sum);
		System.out.println();
	}
	void add2() {
		// 1 ~ 500까지 3의 배수와 4의 배수를 출력하고 더한 값 출력
		System.out.println("3, 4의 배수 출력");
		int sum=0;
		for(int i=3; i<=500; i++) {
			if(i%3==0||i%4==0) {
				System.out.print(i + " ");
				sum +=i;
			}
		}
		System.out.println();
		System.out.println("3, 4의 배수 더한 값");
		System.out.println(sum);
		System.out.println();
	}
	void add3() {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한 값 출력
		System.out.println("1씩 증가 4의 배수만 빼고 출력");
		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%4!=0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("1씩 증가하는 데 4의 배수만 뺀 더한 값");
		System.out.println(sum);
		System.out.println();
	}
}
public class Ex01 {
	public static void main(String[] args) {
		//객체 생성 및 객체의 필드의 값이나 메소드 호출
		
	Man m=new Man();
		m.add1();
		m.add2();
		m.add3();
		
		
	}
}
