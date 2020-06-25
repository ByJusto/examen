package principal;

import modelo.BD_oracle;
import modelo.Bombo;
import modelo.Equipo;
import modelo.Grupo;
import modelo.Modelo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Modelo model = new Modelo();
		
		model.insertarSorteo();
		
//		model.getEquipos();
//		
//		for(Grupo e : model.getGrupos()) {
//			System.out.println(e);
//		}
//		System.out.println(bd.toString());
		
		
		
	}

}
