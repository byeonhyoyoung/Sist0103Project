package day0104;

import java.util.Scanner;

public class KeyBoardin_14 {

	public static void main(String[] args) {
		// 키보드 입력에 필요한 Scanner 클래스를 import
		//1.inport
		Scanner sc=new Scanner(System.in); //생성
		
		//2.변수선언
		String name;
		int age;
		
		//3.입력
		System.out.print("이름을 입력해보세요==>");
		name=sc.nextLine();
		
		System.out.print("나이를 입력하세요==>");
		//age=sc.nextInt(); //숫자로 읽어온다
		//숫자입력후 엔터누르며 그엔터가 키보드 버퍼로 저장되어 다음문자열 읽을때 먼저 읽어버리는 현상발생
		//그래서 다음문자열 읽기전에 그엔터읽어 없애기...sc.nextLine()
		age=Integer.parseInt(sc.nextLine());
		
		System.out.println("당신이 사는 지역은?");
		String city=sc.nextLine();
		
		//4.최종출력
		System.out.println(name+"님의 나이는 "+age+"세 이고"+city+"지역에 살아요~~");
	
		
	}

}
