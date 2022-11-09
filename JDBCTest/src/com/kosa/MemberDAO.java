package com.kosa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn = DBConnection.getConnection();
	private Statement stmt;
	private ResultSet rs;	
	
	public ArrayList<MemberVO> list(MemberVO vo) {
		String _name = vo.getProd_name();
		int _age = vo.getProd_qty();

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			String query = "select * from product";
			if (_name != null && _age != 0) {
				query += " where prod_name='" + _name + "' and prod_qty=" + _age;
			} else if (_name != null && _age == 0) {
				query += " where prod_name='" + _name + "'";
			} else if (_name == null && _age != 0) {
				query += " where prod_qty=" + _age;
			}

			System.out.println(query);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
//				String id = rs.getString("id");
//				String name = rs.getString("name");
//				int height = rs.getInt("height");
//				int weight = rs.getInt("weight");
//				int age = rs.getInt("age");
				String prod_code = rs.getString("prod_code");
				String prod_name = rs.getString("prod_name");
				String prod_color = rs.getString("prod_color");
				int prod_qty = rs.getInt("prod_qty");
				MemberVO data = new MemberVO();

				data.setProd_code(prod_code);
				data.setProd_name(prod_name);
				data.setProd_color(prod_color);
				data.setProd_qty(prod_qty);
			

				list.add(data);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void modMember(MemberVO vo) {
		String _name = null;
		int _age = 0;

		_name = vo.getProd_name();
		_age = vo.getProd_qty();

		try {

			String query = "update product ";
			query += " set prod_qty=" + _age;
			query += " where prod_name='" + _name + "'";

			System.out.println(query);
			stmt = conn.createStatement();
			stmt.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
