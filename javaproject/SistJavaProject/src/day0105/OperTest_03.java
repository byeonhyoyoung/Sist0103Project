package day0105;

public class OperTest_03 {

	public static void main(String[] args) {
		// 증감연산자 ++,--
		
		int a,b;
		a=b=5;
		
		//단항(수식이아닌것)일 경우에는 증감연산자를 앞에붙히나 뒤에붙히나 같다
		++a; //전치
		b++; //후치
		
		System.out.println("a="+a+", b="+b);

		//수식에서는 전치,후치가 결과값이 틀리다
		int m,n;
		m=n=0;
		a=b=5; //재선언 가능
		
		m=a++; //후치일 경우 먼저 대입후 증가
		System.out.println("m="+m+", a="+a);
		
		n=++b; //전치일 경우에는 먼저 증가후 대입
		System.out.println("n="+n+", b="+b);
		
		
		
	}

}
