package chapter17.ex04;

import java.util.ArrayList;

// Car 객체를 3개정도 생성해서 ArrayList 에 저장 후 객체를 출력 시 필드의 값을 출력하도록 
// for / Enhanced for / 컬렉션 객체자체를 출력
class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(String company, String carModel, String color, int maxSpeed){
		this.company=company;
		this.carModel=carModel;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		ArrayList<Car>a=new ArrayList();
		Car c1 = new Car("멕라렌","아투라","검정",330);
		Car c2 = new Car("테슬라","모델 X","하얀",240);
		Car c3 = new Car("람보르기니","우라칸","초록",325);
		
		a.add(c1); a.add(c2); a.add(c3);
		
		for(int i=0; i<a.size(); i++) {
			Car cc1=a.get(i);
			System.out.println(cc1);
		}
		
		System.out.println("===============================================================");
		
		for(Car k:a) {
			System.out.println(k);
		}
		System.out.println("===============================================================");
		
		System.out.println(a);
		
	}
}
