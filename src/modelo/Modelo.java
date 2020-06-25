package modelo;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

public class Modelo {

	private ArrayList<Equipo> equipos;
	private BD_oracle bd;
	private ArrayList<Bombo> bombos;
	private ArrayList<Grupo> grupos;
	public Modelo() {
		
		this.bd = new BD_oracle("alumno2","1521","2222","10.0.3.34");
		this.equipos=getEquipos();
		this.bombos= new ArrayList<Bombo>();
		createBombos();
		this.bombos=fillBombos();
		this.grupos=new ArrayList<Grupo>();
		insertGrupos();
		agruparRandom();
	}
	
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	
	
	public void printLmn(String texto) throws IOException {
		
		BufferedWriter outputStream = null;
		BufferedReader inputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("resultados.txt"));
			outputStream = new BufferedWriter(new FileWriter("resultados.txt"));
			
			outputStream.write(texto);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(outputStream!=null)
				outputStream.close();
		}
		
		
	}

	public void insertarSorteo() {
		
		for(Grupo g : grupos) {
			for(Equipo e : g.getEquipos()) {
//				bd.insertDataSorteo(e.getId(),g.getId()); NO se por que me da error he comprobado que coge bien los ids pero de da una excepcion de que 
//				no tiene todos los parametros que si que le paso
				System.out.println(e.getId()+"|"+g.getId());
			}
			
		}
		
		
	}
	
	
	
	private void agruparRandom() {
		
		for(Bombo b : bombos) {
			for(Grupo g :grupos) {
				b.shuffleEquipos();
				g.addEquipo(b.getEquipos().get(0));
				b.getEquipos().remove(0);		
				
			}
		
		}
		
//		for(Grupo g : grupos) {
//			
//			for(Bombo b : bombos) {
//				b.shuffleEquipos();
//				g.addEquipo(b.getEquipos().get(1));
//				
//			}
//			
			
//		}
		
		
		
	}
	
	private void insertGrupos() {
		
		grupos = bd.getGrupos();
		
	}
	
	
	
	
	public ArrayList<Equipo> getEquipos(){
		
		
		return bd.getEquipos();
		
		
	}
	
	
	
	public void createBombos() {
		for(int i = 0 ;i < 4;i++) {
			bombos.add(new Bombo(new ArrayList<Equipo>(),i+1));
		}
	}
	public ArrayList<Bombo> fillBombos() {
		
		for(Bombo b : bombos) {
			
			for(Equipo e : getEquipos()) {
				
				if(e.getBombo() == b.getNumero()) {
					System.out.println(e.getBombo()+"|"+b.getNumero());
					b.addEquipo(e);
				}
				
			}
			
		}
		return bombos;
		
		
	}
	
	public ArrayList<Bombo> getBombos(){
		
		
		return bombos;
	}
	
}
