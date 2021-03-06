package beans;

import java.io.Serializable;


/**
 * The persistent class for the libros database table.
 * 
 */

public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int isbn;

	private String autor;

	private int idTema;

	private int paginas;

	private double precio;

	private String titulo;

	
	public Libro(int isbn,String titulo, String autor, int idTema, int paginas, double precio ) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.idTema = idTema;
		this.paginas = paginas;
		this.precio = precio;
		this.titulo = titulo;
	}

	public Libro() {
	}

	public int getIsbn() {
		return this.isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIdTema() {
		return this.idTema;
	}

	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}

	public int getPaginas() {
		return this.paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	
}