package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// Scanner 에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로드램을 작성
		//if문을 사용
		//완료시간 13시 20분
		Scanner sc = new Scanner(System.in);
		int select;			//프로그램을 선택
		int kor, eng, math = 0; //점수

		int a;				//홀짝
		
		String aName;		//이름
		String bName;
		
		
		System.out.println("==============================================");
		System.out.println("1.학점의 합계 / 평균 | 2. 홀수, 짝수 | 3. 같은 이름식별");
		System.out.println("==============================================");
		System.out.println("위에 번호를 선택하세요.>>>>>");
		
		select =sc.nextInt();
				if (select == 1) {
					System.out.println("국어점수 영어점수 수학점수를 입력해주세요.");
					kor = sc.nextInt();
					eng = sc.nextInt();
					math = sc.nextInt();			
					int sum;
					sum = kor+eng+math;
					double vag = sum/3.0;
					System.out.println("학점의 합계 : "+ sum +"입니다. 평균 :"+ vag +" 입니다.");
				}else if(select == 2) {
					System.out.println("정수를 입력해주세요.");
					a = sc.nextInt();
					System.out.println(a + " 은" + (a % 2==0 ? " 짝수 입니다." : " 홀수 입니다."));
				}else if(select ==3) {
					System.out.println("식별할 이름들을 입력해주세요.");
					aName = sc.next();
					bName = sc.next();
					System.out.println(aName.equals(bName));					
				}else {
					System.out.println("1번, 2번, 3번 중으로 선택을 부탁드립니다.");
				}
		
	}
}
