package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class DoCalculation
 */
@WebServlet("/DoCalculation")
public class DoCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoCalculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String field1 = request.getParameter("field1");
		String field2 = request.getParameter("field2");
		String operator = request.getParameter("operator");
		Calculator calc = new Calculator(Integer.parseInt(field1),Integer.parseInt(field2), operator);
		calc.doCalculation();
		request.setAttribute("results", calc);
		if(operator.contains("power")) getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		else getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
