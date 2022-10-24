package sec01.ex01;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet3
 */
@WebServlet("/input3")
public class InputServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String[]> paramMap = req.getParameterMap();

		for (String key : paramMap.keySet()) {
			String[] values = paramMap.get(key);

			for (int i = 0; i < values.length; i++) {
				System.out.println(key + "[" + i + "]" + values[i]);
			}
		}
	}

}
