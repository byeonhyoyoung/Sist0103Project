package day0105;

public class book123_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade="B";
		
		int score1=0;
		switch(grade) {
			case "A":
			  score1=100;
			  break;
			case "B":
			  int result=100-20;
			  score1=result;
			  break;
			default:
			  score1=60;
		}
		System.out.println("score1: "+score1);
	}
}
		
