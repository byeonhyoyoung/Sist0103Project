package day0115;

import java.util.Scanner;

//throws-호출한 영역으로 예외처리를 던짐 //실행한 곳에서 처리하라고
//throw-강제로 예외를 발생시킬때  ==>차이 알아두기!
public class Throws_15 {

	//생성안하고 하기위해 static
	public static void scoreInput() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int score;
		
		//점수가 1~100사이가 아니면 익셉션을 강제발생 throw
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();
		
		if(score<0 || score>100)
		{
			throw new Exception("점수가 잘못 입력되었어요");
		}else {
			System.out.println("나의 점수는 "+score+"점 입니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			scoreInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("오류메세지: "+e.getMessage());
		} //모든 드라이버, class, 파일 찾을 때 try catch
		
		System.out.println("**정상종료**");
	}

}
