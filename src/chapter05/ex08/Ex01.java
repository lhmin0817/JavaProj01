package chapter05.ex08;

public class Ex01 {
	public static void main(String[] args) {
		//<문제>
		//	args : 합계40 77 99 100 200
		
		
		//합계 : 정수를 더한 값을 출력
		String s=args[0];
		int sum=0;
		for(int i=1; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.print(s+" : ");
		System.out.println(sum);
		/*
		String a=args[0];
		String b=args[1];
		String c=args[2];
		String d=args[3];
		String e=args[4];
		
		int f=Integer.parseInt(a);
		int g=Integer.parseInt(b);
		int h=Integer.parseInt(c);
		int i=Integer.parseInt(d);
		int j=Integer.parseInt(e);
		
		System.out.println("String a, b, c, d를 정수로 변환 후 합계");
		System.out.println(f+g+h+i+j);
		*/
		
		System.out.println("==========");
		
		System.out.println("합계 " + 1 + 2 + 3);		//합계 123
		System.out.println(1+2+3+"합계");				//6합계
		
		
		
	}
}
