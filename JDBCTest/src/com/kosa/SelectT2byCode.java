package com.kosa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectT2byCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("코드 번호 입력: ");
		
		String prodcode = sc.next();

		String runSP = "{ call sp_select_product_by_prod_code(?, ?, ?, ?) }";
		
		
		try {
			Connection conn = DBConnection.getConnection();
			CallableStatement cs = conn.prepareCall(runSP);
			cs.setString(1,prodcode);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);
			cs.registerOutParameter(4, java.sql.Types.NUMERIC);
			
			
			
			try {
				cs.executeQuery();
				
				String prodname =cs.getString(2);
				String prodcolor =cs.getString(3);
				int prodqty = cs.getInt(4);
				
				System.out.println();
				System.out.println(prodname);
				System.out.println(prodcolor);
				System.out.println(prodqty);
			} catch (SQLException e) {
				System.out.println("프로시저에서 에러 발생!");
				// System.err.format("SQL State: %s", e.getSQLState());
				System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
