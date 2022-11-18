package chapter07;

class Student{
	String stuName;		//이름
	int stuNum; 		//학번
	String stuAddr; 	//학생 주소
	String stuPhone;	//전화번호
	double Weight;		//몸무게
	
	
	//생성자 오버로딩
	//	기본생성자, 매개변수 3개인 생성자 매개변수 5개인 생성자
	//필드의 값을 출력하는 메소드 void ptint() {}
	
	Student(){
		
	}
	
	
	Student(String stuname,int stunum, String stuaddr){
		this.stuName=stuname;
		this.stuNum=stunum;
		this.stuAddr=stuaddr;
	}
	
	Student(String stuname, int stunum, String stuaddr, String stuphone, double weight){
		this.stuName=stuname;
		this.stuNum=stunum;
		this.stuAddr=stuaddr;
		this.stuPhone=stuphone;
		this.Weight=weight;
	}
	void print() {
		System.out.println("학생 이름 : "+stuName);
		System.out.println("학번 : "+stuNum);
		System.out.println("학생 주소 : "+stuAddr);
		System.out.println("학생 전화번호 : "+stuPhone);
		System.out.println("학생 몸무게 : "+Weight);
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.print();
		
		
		System.out.println("=====================");
		Student stu1 = new Student("홍길동",17,"서울시");
		stu1.print();
		
		System.out.println("=====================");
		Student stu2 = new Student("김철수",19,"서울시 종로구","010-1111-2222",82.45);
		stu2.print();
		
	}
}
