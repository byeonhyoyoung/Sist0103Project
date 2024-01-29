package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class QuizStuInfo {

   DbConnect db = new DbConnect();

   public void insert() {

      Scanner sc = new Scanner(System.in);
      String s_name, s_gender, s_hp;
      int s_age;
      String sql="";

      System.out.println("학생명을 입력하세요.");
      s_name = sc.nextLine();

      System.out.println("성별을 입력하세요.");
      s_gender = sc.nextLine();

      System.out.println("나이를 입력하세요.");
      s_age = sc.nextInt();
      sc.nextLine();

      System.out.println("연락처를 입력하세요.");
      s_hp = sc.nextLine();
      

      String sql1 = "insert into stuinfo values(seq_info.nextval,'" + s_name + "','" + s_gender + "','" + s_age + "','"
            + s_hp + "',sysdate)";

      Connection conn = null;
      Statement stmt = null;

      conn = db.getOracle();

      try {
         stmt = conn.createStatement();
         stmt.execute(sql1);
         System.out.println("**데이터가 추가되었습니다.**");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(stmt, conn);
      }

   }

   public void select() {

      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

      String sql = "select num, s_name, s_gender, s_age, s_hp, sdate from stuinfo";
      // String sql="select * from stuinfo order by num";

      System.out.println("시퀀스\t학생명\t성별\t나이\t연락처\t가입날짜");
      System.out.println("---------------------------");

      conn = db.getOracle();

      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);

         while (rs.next()) {
            System.out.println(rs.getInt("num") + "\t" + rs.getString("s_name") + "\t" + rs.getString("s_gender")
                  + "\t" + rs.getInt("s_age") + "\t" + rs.getString("s_hp") + "\t" + rs.getString("sdate"));
         }

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, stmt, conn);
      }

   }

   public void delete() {
      Scanner sc = new Scanner(System.in);
      String num;
      String sql = "";

      System.out.println("삭제할 번호를 입력하세요.");
      num = sc.nextLine();

      sql = "delete from stuinfo where num=" + num;
      
      Connection conn = null;
      Statement stmt = null;
      
      conn = db.getOracle();

      try {
         stmt = conn.createStatement();
         stmt.executeUpdate(sql);
         System.out.println("**데이터가 삭제되었습니다.**");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(stmt, conn);
      }
   }

   // 수정하려는 데이타 조회
   public boolean getOneData(String num) {
      boolean flag = false; // num에 해당하는 데이타가 있으면 true, 없으면 false

      String sql = "select * from stuinfo where num=" + num;

      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

      conn = db.getOracle();
      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);

         // 한개만 조회할 경우는 if문
         if (rs.next()) // 데이타가 있는경우
            flag = true;
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

   // 수정
   public void update() {
      // 수정할 시퀀스를 입력후 이름, 주소 입력
      Scanner sc = new Scanner(System.in);
      String num, s_name, s_gender, s_hp;
      int s_age;

      System.out.println("수정할 번호를 입력하세요.");
      num = sc.nextLine();

      if (!this.getOneData(num)) {
         System.out.println("해당번호는 존재하지 않습니다");
         return; // 메서드 종료
      }

      System.out.println("수정할 학생명으로 변경해주세요");
      s_name = sc.nextLine();
      System.out.println("수정할 성별으로 변경해주세요");
      s_gender = sc.nextLine();
      System.out.println("수정할 나이로 변경해주세요");
      s_age = sc.nextInt();
      System.out.println("수정할 연락처로 변경해주세요");
      s_hp = sc.nextLine();
      
      
      
      String sql = "update stuinfo set s_name='" + s_name + "',s_gender='" + s_gender + "',s_age='" + s_age + "',s_hp='" + s_hp + "' where num=" + num;
      System.out.println(sql);

      Connection conn = null;
      Statement stmt = null;

      conn = db.getOracle();

      try {
         stmt = conn.createStatement();

         int a = stmt.executeUpdate(sql);

         if (a == 0)
            System.out.println("수정할 데이타가 존재하지 않습니다");
         else
            System.out.println("***수정되었습니다***");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(stmt, conn);
      }

   }

   public static void main(String[] args) {

      // QuizStuInfo 객체 생성
        QuizStuInfo stuinfo = new QuizStuInfo();

      Scanner sc = new Scanner(System.in);
      int n;

      while (true) {
         System.out.println("**StuInfo DB**");
         System.out.println("1.insert 2.select 3.delete 4.update 9.exit");

         n = Integer.parseInt(sc.nextLine());

         if (n == 1)
            stuinfo.insert();
         else if (n == 2)
            stuinfo.select();
         else if (n == 3)
            stuinfo.delete();
         else if (n == 4)
            stuinfo.update();
         else if (n == 9) {
            System.out.println("종료하겠습니다.");
            break;
         }
      }

   }

}
