package chapter04.ex03;

public class Ex03 {
	public static void main(String[] args) {
		//<문제> : 2중 for 문을 사용해서 1단 ~ 9단 출력 print로 출력 \t
		
		// 1단 
		// 1 * 1 = 1  1 * 2 = 2
		
		for(int i=1; i<10; i++) {
			System.out.println(i + "단 출력 ");
			for(int j=1; j<10; j++) {
				System.out.print(i + " X " + j + " = " + i*j + "\t");
			}
			System.out.println();
			System.out.println();
		}
		//printf () 를 사용해서 출려부분을 간결하게 처리
		System.out.printf("===========printf===========\n");
		for(int i=1; i<10; i++) {
			System.out.println(i + "단 출력 ");
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
			System.out.println();
		}
	}
}
