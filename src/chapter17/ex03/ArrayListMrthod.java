package chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMrthod {
	public static void main(String[] args) {
		
		List<Integer>aList1 = new ArrayList();
		
		//1. add (E element) : List에 값을 추가할 때 사용 | ArrayList, Vectory, LinkedList
			// 마지막 방에 값이 들어감.
		aList1.add(3);
		aList1.add(5);
		aList1.add(6);
		
		System.out.println(aList1);
		
		//2. add(int index, E element) : 특정 방번호에 값을 추가
		aList1.add(1, 4);
		System.out.println(aList1);
		
		//3. addAll(다른 리스트 객체) : 다른 컬렉션의 모든 내용을 합해서 출력
		List<Integer> aList2=new ArrayList();
		aList2.add(1); aList2.add(2);
		System.out.println(aList2);
		
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		//4. addAll(int index, 또 다른 리스트 객체)
		List<Integer>aList3=new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		System.out.println(aList3);
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		
		//5. set(int index, E element): 기존의 방의 값을 수정
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println(aList3);
		
		//6. remove(int index) : 특정 방번호의 값을 삭제
		aList3.remove(1);
		System.out.println(aList3);
		
		//7. remove(Object o) 방의 들어간 값으로 삭제
		aList3.remove(new Integer(2));	//오류가 아닌 경고
		System.out.println(aList3);
		
		
		//8. clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : 값이 없으면 true 값이 있으면 false
		System.out.println(aList3.isEmpty());
		
		//10. size() : 방갯수
		System.out.println(aList3.size());
		aList3.add(1);aList3.add(2);aList3.add(3);aList3.add(4);
		System.out.println(aList3.size());
		
		
		//11.get(int index) : 방번호의 값을가지고 올때 
		System.out.println("0번쨰 : "+aList3.get(0));
		System.out.println("1번쨰 : "+aList3.get(1));
		System.out.println("2번쨰 : "+aList3.get(2));
		System.out.println("3번쨰 : "+aList3.get(3));
		
		//12. toArray() : List ==> Array(배열로 변환)
		Object[]obj=aList3.toArray();
		System.out.println(Arrays.toString(obj));
		
			
		//13. to Array(T[] t) ==> T[]		리스트 ==> 배열  
		Integer[]int1=aList3.toArray(new Integer[0]);	
		//0 : 변환할 배열방의 갯수, 컬렉션의 배여 방보다 작게 설정된 경우 컬레션에 저장된 것에 맞춰서처리
 
		System.out.println(Arrays.toString(int1));
		
		Integer[]int2=aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(int2));
		
		
		
		
		
	}
}
