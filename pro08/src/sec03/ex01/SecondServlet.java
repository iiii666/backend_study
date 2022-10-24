package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();

     /* out.println("<html><body>");
      out.println("dispatch를 이용한 forward 실습입니다.");
      out.println("</body></html>");*/
      
      String name=request.getParameter("name");//url 엣 받아오는것
      int age = (int)request.getAttribute("age");
      out.println("<html><body>");
      out.println("이름:"+name + " 나이:" + age);
     
      out.println("<br>");
      out.println("dispatch를 이용한 forward 실습입니다.");
      out.println("</body></html>");   

   }
}
