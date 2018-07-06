package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.Cliente;
import beans.Libro;
import beans.Venta;

/**
 * Session Bean implementation class GestionVentasService
 */

public class DaoVentasImpl implements DaoVentas  {
	
	
	@Override
	public List<Venta> recuperarVentas(Date f1, Date f2) {
		String sql="select ventas.*,clientes.*,libros.* from ventas,clientes,libros ";
		sql+="where ventas.idCliente=clientes.idCliente and ";
		sql+="ventas.idLibro=libros.isbn and ";
		sql+="ventas.fecha>=? and ventas.fecha<=?";
		List<Venta> ventas=new ArrayList<>();
		try(Connection con=Datos.obtenerConexion();){
			PreparedStatement ps=con.prepareStatement(sql);		
			ps.setDate(1, new java.sql.Date(f1.getTime()));
			ps.setDate(2, new java.sql.Date(f2.getTime()));
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Cliente al=new Cliente(rs.getInt("idCliente"),rs.getString("clientes.usuario"),
						rs.getString("clientes.password"),
						rs.getString("clientes.email"),
						
						rs.getInt("clientes.telefono")
						);
				Libro cs=new Libro(rs.getInt("libros.isbn"), 
						rs.getString("libros.titulo"),
						rs.getString("libros.autor"),
						rs.getInt("libros.idTema"),
						rs.getInt("libros.paginas"),
						rs.getDouble("libros.precio"));
				Venta mt=new Venta(rs.getInt("ventas.idVEnta"),rs.getDate("ventas.fecha"),cs,al);
				ventas.add(mt);
			}
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return ventas;
	}

   
}
