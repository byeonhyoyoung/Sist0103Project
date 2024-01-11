package day0111;

//객체의 속성: 인스턴스 변수로 표현  객체의 동작: 클래스의 메서드
//Object: 객체,실제로 존재하는 사물(핸드폰,자동차....)
//class: 객체를 정의해놓은 것,객체를 생성하기 위해 존재(설계도...붕어빵틀)
//Instance: 클래스에서 만들어진 객체를 그 클래스의 인스턴스(하나로 연결됨)

class person{
	private String name;
	private int age;
	private String hp;
	private String addr;
	
	//set 수정이 목적 (수정만 하므로 결과값 필요없음 void)
	//get 결과값 return을 받아야함 문자형string 정수int 실수double
	
	
	//class명과 동일하게
	public person() {
		
	}
	//명시적생성자
	public person(String name,int age,String addr,String hp) {
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.hp=hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

//setter getter
public class ObjectReview_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		//p1.name="홍길동"; private인스턴스 변수는 생성을 해도 변수에 접근안됨
		p1.setName("김민지");
		p1.setAddr("강남구");
		p1.setAge(22);
		p1.setHp("010-111-2222");
		
		String name=p1.getName();
		int age=p1.getAge();
		String addr=p1.getAddr();
		String hp=p1.getHp();
		
		System.out.println("[개인신상정보]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(hp);
		
		person p2=new person("김소미", 22, "서울시", "010-111-3333");
		
		System.out.println("---------------------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println(p2.getHp());
		
		
	}

}
