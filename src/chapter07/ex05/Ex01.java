package chapter07.ex05;

class Student{	//완료 : 13시 20분
	//필드
	String stuName;			//학생 이름 	: 학생이름 없음
	int stuNo;				//학생 학번 	: 0
	String stuPhone;		//핸드폰 번호	: 000-0000-0000
	String stuAddr;			//주소		: 서울
	int stuAge;				//나이		: 0
	double stuWeight;		//몸무게		: 0.0
	
	Student(){				//기본 생성자에서 초기값을 할당 this()메소드를 사용해서 각 필드의 값을 적용
		stuName="학생 이름 없음";
		stuNo=0;
		stuPhone="000-0000-0000";
		stuAddr="서울";
		stuAge=0;
		stuWeight=0.0;
	}
	Student(String stuName){
		this();
		this.stuName=stuName;
	}
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuName=stuName;
		this.stuNo=stuNo;
	}
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName,stuNo);
		this.stuName=stuName;
		this.stuNo=stuNo;
		this.stuPhone=stuPhone;
	}
	Student(String stuName, int stuNo, String stuPhone,String stuAddr){
		this(stuName,stuNo,stuPhone);
		this.stuName=stuName;
		this.stuNo=stuNo;
		this.stuPhone=stuPhone;
		this.stuAddr=stuAddr;
	}
	Student(String stuName, int stuNo, String stuPhone,String stuAddr,int stuAge){
		this(stuName,stuNo,stuPhone,stuAddr);
		this.stuName=stuName;
		this.stuNo=stuNo;
		this.stuPhone=stuPhone;
		this.stuAddr=stuAddr;
		this.stuAge=stuAge;
	}
	Student(String stuName, int stuNo, String stuPhone,String stuAddr,int stuAge,double stuWeight){
		this(stuName,stuNo,stuPhone,stuAddr,stuAge);
		this.stuName=stuName;
		this.stuNo=stuNo;
		this.stuPhone=stuPhone;
		this.stuAddr=stuAddr;
		this.stuAge=stuAge;
		this.stuWeight=stuWeight;
	}
	void print() {
		//필드의 내용을 출력
		System.out.println(stuName);
		System.out.println(stuNo);
		System.out.println(stuPhone);
		System.out.println(stuAddr);
		System.out.println(stuAge);
		System.out.println(stuWeight);
	}	
}
public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println("=====기본 생성자=====");
		Student stu0=new Student();
		stu0.print();
		
		System.out.println("=====매개변수 1개 생성자=====");
		Student stu1=new Student("홍길동");
		stu1.print();
		
		System.out.println("=====매개변수 2개 생성자=====");
		Student stu2=new Student("홍길동", 20221122);
		stu2.print();
		
		System.out.println("=====매개변수 3개 생성자=====");
		Student stu3=new Student("홍길동", 20221122,"010-1111-2222");
		stu3.print();
		
		System.out.println("=====매개변수 4개 생성자=====");
		Student stu4=new Student("홍길동", 20221122,"010-1111-2222","서울 종로구");
		stu4.print();
		
		System.out.println("=====매개변수 5개 생성자=====");
		Student stu5=new Student("홍길동", 20221122,"010-1111-2222","서울 종로구",24);
		stu5.print();
		
		System.out.println("=====매개변수 6개 생성자=====");
		Student stu6=new Student("홍길동", 20221122,"010-1111-2222","서울 종로구",24,80.3);
		stu6.print();
	}
}
