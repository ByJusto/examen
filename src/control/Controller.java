package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import view.Main_frame;

public class Controller implements ActionListener{

	private Main_frame view;
	private Modelo model;
	
	
	public Controller(Modelo model,Main_frame view) {
		
		this.view=view;
		this.model=model;
		
		start();
		
		
	}
	
	
	
	public void start() {
		
		// generamos los listeners de los botones
		view.getButtonSorteo().addActionListener(this);
		view.getButtonBorrar().addActionListener(this);
		view.getButtonListadoAlfabetico().addActionListener(this);
		view.getButtonListadoGrupos().addActionListener(this);
		//generamos los action command de los botones
		view.getButtonSorteo().setActionCommand("mostrar_sorteo");
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String command = e.getActionCommand();
		
		if(command == "mostrar_sorteo") {
			mostrar_sorteo();
		}
		
		
	}
	
	private void mostrar_sorteo() {
		
	}


//	private void mostrar_sorteo() {
//		// TODO Auto-generated method stub
//		
//		for(Sorteo s : Sorteo)
//			
//			if(s.getGrupo()== "A")
//				DefaultTableModel view.getTableA().tableModel().roww(();
//			
//		
//		
//	}
	
}
