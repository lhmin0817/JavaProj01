package chapter10.ex05;

class Aa{
	static int m=3;
}
class Bb extends Aa{
	static int m=4;
}

public class Override_Static_Field {
	public static void main(String[] args) {
		//정적 필드 (Static Field) : 오버라이딩 불가	/ 별도의 공간에 값이 존재
			// 메모리의 클래스 영역에 값이 존재
		
		//1. 객체 생성 없이 클래스 이름으로 출력
		System.out.println(Aa.m);
		System.out.println(Bb.m);
		System.out.println("=======");
		
		//2. 객체화 해서 정적필드 내용을 출력
		Aa aa=new Aa();
		Bb bb=new Bb();
		Aa ab=new Bb();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
		
	}
}
