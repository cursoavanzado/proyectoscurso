package modelo;

public class LibreriaFactory {
	public static DaoVentas obtenerDaoVentas() {
		return new DaoVentasImpl();
	}
}
