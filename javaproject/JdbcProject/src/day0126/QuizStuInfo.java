package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class QuizStuInfo {

	DbConnect db=new DbConnect();
	
	public void insert() {
		
		Scanner sc=new Scanner(System.in);
		int s_no;
		String s_name, s_gender;
		int s_age;
		String s_hp;
		String gaipday;
		
		System.out.println("학생명을 입력하세요.");
		s_name=sc.nextLine();
		
		System.out.println("성별을 입력하세요.");
		s_gender=sc.nextLine();
		
		System.out.println("나이를 입력하세요.");
		s_age=sc.nextInt();
		
		System.out.println("연락처를 입력하세요.");
		s_hp=sc.nextLine();
		
		System.out.println("가입일을 입력하세요.");
		gaipday=sc.nextLine();
		
		String sql="insert into stuinfo values(seq_info.nextval,'"+s_name+"','"+s_gender+"','"+s_age+"','"+s_hp+"',+sysdate)";
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			System.out.println("**데이터가 추가되었습니다.**");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
		
		
			
		}
		
	public void select() {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select num, s_name, s_gender, s_age, s_hp, sdate from stuinfo";
		//String sql="select * from stuinfo order by num"; 
		
		System.out.println("시퀀스\t학생명\t성별\t나이\t연락처\t가입날짜");
		System.out.println("---------------------------");
		
		conn=db.getOracle();
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("s_name")+"\t"
						+rs.getString("s_gender")+"\t"
						+rs.getInt("s_age")+"\t"
						+rs.getString("s_hp")+"\t"
						+rs.getString("sdate"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	public void delete() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
