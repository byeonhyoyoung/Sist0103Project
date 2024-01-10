package day0109;

import java.util.Scanner;

public class QuizInOutRank_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name= {"홍수연","김수연","최수연","민수연"};
		int [] kor= {90,88,100,78};
		int [] eng= {100,76,56,71};
		int [] mat= {93,85,99,56};
		
		int [] tot=new int[4];
		double [] avg=new double[4];
		int [] rank=new int[4];
		
		/*
		 *  1:1 카톡으로 콘솔창 결과물만 보내기
		 * 
		 * 각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하세요
		 * 
		 * 번호  이름  국어  영어  수학  총점  평균  등수
		 * =====================================
		 *  1  홍수연  90  100  44   **   **   4
		 */
		
		//1. 총점 평균 ..배열로
		
		//등수
		
		//출력
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		//인원수만큼 데이타 입력
		for(int i=0;i<4;i++)
		{
			//System.out.println(name[i]+"번지 이름");
			//총점
			tot[i]+=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/4;
			rank[i]=1;
			
		} 
		
		//평균
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("============================================================");
		
		
		//등수 구하기(비교하려면 다중 for문으로)
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				//비교되는 대상이 점수가 더 높으면 i번지의 등수를 1증가시킨다
				if(avg[i]<avg[j])
					rank[i]++;
				
				
			}
			System.out.println(i+1+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
		}
		
		//계산
		
		System.out.println("============================================================");
		}
		
	

}
