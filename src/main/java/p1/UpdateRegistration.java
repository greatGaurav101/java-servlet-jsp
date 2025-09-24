package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


@WebServlet("/UpdateRegistration")
public class UpdateRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRegistration() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twfmp", "root", "root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("update student set name = '"+name+"' where email = '"+email+"' ");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
