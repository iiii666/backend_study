package util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CharacterEncoding
 */
@WebFilter(urlPatterns = "/*")//모든 url 다 웹 인코딩 거치게 하기위해
public class CharacterEncoding  implements Filter {
       
    
    public CharacterEncoding() {
    	System.out.println("characterencoding 생성자 수행");
    }

	public void destroy() {
    	System.out.println("characterencoding 소멸자 수행");

	}

	public void doFilter(ServletRequest srequest, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) srequest;
		request.setCharacterEncoding("UTF-8");
		System.out.println("characterencoding dofilter() 수행");

		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("characterencoding,init 수행");
	}

}
