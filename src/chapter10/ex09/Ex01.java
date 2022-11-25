package chapter10.ex09;

class Car {
	private String catName;
	private String carColor;
	private int maxSpeed;
	private String catModel;

	Car() {
	}

	public Car(String catName, String carColor, int maxSpeed, String catModel) {
		super();
		this.catName = catName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.catModel = catModel;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCatModel() {
		return catModel;
	}

	public void setCatModel(String catModel) {
		this.catModel = catModel;
	}

	@Override
	public String toString() {
		return "Car [catName=" + catName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", catModel="
				+ catModel + "]";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. 기본 생성자, 인풋을 받는 생성자,
		// 2. getter, setter 생성
		// 3. toString() 재정의 : 전체 메모리 내용 출력

		// 4. 생성자를 통해서 값을 할당 후 메모리 전체 내용 출력
		// 5. setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력
		// getter를 사용해서 각 필드의 내용을 출력

		System.out.println("==================================================================");

		Car c = new Car("테슬라", "하얀색", 280, "세단");
		System.out.println(c);
		System.out.println(c.toString());

		System.out.println("==================================================================");

		Car c1 = new Car();
		c1.setCatName("삼성 자동차");
		c1.setCarColor("검은색");
		c1.setMaxSpeed(300);
		c1.setCatModel("그렌저");

		System.out.println(c1);
		System.out.println(c1.toString());

		System.out.println("==================================================================");

		System.out.println(c1.getCatName());
		System.out.println(c1.getCarColor());
		System.out.println(c1.getMaxSpeed());
		System.out.println(c1.getCatModel());

		System.out.println("==================================================================");

	}
}
