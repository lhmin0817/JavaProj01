package chapter04.ex03;

public class For_statement03 {
	public static void main(String[] args) {
		//for문 내의 for문 : 2중 for문
		//for을 사용해서 구구단 출력
		
		// 바깥쪽 for는 단을 출력하는 변수
		for(int i=1; i<10; i++) {
			//
			System.out.println(i + "단 출력");
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("==============================");
		}
		
	}
}
