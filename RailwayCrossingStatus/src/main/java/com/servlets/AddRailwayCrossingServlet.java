package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.entity.RailwayCrossing;
import com.operations.AdminOperations;


/**
 * Servlet implementation class AddRailwayCrossingServlet
 */
@WebServlet("/AddRailwayCrossingServlet")
public class AddRailwayCrossingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRailwayCrossingServlet() {
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
		// TODO Auto-generated method stub
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String landmark = request.getParameter("landmark");
        String schedules = request.getParameter("schedules");
        String personInCharge = request.getParameter("personInCharge");
        String status = request.getParameter("status");
		
        RailwayCrossing newCrossing = new RailwayCrossing(0, name, address, landmark, schedules, personInCharge, status);
       
        AdminOperations adminOper = new AdminOperations(); 
 
    if (adminOper.AddCrossing(newCrossing) >= 1)
        response.sendRedirect("railwayCrossing.jsp");
    else
        response.getWriter().print("<h1>Error! RailwayCrossing Not Added..</h1>");

    }
	}


