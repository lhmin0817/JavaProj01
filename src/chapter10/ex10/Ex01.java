package chapter10.ex10;

class C{
	String stuID;
	String name;
	int age;
	//c1.equals(c2) stuID : true/false 출력값 산출
	
	//생성자, 기본 생성자1,  생성자2(시그니처)
	C(){}
	C(String stuID, String name, int age){
		this.age=age;
		this.name=name;
		this.stuID=stuID;
	}
	@Override
	public boolean equals(Object obj) {		
		if(this.stuID==((C)obj).stuID) {
			return true;
		}else {
			return false;
		}
	}	
	//toString() 재정의 : 필드의 값을 출력, 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		C c1 = new C("1111","홍길동",11);
		C c2 = new C("1111","홍길순",12);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("=================================");
		System.out.println();
		System.out.println("==========stuID equals비교=============");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		
		
		
		
	}
}
