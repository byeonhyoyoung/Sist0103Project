package day0110;

import java.util.Scanner;

public class ArraySearchNum_01 {

	public static void main(String[] args) {
		// 배열중에서 숫자 입력하여 찾기
		// 있는지 찾기, 없으면 없다고 표시 있으면 몇번째 있는지 출력
		// 0 입력시 종료
		
		int [] data= {3,11,19,23,37,44,56,69,89,102,133,237};

		boolean flag;
		Scanner sc=new Scanner(System.in);
		int su;
		
		while(true)
		{
			System.out.println("검색할 숫자 입력해주세요");
			su=sc.nextInt();
			
			//0입력시 종료
			if(su==0) {
				System.out.println("프로그램 종료!!!");
				break;
			}
				
			
			flag=false; //찾으면 true로 변경
			
			//값찾기
			for(int i=0;i<data.length;i++)
			{
				if(su==data[i])
				{
					flag=true;
					System.out.println(i+1+"번째 에서 검색");
				}
			}
			if(!flag) //flag==false
				System.out.println(su+"는 데이타에 없습니다");
		}
		
		
	}

}
