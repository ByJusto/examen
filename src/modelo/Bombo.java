package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Bombo {

	private ArrayList<Equipo> equipos;
	private int numero;
	
	public Bombo(ArrayList<Equipo> equipos ,int numero) {
		
		this.equipos=equipos;
		this.numero = numero;
		
		
		
		
	}

	public void shuffleEquipos() {
		Collections.shuffle(equipos);
	}
	
	public int getNumero() {
		return numero;
	}
	
//	public Equipo getRandomEquipo() {
//		
//		return equipo;
//		
//		
//	}

	@Override
	public String toString() {
		return "Bombo [equipos=" + equipos + ", numero=" + numero + "]";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void addEquipo(Equipo e) {
		
		this.equipos.add(e);
		
		
	}
	
	public void clearEquipos() {
		
		this.equipos.clear();
		
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
	
}
