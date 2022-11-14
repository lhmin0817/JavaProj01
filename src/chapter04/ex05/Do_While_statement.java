package chapter04.ex05;

public class Do_While_statement {
	public static void main(String[] args) {
		/* do ~ while 문 : 실행문을 조건과 상관없이 1번은 실행 시킨 후 조건에 따라 반복
		   while		: 조건에 만족해야지만 실행 블락을 실행 
		 
		 while 문
		 초기식
		 while(조건){
		 	실행블학;
		 	증감식;
		 }	
		 
		 do while 문
		 초기식
		 do{				무조건 한번 실행 후 조건을 거침
		 	실행블락;
		 	증감식;
		}while(조건);		 
		 
		 */
		//1. while 문
		System.out.println("===== while문 =====");
		int a=0;
		while(a<0) {		//조건이 false 임으로 실행블락이 실행되지 않는다.
			System.out.println(a + " ");
			
		}
		
		System.out.println("===== do while문 =====");
		//2. do while
		a=0;
		do {				//조건과 상관없이 실행문을 반드시 1번 실행한다.
			System.out.println(a + " ");
		}while(a<0);
		
		
		System.out.println("===== while문을 사용해서 10번 출력 =====");
		//3. 반복 횟수가 10번인 경우 while 문과 do while 문 비교
		a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		System.out.println("===== do while문을 사용해서 10번 출력 =====");
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<10);
		
		
		
		
		
	}
}
