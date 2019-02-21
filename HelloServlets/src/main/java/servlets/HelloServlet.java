package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

/*Requests get sent to a service method
 * HttpServlet/DefaultServlet have this method implemented already.
 * It automatically delegates to appropriate of Http actions.
 * Such that for
 * POST -> doPost
 * GET -> doGet
 * PUT -> doPut
 * DELETE -> doDelete
 * 
 * */

public class HelloServlet extends DefaultServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Hello Servlet!");
	}

}
