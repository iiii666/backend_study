<%@page import="java.sql.PreparedStatement"%>
<%@page import="sec01.ex01.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	StringBuffer sql = new StringBuffer();
	sql.append("select id, pwd, name, email, joindate  ");
	sql.append("from t_member  ");
	sql.append("order by id asc ");

	Connection conn = null;
	PreparedStatement pstmt = null;//처음부터 sql 던져줘야한다
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.OracleDriver"); //jdbc 드라이버가 있는지 확인한다
		conn = DriverManager.getConnection(//오라클 연결 까지 된거임
		"jdbc:oracle:thin:@localhost:1521/xepdb1", "tester1", "1234");
		pstmt = conn.prepareStatement(sql.toString());
		rs = pstmt.executeQuery();
	%>

	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>가입일</th>

		</tr>

		<%
		List<MemberVO> list = new ArrayList<>();

		while (rs.next()) {

			MemberVO memberVO = new MemberVO();

			memberVO.setId(rs.getString("id"));
			memberVO.setPwd(rs.getString("pwd"));
			memberVO.setName(rs.getString("name"));
			memberVO.setEmail(rs.getString("email"));
			memberVO.setJoinDate(rs.getDate("joinDate"));

			list.add(memberVO);
		}
		for (int i = 0; i < list.size(); i++) {
			MemberVO memberVO = list.get(i);
			
		%>

		<tr>
			<td><%=memberVO.getId()%></td>
			<!-- 표현식 -->
			<td><%=memberVO.getPwd()%></td>
			<td><%=memberVO.getName()%></td>
			<td><%=memberVO.getEmail()%></td>
			<td><%=memberVO.getJoinDate()%></td>
		</tr>

		<%
		}
		} catch (Exception e) {
		out.println("연결 실패!");
		} finally {
		if (rs != null)
		try {
			rs.close();
		} catch (Exception e) {
		}
		if (pstmt != null)
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		if (conn != null)
		try {
			conn.close();
		} catch (Exception e) {
		}

		}
		%>
		<!-- scriptlet 자바 언어 사용가능 -->
	</table>
</body>
</html>