package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionJDBC {
	
	private static String url = "jdbc:postgresql://localhost:5433/Registro";
	private static String user = "postgres";
	private static String pwd = "250797Ac*";
	private static String driver = "org.postgresql.Driver";
	
	Connection connection = null;
	Statement st;
	ResultSet result;
	
	public Connection conectar() {
		try {
			Class.forName(driver);
		    connection = DriverManager.getConnection(url, user, pwd);
			
		    if(!connection.isClosed()) {
		    	System.out.println("Conectado a la base de datos");
		    	}
			return connection;
		} catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE,null,ex);
            return null;
		}
		
	}
	public Connection getConexion() {
		return connection;
	}
	
	
	

}
