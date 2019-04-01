package com.github.javatraining.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("test2_index.jsp").forward(request, response);
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
		
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("test2_result.jsp").forward(request, response);
	}

}
