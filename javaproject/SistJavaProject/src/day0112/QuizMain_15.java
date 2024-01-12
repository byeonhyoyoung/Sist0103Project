package day0112;

class Quiz {
	
	private String qName;
	private int qJave;
	private int qOracle;
	private int qHtml;
	private int qScore;
	private int qAverage;
	private String qAppraisal;
	
	private static int no;
	static String hagwonName="쌍용";
	
	//명시적생성자
	public Quiz(String name,int java,int oracle,int html,int score, int average,String appraisal) 
	{
		this.qName=name;
		this.qJave=java;
		this.qOracle=oracle;
		this.qHtml=html;
		this.qScore=score;
		this.qAverage=average;
		this.qAppraisal=appraisal;
	}
	public static void showTitle()
	{
		System.out.println("["+hagwonName+"교육센터]");
		System.out.println();
		System.out.println("이름\tJAVA\tORACLE\tHTML\t총점\t평균\t평가");
		System.out.println("================================");
	}


public class QuizMain_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quiz [] quiz= {
				new Quiz("홍현희", 25000, "pink"),
				new Quiz("아령", 18000, "black"),
		};
	
}
