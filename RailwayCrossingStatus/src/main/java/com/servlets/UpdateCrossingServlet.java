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
 * Servlet implementation class UpdateCrossingServlet
 */
@WebServlet("/UpdateCrossingServlet")
public class UpdateCrossingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCrossingServlet() {
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
		 int crossingId = Integer.parseInt(request.getParameter("crossingId"));
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String landmark = request.getParameter("landmark");
	        String trainSchedules = request.getParameter("trainSchedules");
	        String personInCharge = request.getParameter("personInCharge");
	        String status = request.getParameter("status");

	        // Create a new RailwayCrossing object with updated values
	        RailwayCrossing updatedCrossing = new RailwayCrossing();
	        updatedCrossing.setId(crossingId);
	        updatedCrossing.setName(name);
	        updatedCrossing.setAddress(address);
	        updatedCrossing.setLandmark(landmark);
	        updatedCrossing.setTrainSchedules(trainSchedules);
	        updatedCrossing.setPersonInCharge(personInCharge);
	        updatedCrossing.setStatus(status);

	        // Use AdminOperations to update the crossing
	        AdminOperations adminOperations = new AdminOperations();
	        int result = adminOperations.updateCrossing(updatedCrossing);

	        // Redirect to appropriate page based on the result
	        if (result > 0) {
	            response.sendRedirect("railwayCrossing.jsp");
	        } else {
	            response.getWriter().println("Error updating crossing");
	        }
	    
	}

}
