package modelo;

import java.util.ArrayList;

public class Grupo {
	
	private String letra;
	private int id;
	private ArrayList<Equipo> equipos;
	
	public Grupo(String letra,int id) {
		this.id=id;
		this.letra=letra;
		this.equipos=new ArrayList<Equipo>();
	}




	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}




	public int getId() {
		return id;
	}




	@Override
	public String toString() {
		return "Grupo [letra=" + letra + ", equipos=" + equipos + "]";
	}




	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	
	public void addEquipo(Equipo e) {
		
		equipos.add(e);
		
	}
	
}
