package com.icecreamappdynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 100L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Home</title></head><body>");
		out.println("<h1>Welcome to the Ice Cream App!</h1>");

		out.println("<p><a href='order'>Order Ice Cream</a></p>");

		out.println("</body></html>");
	}

}
