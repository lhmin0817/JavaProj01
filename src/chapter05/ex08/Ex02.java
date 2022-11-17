package chapter05.ex08;

public class Ex02 {
	public static void main(String[] args) {
		//main method의 배열 변수 args로 실수 값 넣러서 계산하기
		// args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		//		for문을 사용해서 처리
		//			합계 : <실수를 더한 합계>		
		String st=args[0];
		double sum=0;
		for(int k=1; k<args.length; k++) {
			sum += Double.parseDouble(args[k]);
		}
		System.out.print(st+" : ");
		System.out.print(sum);
		System.out.println();
		System.out.printf(st+" : %8.4f",sum);
		
		
		
		
													//Iteger.parseInt()문자열로 된 정수를 정수형으로 변환
		double d=Double.parseDouble(args[1]);		//문자열로 된 실수를 실수형으로 변환
		
		
		
	}
}
