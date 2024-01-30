package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracleDb.DbConnect;
import oracleDb.DbConnectStu;

public class PersonGroup {
	// job별 인원수와 평균나이 구해주세요

	DbConnectStu db = new DbConnectStu();

	public void select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select job, count(*) count, round(avg(age), 2) avgage " + "from person2 group by job";

		conn = db.getOracle();
		System.out.println("오라클 계정연결성공!!!");

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("\t***회사 직급별 인원 및 평균 나이***");
			System.out.println();
			System.out.println("직급\t인원수\t평균나이");
			System.out.println("-----------------------------------------------------------");

			while (rs.next()) {
				String job = rs.getString("job");
				int count = rs.getInt("count");
				double avgAge = rs.getDouble("avgage");

				System.out.println(job + "\t" + count + "\t" + avgAge);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonGroup personGroup = new PersonGroup(); // 객체 생성이 누락되어 있었습니다.
		personGroup.select(); // connectSawonGroup 메서드 호출

	}

}
