package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//java.lang패키지 하위의 클래스는 생략 가능(object, integer String.....)

public class CeateListObject {
	public static void main(String[] args) {
		
		//참고 
		//1. ArrayList
		List<Integer> aList1=new ArrayList<>();		//내부적으로 메모리 공간 10개를 확보
		List<Integer> aList2=new ArrayList<>(30);	//내부적으로 포기 메모리 공간 방 30개 생성
		
		//2, Vector
		List<Integer> aList3=new Vector();			//capacity 10
		List<Integer> aList4=new Vector<>(50);		//capacity 50
		
		//3, LiskedList
		List<Integer>aList5=new LinkedList<>();		//capacity 10
//		List<Integer>aList6=new LinkedList<>(60);	  오류발생/초기 설정 시 오류 
		
		//컬렉션은 자동으로 방 크기가 설정된다.(무한정)
		//Arrays.asList( ) 을 사용해서 값을 놓을 경우 방크기가 고정된다.
		//고정된 값만 들어가야 할 경우 : 12달 요일 
		List<Integer> aList7=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8=Arrays.asList("월","화","수","목","금","토","일");
		
//		aList7.add(13);		// 값을 더 추가할 수 없다.
//		aList7.remove(0);	// 값을 제거 할 수 없다.
			//수정은 가능
		aList7.set(1, 7);
		
		try {
			aList8.add("오늘");
		}catch(UnsupportedOperationException e){
			System.out.println("값을 추가할 수 없음");
		}
		try {
		aList8.remove(0);
		}catch(UnsupportedOperationException e) {
			System.out.println("방의 값을 제거 할 수 없음");
		}
		System.out.println(aList7);
		
		//수정 가능
		aList8.set(4, "오늘");
		System.out.println(aList8);
		
		
		
		
		
		
		
	}
}
