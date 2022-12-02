package chapter16.ex10;



//제너릭 클래스 / 제너릭 메소드 /를 사용해서 두점의 좌표 값으로 넓이를 구하는 프로그램 작성
//두점의 좌표를 처리하는 클래스 생성 <제너릭 클래스>
class Point<X, Y>{
	X x;
	Y y;
	
	//생성자를 통해서 x,y 의 값을 입력
	Point(){}		
	Point(X x, Y y){	// x : x좌표  / y : y좌표
		this.x=x;
		this.y=y;
	}
	// getter 만 생성
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
}
// 제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GeneriMethod<X, Y>{
	//makeRectangle() 메소드를 호출 시 
	
	public static <X, Y> double makeRectangle(Point<X,Y>p1, Point<X,Y>p2){
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌
		//넓이를 리턴 해주면 됨
		double p1x = (double)p1.getX();
		double p1y = (double)p1.getY();
		double p2x = (double)p2.getX();
		double p2y = (double)p2.getY();
		
		return ((double)p1x-p1y)*((double)p2x-p2y);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Point<Double, Double> p1 = new Point(10.2, 30.5);
		Point<Double, Double> p2 = new Point(30.3, 20.3);
	
		GeneriMethod g = new GeneriMethod();
		System.out.println(g.makeRectangle(p1, p2));
		
		
	
		//두 점의 좌표를 저장하느 p1 p2
		
		//makeRectangle(p1,p2) <== 두점의 값을 찾아서 넓이를 처리해서 리턴으로 받음
		
		
		
		
	}
}
