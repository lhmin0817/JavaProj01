package chapter12.ex01;

abstract class Calc2 { // 사칙 연산을 계산하는 계산기 클래스
	abstract void add(int a, int b); // 더하기 연산

	abstract void diff(int a, int b); // 빼기 연산

	abstract void mul(int a, int b); // 곱하기 연산

	abstract void div(int a, int b); // 나누기 연산

}

class Calc_Impl2 extends Calc2 { // Calc2를 구현한 클래스
	@Override
	void add(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	void diff(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	void div(int a, int b) {
		System.out.println(a / b);
	}

	@Override
	void mul(int a, int b) {
		System.out.println(a * b);
	}

}

abstract class Calc_C2 extends Calc2 {
	abstract void add(int a, int b); // 더하기 연산

	abstract void diff(int a, int b); // 빼기 연산

	abstract void mul(int a, int b); // 곱하기 연산

	abstract void div(int a, int b); // 나누기 연산

}

public class Ex02 {
	public static void main(String[] args) {
		//

		int a = 5;
		int b = 4;

		// 1. 구현 클래스의 메소드 호출 후 출력
		Calc2 c1 = new Calc_Impl2();
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);

		System.out.println("=============");
		// 2. 익명 클래스로 메소드 호출 후 출력
		Calc_C2 c2 = new Calc_C2() {
			@Override
			void add(int a, int b) {
				System.out.println(a + b);
			}

			@Override
			void diff(int a, int b) {
				System.out.println(a - b);
			}

			@Override
			void mul(int a, int b) {
				System.out.println(a * b);
			}

			@Override
			void div(int a, int b) {
				System.out.println(a / b);
			}
		};
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);

	}
}
