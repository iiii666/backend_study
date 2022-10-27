package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;

	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void dbClose(Connection conn, PreparedStatement pstmt) {
		if(pstmt !=null) {
			try {pstmt.close();} catch(Exception e) {}
		}
		if(conn !=null) {
			try {conn.close();} catch(Exception e) {}
		}

		
	}
	
	
	public List<MemberVO> listMembers() {
		List<MemberVO> membersList = new ArrayList();
		try {
			conn = dataFactory.getConnection();
			StringBuffer query = new StringBuffer();
			query.append("select id, pwd, name, email, joinDate ") ;
			query.append("from  t_member ");
			query.append("order by joinDate desc ");
	
			pstmt = conn.prepareStatement(query.toString());
			
			try(ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String id = rs.getString("id");
					String pwd = rs.getString("pwd");
					String name = rs.getString("name");
					String email = rs.getString("email");
					Date joinDate = rs.getDate("joinDate");
					MemberVO memberVO = new MemberVO(id, pwd, name, email, joinDate);
					membersList.add(memberVO);
				}
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbClose(conn, pstmt);
		}
		return membersList;
	}

	

}
