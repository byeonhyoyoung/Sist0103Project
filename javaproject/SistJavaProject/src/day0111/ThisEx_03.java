package day0111;

//1.this: 객체생성후 메모리에 생성된 자기자신의 인스턴스를 의미
//인스턴스 변수와 로컬 변수명이 동일한 경우에 this.인스턴스명수명
//2.생성자에서 다른오버로딩생성자를 호출하는 경우..this():반드시 생성자의 첫라인
class Test{
	
	private String name;
	private int grade;
	
	//생성자
	
	public Test(String name) {
		this(name,4);
	}
	
	public Test(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}

	//getter메서드
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}
	
	
}
/////////////////////
public class ThisEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test("홍길동");
		System.out.println("Name: " + t1.getName() + ", Grade: " + t1.getGrade());
	}

}
