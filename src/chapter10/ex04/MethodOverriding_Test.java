package chapter10.ex04;

class Animal{
	//Animal 필드
	String name;
	int age;
	
	//기본 생성자 생략 Animal(){}
	//Animal(String name, int age){
		//this.name=name;
		//this.age=age;
	//}
	//Animal 메소드
	void cry() {
		System.out.println("Animal class cry Method");
	}
}
class Tiger extends Animal{

	/*기본생성자가 생략 Tiger(){}
	Tiger(String name, int age) {
		super(name, age);
	}
	자식 클래스의 생성자에는 기본적으로 super()가 생략
	 */
	int tigerNo;	//tiger에서 생성된 필드
	
	void tigerMethod() {
		System.out.println("Tiger class Method");
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}
}
class Eagle extends Animal{
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle class Method");
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class TigerChild extends Tiger{
	int tigerChildNo;
	void tigerChildMethod() {
		System.out.println("Tiger Child class Method");
	}
	@Override
	void cry() {
		System.out.println("응애");
	}
}

public class MethodOverriding_Test {
	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속관계에서 부모클래스의 메소드를 자식 클래스에서 재정의해서 사용
		// 
		
		//1. 객체의 타입
		// a1 : Animal를 내포하고 잇고 Animal의 필드와 메소드 접근 
		Animal a1=new Animal();
		a1.name="동물 이름";
		a1.age=10;
		a1.cry();
		
		System.out.println("========================");
		
		//2. Tiger객체를 생성하면서 Tiger 타입으로 지정
		//t1은 Tiger Animal 를 내포하고 있고, Tiger타입으로 지정(Tiger, Animal 필드 메소드 모두 접근 가능)
		Tiger t1=new Tiger();
		//부모의 필드와 메소드 호출
		t1.name="호랑이1";
		t1.age=5;
		t1.cry();
		
		//Tiger의 필드 메소드 호출 
		t1.tigerNo=10;
		t1.tigerMethod();
		
		System.out.println("========================");
		
		//3. Tiger객체를 생성하면서 Animal 타입으로 지정(Animal의 필드와 메소드만 접근)
		// a2 : A 
		Animal a2=new Tiger();
		//Animal의 필드와 메소드만 접근
		a2.name="호랑이2";
		a2.age=5;
		a2.cry();	//오버라이딩 된 Tiger 의 메소드 호출
		
		System.out.println("========================");
		
		//다운 캐스팅 : a2 : Animal, Tiger을 내포하고 있고 Animal타입
		Tiger t2=(Tiger)a2;	//다운 캐스팅 할땐 반드시 instanceof 를 사용해야한다.
		
		if(a2 instanceof TigerChild) {
			TigerChild t3=(TigerChild)a2;
		}else {
			System.out.println("a2에는 TigerChild를 내포하지 않습니다.");
		}
		
		//TigerChild 객체를 생성하면서 Animal 타입으로 지정
		// a4 : Animal Tiger TigerChild
		Animal a4=new TigerChild();
		a4.cry();
		
		//다운 캐스팅 : 타입을 명시해야함 
		Tiger t10=(Tiger)a4;
		t10.cry();
		
		//다운 캐스팅
		TigerChild tc10=(TigerChild)t10;
		tc10.cry();
		
		//업캐스팅
		Animal a20=tc10;
		
		System.out.println("========================");
		
		//배열에 객체를 저장하고 값을 출력하기 위한 객체 생성, Animal 타입으로 지정
		Animal a29=new Animal();		// a29 : Animal 
		Animal a30=new Tiger();			// a30 : Animal Tiger
		Animal a31=new Eagle();			// a31 : Animal Eagle
		Animal a32=new TigerChild();	// a32 : Animal Tiger TigerChild
		
		//배열에 Animal 타입의 객체 저장
		Animal[] arr=new Animal[] {a29, a30, a31, a32};
		
		System.out.println("============향상된 For 문을 사용해서 객체 정보 출력============");
		
		//배열의 값을 출력 : 향상된 for문을 사용해서 출력
		for(Animal k : arr) {
			k.cry();
		}
		
		System.out.println("============For 문을 사용해서 객체 정보 출력============");
		
		//배열의 값 출력 : for문을 사용해서 출력 / 배열의 값을 Animal 변수에 할당하고 출력
		for(int i=0; i<arr.length; i++) {
			Animal aa=arr[i];
			aa.cry();
		}
		System.out.println("============ ============");
		for(int i=0; i<arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("============ ============");
		
		//객체 변수를 블락 밖에서 선언 후 출력
		Animal aaa=null;			//Animal 객체형 변수 : 초기화할때 기본값으로 null을 준다.
		for(int i=0; i<arr.length; i++) {
			aaa=arr[i];
			aaa.cry();
		}
		
		
		
		
		
		
		
		
	}
}
