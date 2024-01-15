package day0115;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListEx_07 {

	public static void main(String[] args) {
		// 1.순차적으로 데이타 들어간다
		// 2.중복데이타도 허용한다
		// 3.처음생성시 일정한 갯수로 생성되는데 그 이상의 데이타를 넣으면 자동으로 공간이 늘어난다
		
		//List는 인터페이스
		//List<String> list=new Vector<String>(); //List로 많이 쓰임?
		Vector<String> list=new Vector<String>();
		//생성자가 디폴트인경우 기본 할당크기 10
		System.out.println("초기데이타갯수: "+list.size());
		System.out.println("초기할당크기: "+list.capacity());
		
		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");
		list.add("안개꽃");
		list.add("장미");
		list.add("프리지아");
		list.add("안개꽃");
		list.add("장미");
		list.add("프리지아");
		list.add("안개꽃");
		list.add("장미");
		
		System.out.println("초기데이타갯수: "+list.size());
		System.out.println("초기할당크기: "+list.capacity()); //늘어나는게 배열과의 차이점
		
		System.out.println("출력_#1");
		for(int i=0;i<list.size();i++)
		{
			//list.get(i); //반환형이 String
			String s=list.get(i);
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("출력_#2");
		for(String s:list)
			System.out.print(s+" ");
		System.out.println();
		
		System.out.println("출력_#3");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
			System.out.print(iter.next()+" ");
		System.out.println();
		
		System.out.println("출력_#4");
		
		Object [] ob=list.toArray();
		for(int i=0;i<ob.length;i++)
		{
			String s=(String)ob[i];
			System.out.print(s+" ");
		}
		
	}

}
