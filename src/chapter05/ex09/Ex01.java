package chapter05.ex09;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		/*
				국어	영어	수학 과학			국어	영어	수학	과학			국어	영어	수학	과학			국어	영어	수학	과학
		홍길동	70	88	77	99	 이순신	80	68	87	79	  김똘똘	60	86	87	30	  홍길순	77	56	80	99
		
		메인 메소드 args로 아래와 같은 값이 인풋 되었을 경우 <출력> 과 갗이 출력해보세여
		args: 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99 
		
		<for>문을 사용해서 출력하세요>
		
		<출력>
					국어			영어			수학			과학			<합계>			<평균>
		=================================================================================
		홍길동		70			88			77			99
		이순신		80			68			87			79		
		김똘똘		60			86			87			30
		홍길순		77			56			80			99
		=================================================================================
		<합계>
		<평균>		
		*/
		
		
		String[][] arra = new String[4][5];
		int[]sum=new int[4];
		double[]vag=new double[4];
		
		for(int i=0; i<arra.length; i++) {
			for(int j=0; j<arra[i].length; j++) {
				arra[i][j]=args[j+(i*5)];
			}
		}
		for(int i=0; i<arra.length; i++) {
			for(int j=1; j<arra[i].length; j++) {
				sum[i] += Integer.parseInt(arra[i][j]);
			}
			for(double k=0; k<sum.length; k++) {
				vag[i] = (sum[i]/4.);
			}
		}
		
		int a=0;
		int b=0;
		
		
		System.out.println("  이름  국어  영어  수학  과학  합계  평균");
		System.out.println("===================================");
		for(String[] k : arra) {
			System.out.print(Arrays.toString(k));
			System.out.println("\t"+sum[a] + "   "+vag[b]);
			a++; b++;
		}
		System.out.println("===================================");
		System.out.println("합계 : "+(sum[0]+sum[1]+sum[2]+sum[3])+ " 점");
		System.out.println("평균 : "+(vag[0]+vag[1]+vag[2]+vag[3])/4 + "점");
		
		
		
		
		
		
		
		
		
		
		
		/*String s1=args[0];
		String s2=args[5];
		String s3=args[10];
		String s4=args[15];
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		
		int vag=0;
		int vag1=0;
		int vag2=0;
		int vag3=0;
		int vag4=0;
		
		for(int i=1; i<5; i++) {
			sum1 += Integer.parseInt(args[i]);
		}
		for(int i=6; i<10; i++) {
			sum2 += Integer.parseInt(args[i]);
		}
		for(int i=11; i<15; i++) {
			sum3 += Integer.parseInt(args[i]);
		}
		for(int i=16; i<20; i++) {
			sum4 += Integer.parseInt(args[i]);
		}
		
		
		
		
		System.out.print(s1+" : ");
		System.out.println(sum1);
		System.out.print(s2+" : ");
		System.out.println(sum2);
		System.out.print(s3+" : ");
		System.out.println(sum3);
		System.out.print(s4+" : ");
		System.out.println(sum4);
		*/
		
		
	}
}
