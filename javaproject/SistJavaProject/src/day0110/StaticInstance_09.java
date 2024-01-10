package day0110;

//static변수는 메모리에 한번 할당되면 프로그램이 종료될때 해제되는 변수
//메모리에 한번 할당이므로 여러객체가 해당메모리를 공유할 수 있다..메모리 효율이 좋아짐(조회수증가 static 많이 사용)

public class StaticInstance_09 {
	
	static int count=0;
	
	//생성자
	public StaticInstance_09() {
		// ()넘겨주는것이 아무것도 없는=default 생성자
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체변수는 항상 독립적이므로 count는 서로 다른 메모리를 가지므로 증가하지 않는다
		//static은 공유하므로 증가함
		StaticInstance_09 s1=new StaticInstance_09();
		StaticInstance_09 s2=new StaticInstance_09(); //권장x instance변수와 헷갈림
		

	}

}
