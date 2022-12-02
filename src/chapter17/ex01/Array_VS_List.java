package chapter17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//배열과 컬렉션의 차이점
// 1. 배열 : 동일한 타입을 저장
//			방의 크기가 고정(방의 크리글 수정이 불가능)

//2. 컬렉션 : 동일한 타입을 저장
// 			모든 컬렉션은 제너릭 타입으로 저장 객체를 생성 시에 타입을 지정해서 저장
// 			방의 크기가 고정되어 있지 않다. 자동으로 크기가 조절


public class Array_VS_List {
	public static void main(String[] args) {
		
		//배열 
		String[]arr=new String[] {"가","나","다","라","마","바","사"};
			//배열 방의 크기 출력
		System.out.println(arr.length);
		//배열의 방의 값을 삭제 시 자동으로 방의 크기가 줄어들지 않느다. 비어둠
		arr[2]=null;
		arr[5]=null;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		
		System.out.println();
		System.out.println("===============================");
		
		//컬렉션 (List) <== arrayList
		
		// List : Interface 객체화 할 수 없다. 타입으론 지정가능
			// ArrayList<>, Vector<>, LinkedList<>
		List<String>aList=new ArrayList<>();
		
		//List의 방의 크기를 알려주는 메소드 : aList.size();
		System.out.println(aList.size());
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라");
		aList.add("마"); aList.add("바"); aList.add("사");
		
		System.out.println(aList.size());
		
		//방의 값을 출력하기
		//모든 컬렉션은 객체 자체를 출력 시 Object 클래스의 toString()이 재정의 되어있다.
		System.out.println(aList);
		System.out.println(aList.toString());
		
		//컬렉션의 값을 삭제. remove()
		
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList);
		System.out.println(aList.size());
		
		
		
		
	}
}
