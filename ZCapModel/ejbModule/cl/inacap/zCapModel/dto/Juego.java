package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {
	
	private String nombreJuego;
	private String descripcionJuego;
	private boolean aptoNinos;
	private int precioJuego;
	private LocalDate fechaLanzamientoJuego;
	private Consola consola;
	
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getDescripcionJuego() {
		return descripcionJuego;
	}
	public void setDescripcionJuego(String descripcionJuego) {
		this.descripcionJuego = descripcionJuego;
	}
	public boolean isAptoNinos() {
		return aptoNinos;
	}
	public void setAptoNinos(boolean aptoNinos) {
		this.aptoNinos = aptoNinos;
	}
	public int getPrecioJuego() {
		return precioJuego;
	}
	public void setPrecioJuego(int precioJuego) {
		this.precioJuego = precioJuego;
	}
	public LocalDate getFechaLanzamientoJuego() {
		return fechaLanzamientoJuego;
	}
	public void setFechaLanzamientoJuego(LocalDate fechaLanzamientoJuego) {
		this.fechaLanzamientoJuego = fechaLanzamientoJuego;
	}
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}

}
