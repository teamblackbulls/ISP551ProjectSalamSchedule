package staff.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import staff.model.*;
import staff.dao.*;

/**
 * Servlet implementation class LoginStaffController
 */
@WebServlet("/LoginStaffController")
public class LoginStaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StaffDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginStaffController() {
        super();
        dao = new StaffDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StaffDAO sd = new StaffDAO();
		String sid = request.getParameter("sid");
		String pass = request.getParameter("pass");
		Staff s = sd.getStaffLogin(sid,pass);
		if(s!=null && s.getName() != null) {
			request.setAttribute("message", s.getName());
			request.getRequestDispatcher("staffHome.jsp").forward(request, response);
		} else {
			response.sendRedirect("errorStaffLogin.html");
		}
	}

}
