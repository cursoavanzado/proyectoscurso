package modelo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Datos {
	public static Connection obtenerConexion() throws SQLException {
		Connection cn=null;
		try {
			Context ct=new InitialContext();	
			//via referencia
			DataSource ds=(DataSource)ct.lookup("java:comp/env/reflibros");
			
			cn=ds.getConnection();
		}catch(NamingException ex) {
			ex.printStackTrace();
		}
		return cn;
	}
}
