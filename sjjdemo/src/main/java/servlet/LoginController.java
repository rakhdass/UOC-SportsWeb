package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import model.User;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String pw=request.getParameter("pw");
		System.out.println(pw);
		LoginDao dao=new LoginDao();
		User u =dao.getUser(id,pw);
		System.out.println(u.getPassword());
		String pwr=u.getPassword();
		
		if(pwr.equals(pw)) {
			
			
			javax.servlet.RequestDispatcher rs = request.getRequestDispatcher("TournamentSelect.jsp");
			rs.forward(request,response);
		}else {
			System.out.println("no");
			response.sendRedirect("Login.jsp");
		
		}
		
	
		
		
		/*if(dao.checkDetails(id, pw)){
			response.sendRedirect("Welcome.jsp");
			
			
		}else {
			
			response.sendRedirect("Login.jsp");
		}*/
	}


}
