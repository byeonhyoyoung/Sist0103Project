package day0108;

import java.util.Scanner;

public class Other_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//quiz_1();
		quiz_2();
	}
	public static void quiz_1() {
		Scanner sc=new Scanner(System.in);
		int su;
		int pcnt=0,ncnt=0;
		
		while(true)
		{
			System.out.println("숫자입력");
			su=sc.nextInt();
			
			if(su==0)
				break;
			if(su>0)
				pcnt++;
			else
				ncnt++;
		}
		System.out.println("양수의 갯수 "+pcnt);
		System.out.println("음수의 갯수 "+ncnt);
	}
		

	
	public static void quiz_2() {
		
		Scanner sc=new Scanner(System.in);
		int su;
		int cnt=0,sum=0;
		double avg;
		
		while(true)
		{
			System.out.println("점수입력");
			su=sc.nextInt();
			
			if(su==0)
				break;
			
			if(su<1||su>100)
			{
				System.out.println("\t다시입력바람");
				continue;
			}
			
			cnt++;
			sum+=su;
		}
		
		avg=(double)sum/cnt;

		System.out.println("총갯수: "+cnt+" 개");
		System.out.println("총점: "+sum+" 점");
		System.out.println("평균: "+avg+" 점");
	}
	}


