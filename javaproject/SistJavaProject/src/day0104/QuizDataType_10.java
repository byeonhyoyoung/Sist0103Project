package day0104;

public class QuizDataType_10 {

	public static void main(String[] args) {
		// 변수는 args를 이용할것(변수는 5개 0~4까지임.. 변수명은 어울리게 알아서)
		/*
		 * 학생명: 김선호 님
		 * 지역: 부산
		 * 나이: 23세
		 * 
		 * ============================================
		 * 김선호님의 자바점수는 88점 오라클점수는 77점 총 165점입니다
		 * 
		 * */
		//1.변수선언..실행단계에서 문자열을 읽어서 변수에 저장
		
		String name=args[0];
		String area=args[1];
		int age=Integer.parseInt(args[2]);
		//String age=args[2]; 가능
		int java=Integer.parseInt(args[3]);
		int oracle=Integer.parseInt(args[4]);
		
		
		//2.계산
		int tot=java+oracle;
		
		
		//3.출력
		System.out.println("학생명: "+name+ "님");
		System.out.println("지역: "+area);
		System.out.println("나이: "+age+ "세");
		System.out.printf("%s님의 자바점수는 %d점 오라클점수는 %d점 총 %d점입니다",name,java,oracle,java+oracle);
		//System.out.println("김선호님의 자바점수는 "+java+"점 오라클점수는 "+oracle+"점 총"+tot+"점 입니다");
		
		

		

	}

}
