package day0111;

/*
 *  이름   MBTI  나이
 * ================
 * 이효리  ENTP  26세
 * 이상순  ISFJ  33세
 * 이영자  ENFJ  28세
 */

class MyInfo{
	
	private String name;
	private String mbti;
	private int age;
	
	public MyInfo(String name,String mbti,int age) {
		this.name=name;
		this.mbti=mbti;
		this.age=age;
	}
	public static void showTitle()
	{
		System.out.println("이름\tMBTI\t나이");
		System.out.println("------------------------");
	}
	
	public void showInfo()
	{
		System.out.println(name+"\t"+mbti+"\t"+age+"세");
	}
}


//////////////////////////
public class QuizArrObTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInfo [] myInfo= {
	
				new MyInfo("이효리", "ENTP", 26),
				new MyInfo("이상순", "ISFJ", 33),
				new MyInfo("김상진", "ENFJ", 28)
		};
		
		MyInfo.showTitle();
		for(MyInfo info:myInfo)
			info.showInfo();
	
	}

}
