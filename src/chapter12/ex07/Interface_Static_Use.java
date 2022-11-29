package chapter12.ex07;

interface A{
	//
	static void abc() {
		System.out.println("인터페이스의 static 메소드");
	}
}

public class Interface_Static_Use {
	public static void main(String[] args) {
		// interface 블락에서 구현된 메소드 : default, static
		//    메소드 이름앞에 static 메소드 : 인터페이스 이름으로 바로 호출가능
		
		// interface : 모든 필드와 메소드에 public 이 모두 생략
		// 1. 필드  : public static final
		// 2. 메소드 : 
		//	 2-1. 추상 메소드 : public abstract 생략, 선언만 됨
		//   2-2. default 메소드 : [public] default 메소드, 구현부가 있는 메소드
		//		모든 자식 클래스에 상속되는 메소드, java 1.8버전부터 지원
		//   2-3. static 메소드 : [public]static메소드, 구현부가 있는 메소드
		//		java 1.8버전부터 지원, 객체 생성없이 인터페이스 이름으로 호출
		
		//객체 생성없이 인터페이스 이름으로 호출해서 사용가능
		A.abc();
		
	}
}
