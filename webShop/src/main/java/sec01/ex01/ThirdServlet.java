package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
	value="/third",
	loadOnStartup = 1
	)
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThirdServlet() {
        System.out.println("1.ThirdServlet() 생성자 수행");
    }

	public void init(ServletConfig config) throws ServletException {
        System.out.println("2.ThirdServlet.init() 수행");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("3.ThirdServlet.service() 수행");
        super.service(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("4.ThirdServlet.doGet() 수행");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("4.ThirdServlet.doPOST() 수행");
	}
	public void destroy() {
		System.out.println("5.ThirdServlet.destroy() 수행");
	}
}
