package chapter10.ex11;

import java.util.HashMap;

class A { // equals() 메소드만 재정의 된 상태, hashcode()재정의 되지 않은 상태
	String name;

	A(String name) {
		this.name = name;
	}

	// equals()재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A) obj).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

}
class B {	//equals(), hashcode() 메소드 2개를 재정의 함
	String name;

	B(String name) {
		this.name = name;
	}

	// equals()재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B) obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}

}
public class Object_Method03 {
	public static void main(String[] args) {
		//HasMap : (key : value) <== 컬랙션 
			//key는 중복된 데이터를 넣을 수 없도록 하는 자료 구조
			//	equals(), hashcode();
		
		HashMap<Integer,String>hm1 = new HashMap<>();
		hm1.put(1, "데이터1");	// 
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		
		System.out.println(hm1);
		
		// Integer : equals() hascode() 메소드가 재정의 되어 있기 때문에
			// Map자료구조의 key로 사용할 수 있다.
		// 자신의 만등 객체는 Map에 Key로 사용할 수 있다.
		// equals(), hashCode()를 재정의해야 Map에 key로 사용할 수 있다.
		
		System.out.println("===================");
		
		HashMap<A,String>hm2 = new HashMap<>();
		// A 클래스는 equals() 재정의, hasdhCode()재정의 안됨 <== Map의 key로 사용할 수 없다.
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2);
		
		System.out.println("===================");
		
		HashMap<B,String>hm3 = new HashMap<>();
		// B클래스 : equals(), hashCode() 재정의 <== Map자료 구조의 key로 사용 가능
		hm3.put(new B("첫 번째"), "데이터1");
		hm3.put(new B("첫 번째"), "데이터2");
		hm3.put(new B("첫 번째"), "데이터4");
		hm3.put(new B("두 번째"), "데이터3");
		
		System.out.println(hm3);
		
	}
}
