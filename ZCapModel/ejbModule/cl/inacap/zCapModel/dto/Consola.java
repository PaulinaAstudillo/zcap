package cl.inacap.zCapModel.dto;

import java.util.List;

public class Consola {
	
	private String nombre;
	private String marcaConsola;
	private int anioLanzamientoConsola; 
	private List<Juego> juegos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarcaConsola() {
		return marcaConsola;
	}
	public void setMarcaConsola(String marcaConsola) {
		this.marcaConsola = marcaConsola;
	}
	public int getAnioLanzamientoConsola() {
		return anioLanzamientoConsola;
	}
	public void setAnioLanzamientoConsola(int anioLanzamientoConsola) {
		this.anioLanzamientoConsola = anioLanzamientoConsola;
	}
	public List<Juego> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}

}
