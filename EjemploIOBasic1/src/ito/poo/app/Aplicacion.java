package ito.poo.app;

import ito.poo.clases.Cita;
import ito.dsc.input.FormInput;
import ito.dsc.output.FormOutput;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicacion {
	static private ArrayList<Cita> citas= new ArrayList<Cita>();
	static private FormInput menu= new FormInput();
	static private final int FIN=4;
	
	static void generaMenu() {
		menu.addItemMenu("1.- Agregar cita");
		menu.addItemMenu("2.- Mostrar citas");
		menu.addItemMenu("3.- Eliminar cita");
		menu.addItemMenu("4.- Terminar");
	}
	
	static LocalDate capturaFecha() {
		LocalDate fecha;
		String txtFecha= FormInput.leeString("Proporciona fecha de cita:[aaaa-mm-dd]:");
		fecha= LocalDate.parse(txtFecha);
		return fecha;
	}
	
	static LocalTime capturaHora() {
		LocalTime hora;
		String txtHora= FormInput.leeString("Proporciona hora de cita:[hh:mm]");
		hora= LocalTime.parse(txtHora);
		return hora;
	}
	
	static Cita capturaCita() {
		LocalDate fecha=capturaFecha();
		LocalTime hora=capturaHora();
		String lugar=FormInput.leeString("Proporciona lugar de cita:");
		String tema=FormInput.leeString("Proporciona tema a tratar:");
		return new Cita(fecha,hora,lugar,tema);
	}
	
	static void addCita() {
		 Cita cita=capturaCita();
		 citas.add(cita);
	}
	
	static void listCitas() {
		FormOutput.imprimeListaTabla(citas, "Lista de citas");
	}
	
	static void eliminarCita() {
		for(Cita cita: citas)
			if (FormInput.leeBoolean(cita+"\nEs la cita a eliminar:")) {
				citas.remove(cita);
				break;
			}
	}
	
	static void run() {
		generaMenu();
		int opc;
		do {
			opc=menu.menuOption();
			switch(opc) {
			    case 1: addCita(); break;
			    case 2: listCitas(); break;
			    case 3: eliminarCita(); break;
			}
		}while(opc!=FIN);	
	}

}
