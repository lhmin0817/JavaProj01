package chapter10.ex02;

//class의 상속 관계에서 업캐스팅 및 다운 캐스팅
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class TypeCasting02 {
	public static void main(String[] args) {
		//1. 업캐스팅(자동으로 변환) : 생략 시 컴파일어가 자동으로 추가, 자식 클래스 객체 생성 => 타입을 부모
		// ac : A, B C를 모두 내포하고 있고 A타입으로 정의 A 접근가능
		A ac=new C();
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);
			
		System.out.println("===================");
		
		//bc : A B C 를 모두 내포하고 있고 B타입으로 정의, A, B 접근가능
		B bc=new C();
		System.out.println(bc instanceof A);
		System.out.println(bc instanceof B);
		System.out.println(bc instanceof C);
		System.out.println(bc instanceof D);	
		
		//bc는 B 타입으로 정의 A타입으로 업캐스팅
		A a=bc;	//A a=(A)b;
		
		System.out.println("===================");
		//2. 다운 캐스팅(수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않느다. 실행시 예외발생
		//aa는 A만 내포하고 있다.
		A aa=new A();
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		System.out.println(aa instanceof D);
		
		System.out.println("===================");
		if(aa instanceof B) {
		B ba=(B)aa;		//컴파일러 오류 없으나 실행시 오류
		}else {
			System.out.println("aa는 B를 내포하지 않아서 다운캐스팅이 불가합니다. ");
		}
		
		System.out.println("===================");
		
		if(aa instanceof C) {
			C ca=(C)aa;		//컴파일러 오류 없으나 실행시 오류
			}else {
				System.out.println("aa는 C를 내포하지 않아서 다운캐스팅이 불가합니다. ");
			}
		
		System.out.println("===================");
		
		//bd : A , B, D 를 내포하고 있고 B 타입으로 지정, A, B
		B bd=new D();
		System.out.println(bd instanceof A);
		System.out.println(bd instanceof B);
		System.out.println(bd instanceof C);
		System.out.println(bd instanceof D);
		
		
		
		
		
		
		
		
		
		
	}
}
