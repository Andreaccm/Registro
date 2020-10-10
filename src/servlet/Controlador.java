package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.ConexionJDBC;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {

	
	protected void processResquest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ConexionJDBC con = new ConexionJDBC();
		con.conectar();		
		 String sql = "INSERT INTO userp (userp,email,passwordp) VALUES(?,?,?)";
		
		try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
			
			pst.setString(0, request.getParameter("usuario"));
			pst.setString(1, request.getParameter("email"));
			pst.setString(2, request.getParameter("password"));
			pst.execute();
			
		//	request.getRequestDispatcher("salida.jsp").forward(request, response);
			
		} catch (SQLException e) {
			
			Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null,e);
		}
	        
	}
	


}
