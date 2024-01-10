package day0110;

import java.util.Arrays;

public class ArrJungbokSort_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] lotto=new int[6];
		
		//임의의 수(랜덤수)를 로또변수에 발생시켜서 넣어준다
		for(int i=0;i<lotto.length;i++)
		{
			//1~45까지의 랜덤수 발생
			lotto[i]=(int)(Math.random()*45)+1; //실수를 정수로 형변환
			//중복처리 (기준데이타말고 비교하는 데이타에..)
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--; //반드시 빼주어야 같은 수(i=j)가 나온 데이타로 갈 수 있음
					break; //i++로 이동 -> 이것이 중복체크 로직이다.
				}
			}
			
		}
		
		//오름차순 정렬
		//Arrays.sort(lotto);
		
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++) //비교하는 데이타 j는 +1
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//출력
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		System.out.println();
	}

}
