package chapter16.ex07;

abstract class Fluit{
	abstract void print();	// 추상 메소드 / 객체의 필드 정보를 출력
}
class Apple extends Fluit{
	private String name;
	private int price;
	Apple(){}
	Apple(String name, int price){
		this.name=name;
		this.price=price;
	}
	@Override
	void print() {
		System.out.println("이름은 : "+ name+" 가격은 : "+price+" 원입니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// getter setter 통해서 인풋
	// print 메소드 오버라이딩 해서 필드의 정보를 출력
}
class Banana extends Fluit{
	private String name;
	private int price;
	Banana(){}
	Banana(String name, int price){
		this.name=name;
		this.price=price;
	}
	@Override
	void print() {
		System.out.println("이름은 : "+ name+" 가격은 : "+price+" 원입니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
// Fluit 을 상속하지 않았기 때문에 제너릭 타입으로 저장 불가
class Pencil{
	
}
//제너릭 클래스 : Fluit 만 저장할수 있는 제너릭 클래스
class genericClass<T extends Fluit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		genericClass<Fluit> f1 = new genericClass<>();
		genericClass<Apple> a1 = new genericClass<>();
		genericClass<Banana> b1 = new genericClass<>();
		
		f1.setT(new Apple());
		f1.getT();
		
		f1.setT(new Banana());
		f1.getT();
		
		f1.getT().print();
		
		a1.setT(new Apple());
		a1.getT().setName("사과"); a1.getT().setPrice(1000); a1.getT().print();
		
		b1.setT(new Banana());
		b1.getT().setName("바나나"); b1.getT().setPrice(2000); b1.getT().print();
		
	}
}
