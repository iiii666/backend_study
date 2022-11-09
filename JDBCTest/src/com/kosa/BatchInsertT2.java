package com.kosa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class BatchInsertT2 {
	public static void main(String[] args) {
		String runSP = "{call sp_insert_product(?,?,?,?)}";
		
	
		try {
			Connection conn = DBConnection.getConnection();
			
			CallableStatement cs = conn.prepareCall(runSP);
			cs.setString(1, "4");
			cs.setString(2, "book");
			cs.setString(3, "red");
			cs.setString(4, "1");
			cs.addBatch();//이게뭐더라
			cs.setString(1, "5");
			cs.setString(2, "pen");
			cs.setString(3, "black");
			cs.setString(4, "1");
			cs.addBatch();//이게뭐더라
			cs.setString(1, "6");
			cs.setString(2, "desk");
			cs.setString(3, "orange");
			cs.setString(4, "1");
			cs.addBatch();//이게뭐더라

			cs.executeBatch();
			System.out.println("성공");
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
