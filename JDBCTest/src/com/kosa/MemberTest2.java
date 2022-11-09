package com.kosa;

import java.util.ArrayList;

public class MemberTest2 {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		String _name = "keyboard";
		int _age = 13;

		MemberVO vo = new MemberVO(_name, _age);
		dao.modMember(vo);

		ArrayList<MemberVO> list = dao.list(vo);
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO data = list.get(i);
//			String id = data.getId();
//			String name = data.getName();
//			int height = data.getHeight();
//			int weight = data.getWeight();
//			int age = data.getAge();
			String prod_code = data.getProd_code();
			String prod_name = data.getProd_name();
			String prod_color = data.getProd_color();
			int prod_qty = data.getProd_qty();
			
			
//			System.out.println("아이디는>>"+id+
//					   ", 이름은>>"+name+
//					   ", 키는>>"+height+
//					   ", 체중은>>"+weight+
//					   ", 나이는>>"+age);	
			System.out.println("제품 번호>>"+prod_code+
					   ", 제품 이름>>"+prod_name+
					   ", 제품 색상>>"+prod_color+
					   ", 제품 수량>>"+prod_qty);	
		}
	}

}