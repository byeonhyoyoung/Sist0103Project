package day0112;

/*
 * **디폴트 생성자로 생성**
 * 회사명:현대
 * 종류:전기차
 * 자동차명:아이오닉5
 * 색상:블랙
 * 가격:35000000원
 * 
 * **명시적 생성자로 생성**
 * 회사명:기아
 * 종류:가솔린
 * 자동차명:코나
 * 색상:화이트
 * 가격:25000000원 
 */


//부모클래스
class Car{
	
	private String carCompany; //제조회사
	private String carKind; //종류
	
	//디폴트생성자
	public Car() {
		carCompany="현대";
		carKind="전기차";
	}
	//명시적생성자
	public Car(String comp,String kind) {
		
		this.carCompany=comp;
		this.carKind=carKind;
	}
	
}
//////////////////////
//자식클래스
class myCar{
	private String carName;
	private String carColor;
	private int carPrice; 
	
	public MyCar() {
		super();
		carName="아이오닉5";
	}
	public MyCar(String company,String kind,String name,String color,int price) {
		super(company, kind);
		this.carName=name;
		this.carColor=color;
		this.carPrice=price;
	}
}

public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//생성하는 것이 가장 중요!!!
		System.out.println("**디폴트 생성자로 생성**");
		MyCar car1=new MyCar();
		car1.setCarColor("블랙");
		car1.setCarPrice(35000000);
		car1.writeCar();
		
		System.out.println("**명시적 생성자로 생성**");
		MyCar car2=new MyCar("기아", "가솔린", "코나", "화이트", 25000000);
		car2.writeCar();
		
		System.out.println(("**부모 메서드 출력**"));
		Car c1=new Car();
		c1.writeCar();
	}
	

}
