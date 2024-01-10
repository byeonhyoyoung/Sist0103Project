package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names= {"변효영","박민지","성수아","백수현","곽혜정","이예림","백순흠","김은규"};
		
		
		boolean flag;
		Scanner sc=new Scanner(System.in);
		String name;
		
		while(true)
		{
			System.out.println("검색할 이름");
			name=sc.nextLine();
			
			if(name.equalsIgnoreCase("q"))
			{
				System.out.println("종료합니다");
				break;
			}
			
			flag=false;
			
			for(int i=0;i<names.length;i++)
			{
				if(name.equals(names[i]))
				{
					flag=true;
					System.out.println(i+1+" 번째에서 검색됨");
				}
			}
			if(!flag) //flag==false
				System.out.println(names+"는 데이타에 없습니다");
		}
		
		
		
		
	}

}
