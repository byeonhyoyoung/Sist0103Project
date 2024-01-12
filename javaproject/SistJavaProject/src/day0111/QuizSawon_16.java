package day0111;

/*
 * [쌍용_1월 급여내역]
 * 사원명   기본급      수당     실수령액(mathod)
 * ==========================================
 * 손흥민  2500000   500000     2700000
 * 황희찬  1500000   500000     1800000
 */

class Sawon2{
	
	private String name;
	private int basepay;
	private int pluspay;
	private int realpay;
	
	
	public Sawon2(String name,int basepay,int pluspay,int realpay) {
		this.name=name;
		this.basepay=basepay;
		this.pluspay=pluspay;
		this.realpay=realpay;
	}
	public static void showTitle()
	{
		System.out.println("사원명\t기본급\t수당\t실수령액");
		System.out.println("------------------------");
	}
	
	public void showInfo()
	{
		System.out.println(name+"\t"+basepay+"\t"+pluspay+"\t"+realpay);
	}
}

public class QuizSawon_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sawon2 [] Sawon2= {
				
				new Sawon2("손흥민", 2500000, 500000, 2700000),
				new Sawon2("황희찬", 1500000, 500000, 1800000),
		};
		
		/*Sawon2.showTitle();
		for(Sawon2 info : sawonArray)
			info.showInfo();*/
		
	}

}
