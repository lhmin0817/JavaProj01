package chapter04.ex01;

public class If_Controll_Statement {
	public static void main(String[] args) {
		//if 구문 사용하기 
		//1. type 1 : if (조건) {실행문 : 조건이 참일 때 실행;}
			//{}를 생략 가능한데, 생략
		int value1 = 5;
		
		//조건이 참일 때
		if (value1 > 3) {
			//조건이 참일 때 실행블락 
			System.out.println("실행1");		//조건이 참이므로 실행
		}
		
		//조건이 거짓일 떄
		if (value1 < 3) {
			//조건이 거짓일 때 실행블락 
			System.out.println("실행2");
		}
		
		System.out.println("======= {조건이 참일때 실행문,} {}생략가능 =======");
		
		//if 조건에서 실행문이 하나일 때 {}을 생략
		if (value1 < 3) 
			System.out.println("실행3");		//실행문 1개만 {}가 생략되어서 처리될 수 있다.		
			System.out.println("실행4");
			
		System.out.println("============================================");		
		//2. type2 : if(조건) {조건이 참일 때 실행;} else {조건이 거짓일때 실행;}
			// 삼항 연산자료 변환 
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("=======if를 사용해서 출력 =======");
		
		
		if (bool2) {
			//조건이 참일 때 실행
			System.out.println("참");
		}else {
			//조건이 거짓일 때 실행
			System.out.println("거짓");
		}
		
		System.out.println("=======삼항 연산자를 사용해서 출력=======");
		System.out.println((bool1)? "참":"거짓");
		
		System.out.println("===================================");
		/*3. type3 : 조건이 여러개인 경우 
		if(조건1) {조건1이 참일 때 실행;
		}else if(조건2) {조건2이 참일 때 실행
		}else if(조건3) {조건3이 참일 때 실행
		}........else{조건에 존재하지 않는 경우 실행 
		}
		 */
		int value3 = 140;
		
		if (value3 > 90) {
			System.out.println("A학점");
		}else if(value3 >= 80) {
			System.out.println("B학점");			//참일 경우 if문을 빠져나온다. 실행 후 탈출
		}else if(value3 >= 70) {
			System.out.println("C학점");
		}else if(value3 >= 60) {
			System.out.println("D학점");
		}else{
			//위에 조건이 만족하지 않으면 실행 
			System.out.println("F학점");
		}
		
		System.out.println("===============조건을 거꾸로 적용=======");
		
		if(value3 >= 70) {						//실행 후 탈출 
			System.out.println("C학점");
		}else if(value3 >= 80) {
			System.out.println("B학점");
		}else if(value3 >= 90) {
			System.out.println("A학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("==============조건을 디테일 하게 적용====");
		
		if(value3 >= 60 && value3 < 70) {
			System.out.println("D학점");
		}else if(value3 >= 70 && value3 < 80) {
			System.out.println("C학점");
		}else if(value3 >= 80 && value3 <90) {
			System.out.println("B학점");
		}else if(value3 >= 90 && value3 <=100) {
			System.out.println("A학점");
		}else if(value3 >=0 && value3 <60) {
			System.out.println("F학점");
		}else {
			System.out.println("정학한 점수가 아닙니다. 0 ~ 100까지만 넣어주세요.");
		}
		
		
		
		
	}
}
