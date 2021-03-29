package ito.poo.clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
	
	private LocalDate fecha;
	private LocalTime hora;
	private String lugar;
	private String tema;
	
	public Cita(LocalDate fecha, LocalTime hora, String lugar, String tema) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.tema = tema;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Cita [fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", tema=" + tema + "]";
	}
	
	

}
