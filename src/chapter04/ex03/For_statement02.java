package chapter04.ex03;

public class For_statement02 {
	public static void main(String[] args) {
		//for문의 특수한 형태(무한 루프)
		// ---- for문에서 조건이 생략될 경우 무한 루프에 빠진다.
		// ---- 초기식, 조건, 증감식이 모두 빠진 경우 무한 루프가 된다.
		
		/*
		for(int i=0; ; i++) {			//조건이 생략되면 무한 루프
			System.out.print(i + " ");	//메모리가 풀 : 서버가 다운
		}
		for(;;) {
			System.out.println("무한 루프");
		}
		*/
		System.out.println("==================================");
		//무한 루프 탈출 방법 : break;
		for(int i=0; ; i++) {
			System.out.println(i + " ");
			if(i>100) {
				break;					//break; 는 if조건과 같이 사용한다.
			}
		}
		
		
		
		
	}
}
