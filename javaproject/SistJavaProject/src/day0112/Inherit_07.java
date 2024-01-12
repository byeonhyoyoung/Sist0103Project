package day0112;

import day0110.Student;

class School{
	
	public static final String SCHOOLNAME="쌍용고등학교"; //final을 써야 상수 - 못바꿈?
	private String schoolAddr;
	private int countStu;
	private int conntTeacher;
	
	public School() {
		this("강남구 역삼동", 120, 10)
	}
	public School(String saddr,int cntstu,int cntteacher) {
		this.schoolAddr=saddr;
		this.countStu=cntstu;
		this.conntTeacher=cntteacher;
	}
	
	//setter&getter
	public String getSchoolAddr() {
		return schoolAddr;
	}
	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}
	public int getCountStu() {
		return countStu;
	}
	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}
	public int getConntTeacher() {
		return conntTeacher;
	}
	public void setConntTeacher(int conntTeacher) {
		this.conntTeacher = conntTeacher;
	}
	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	//메서드
	public void writeData()
	{
		System.out.println("학교주소: "+this.schoolAddr);
		System.out.println("학생수: "+this.countStu+", 선생님수: "+this.conntTeacher);
	}
	
}
/////////////////////////////자식클래스

class student extends School {
	private String stuName;
	private int grade;
	
	public public student() {
		// TODO Auto-generated constructor stub
	}
	public public student() {
		// TODO Auto-generated constructor stub
	}
	
	
	//각각의 setter, getter

	//재정의메서드
		
	
}

	

////////////////////////
public class Inherit_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.writeData();
		System.out.println();
		
		Student s2=new student()
	
		

	}

}
