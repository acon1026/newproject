package slogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginok")
public class Login  extends HttpServlet{
	
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html;utf-8");
		   response.setCharacterEncoding("UTF-8");
		   
		   String id = request.getParameter("loginid");
		   HttpSession session = request.getSession();   // 세션을 가져오는 구문		   
		   session.setAttribute("id", id);
		   
		 
		   
	
		   
		   
		   response.sendRedirect("html/s_main.html");
	}
	
}
