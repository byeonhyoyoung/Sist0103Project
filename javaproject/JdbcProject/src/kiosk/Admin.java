package kiosk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class Admin {
   private String identify;
   private String pwd;
   private Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getIdentify() {
      return identify;
   }

   public void setIdentify(String id) {
      this.identify = id;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }

   // MENU 추가가가아ㅏ아앙
   public void insertMenu() {
      DbConnect db = new DbConnect();
      Connection conn = db.getOracle();
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      Scanner sc = new Scanner(System.in);
      String category = "", menuName = "";
      int menuPrice = 0;

      System.out.println("추가하실 Menu에 대한 정보를 작성해주세요.");
      System.out.println("카테고리 : ");
      category = sc.next();
      System.out.println("메뉴 이름 : ");
      menuName = sc.next();
      System.out.println("메뉴 가격 : ");
      menuPrice = sc.nextInt();

      String sql = "insert into menu (menu_id, category, menu_name, menu_price) "
            + "values (MENU_seq.nextval, ?, ?, ?)";
      try {
         pstmt = conn.prepareStatement(sql);

         // ?를 순서대로 바인딩한후 업데이트
         pstmt.setString(1, category);
         pstmt.setString(2, menuName);
         pstmt.setInt(3, menuPrice);

         // 업데이트
         int n = pstmt.executeUpdate();
         if (n == 1)
            System.out.println("추가 성공");
         else
            System.out.println("실패");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }

   }

   // MENU 수저어어어ㅓ어엉
   public void updateMenu() {
      DbConnect db = new DbConnect();
      Connection conn = db.getOracle();
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      Scanner sc = new Scanner(System.in);
      String str = "";

      System.out.println("수정할 메뉴의 카테고리를 작성해주세요");
      str = sc.next();
      String sql = "select menu_name from menu where category=?";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, str);
         rs = pstmt.executeQuery();

         System.out.println(str+"카테고리 메뉴");
         System.out.println("-------------------------------------------");

         while (rs.next()) {
            System.out.println(rs.getString("menu_name"));
         }
         update();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }
   }

   public void update() {
      DbConnect db = new DbConnect();
      Connection conn = db.getOracle();
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      Scanner sc = new Scanner(System.in);
      String name="";
      int price=0;
      System.out.println("수정할 메뉴의 이름을 작성해주세요");
      name = sc.next();
      System.out.println("해당 메뉴의 가격을 작성해주세요");
      price = sc.nextInt();
      String sql = "update menu set menu_price=? where menu_name=?";
      try {
         pstmt = conn.prepareStatement(sql);
         //바인딩
         pstmt.setInt(1, price);
         pstmt.setString(2, name);
         
         int n=pstmt.executeUpdate();
         
         if(n==1)
            System.out.println("수정 성공");
         else
            System.out.println("실패");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }
      
   }

   // MENU 삭제ㅔ에엥ㅇ
   public void deleteMenu() {
      DbConnect db = new DbConnect();
      Connection conn = db.getOracle();
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      Scanner sc = new Scanner(System.in);
      String str = "";

      System.out.println("삭제할 메뉴의 카테고리를 작성해주세요");
      str = sc.next();
      String sql = "select menu_name from menu where category=?";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, str);
         rs = pstmt.executeQuery();

         System.out.println(str+"카테고리 메뉴");
         System.out.println("-------------------------------------------");

         while (rs.next()) {
            System.out.println(rs.getString("menu_name"));
         }
         delete();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }
   }

   public void delete() {
      DbConnect db = new DbConnect();
      Connection conn = db.getOracle();
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      Scanner sc = new Scanner(System.in);
      String str = "";
      System.out.println("삭제할 메뉴의 이름을 작성해주세요");
      str = sc.next();
      String sql = "delete from menu where menu_name=?";
      try {
         pstmt = conn.prepareStatement(sql);
         //바인딩
         pstmt.setString(1, str);
         
         int n=pstmt.executeUpdate();
         
         if(n==1)
            System.out.println("삭제 성공");
         else
            System.out.println("실패");

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }
   }

}