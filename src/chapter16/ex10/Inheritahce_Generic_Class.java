package chapter16.ex10;

//제너릭 클래스의 상속, 자식 클래스는 부모 클래스의 타입 변수의 객수가 같더나 많아야한다.

class Parent<T>{
	T t;
	//getter setter 생략
}

class Child1<T> extends Parent<T>{
	
}

class Child2<T, V> extends Parent<T>{
	V v;
}

public class Inheritahce_Generic_Class {
	public static void main(String[] args) {
		
	}
}
