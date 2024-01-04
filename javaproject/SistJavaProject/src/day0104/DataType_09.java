package day0104;

public class DataType_09 {

	public static void main(String[] args) {
		// args이용한 연산
		
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		
		//계산
		int tot=java+jsp+spring;
		int count=3; //3과목 의미하는 변수
		
		double avg1=tot/count; //결과값은 무조건 int가 나옴!
		double avg2=(double)tot/count; //결과는 double
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		//printf를 이용해서
		System.out.printf("java=%d, jsp=%d, spring+%d\n",java,jsp,spring);
		System.out.println("총점="+tot);
		
		System.out.printf("평균=%.2f\n",avg1);
		
		

	}

}
