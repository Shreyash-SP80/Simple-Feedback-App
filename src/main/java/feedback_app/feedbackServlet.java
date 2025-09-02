package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class feedbackServlet extends HttpServlet{
	
	void saveData(String email, String phone, String message) {
		try {
			
			// Get Required drivers			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			// Create an connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "dbms");
			
			// Create Prepared Statements			
			PreparedStatement ps = con.prepareStatement("INSERT INTO FeedBack VALUES(?, ?, ?)");
			
			// Insert Data			
			ps.setString(1, email);
			ps.setString(2, phone);
			ps.setString(3, message);
			
			// Execute Query in database			
			ps.executeUpdate();
		} catch (Exception err) {
			System.out.println("Error occured: " + err);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Form data get
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String feedbackMessage = req.getParameter("feedbackMessage");
		// Form data process
		
		feedbackServlet obj = new feedbackServlet();
		obj.saveData(email, phone, feedbackMessage);
		
		// Response
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Feedback servlet Working</h1>");
		pw.print(""" 
			<h2>Your Form details that you have submitted</h2>
			<h3>Email: %s</h3>
			<h3>Phone: %s</h3>
			<h3>Message: %s</h3>
			<h4 style="color:green; font-family:mono;">Data Saved Thank you for your responce<h4>
		""".formatted(email, phone, feedbackMessage));
		
		// Redirect after all working		
		// resp.sendRedirect("/feedback_app");	
	}
		
}
