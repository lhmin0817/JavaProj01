package chapter10.ex04;

class A{
	protected void abc() {	//메소드의 접근 지정자 : protected
		
	}
}
class B extends A{
	@Override
	//void abc() {}			   protected 보다 넓거나 같아야 한다. default
	public void abc() {		// public 은 부모 메소드의 접근 지정자 protected 보다 넓다.
		
	}
}
class B2 extends A{
	@Override
	protected void abc() {}
}
class B3 extends A{
	//@Override
	//void abc() {}
}
class B4 extends A{
	//@Override
	//private void abc() {}
}

public class MrthodOverriding04 {
	public static void main(String[] args) {
		//메소드 오버라이딩과 접근 지정자와의 관계
		//	- 부모의 메소드를 자식에서 재정의 해서 사용
		//	- 부모의 메소드 이름과 동일해야 하며 시그니처도 동일해야 한다.
		//	- 부모의 접근 지정자보다 오버라이딩할 자식 메소드는 접근 지정자가 부모와 같거나 범위가 넓어야 한다.
		//	- public > protected > default > private
	}
}
