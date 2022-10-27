package sec01.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/mem.do") // ø‰√ª
public class MemberController extends HttpServlet {

	MemberDAO memberDAO;

	@Override
	public void init() throws ServletException {
		memberDAO = new MemberDAO();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<MemberVO> membersList = memberDAO.listMembers();
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/test01/listMembers.jsp");
		dispatcher.forward(request, response);
	}
}
