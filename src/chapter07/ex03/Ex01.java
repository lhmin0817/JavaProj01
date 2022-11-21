package chapter07.ex03;

public class Ex01 {
	public static void main(String[] args) {
		//가변 길이 배열 문제
		/*
		 values[0] : 값이 정수 1이 들어올 때 "파워레벨 1입니다." 출력 1 ~ 9까지 
		 values[1] : 값ㅇ ㅣ11 ~ 19까지 들어올 때 "스피트 레벨 1 입니다." 출력 9까지
		 
		 */
		arrayFlexble(7,8); 
	}
	
	public static void arrayFlexble(int...values) {
			if(values[0]<=9 && values[0]>0) {
				System.out.print("파워레벨 "+(values[0])+"입니다. \n");
			}
			if(values[1]<=9 && values[1]>0) {
				System.out.print("스피드 레벨 "+(values[1]+"입니다."));
			}
			
	}
}
