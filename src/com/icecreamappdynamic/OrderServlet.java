package com.icecreamappdynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		response.getWriter().println("<html><head><title>Ice Cream Order</title></head><body>");
		response.getWriter().println("<form id='orderForm' name='orderForm' action='order' method='post'>");
		response.getWriter().println("<h1>Order Your Ice Cream</h1>");
		response.getWriter().println("<h2>Cup or Cone?</h2>");
		response.getWriter().println("<input type='radio' id='cup' name='cupOrCone' value='cup'>");
		response.getWriter().println("<label for='cup'>Cup</label>");
		response.getWriter().println("<input type='radio' id='cone' name='cupOrCone' value='cone'>");
		response.getWriter().println("<label for='cone'>Cone</label>");
		response.getWriter().println("<h2>Size?</h2>");
		response.getWriter().println("<input type='radio' id='small' name='size' value='small'>");
		response.getWriter().println("<label for='small'>Small</label>");
		response.getWriter().println("<input type='radio' id='medium' name='size' value='medium'>");
		response.getWriter().println("<label for='medium'>Medium</label>");
		response.getWriter().println("<input type='radio' id='large' name='size' value='large'>");
		response.getWriter().println("<label for='large'>Large</label>");
		response.getWriter().println("<h2>Flavor?</h2>");
		response.getWriter().println("<select id='flavor' name='flavor>");
		response.getWriter().println("<option value='vanilla'>Vanilla</option>");
		response.getWriter().println("<option value='chocolate'>Chocolate</option>");
		response.getWriter().println("<option value='strawberry'>Strawberry</option>");
		response.getWriter().println("<option value='butterPecan'>Butter Pecan</option>");
		response.getWriter().println("</select>");
		response.getWriter().println("<input type='submit' value='Order'>");
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
		String cupOrCone = request.getParameter("cupOrCone");
		String size = request.getParameter("size");
		String flavor = request.getParameter("flavor");
		HttpSession session = request.getSession(true);
		session.setAttribute("size", size);
		session.setAttribute("flavor", flavor);
		session.setAttribute("cupOrCone", cupOrCone);

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Order Confirmation</title></head>");
		out.println("<body><h1>Thank you for your order!</h1>");
		out.println(String.format("<h1>Here is your %s %s ice cream in a %s. Enjoy!</h1>", size, flavor, cupOrCone));
		out.println("</body></html>");

	}

}
