package com.github.javatraining.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Servlet implementation class Test1Servlet
 */
public class Test1Servlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8845371261577890779L;

	private static final Log log = LogFactory.getLog(Test1Servlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("Test1Servlet's doGet function called.");
		response.getWriter().append("Served doget at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("Test1Servlet's doPost function called.");
		response.getWriter().append("Served dopost at: ").append(request.getContextPath());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.debug("Test1Servlet's service function called.");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		log.debug("Test1Servlet's destroy function called.");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		log.debug("Test1Servlet's init function called.");
	}

}
