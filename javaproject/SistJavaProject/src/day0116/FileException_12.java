package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException_12 {

	//점수의  총개수,합계,평균
	public static void scoreRead() throws FileNotFoundException,IOException
	{
		String fileName="C:\\sist0103\\File\\score.txt";
		FileReader fr=null;
		BufferedReader br=null;
		int cnt=0;
		int total=0;
		double avg=0;
		
		//파일읽기
		fr=new FileReader(fileName);
		System.out.println("파일 정상적으로 읽음!!");
		
		br=new BufferedReader(fr);
		
		while(true)
		{
			String s=br.readLine(); //형변환 해줘야함 (반환값 정수,문자..확인해야함)
			
			if(s==null)
				break;
			
			//문자열점수를 int로 변환해서 합계랑 갯수 구하기
			cnt++;
			total+=Integer.parseInt(s); //합계
		}
		
		//평균구하기 (while문 빠져나오기..출력 또한 빠져나와서)
		avg=(double)total/cnt;
		
		System.out.println("총갯수: "+cnt);
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
		
		//자원들 닫기
		br.close();
		fr.close(); //->노란줄 사라짐
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("**정상종료**");
	}

}
