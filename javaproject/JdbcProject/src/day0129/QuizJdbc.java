package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import oracleDb.DbConnect;

public class QuizJdbc {

	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	private void insertMember()
	{
		System.out.println("사원명");
		String s_name=sc.nextLine();
		System.out.println("부서");
		String buseo=sc.nextLine();
		System.out.println("직급");
		String position=sc.nextLine();
		System.out.println("성별");
		String gender=sc.nextLine();
		System.out.println("월급여");
		int pay=Integer.parseInt(sc.nextLine());
		System.out.println("보너스");
		int bonus=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		String sql="insert into sawonmember (s_num,s_name,buseo,position,gender,pay,bonus,ipsaday) values (seq_smem.nextval,?,?,?,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, s_name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);
			
			pstmt.execute();
			System.out.println("추가되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	//////////////////////////////////
	public void writeMember()
	{
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from sawonmember order by s_num asc";
		
			try {
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스\t입사일");
				System.out.println("---------------------------------------------------------");
				
				while(rs.next())
				{
					DecimalFormat df=new DecimalFormat("#.###");
					
					System.out.println(rs.getInt("s_num")+"\t"
							+rs.getString("s_name")+"\t"
							+rs.getString("buseo")+"\t"
							+rs.getString("position")+"\t"
							+rs.getString("gender")+"\t"
							+df.format(rs.getInt("pay"))+"\t"
							+df.format(rs.getInt("bonus"))+"\t"
							+rs.getString("ipsaday"));
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}
			
	}
	/////////////////////////////
	public void deleteMember()
	{
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		//Scanner sc=new Scanner(System.in);
		
		System.out.println("삭제할 사원번호는?");
		int num=Integer.parseInt(sc.nextLine());
		
		String sql="delete from sawonmember where s_num=?";
		
			try {
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setInt(1, num);
				
				int n=pstmt.executeUpdate();
				
				if(n==1)
					System.out.println("삭제 성공했습니다.");
				else
					System.out.println("삭제 실패했습니다.");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(pstmt, conn);
			}
			
		
	}
	
	public void updateMember() 
	{
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		
		System.out.println("수정할 사원번호 입력");
		int num=Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 부서 입력");
		String buseo=sc.nextLine();
		System.out.println("수정할 직급 입력");
		String position=sc.nextLine();
		System.out.println("수정할 월급 입력");
		int pay=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 보너스 입력");
		int bonus=Integer.parseInt(sc.nextLine());
		
		String sql="update sawonmember set buseo=?, position=?, pay=?, bonus=? where s_num=?";
		
			try {
				pstmt=conn.prepareStatement(sql);
				
				//바인딩
				pstmt.setString(1, buseo);
				pstmt.setString(2, position);
				pstmt.setInt(3, pay);
				pstmt.setInt(4, bonus);
				pstmt.setInt(5, num);
				
				int n=pstmt.executeUpdate();
				
				if(n==1)
					System.out.println("수정 성공했습니다.");
				else
					System.out.println("수정 실패했습니다.");
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(pstmt, conn);
			}
			
		
	}
	//////////////////////////////////
	public void searchMember()
	{
		System.out.println("검색할 이름을 입력하세요.");
		String name=sc.nextLine();
		
		String sql="select * from sawonmember where s_name like ?";
		
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스\t입사일");
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		
			try {
				pstmt=conn.prepareStatement(sql);
				
				//바인딩
				pstmt.setString(1, "%"+name+"%");
				rs=pstmt.executeQuery();
				
				while(rs.next())
				{
					DecimalFormat df=new DecimalFormat("#.###");
					System.out.println(rs.getInt("s_num")+"\t"
							+rs.getString("s_name")+"\t"
							+rs.getString("buseo")+"\t"
							+rs.getString("position")+"\t"
							+rs.getString("gender")+"\t"
							+df.format(rs.getInt("pay"))+"\t"
							+df.format(rs.getInt("bonus"))+"\t"
							+rs.getString("ipsaday"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuizJdbc quizJdbc=new QuizJdbc();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("**사원현황**");
			System.out.println("1.사원정보입력  2.전체사원출력  3.사원삭제  4.사원수정  5.이름검색  9.시스템종료");
			
			System.out.println("선택할 메뉴는?");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				quizJdbc.insertMember();
			else if(n==2)
				quizJdbc.writeMember();
			else if(n==3)
				quizJdbc.deleteMember();
			else if(n==4)
				quizJdbc.updateMember();
			else if(n==5)
				quizJdbc.searchMember();
			else if(n==9)
			{
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
			
			
		}

	}

}
