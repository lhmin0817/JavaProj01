package chapter14.ex05;

// 우리가 생성한 객체를 자동으로 리소스 해제하기 
	// AutoCloseable 인터페이스를 구현해야 한다. 
		// close() 메소드를 재정의 해야한다.


class A implements AutoCloseable{
	String resource;
	A(String resource){
		this.resource=resource;
	}
	@Override
	public void close() throws Exception {	//close() 메소드를 호출하는 곳에서 예외 처리가 필요
		if(resource !=null) {
			resource=null;
			System.out.println("리소스 해제");
		}
	}
}


public class Try_With_Resoutce03 {
	public static void main(String[] args) {
		// 1. 리소스를 수동으로 제거
		A a1=null;
		
		try {
			a1 = new A("문자열 입력 : ");
			System.out.println(a1.resource);	// 문자열 입력
			System.out.println("===============");
		}catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
			e.printStackTrace();
		}finally {
			// 
			if(a1.resource !=null) {
				try {
					a1.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			
			}
		}
		
		
		System.out.println(a1.resource); // null
		
		System.out.println();
		System.out.println(" = 자동으로 객체 리소드 제거 = ");
		System.out.println();
		//1. 그 객체가 AutoCloseable 인터페이스의 close()메소드를 재정의가 필요
		//2. try(객체 선언, 생성) 경우 : 자동으로 close()
		
		
		try(A a2 = new A("생성자 필드에 값 입력");){
			System.out.println(a2.resource);	//생성자 필드에 값 입력
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
