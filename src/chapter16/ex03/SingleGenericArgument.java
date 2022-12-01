package chapter16.ex03;


class Apple {String apple = "사과";}
class Pencil {String pencil = "연필";}
class Banana{String banana = "바나나";}

// 제너릭 클래스 : 다양한 타입의 저장할 수 있는 클래스
	//클래스 이름 뒤 <T>
	//객체를 생성할 때 <T>들어는  타입을 지정해서 객체를 생성함
	// <T>들어오는 타입은 객체형 타입만 들어와야 한다.		wrapper class 해야 한다.
	// wrapper class : 기본 자료형을 객체형 자료형으로 만들것
		// boolean : Boolean / char : Carter / 
		// byte Byte / short Short / int Integer / long Long
		// float Float / double Double 

class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		
		MyClass<Apple>app1 =new MyClass<Apple>();
		
		//Apple 객체를 setter를 사용해서 주입하고 값 가져오기
		app1.set(new Apple());
		System.out.println(app1.get().apple);
		
		//Pencil 객체를 setter를 사용해서 주입하고 값 가져오기
		
		MyClass<Pencil>pen=new MyClass<Pencil>();
		pen.set(new Pencil());
		System.out.println(pen.get().pencil);
		
		MyClass<Banana> ba=new MyClass<>();
		ba.set(new Banana());
		System.out.println(ba.get().banana);
		
		//String 값 넣고 출력
		MyClass<String>st=new MyClass<>();
		st.set("ㅎㅇ");
		System.out.println(st.get());
		
		//int 값을 넣고 출력 : Integer 객체
		MyClass<Integer>in=new MyClass<>();
		in.set(18);
		System.out.println(in.get());
		
		//double 값을 넣고 출력	: Double 객체
		MyClass<Double>du=new MyClass<>();
		du.set(5.3);
		System.out.println(du.get());
		
		
	}
}
