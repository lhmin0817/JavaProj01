package chapter08.ex02;

public class Car {	//public : 클래스이름, 필드면, 생서자명, 메소드명 앞에 존재해야 다른 패키지에서 접근할 수 있음.
	
	//필드
	public String carName;
	public String carColor;
	public int maxSpeed;
	
	//생성자
	public Car(){}
	public Car(String carName, String carColor, int maxSpeed){
		this.carName=carName;
		this.carColor=carColor;
		this.maxSpeed=maxSpeed;
	}
	
	public void print() {
		System.out.println("자동차 명 : "+carName);
		System.out.println("자동차 색 : "+carColor);
		System.out.println("자동차최대 속도 : "+maxSpeed);
	}
	
	
}
