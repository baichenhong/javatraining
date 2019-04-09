package com.github.javatraining.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.github.javatraining.web.db.UserManager;
import com.github.javatraining.web.entity.User;

/**
 * Servlet implementation class Test2Servlet
 */
public class Test2Servlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5771529038846994426L;

	private static final Log log = LogFactory.getLog(Test2Servlet.class);
	
	
	private UserManager userManager = new UserManager();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> users = userManager.getUsers();
		request.setAttribute("users", users);
		request.getRequestDispatcher("test2_all.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		User user = new User();
		String username = request.getParameter("username");
		if (username != null) {
			user.setUsername(username);
		}
		String password = request.getParameter("password");
		if (username != null) {
			user.setPassword(password);
		}
		String name = request.getParameter("name");
		if (name != null) {
			user.setName(name);
		}
		String sex = request.getParameter("sex");
		if (sex != null) {
			user.setSex(sex);
		}
		String province = request.getParameter("province");
		if (province != null) {
			user.setProvince(province);
		}

		boolean result = userManager.addUser(user);
		
		request.setAttribute("result", Boolean.valueOf(result));
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("test2_result.jsp").forward(request, response);
	}

}
