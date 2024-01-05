package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_08 {

	public static void main(String[] args) {
		/*
		 * 당신의 이름은?==>변효영
		 * 당신이 태어난 연도는==>1992
		 * 당신이 사는 지역은?==>경기
		 * 
		 * ==========================
		 * [변효영 님의 개인정보]
		 * ==========================
		 * 이름: 변효영
		 * 태어난년도: 1992
		 * 나이: 31세
		 * 지역: 경기
		 * 
		 */
		
		//1.임포드
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		//2.변수
		String name,addr;
				
		//3.입력
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
		
		System.out.println("당신이 태어난 연도는");
		//year=sc.nextInt();
		int year=Integer.parseInt(sc.nextLine());
		//Integer.parseInt("1992")
		
		System.out.println("당신이 사는 지역은?");
		addr=sc.nextLine();
		
		//4.계산
		
		//5.결과출력
		System.out.println("==================");
		System.out.println("["+name+"님의 개인정보]");
		System.out.println("==================");
		System.out.println("이름: "+name);
		System.out.println("태어난년도: "+year);
		int age=cal.get(Calendar.YEAR)-year;
		System.out.println("나이: "+age);
		System.out.println("지역: "+addr);

	}

}
