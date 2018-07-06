package modelo;

import java.util.Date;
import java.util.List;

import beans.Venta;

public interface DaoVentas {

	List<Venta> recuperarVentas(Date f1, Date f2);

}