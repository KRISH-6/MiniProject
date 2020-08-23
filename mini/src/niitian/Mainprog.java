package niitian;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mainprog
 */
@WebServlet("/Mainprog")
public class Mainprog extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pd=response.getWriter();
		String m=request.getParameter("username"); 
		String n=request.getParameter("mail"); 
		String o=request.getParameter("address"); 
		String p=request.getParameter("area"); 
		String q=request.getParameter("password"); 
		System.out.println("done");
		try { 
		System.out.println("enters "); 
		Class.forName ("org.h2.Driver"); 
		System.out.println("driver is done"); 
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","krishna","1234"); 
		String str ="insert into customer values(?,?,?,?,?)"; 
		System.out.println("connection done"); 
		// Step 2:Create a statement using connection object 
		PreparedStatement px=con.prepareStatement(str); 
		px.setString(1, m); 
		px.setString(2, n); 
		px.setString(3, o); 
		px.setString(4, p); 
		px.setString(5, q);
		px.execute(); 
		pd.println("<a href='page2.html'>login in </a>");
		
		
		System.out.println(" after submission"); 
		
		
		
		con.close();
		} 
		catch (Exception e2)
		{ 
		System.out.println("error"); 
		System.out.println(e2); 
		}
		

	}

}
