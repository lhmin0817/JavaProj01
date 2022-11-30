package chapter13.ex09;

interface Car{
	void run();
	void stop();
	void start();
}
class Carplay{
	void abc(Car c1) {
		c1.run(); c1.stop(); c1.start();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Carplay c = new Carplay();
		c.abc(new Car() {
			@Override
			public void run() {
				System.out.println("car run");
			}
			@Override
			public void stop() {
				System.out.println("car stop");
			}
			@Override
			public void start() {
				System.out.println("car start");
			}
		});
		
	}
	
}
