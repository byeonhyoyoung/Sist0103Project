package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

public class QuizJdbcFoodOrder {
    static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    public void readOrder(){

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(); // 화폐단위와 컴마

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "select order_num as 주문번호, jumun.fno as 음식번호, order_name as 주문자, food_name as 음식명,\n" +
                "price as 가격, f_shopname as 상호명, shoploc as 상점위치, order_addr as 주문자위치\n" +
                "from foodshop, jumun\n" +
                "where jumun.fno=foodshop.fno\n" +
                "order by order_name";


        try {
            conn= DriverManager.getConnection(URL,"stu","a1234");

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("주문번호\t음식번호\t주문자\t음식명\t가격\t상호명\t상점위치\t주문자위치");
            System.out.println("=================================================");

            while(rs.next()){
                int order_num = rs.getInt("주문번호");
                int fno = rs.getInt("음식번호");
                String order_name = rs.getString("주문자");
                String food_name = rs.getString("음식명");
                int price = rs.getInt("가격");
                String f_shopname = rs.getString("상호명");
                String shoploc = rs.getString("상점위치");
                String order_addr = rs.getString("주문자위치");

                System.out.println(order_num + "\t" + fno + "\t" + order_name + "\t" + food_name + "\t" +numberFormat1.format(price) + "\t" +f_shopname + "\t" +shoploc + "\t" +order_addr);
            }

        } catch (SQLException e) {
            System.out.println("e = " + e);
            System.out.println("오라클 드라이버 연결 실패!!!");
        }finally {
            try {
                if (rs != null)
                    rs.close();
                if(stmt != null)
                    stmt.close();
                if(conn != null)
                    conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void main(String[] args) {
        QuizJdbcFoodOrder quizJdbcFoodOrder = new QuizJdbcFoodOrder();
        quizJdbcFoodOrder.readOrder();
    }
}

 
