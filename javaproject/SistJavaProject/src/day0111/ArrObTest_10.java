package day0111;

class Student1{
	
	private String stuName;
	private String hp;
	private int score;
	
	//생성자 3개짜리
	public Student1(String name,String hp,int score) {
		this.stuName=name;
		this.hp=hp;
		this.score=score;
	}
	
	//출력메서드
	public void writeData()
	{
		System.out.println("이름: "+stuName);
		System.out.println("전화번호: "+hp);
		System.out.println("점수: "+score);
	}
}

public class ArrObTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열변수 선언...초기화
		/*Student1 [] stu=new Student1[3];
		
		stu[0]=new Student1("이민호", "010-111-2222", 88);
		stu[1]=new Student1("이영자", "010-333-4444", 77);
		stu[2]=new Student1("김민정", "010-666-7777", 98);*/
		
		//생성과 동시에 초기화
		Student1 [] stu= {
				new Student1("이민호", "010-111-2222", 88),
				new Student1("이영자", "010-333-4444", 77),
				new Student1("김민정", "010-666-7777", 98)
		};
		
		//배열출력(방법#1)
		for(int i=0;i<stu.length;i++)
		{
			/*Student1 s=stu[i];
			s.writeData();*/
			stu[i].writeData();
			System.out.println("---------------------");
		}
		
		//배열출력(방법#2)
		System.out.println("============================");
		for(Student1 s1:stu)
		{
			s1.writeData();
			System.out.println("=============================");
		}
		
	}

}
