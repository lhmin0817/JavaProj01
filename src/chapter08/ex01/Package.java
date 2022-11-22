package chapter08.ex01;

//다른 패키지에 존재하는 클래스는 import
import chapter08.ex02.Student;
import chapter07.*;				//주의 : 하위 패키지는 임포트 하지 않음/
import chapter07.ex01.*;

public class Package {
	public static void main(String[] args) {
		//클래스 내부 구성요소 
			// 필드, 생성자, 메소드, 이너클래스
		
		//클래스 외부 구성요소 
			//패키지, 임포트, 외부 클래스
		
		//패키지(package) : 클래스를 조직화해서 관리하는 폴더
			//한 패키지내에 동일한 이름의 클래스는 올 수 없다.
			//외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한 경우
		
		//임포트(import) 	: 다른 패키지의 클래스를 사용할려 하는 경우 : import
		
		//Student 클래스의 객체 생성 : 다른 패키지에 존재하는 클래스
			//chaeter08.ex02.Student
		
		//기본 생성자 호출
		//Student : import
		Student s1=new Student();
		s1.print();
		System.out.println();
		
		//매개변수 4개인 생성자 호출
		Student s2=new Student("홍길동", "1111",3,"서울 종로구");
		s2.print();
		
		System.out.println("==========");
		
		//Car 클래스 import없이 전체이름(패키지이름.클래스이름)으로 사용
		chapter08.ex02.Car ca1=new chapter08.ex02.Car();
		ca1.print();
		System.out.println();
		
		chapter08.ex02.Car ca2=new chapter08.ex02.Car("삼성자동차","검은색",200);
		ca2.print();
		
		
	}
}
