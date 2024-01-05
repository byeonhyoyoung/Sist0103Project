package day0105;

import java.util.Scanner;

public class QuizOper_19 {

	public static void main(String[] args) {
		/*
		 * (평가는 90점 이상은 참잘함!! 80점 이상은 좀더 노력하세요~~ 80점 미만은 불합격)
		 * 이름을 입력하세요
		 * 손흥민
		 * 국,영,수 점수를 입력하세요
		 * 88
		 * 99
		 * 77
		 * 
		 * ======================
		 * [손흥민 님의 기말고사 성적]
		 * 총점: ** 점
		 * 평균: **.*점
		 * 평가: 좀 더 노력하세요~~~
		 */

		Scanner sc=new Scanner(System.in);
		String name,p_msg;
		int score;
		
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("국,영,수 점수를 입력하세요");
		name=sc.nextLine();
		
		if(score>=90)
			p_msg="참잘함!!";
		else if(score>=80)
			p_msg="좀더 노력하세요~~";
		else
			p_msg="불합격";
		
		//p_msg=score>=90?"참잘함":score>=80?"좀더노력하세요":score<80?"불합격";
		
		System.out.println("==================");
		System.out.println("[손흥민 님의 기말고사 성적]");
		System.out.println("");
			
	}

}
