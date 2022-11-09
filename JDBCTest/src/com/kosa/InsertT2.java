package com.kosa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��ǰ �ڵ� �Է�:  ");
		String prod_code = sc.next();
		System.out.println("��ǰ �̸� �Է�:  ");
		String prod_name = sc.next();
		System.out.println("��ǰ ���� �Է�:  ");
		String prod_color = sc.next();
		System.out.println("���� �Է� : ");
		int prod_qty = sc.nextInt();

		String runSP = "{ call sp_insert_product(?, ?, ?, ?) }";

		try {
			Connection conn = DBConnection.getConnection();
			CallableStatement cs = conn.prepareCall(runSP);
			cs.setString(1, prod_code);
			cs.setString(2, prod_name);
			cs.setString(3, prod_color);
			cs.setInt(4, prod_qty);
			cs.executeUpdate();
			System.out.println("insert ����");
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			sc.close();
		}
	}
}
