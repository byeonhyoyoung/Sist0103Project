package day0109;

public class SrtingEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체에 대한 멤버 메서드 익혀보기");
		
		String str1="apple";
		String str2="Apple";
		String str3="Have a Nice Day";
		String str4="    Today now    ";
		
		System.out.println("str의 길이:"+str3.length());
		System.out.println("str의 길이:"+str4.length());
		
		System.out.println("앞뒤 공백 제거후 str4의 길이: "+str4.trim().length()); //앞뒤 공백만 제거됨
		System.out.println("*"+str4+"*");
		System.out.println("*"+str4.trim()+"*"); //trim() 공백제거
		
		System.out.println("str3에서 0번 문자:"+str3.charAt(0));
		System.out.println("str3에서 0번 문자:"+str3.charAt(7));
		
		System.out.println("str3의 H의 인덱스: "+str3.indexOf("H"));
		System.out.println("str3의 H의 인덱스: "+str3.indexOf("N"));
		
		System.out.println("str3에서 Have 추출: "+str3.substring(0, 4));
		System.out.println("str3에서 Have 추출: "+str3.substring(7, 11)); //index시작번호,끝번호+1
		System.out.println("str3에서 Nice부터 끝까지: "+str3.substring(7)); //index번호(7)부터 끝까지
		
		
		//equlas는 같으면 true, 다르면 false
		System.out.println("문자열비교: "+str1.equals(str2));
		System.out.println("문자열비교: "+str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b)
		//a와 b가 같으면 0이 나옴
		//a가 작을경우 -값(알파벳 차이만큼 마이너스값)
		//a가 클경우 +값
		System.out.println(str1.compareTo(str2)); //첫번쨰 문자가 같으면 두번쨰 문자로
		System.out.println(str1.compareTo(str1)); //같으면 0이 나옴
		System.out.println("computer".compareTo("command")); //p와 m비교
	}

}
