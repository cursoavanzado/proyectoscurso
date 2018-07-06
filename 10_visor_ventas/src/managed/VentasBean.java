package managed;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import beans.Venta;
import modelo.DaoVentas;
import modelo.LibreriaFactory;

@ManagedBean
public class VentasBean {
	
	
	private Date fInicio;
	private Date fFin;
	private List<Venta> listaVentas;
	
	
	
	public Date getfInicio() {
		return fInicio;
	}
	public void setfInicio(Date fInicio) {
		this.fInicio = fInicio;
	}
	public Date getfFin() {
		return fFin;
	}
	public void setfFin(Date fFin) {
		this.fFin = fFin;
	}
	public List<Venta> getListaVentas() {
		return listaVentas;
	}
	public void setListaVentas(List<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}
	
	
	public void recuperarVentas() {
		DaoVentas dventas=LibreriaFactory.obtenerDaoVentas();
		listaVentas=dventas.recuperarVentas(fInicio, fFin);
	}
		
	
}
