package Servelet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import dao.AlienDao;
import model.Alien;

public class GetAlienController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		AlienDao a1= new AlienDao();
		Alien a2 =a1.getAlien(id);
		request.setAttribute("Alien", a2);
		javax.servlet.RequestDispatcher rs = request.getRequestDispatcher("showAlien.jsp");
		rs.forward(request,response);
		

		
		System.out.println("servlet " );
		 
	
	}



}
