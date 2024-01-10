package day0110;

class Mart{
	
	private String sangpum;
	int su;
	int dan;
	static String SHOPNAME="롯데마트"; //롯데마트로 초기화 해놓음
	
	//sangpum은 메서드가 아니면 다른 클래스에서 접근 불가
	public void setSangpum(String sangpum)
	{
		this.sangpum=sangpum;
	}
	
	public String getSangpum()
	{
		return sangpum;
	}
	
	//su,dan은 private이 아니므로 다른클래스에서 생성시 변수접근 가능하다
	//static은 다른클래스에서 접근시 클래스명,변수몀으로 접근 가능하다
	
	/*생성 후 초기값준 후 출력하시오
	
	***롯데마트 입고물품***
	===================
	상품명:초코파이
	수량:10개
	가격:4500원
	-------------------
	상품명:엄마손파이
	수량:5개
	가격:2500원
	*/
}

public class QuizClass_16 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mart m1=new Mart();
		m1.setSangpum("초코파이");
		m1.su=10;
		m1.dan=4500;
		
		Mart m2=new Mart();
		m2.setSangpum("엄마손파이");
		m2.su=5;
		m2.dan=2500;
		
		System.out.println("**"+Mart.SHOPNAME+" 입고상품**");
		System.out.println("=======================");
		System.out.println("상품명: "+m1.getSangpum());
		System.out.println("수량: "+m1.su+"개");
		System.out.println("가격: "+m1.dan+"원");
		System.out.println("-----------------------");
		System.out.println("상품명: "+m2.getSangpum());
		System.out.println("수량: "+m2.su+"개");
		System.out.println("가격: "+m2.dan+"원");

	}

}
