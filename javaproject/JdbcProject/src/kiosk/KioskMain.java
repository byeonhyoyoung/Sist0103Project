package kiosk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class KioskMain {

   static DbConnect db = new DbConnect();

   public static boolean accessAdmin(String identify, String pwd) { // 처음 관리자 권한 확인 => 로그인 과정

      boolean flag = false;
      String sql = "select * from admin where id=" + identify + " and pwd=" + pwd;
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

      conn = db.getOracle();
      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);

         // 한개만 조회할경우는 if문
         if (rs.next()) // 데이타가 있는경우
            flag = true;
         else
            flag = false;
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, stmt, conn);
      }
      return flag;

   }

   public static Menu selectMenu(String ss) {
      Menu menu = new Menu();

      String str = ss;
      int n = 0;
      Scanner sc = new Scanner(System.in);

      menu.setCategory(str); // 메뉴 선택
      
      
      if (str.equals("커피")) { // 선택된 메뉴가...
         System.out.println("아메리카노(3500) / 라떼(4000) / 카페모카(4500)");
         str = sc.next();
         menu.setMenuName(str);

         if (str.equals("아메리카노"))
            menu.setMenuPrice(3500);
         else if (str.equals("라떼"))
            menu.setMenuPrice(4000);
         else if (str.equals("카페모카"))
            menu.setMenuPrice(4500);
      } else if (str.equals("논커피")) { // 선택된 메뉴가...
         System.out.println("초코라떼(4000) / 녹차라떼(4000)");
         str = sc.next();
         menu.setMenuName(str);

         if (str.equals("초코라떼"))
            menu.setMenuPrice(4000);
         else if (str.equals("녹차라떼"))
            menu.setMenuPrice(4000);
      } else if (str.equals("스무디")) { // 선택된 메뉴가...
         System.out.println("딸기스무디(5000) / 요거트스무디(5000)");
         str = sc.next();
         menu.setMenuName(str);

         if (str.equals("딸기스무디"))
            menu.setMenuPrice(5000);
         else if (str.equals("요거트스무디"))
            menu.setMenuPrice(5000);
      }
//      System.out.println(menu.toString());

      return menu;

   }

   public static Menu insertAddition(Menu m) {
      Addition addition = new Addition();
      DbConnect db = new DbConnect();
      String str = "";
      int n = 0;
      Scanner sc = new Scanner(System.in);
//      Menu menu = m;

      System.out.println("====================================");
      System.out.println("다음 옵션을 꼭 선택해주세요.");
      System.out.println("hot / ice");
      str = sc.next();
      addition.setHotIce(str);
      System.out.println("tall / grande / venti");
      str = sc.next();
      addition.setVolume(str);
      System.out.println("우유 / 두유");
      str = sc.next();
      addition.setMilk(str);
      System.out.println("1샷 / 2샷");
      n = sc.nextInt();
      addition.setShot(n);
      System.out.println("수량 : ");
      n = sc.nextInt();
      addition.setQuantity(n);

      m.setAddition(addition); // 해당 메뉴에 대한 옵션 넣어줌
//      System.out.println(m.toString());
      return m;

   }

   public static int findPrice(String name) {
      int result = 0;
      String sql = "select menu_price from menu where menu_name=?";
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      conn = db.getOracle();
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         rs = pstmt.executeQuery();

         while (rs.next()) {
            result = rs.getInt("menu_price");
         }

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         db.dbClose(rs, pstmt, conn);
      }

      return result;
   }

   public static void main(String[] args) throws InterruptedException {

      Scanner sc = new Scanner(System.in);
      int n;
      String id = "", pwd = "", str = "";

      System.out.println("로그인 해주세요");
      System.out.println("아이디 : ");
      id = sc.next();
      System.out.println("비밀번호 : ");
      pwd = sc.next();

      if (accessAdmin(id, pwd)) { // 로그인 성공 시
         System.out.println("=== Kiosk Start ===");
         while (true) {
            System.out.println("커피 / 논커피 / 스무디 / 종료 ");
            str = sc.next();
            if (str.equals("종료"))
               break;
            if (str.equals("모드")) {
               print();
               continue;
            }

            Menu menu = selectMenu(str); // 해당 메소드에서 메뉴를 다 저장하여 리턴해줌
            menu = insertAddition(menu); // 해당 메뉴에 대한 옵션 선택해줌
            System.out.println();
            int price = findPrice(menu.getMenuName());
            int quantity = menu.getAddition().getQuantity();
            int pay = price * quantity;
//            System.out.println("price" + price + " quantity" + quantity);
            System.out.println("금액 : " + pay);

            System.out.println("결제 방법을 선택하세요(카드 / 기프티콘)");
            str = sc.next();
            if (str.equals("카드")) {
               System.out.println("카드를 넣어주세요.");
               System.out.println("처리중입니다. 잠시만 기다려주십시오.");
               Thread.sleep(3000); // 3초 정도 진행됨
               System.out.println("결제가 완료되었습니다.\n");
               /*
                * 여기다가 영수증 여부 묻는 코드 작성
                */

            } else if (str.equals("기프티콘")) {
               System.out.println("기프티콘을 바코드에 찍어주세요.");
               Thread.sleep(3000); // 3초 정도 진행됨
               System.out.println("띡");
               System.out.println("결제가 완료되었습니다.\n");
               /*
                * 여기다가 영수증 여부 묻는 코드 작성
                */

            } else {
               System.out.println("잘못 입력하여 이전 화면으로 돌아갑니다.");
            }

         } // while end
      } else { // 로그인 실패 시
         System.out.println("로그인 실패하셨습니다.");
      }
   } // main end

   public static void print() {
      Scanner sc = new Scanner(System.in);
      Admin admin = new Admin();
      String str = "";

      while (true) {
         System.out.println("메뉴 추가 / 수정 / 삭제 / 이전");
         str = sc.next();
         if(str.equals("추가")) {
            admin.insertMenu();
         }else if(str.equals("수정")) {
            admin.updateMenu();
         }else if(str.equals("삭제")) {
            admin.deleteMenu();
         }else if(str.equals("이전")) {
            break;
         }else {
            System.out.println("잘못 입력하셨습니다.");
         }

      } // while end

   }

} // class end