package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class HelloCrud {

	DbConnect db=new DbConnect();
			
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		String name,addr;
		String sql="";
		
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		
		System.out.println("주소를 입력하세요");
		addr=sc.nextLine();
		
		sql="insert into hello values (seq1.nextval,'"+name+"','"+addr+"', sysdate)";
		System.out.println(sql);
		
		//1.db연결
		Connection conn=null;
		
		//2.statment
		Statement stmt=null; //sql문 객체 전송에 필요한 API
		
		conn=db.getOracle();
		
		
		try {
			stmt=conn.createStatement();
			
			stmt.execute(sql);
			System.out.println("**데이타 추가됨**");
			
		} catch (SQLException e) {
			// SQL 예외 처리
			e.printStackTrace();
		} finally {
			// 3. DB 자원 닫기
			db.dbClose(stmt, conn);
		}
		
	}
	public void select() {
		
		Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs=null;
	    
	    String sql="select num, name, addr, sdate from hello";
	    //String sql="select * from hello order by num";
	    
	    System.out.println("시퀀스\t이름\t주소\t가입날짜");
		System.out.println("----------------------------");
	    
	    conn=db.getOracle();
	    
	    	try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
				//2개 이상 while
				while(rs.next())
				{
					System.out.println(rs.getInt("num")+"\t"
							+rs.getString("name")+"\t"
							+rs.getString("addr")+"\t"
							+rs.getString("sdate"));
							
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);
			}
			
	    }
	   
	    	public void delete() {
	    	    Scanner sc = new Scanner(System.in);
	    	    String num;
	    	    String sql = "";

	    	    System.out.println("삭제할 번호 입력");
	    	    num = sc.nextLine();

	    	    sql = "delete from hello where num=" + num;
	    	    System.out.println(sql);

	    	    Connection conn = null;
	    	    Statement stmt = null;

	    	    conn = db.getOracle();

	    	    try {
	    	        stmt = conn.createStatement();
	    	        stmt.executeUpdate(sql);
	    	        System.out.println("**데이터가 삭제되었습니다**");

	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	    } finally {
	    	        db.dbClose(stmt, conn);
	    	    }
	    	}
	    
	    //수정하려는 데이타 조회
	    public boolean getOneData(String num)
	    {
	    	boolean flag=false; //num에 해당하는 데이타가 있으면 true, 없으면 false
	    	
	    	String sql="select * from hello where num="+num;
	    	
	    	Connection conn=null;
	    	Statement stmt=null;
	    	ResultSet rs=null;
	    	
	    	conn=db.getOracle();
	    	try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
				//한개만 조회할 경우는 if문
				if(rs.next()) //데이타가 있는경우
					flag=true;
				else {
					System.out.println("해당 번호는 존재하지 않습니다");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(rs, stmt, conn);
			}
	    	
	    	
	    	return flag;
	    }
	    
	    
	    //수정
	    public void update()
	    {
	    	//수정할 시퀀스를 입력후 이름, 주소 입력
	    	Scanner sc=new Scanner(System.in);
	    	String num,name,addr;
	    	
	    	System.out.println("수정할 번호를 입력");
	    	num=sc.nextLine();
	    	
	    	if(!this.getOneData(num))
	    	{
	    		System.out.println("해당번호는 존재하지 않습니다");
	    		return; //메서드 종료
	    	}
	    	
	    	System.out.println("수정할 이름으로 변경해주세요");
	    	name=sc.nextLine();
	    	System.out.println("수정할 주소로 변경해주세요");
	    	addr=sc.nextLine();
	    	String sql="update hello set name='"+name+"',addr='"+addr+"' where num="+num;
	    	System.out.println(sql);
	    	
	    	Connection conn=null;
	    	Statement stmt=null;
	    	
	    	conn=db.getOracle();
	    	
	    	try {
				stmt=conn.createStatement();
				
				int a=stmt.executeUpdate(sql);
				
				if(a==0)
					System.out.println("수정할 데이타가 존재하지 않습니다");
				else
					System.out.println("***수정되었습니다***");
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(stmt, conn);
			}
	    	
	    }
	    
	
	
	
	
	public static void main(String[] args) {
		
		// HelloCrud 객체 생성
		HelloCrud hello=new HelloCrud();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("**hello db 연습**");
			System.out.println("1.insert 2.select 3.delete 4.update 9.exit");
			
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				hello.insert();
			else if(n==2)
				hello.select();
			else if(n==3)
				hello.delete();
			else if(n==4)
				hello.update();
			else if(n==9)
			{
				System.out.println("종료할게요~~~");
				break;
			}
		}

	}

}
