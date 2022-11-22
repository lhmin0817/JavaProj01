package chapter07.ex05;

class Book{
	String title;			//책 제목을 넣는 변수
	String author;			//책 저자를 넣는 변수
	
	Book(){
		title="책 제목 없음";
		author="작자미상";
	}
	Book(String title){
		this();
		this.title=title;
	}
	Book(String title, String author){
		this(title);
		this.author=author;
	}
	//필드의 값을 출력해주는 메소드
	void print() {
		System.out.println("책의 제목은 : "+title);
		System.out.println("책의 저자는 : " + author);
	}
}

public class Book_Test {
	public static void main(String[] args) {
		
		//기본 생성자 
		Book b=new Book();
		b.print();
		
		//매개변수 1개인 생성자 호출
		Book b1=new Book("콩쥐팥쥐");
		b1.print();
		
		//매개변수 2개인 생성자 호출
		Book b2=new Book("콩쥐팥쥐","");
		b2.print();
	}
}
