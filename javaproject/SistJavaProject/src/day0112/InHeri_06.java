package day0112;
/*
 * 단가: 10000
 * 상품명: 딸기
 * 수량: 10

 * 단가: 25000
 * 상품명: 수박
 * 수량: 5
 */

import java.awt.event.KeyAdapter;

class Emart{
	
	private String sangpum;
	private int su;
	
	public Emart() {
		//sangpum="딸기";
		//su=10;
		this("딸기", 10); //<-이와같이 초기화 호출해서 넣어주는 방법도 있다
	}
	
	public Emart(String sangpum,int su) {
		this.sangpum=sangpum;
		this.su=su;
	}
	
	public void writeMart()
	{
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su);
	}
}
/////////////////
class KangnamEmart extends Emart{
	
	private int price;
	
	KangnamEmart() {
		price=10000;
	}
	KangnamEmart(String sanString,int su,int price) {
		super(sanString,su);
	}
	
	//재정의
	@Override
	public void writeMart() {
		// TODO Auto-generated method stub
		System.out.println("단가: "+price);
		super.writeMart();
	}
}
///////////////////////
public class InHeri_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KangnamEmart kang1=new KangnamEmart();
		kang1.writeMart();
		
		System.out.println();
		
		KangnamEmart kang2=new KangnamEmart("수박", 5, 25000);
		kang2.writeMart();
		
	}

}
