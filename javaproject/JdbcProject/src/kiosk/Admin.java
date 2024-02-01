package kiosk;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

	public boolean accessAdmin(String identify, String pwd) {

		DbConnect db = new DbConnect();
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

}
