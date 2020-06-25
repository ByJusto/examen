package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BD_oracle extends Data_base{

	
	public BD_oracle(String user, String port, String password, String host) {
		super(user, port, password, host);
		// TODO Auto-generated constructor stub
		
		crearConexion();
		
		
		
	}
	
	public void clearTable() {
		
		String sql = "DELETE FROM TABLE EQUIPO_HAS_GRUPO";
		
//		Connection con = crearConexion();
		
//		ResultSet rs = st.executeQuery(sql);
		
		try(Connection con = crearConexion();Statement st = con.createStatement()) {
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Datos Eliminados");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertDataSorteo(int IdEquipo,int IdGrupo) {
		
//		PreparedStatement pst = null;
		
		String sql= "INSERT INTO EQUIPO_HAS_GRUPO(IDEQUIPO,IDGRUPO) VALUES(?,?)";
		
		try(Connection con = crearConexion(); PreparedStatement pst= con.prepareStatement(sql)){
			
			pst.setInt(1,IdEquipo);
			pst.setInt(2, IdGrupo);
			
			
			pst.execute(sql);
			
			System.out.println("Sql Insertada correctamente");
			
			
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	public ArrayList<Grupo> getGrupos(){
		
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		String sql = "SELECT LETRA,ID FROM GRUPO";
		
//		Connection con = crearConexion();
		
//		ResultSet rs = st.executeQuery(sql);
		
		try(Connection con = crearConexion();Statement st = con.createStatement()) {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				String letra = rs.getString("LETRA");
				int id = rs.getInt("ID");
				
				grupos.add(new Grupo(letra,id));
				System.out.println("Grupo agregado");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grupos;
	
	}
	
	
	
	public ArrayList<Equipo> getEquipos() {
		
		
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "SELECT ID,NOMBRE,BOMBO FROM EQUIPO";
		
//		Connection con = crearConexion();
		
//		ResultSet rs = st.executeQuery(sql);
		
		try(Connection con = crearConexion();Statement st = con.createStatement()) {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				int id = rs.getInt("ID");
				String nombre =rs.getString("NOMBRE");
				int bombo =rs.getInt("BOMBO");
				
				
				equipos.add(new Equipo(id,nombre,bombo));
//				System.out.println("Equipo agregado");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipos;
		
		
		
		
		
	}

	
	
}
