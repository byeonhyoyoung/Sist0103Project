package day0111;

class Shop{
	private String sangpum;
	private int price;
	private String sangColor;
	
	public Shop(String s, int p, String c) {
		sangpum = s;
		price = p;
		sangColor = c;
	}
	
	public void setMember(String sangpum,int price,String sangColor)
	{
		this.setSangpum(sangpum);
		setPrice(price);
		this.setSangColor(sangColor);
	}
	
	
	//setter, getter
	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSangColor() {
		return sangColor;
	}

	public void setSangColor(String sangColor) {
		this.sangColor = sangColor;
	}


	
	//3개의 멤버변수 출력을 한꺼번에 문자열로 리턴
	public String getMembers() //->무조건 return 해줘야함
	{
		String s="상품명: "+sangpum+"\n가격: "+price+"\n색상: "+sangColor;
		
		return s;
	}
	
	
	//제목
	public static void showTitle()
	{
		System.out.println("상품명\t가격\t색상");
		System.out.println("==========================");
	}
	//생성한 갯수만큼 출력
	public void showShop()
	{
		System.out.println(sangpum+"\t"+price+"원\t"+sangColor);
	}
}

public class ArrObTest_11 {

	public static void main(String[] args) {
		// 배열로 4개 생성해서 출력할것
		Shop []shop=new Shop[4]; //null로 초기화 주소값 할당
		//shop[0].showShop();
		
		//4개의 shop 배열에 생성자를 통해서 생성
		shop[0]=new Shop("코트", 400000, "brown");
		shop[1]=new Shop("스커트", 100000, "red");
		shop[2]=new Shop("모자", 50000, "black");
		shop[3]=new Shop("가방", 100000, "navy");

		//출력
		Shop.showTitle();
		for(Shop s:shop)
			s.showShop();
		System.out.println("======================");
		
		
	
	}	
		

}


