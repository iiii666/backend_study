package com.kosa;

import java.util.ArrayList;

public class MemberTest {
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		String _name = "Peter";
		int _age = 24;
		MemberVO vo = new MemberVO(_name, _age);
		ArrayList<MemberVO> list = dao.list(vo);
		for (int i = 0; i < list.size(); i++) {
			MemberVO data = (MemberVO) list.get(i);
//			String id = data.getId();
//			String name = data.getName();
//			int height = data.getHeight();
//			int weight = data.getWeight();
//			int age = data.getAge();

//			System.out.println("���̵��>>" + id + 
//					           " �̸���>>" + name + 
//					           " Ű��>>" + height + 
//					           " �����Դ�>>" + weight + 
//					           " ���̴�>>" + age);
		}
	}

}