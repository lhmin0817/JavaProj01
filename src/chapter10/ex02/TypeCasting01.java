package chapter10.ex02;

class Animal{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	String tigerSoind;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}
class TigerChild extends Tiger{
	String tigerChildSound;
	void tigerChildEat() {
		System.out.println("새끼 호랑이는 젖을 먹습니다.");
	}
}

public class TypeCasting01 {
	public static void main(String[] args) {
		//type Casting(형 변환):
		
		
		//1. 업캐스팅 : Tiger(자식객체) ==> Animal(부모)
		//업캐스팅 : 자식 객체를 생성해서 부모 타입으로 정의, 자동으로 일어남
		// a1 : Tiger필드 메소드 + Animal 필드 메소드 포함
		//	Animal의 필드와 메소드만 사용 가능 
		//Animal a1=(Animal)new Tiger();	//Tiger객체를 생성해서 Animal 타입으로 지정
		Animal a1=new Tiger();
		
		// a1은 Animal타입의 필드 메소드만 사용 가능 
		a1.name="호랑이";
		a1.age=10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		a1.eat();
		
		System.out.println("=====다운 캐스팅=====");
		//2. 다운 캐스팅 : Animal(부모타입) ==> Tiger(자식타입), 수동으로 명시
			// a1 : Tiger필드 메소드 + Animal 필드 메소드 포함
			// a1 : Animal 타입 ===> t2(Tiger)타입으로 다운 캐스팅
		Tiger t2=(Tiger)a1;
		//t2는 Animal, Tiger의 필드와 메소드를 모두 접근 가능 
		t2.name="호랑이2";
		t2.age=6;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.eat();
		
		System.out.println("=================");
		//Tiger의 필드 메소드도 접근 가능
		t2.tigerSoind="어흥";
		System.out.println(t2.tigerSoind);
		t2.tigerEat();
		
		System.out.println("================");
		//3. Tiger 타입으로 객체 생성 : Animal Tiger의 필드 메소드 모두 접근
		// t3: Animal, Tiger 모두 내포
		Tiger t3=new Tiger();
		
		//다운 캐스팅 : 실행 시 오류 t3에는 TigerChild필드 메소드르 가지고 있지 않다.
		System.out.println("=====instanceof 출력=====");
		System.out.println(t3 instanceof Animal);
		System.out.println(t3 instanceof Tiger);
		System.out.println(t3 instanceof TigerChild);
		
		//다운 캐스팅 할때에는 반드시 instanceof를 사용해야 한다.
		if(t3 instanceof TigerChild) {		//
			TigerChild t4=(TigerChild)t3;
		}
		System.out.println("=======================");
		//1.업캐스팅 : a3 : Animal, Tiger, TigerChild
			//Animal 타입의 필드와 메소드만 접근 가능
		Animal a3=new TigerChild();
		System.out.println(a3 instanceof Animal);
		System.out.println(a3 instanceof Tiger);
		System.out.println(a3 instanceof TigerChild);
		
		//a3 : Animal 의 필드와 메소드만 접근
		a3.name="호랑이4";
		a3.age=7;
		System.out.println(a3.name);
		System.out.println(a3.age);
		a3.eat(); 
		
		System.out.println();
		//a3를 Tiger 타입으로 다운 캐스팅
		Tiger t5=null;	//실행블락 밖에서 캐스팅할 변수선언 /객체 초기화
		if(a3 instanceof Tiger) {
			t5 =(Tiger)a3;
		}
		t5.age=10;
		System.out.println(t5.age);
		t5.name="호랑이5";
		System.out.println(t5.name);
		
		t5.tigerSoind="어흥";
		System.out.println(t5.tigerSoind);
		
		System.out.println();
		//3. a3를 TigerChild로 다운 캐스팅
		TigerChild t6=null;
		if(t6 instanceof TigerChild) {
			t6=(TigerChild)a3;
		}
		//t6 : TigerChild 타입(Animal Tiger TigerChild 의 필드와 메소드를 모두 접근가능)
		t6.age=2;					//Animal
		t6.tigerSoind="어흥어흥";		//Tiger
		t6.tigerChildSound="어흥";	//TigerChild
		
		//t6 (TigerChild) ---> Animal
		Animal t7=t6;				//t7 : 'Animal' Tiger TigerChild 내포하고 있고 Animal 타입
		Tiger t8=t6;				//t8 : Animal 'Tiger' TigerChild 내포하고 있고 Tiger 타입
				
		
	}
}
