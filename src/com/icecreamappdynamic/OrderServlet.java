package com.icecreamappdynamic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html><head><title>Order Ice Cream</title></head><body>");
		response.getWriter().println("<h1>Order Your Ice Cream</h1>");
		response.getWriter().println("<form action='order' method='post'>");
		response.getWriter().println("Flavor: <input type='text' name='flavor'><br>");
		response.getWriter().println("Quantity: <input type='number' name='quantity'><br>");
		response.getWriter().println("<input type='submit' value='Place Order'>");
		response.getWriter().println("</form>");
		response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flavor = request.getParameter("flavor");
		String quantity = request.getParameter("quantity");

		response.setContentType("text/html");
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html><head><title>Order Confirmation</title></head><body>");
		response.getWriter().println("<h1>Thank you for your order!</h1>");
		response.getWriter().println("<p>Flavor: " + flavor + "</p>");
		response.getWriter().println("<p>Quantity: " + quantity + "</p>");
		response.getWriter().println("<p><a href='index.jsp'>Back to Home</a></p>");
		response.getWriter().println("</body></html>");

	}

}
