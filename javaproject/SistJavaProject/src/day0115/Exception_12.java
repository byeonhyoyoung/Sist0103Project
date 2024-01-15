package day0115;

public class Exception_12 {

	public static void main(String[] args) {
		// 에러보다 약한것이 예외
		// 진행시킬 때 try catch 처리
		System.out.println("프로그램시작");
		try { //예외발생코드넣기
			int num=3/0; //정수를 0으로 나누면 나오는 에러(ArithmeticException)
		} catch (ArithmeticException e) {
			//예외처리코드넣기
			//e.printStackTrace(); //자세한 예외정보가 무엇인지 출력
			//e.getMessage();
			
		}
		System.out.println("프로그램종료");
	}

}
