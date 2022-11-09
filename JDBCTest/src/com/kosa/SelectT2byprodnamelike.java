package com.kosa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;

public class SelectT2byprodnamelike {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("사물 이름 입력 해라: ");
		String prodname = sc.next();
		
		String runSP = "{ call sp_select_product_by_prod_name_like(?,?)}";
		
		try {
			Connection conn = DBConnection.getConnection();
			
			
			CallableStatement cs = conn.prepareCall(runSP);
			cs.setString(1, prodname);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			
			System.out.println();
			
			try {
				cs.execute();
				ResultSet rs = (ResultSet) cs.getObject(2);
				
				while(rs.next()) {
					String prodcode = rs.getString(1);
					prodname = rs.getString(2);
					String prodcolor = rs.getString(3);
					int prodqty = rs.getInt(4);
					System.out.println(prodcode);
					System.out.println(prodname);
					System.out.println(prodcolor);
					System.out.println(prodqty);
					System.out.println();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
