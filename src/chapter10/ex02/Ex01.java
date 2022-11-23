package chapter10.ex02;

class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2은 음식을 먹습니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//업캐스팅 실습
		//1. Studnet 클래스를 생성하면서 Human타입으로 지정		: h1
		//2. Studnet 클래스를 생성하면서 Studnet 타입으로 지정	: s1
		//3. Student2 클래스를 생성하면서 Human타입으로 지정 		: h2
		//4. Student2 클래스를 생성하면서 Student타입으로 지정	: s2
		//5. Student2 클래스를 생성하면서 Student2타입으로 지정	: s3
		
		System.out.println("1.Studnet 클래스를 생성하면서 Human타입으로 지정");
		Human h1=new Student();
		h1.age=15;
		h1.name="홍길동";
		System.out.println(h1.age);
		System.out.println(h1.name);
		h1.eat();
		
		System.out.println("2.Studnet 클래스를 생성하면서 Studnet 타입으로 지정");
		Student s1=(Student)h1;
		s1.age=16;
		s1.name="이순신";
		s1.stuID="1111";
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.stuID);
		s1.stuEat();
		
		System.out.println("3.Student2 클래스를 생성하면서 Human타입으로 지정 ");
		Human h2=new Student2();
		h2.age=17;
		h2.name="김철수";
		System.out.println(h2.age);
		System.out.println(h2.name);
		h2.eat();
		
		System.out.println("4.Student2 클래스를 생성하면서 Student타입으로 지정");
		Student s2=(Student2)h2;
		s2.age=18;
		s2.name="홍길순";
		s2.stuID="2222";
		System.out.println(s2.age);
		System.out.println(s2.name);
		System.out.println(s2.stuID);
		s2.eat();
		s2.stuEat();
		
		System.out.println("5.Student2 클래스를 생성하면서 Student2타입으로 지정");
		Student2 s3=(Student2)s2;
		s3.age=19;
		s3.name="강감춘";
		s3.stuID="3333";
		s3.stu2ID="4444";
		System.out.println(s3.age);
		System.out.println(s3.name);
		System.out.println(s3.stuID);
		System.out.println(s3.stu2ID);
		s3.eat();
		s3.stuEat();
		s3.stu2Eat();
		
		
		
		
		
		
		
		
		
		
		
	}
}
