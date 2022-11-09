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
			
			
//			System.out.println("���̵��>>"+id+
//					   ", �̸���>>"+name+
//					   ", Ű��>>"+height+
//					   ", ü����>>"+weight+
//					   ", ���̴�>>"+age);	
			System.out.println("��ǰ ��ȣ>>"+prod_code+
					   ", ��ǰ �̸�>>"+prod_name+
					   ", ��ǰ ����>>"+prod_color+
					   ", ��ǰ ����>>"+prod_qty);	
		}
	}

}