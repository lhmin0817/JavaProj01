package chapter07;

class Calc{
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add(int a, int b) {
		return a+b;
	}
	
	
	//빼기 (idff)
	int idff(int a, int b) {
		return a-b;
	}
	//곱하기 ((mul)
	int mul(int a, int b) {
		return a*b;
	}
	
	//나누기 (div)
	double div(double a, double b) {
		return a/b;
	}
	//면적 (Rec)	(가로 : x 세로 : y)
	double Rec(double a, double b) {
		return a*b;
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		
		Calc cl = new Calc();
		
		int q = cl.add(10, 100);
		System.out.println(q);
		
		int w = cl.idff(5, 4);
		System.out.println(w);
		
		int e = cl.mul(7, 5);
		System.out.println(e);
		
		double r = cl.div(5, 3);
		System.out.println(r);
		
		double t = cl.Rec(4, 3.5);
		System.out.println(t);
		
		System.out.println("==============");
		System.out.println(cl.add(10, 20));
		System.out.println(cl.idff(50, 22));
		System.out.println(cl.mul(40, 50));
		System.out.println(cl.div(10, 55));
		System.out.println(cl.Rec(20, 68.8));
		
	}
}
