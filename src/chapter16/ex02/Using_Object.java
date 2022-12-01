package chapter16.ex02;

// 모든 객체는 오브젝트를 상속하고 있다.
// 모든 객체는 오브젝트 타입으로 모두 타입 변환을 할 수 있다.
	// 오브젝트 타입으로 저장된 객체를 가져와서 사용하기 위해서는 매번 다운 캐스팅이 필요하다. 
	// 모든 객체는 오브젝트 타입으로 저장할 수 있고, 매번 다운 캐스팅이 필요
class Apple{String apple = "애플";}
class Pencil{String pencil = "연필";}
class Banana{String banana = "바나나";}
class Orange {String orange = "오렌지";}
class Goods{
	//오브젝트는 자바의 모든 객체를 담을수 있는 타입니다.
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}


public class Using_Object {
	public static void main(String[] args) {
		
		//1. Goods를 사용해서 Apple 객체를 저장 후 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());	//Apple 객체를 생성해서 setter 주입
		
		//getter 를사용해서 값을 가져올 때는 다운 캐스팅해서 가져와야 한다.
		Object obj = goods1.getObject();
		Apple app1 = (Apple)obj;
		
		Apple app2 = (Apple)goods1.getObject();
		System.out.println(app2.apple);
		
		//2. Goods를 사용해서 Pencil 객체를 저장 후 가져오기
		goods1.setObject(new Pencil());
		Object obj2 = goods1.getObject();
		Pencil p1 = (Pencil)obj2;
		System.out.println(p1.pencil);
		
		
		//3. Goods를 시용해서 Banana객체를 저장 후 가져오기
		goods1.setObject(new Banana());
		Banana banana=(Banana)goods1.getObject();
		System.out.println(banana.banana);
		
		
		
		
		
		
	}
}
