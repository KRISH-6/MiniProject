package niitian;
import java.sql.*;
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
 * Servlet implementation class Mainlog
 */
@WebServlet("/Mainlog")
public class Mainlog extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter p=response.getWriter(); 
		String mail=request.getParameter("mail"); 
		String password=request.getParameter("password"); 
		
		
		if(Validates.checkUser(mail,password))
        {
			p.println("Welcome");
            RequestDispatcher rd = request.getRequestDispatcher("/page2.html");
            
            rd.forward(request, response);
           
            
        }
        else
        {
           
           RequestDispatcher r = request.getRequestDispatcher("/login.html");
           r.include(request, response);
           p.println("Your Username or Password is incorrect");
        }
		
		
		
		} 
		
	}

