<%@page import="java.sql.PreparedStatement"%>
<%@page import="sec01.ex01.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
   sql.append("select id, pwd, name, email, joindate ");
   sql.append("from   t_member ");
   sql.append("order  by id asc ");
   

   try {
      Class.forName("oracle.jdbc.OracleDriver");
   } catch(Exception e){
      e.printStackTrace();
   }

   try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "tester1", "1234");
       PreparedStatement pstmt= conn.prepareStatement(sql.toString())) {

      try (ResultSet rs = pstmt.executeQuery()) {
      
         List<MemberVO> list = new ArrayList<>();
         
         while(rs.next()) { 
            MemberVO memberVO = new MemberVO();
            memberVO.setId(rs.getString("id"));
            memberVO.setPwd(rs.getString("pwd"));
            memberVO.setName(rs.getString("name"));
            memberVO.setEmail(rs.getString("email"));
            memberVO.setJoinDate(rs.getDate("joinDate"));
            list.add(memberVO);
         }
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
      for(int i=0; i<list.size(); i++) {
         MemberVO memberVO = list.get(i); %>
      <tr>
         <td><%=memberVO.getId() %></td><!-- expression -->
         <td><%=memberVO.getPwd() %></td>
         <td><%=memberVO.getName() %></td>
         <td><%=memberVO.getEmail() %></td>
         <td><%=memberVO.getJoinDate() %></td>
      </tr>            
   <%      } // end of for
      }   // end of ResultSet
   } catch(Exception e) {
      e.printStackTrace();
   } 
%> <!-- scriptlet -->
</table>
</body>
</html>