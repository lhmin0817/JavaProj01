package chapter05.ex04;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열을 인풋 받는 변수 선언
		int[]arr1;	//배열 변수 선언
		int n;		//선택자 (1, 2, 3, 4,)번호를 인풋 받는 변수
		int idx;	//배열의 방의 크기를 스캐너로 인풋 받는 변수
		
		while (true) {
		System.out.println("======================================================================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력");
		System.out.println("4. 프로드램 종료");
		System.out.println("======================================================================");
		
		System.out.println("1 ~ 4번까지 번호를 입력하세요>>>>");
		n=sc.nextInt();
				
		if(n==1) {
			//1번 선택 시 출력하는 프로그램
			System.out.println("1번 선택 : 배열의 방의 크기를 적어주세요.");
			idx=sc.nextInt();			//배열의 방의 크기를 스캐너로 받아서 idx변수에 할당
			arr1 = new int[idx];		//arr1 배열변수의 방의 크기를 지정
			// 7의 배수, 8의 배수를 저장하는 프로그램 작성
			int i=-1;					//배열의 방번호를 지정하는 변수
			int a;						//7의 배수와 8의 배수를 저장하는 변수
			for(a=1; ; a++) {	// 조건을 생략하면 무한 루프
				if(a%7==0 || a%8==0) {	//7의 배수 이거나 8의 배수라면 
					i++;				//배열의 방의 번호증가는 값이 저장될때만 증가되어야 한다.
					arr1[i]=a;			//배열 방에 7의 배수와 8의 배수를 저장					 
				}
				if(i==idx-1) {			//i : 방 번호 / idx : 인풋받은 방 갯수
					break;
				}
			}
			System.out.println("인풋받은 방의 갯수 "+idx);
			System.out.println("마지막 방 번호"+i);
			System.out.println("마지막 방번에 들어간 값 " + a);
			//for 문을 사용해서 배열에(arr1)저장된 값을 출력
			
			System.out.println("1. 7의 배수, 8의 배수 출력 됨");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+", ");
			}
			System.out.println();
		}else if(n==2) {
			//2번 선택 시 출력하는 프로그램
			System.out.println("2번 선택 : 배열의 방의 크기를 적어주세요.");
			//2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는다.4의 배수는 빼고 저장 후 출력
			idx=sc.nextInt();			//배열 방의 크기 
			arr1 = new int[idx];
			//for문을 사용해서 1씩 증가 하는데 4의 배수는 배열에 넣지 않고 저장
			int i=-1;					//방 번호
			int a;						//값을 저장하는 변수
			for(a=0; ; a++) {
				if(a%4==0) {
					continue;			//continue를 만나면 아래 블락은 실행되지 않고 증가식으로 올라간다.
				}
				i++;
				arr1[i]=a;
				if(i==idx-1) {
					break;
				}
			}
			//for문을 사용해서 배열에 들어간 값을 출력
			System.out.println("2. 1씩 증가하는데 4의 배수는 출력 된지 않는다.");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+", ");
			}
			System.out.println();
			
		}else if(n==3) {
			//3번 선택 시 출력하는 프로그램
			
			System.out.println("3번 선택 : 방의 크기를 적어주세요.");
			idx =sc.nextInt();
			arr1 = new int[idx];
			//3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장 그중 6의 배수는 빼고 저장 후 출력"
			int i=0;					//방 번호
			int a;						//3의 배수만 저장하되 6의 배수는 저장하지 않도록
			//for 문을 사용해서 값을 저장
			for(a=1; ; a++) {
				if(a%3==0) {			//3의 배수이고
					if(a%6 !=0) {		//6의 배수가 아닐때					
						arr1[i]=a;	
						i++;
					}
				}
				if(i==idx){
					break;
				}
			}
			//for문을 사용해서 배열에 들어간 값을 출력
			System.out.println("3. 3배수의 값 중 6의 배수는 출력하지 않는다..");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+", ");
			}
			System.out.println();
			
		}else if(n==4) {
			//4번 선택 시 출력하는 프로그램
			System.out.println("4번 선택");
			break;
		}else {
			//위의 조건이 만족하지 못하였을 때 : 1 ~ 4 이외의 값이 들어 왔을 때
			System.err.println("1 ~ 4번 선택하시오");
		}
			
					
		}
		System.out.println("프로그램 종료");
		sc.close();
		
		
		
		
	}
}
