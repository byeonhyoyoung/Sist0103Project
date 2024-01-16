package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileTokenException_14 {
	
	public static void fileRead()
	{
		//파일 경로 설정
		String fName="C:\\sist0103\\File\\info.txt";
		FileReader fr= null;
		BufferedReader br=null;
		
		try {
			//FileReader와 BufferedReader를 이용하여 파일 열기
			fr=new FileReader(fName);
			br=new BufferedReader(fr);
			
			//결과 출력 헤더
			System.out.println("**파일읽기 결과**");
			System.out.println("이름\t주소\t나이");
			System.out.println("--------------");
			
			//파일에서 한 줄씩 읽어오기
			while(true)
			{
				String s=br.readLine();
				
				// 파일의 끝에 도달하면 반복 종료
				if(s==null)
					break;
				//split으로 분리
				//String [] data=s.split(",");
				//배열갯수만큼 출력
				//System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);
				
				//이번에는 StringTokeneizer를 사용하여 쉼표로 분리
				StringTokenizer st=new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken()+"세");
				
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//파일이 발견되지 않을 경우의 예외 처리
			e.printStackTrace();
		}catch (IOException e) {
			//파일 읽기 중에 예외 처리
			//예외 내용이 빈 상태로 남아 있어서 나중에 수정이 필요합니다
		}finally {
				try {
					//ButteredReader와 FileReader를 닫기
					br.close();
					fr.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//닫기 과정에서 예외 처리
					e.printStackTrace();
				
				}
			
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 읽기 메서드 호출
		fileRead();
	}

}
