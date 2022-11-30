package chapter14.ex03;

public class Multi_Catch03 {
	public static void main(String[] args) {
		// Execption : 모든 예외의 부모 클래스, try 블락의 모든 예외를 처리
			// 각 예외의 세부적인 제어가 불가능 
		
		/*
		try {
		System.out.println(3/0);
		
		int arr[]=new int[] {1,2,3,};
		System.out.println(arr[5]);
		
		int num=Integer.parseInt("20A");
		
		}catch(Exception e) {
			// 모든 에외를 Exception 에서 받아서 처리
		}catch(ArithmeticException e) {		
			
		}catch(ArrayIndexOutOfBoundsException e) {		
			
		}catch(NumberFormatException e) {		
			
		}
		*/
		
		try {
			System.out.println(3/0);
			
			int arr[]=new int[] {1,2,3,};
			System.out.println(arr[5]);
			
			int num=Integer.parseInt("20A");
			
			}catch(ArithmeticException e) {		
				//1. try블락의 예외에 대한 세부 처리
				
			}catch(ArrayIndexOutOfBoundsException e) {		
				//1. try블락의 예외에 대한 세부 처리
				
			}catch(NumberFormatException e) {		
				//1. try블락의 예외에 대한 세부 처리
				
			}catch(Exception e) {	//<== 세부적인 예외 처리 후 마지막에 위치
				// 모든 에외를 Exception 에서 받아서 처리
				
			}
		
		
		
		
		
		
		
		
	}
}
