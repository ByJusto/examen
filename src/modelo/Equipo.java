package modelo;

public class Equipo {

	private int id;
	private String nombre;
	private int bombo;
	
	public Equipo(int id, String nombre, int bombo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.bombo = bombo;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", bombo=" + bombo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBombo() {
		return bombo;
	}

	public void setBombo(int bombo) {
		this.bombo = bombo;
	}
	
	
}
