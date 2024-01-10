package day0109;

import java.util.Scanner;

public class Book175_14 {

	public static void main(String[] args) {
		/*
		// 배열 변수 선언과 배열 대입
		int[] scores = { 84, 90, 96 };
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);
		
		//배열 항목의 평균 구하기
		int avg = (int) sum / scores.length;
		System.out.println("평균: "+avg);
		*/
		
		//↑book==========================================
		//학생명과 점수를 입력_몇명인지는 입력해 주는 만큼
		//등수를 구한다
		//입력해준 데이타로 등수도 출력을 하고 합계, 평균도 구해보자
		
		int inwon;
		String [] name;
		int [] score;
		int [] rank; //등수
		
		int tot=0;
		double avg=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("인원수를 입력하시오");
		inwon=Integer.parseInt(sc.nextLine()); //"3"==>3
		
		//인원수만큼 배열로 할당
		name=new String[inwon];
		score=new int[inwon];
		rank=new int[inwon];
		
		//인원수만큼 데이타 입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+"번지 이름");
			name[i]=sc.nextLine();
			System.out.println(i+"번지 점수");
			score[i]=Integer.parseInt(sc.nextLine()); //"88"==>88
			
			//총점
			tot+=score[i];
		}
		
		//등수 구하기(비교하려면 다중 for문으로)
		for(int i=0;i<inwon;i++)
		{
			rank[i]=1;
			
			for(int j=0;j<inwon;j++)
			{
				//비교되는 대상이 점수가 더 높으면 i번지의 등수를 1증가시킨다
				if(score[i]<score[j])
					rank[i]++;
				
			}
			
		}
		
		//계산
		avg=(double)tot/inwon;
		
		//출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("============================");
		
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
			
		}
		System.out.println("----------------------------");
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
	}

}
