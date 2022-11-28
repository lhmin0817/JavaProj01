package chapter12.ex01;

abstract class Calc {  // 사칙 연산을 계산하는 계산기 클래스
	abstract int add(int a, int b);  // 더하기 연산
	abstract int diff(int a, int b);  // 빼기 연산
	abstract int mul(int a, int b);  // 곱하기 연산
	abstract double div(int a, int b); //나누기 연산
	
	
}

class Calc_Impl extends Calc{  // Calc를 구현한 클래스
	@Override
	int add(int a, int b) {
		System.out.println(a+b);
		return 0;
	}
	@Override
		int diff(int a, int b) {
		System.out.println(a-b);	
			return 0;
		}
	@Override
		double div(int a, int b) {
			System.out.println(a/b);
			return 0;
		}
	@Override
		int mul(int a, int b) {
			System.out.println(a*b);
			return 0;
		}
	
}

abstract class Calc_C extends Calc{
	abstract int add(int a, int b);  // 더하기 연산
	abstract int diff(int a, int b);  // 빼기 연산
	abstract int mul(int a, int b);  // 곱하기 연산
	abstract double div(int a, int b); //나누기 연산
	
}

public class Ex01 {
	public static void main(String[] args) {
		// 
		
		int a=5;
		int b=4;
		
		// 1. 구현 클래스의 메소드 호출 후 출력
		Calc c1 = new Calc_Impl();
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		
		System.out.println("=============");
		//2. 익명 클래스로 메소드 호출 후 출력
		Calc_C c2 = new Calc_C() {
			@Override
			int add(int a, int b) {
				System.out.println(a+b);
				return 0;
			}

			@Override
			int diff(int a, int b) {
				System.out.println(a-b);
				return 0;
			}

			@Override
			int mul(int a, int b) {
				System.out.println(a*b);
				return 0;
			}

			@Override
			double div(int a, int b) {
				System.out.println(a/b);
				return 0;
			}
		};
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
		
		
		
		
		
		
		
	}
}
