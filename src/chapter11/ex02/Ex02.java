package chapter11.ex02;

class Student {
	//필드 
	String name;
	
	Student(){}
	
	//합계와 평균을 출력하는 메소드
	void sum_avg() {
		System.out.println("값을 입력해주세요");
	}
}
class Student_Sub extends Student{
	//자식 필드
	int kor; 	//국어점수
	int eng;	//영어점수
	int math;	//수학점수
	
	//부모의 sum_avg()메소드를 오버라이딩 해서 객체의 국어 영어 수락의 합계와 평균을 출혁하는 메소드
	Student_Sub(String name,int kor, int eng, int math){
		super();
		super.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	@Override
	void sum_avg() {
		int sum=kor+eng+math;
//		double avg=sum/3.;
		System.out.printf("학생이름 = "+name+"| 국어점수 = "+kor+"점| 영어점수 = "+eng+"점| 수학점수 = "+math+"점| 총 점수 = "+sum+"점| 평균 = %5.2f점| \n",(sum/3.));
		
			
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
	
		/*
		 상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력
		 생성자를 사용해서 객체 생성 시 필드의 값을 할당하고  
		 
		 홍길동, 70, 88, 77
		 이순신, 80, 68, 87
		 김똘똘, 60, 86, 30
		 홍길순, 77, 56, 80
		 감강찬, 55, 66, 77	 
		 
		 Student 배열변순 arr 변수에 모든 객체를 저장해서 
		 배열의 값을 for문으로 출력할 때 
		 	오버라이딩된 메소드 출력	<그 학생의 국어 영어 수학의 합계 평균	- 업캐스팅
		 	5명의 학생의 국어에 대한 합계, 평균	- 다운캐스팅
		 	5명의 학생의 영어에 대한 합계, 평균	- 다운캐스팅
		 	5명의 학생의 수학에 대한 합계, 평균	- 다운캐스팅
		 	
		 */
		
		Student s1 = new Student_Sub("홍길동", 70, 88, 77);
		Student s2 = new Student_Sub("이순신", 80, 68, 87);
		Student s3 = new Student_Sub("김똘똘", 60, 86, 30);
		Student s4 = new Student_Sub("홍길순", 77, 56, 80);
		Student s5 = new Student_Sub("감강찬", 55, 66, 77);
		
		s1.sum_avg(); s2.sum_avg(); s3.sum_avg(); s4.sum_avg(); s5.sum_avg();  
		System.out.println("===================================================================================");
		
		Student stuarr[] = {s1,s2,s3,s4,s5};
		for(int i=0, ks=0; i<stuarr.length; i++) {
			ks += ((Student_Sub) stuarr[i]).kor;
			if(i==(stuarr.length-1)) {
				System.out.print("국어 합계 : "+ks + "점| ");
				System.out.println("국어 평균 : "+(ks/5.)+"점|");
			}
		}
		
		for(int i=0, es=0; i<stuarr.length; i++) {
			es += ((Student_Sub) stuarr[i]).eng;
			if(i==(stuarr.length-1)) {
				System.out.print("영어 합계 : "+es + "점| ");
				System.out.println("영어 평균 : "+(es/5.)+"점|");
			}
		}
		
		for(int i=0, ms=0; i<stuarr.length; i++) {
			ms += ((Student_Sub) stuarr[i]).math;
			if(i==(stuarr.length-1)) {
				System.out.print("수학 합계 : "+ms + "점| ");
				System.out.println("수학 평균 : "+(ms/5.)+"점|");
			}
		}
		System.out.println("===============================");
		
		
		
	}
}
