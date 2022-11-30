package chapter14.ex02;

public class Ex01 {
	public static void main(String[] args) {
		//try catch - finally 구문을 사용해서 예외처리
		int arr[]=new int[] {1,2,3,4};
		
		//실행 시 예외 발생 : ArrayIndexOutOfBoundsException
		try {
			System.out.println(arr[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동
			System.out.println("배열에 없는 자리입니다.");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
	}
}
