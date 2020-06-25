package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class Data_base{

	private String user;
	private String port;
	private String password;
	private String host;
	Connection con;
	
	public Data_base(String user,String port,String password,String host) {
		this.host=host;
		this.user=user;
		this.password=password;
		this.port=port;
		this.con=null;
		
		
		
	}

	protected Connection crearConexion() {
		// TODO Auto-generated method stub
		
		try { 
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				String BaseDeDatos = "jdbc:oracle:thin:@" + host + ":" + port + ":XE"; 
				con = DriverManager.getConnection(BaseDeDatos, user, password); 
				if (con != null) 
				System.out.println("Conexión realizada con éxito a la BD"); 
			} catch (Exception e) { 
				e.printStackTrace(); 
				System.out.println("No se ha podido conectar");
			
			} 
		
		
		return con;
		
		
	}

	protected Connection getCon() {
		return con;
	}

	@Override
	public String toString() {
		return "Data_base [user=" + user + ", port=" + port + ", password=" + password + ", host=" + host + ", con="
				+ con + "]";
	}
	
	
		
	
	
}
