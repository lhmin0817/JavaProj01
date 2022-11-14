package chapter04.ex03;

public class Ex02 {
	public static void main(String[] args) {
		//<문제> 2중 for문을 사용해서  1단 ~ 19단 까지 출력
		//3의 배수단과 7의 배수단을 출력
		
		for(int i=1; i<20; i++) {
			System.out.println(i + "단");
			for(int j=1; j<20; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("=============");
		}
		for(int i=1; i<20; i++) {
			System.out.println(i + "단의 3의 배수");
			for(int j=3; j<10; j+=3) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("=============");
		}
	}
}
