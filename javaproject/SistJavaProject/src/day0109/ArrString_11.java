package day0109;

public class ArrString_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 배열
		String [] str1= {"텀블러","키보드","핸드크림","칫솔","우산"};
		String [] strColors= {"red","pink","blue","yellow","gray","white"};
		
		//str1은 1번째: 텀블러
		System.out.println("str1_출력1_for");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println((i+1)+"번째: "+str1[i]);
		}
		
		System.out.println("===================");
		System.out.println("str1+출력2_foreach");
		for(String al:str1)
		{
			System.out.println(al);
		}
		
		
		//strColors 0번지 색: red
		System.out.println("===================");
		System.out.println("strColors_출력1_for");
		for(int i=0;i<strColors.length;i++)
		{
			System.out.println(i+"번지색 : "+strColors[i]);
		}
		
		System.out.println("===================");
		System.out.println("strColors_출력1_foreach");
		for(String cols:strColors)
		{
			System.out.println(cols);
		}
		
	}

}
