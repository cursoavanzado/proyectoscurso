package beans;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the ventas database table.
 * 
 */

public class Venta implements Serializable {
	

	
	private int idVEnta;

	
	private Date fecha;

	
	private Libro libro;

	
	private Cliente cliente;

	public Venta(int idVEnta, Date fecha, Libro libro, Cliente cliente) {
		super();
		this.idVEnta = idVEnta;
		this.fecha = fecha;
		this.libro = libro;
		this.cliente = cliente;
	}

	public Venta() {
	}

	public int getIdVEnta() {
		return this.idVEnta;
	}

	public void setIdVEnta(int idVEnta) {
		this.idVEnta = idVEnta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {		
		return "libro="+libro;
	}
	

}