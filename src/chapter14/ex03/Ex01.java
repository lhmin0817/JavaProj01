package chapter14.ex03;

public class Ex01 {
	public static void main(String[] args) {
		
		try {
			System.out.println(3/0);
			
			int arr[]=new int[] {1,2,3,};
			System.out.println(arr[5]);
			
			int num=Integer.parseInt("20A");
			
			}catch(ArithmeticException e) {
				System.out.println(" 0으로 나눌수 없습니다.");
			}catch(ArrayStoreException e) {
				System.out.println("없는 배열의 방입니다.");
			}catch(NumberFormatException e) {
				System.out.println("문자를 숫자로 바꿀수 없습니다.");
			}finally {
				System.out.println("각각 예외에 대해 catch");
			}
		
		System.out.println("======================================================");
		
		try {
		System.out.println(3/0);
		
		int arr[]=new int[] {1,2,3,};
		System.out.println(arr[5]);
		
		int num=Integer.parseInt("20A");
		
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(" 0으로 나눌수 없습니다.");
			System.out.println("없는 배열의 방입니다.");
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
			System.out.println(e.getMessage());	//예외의 간단한 정보를 출력
			e.printStackTrace();				// 예외의 세부적인 정보를 출력
		}finally {
			System.out.println("예외를 하나의 출력");
		}
		
		System.out.println("프로그럼 종료");
		
		
	}
}
