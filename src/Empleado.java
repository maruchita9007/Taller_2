
public class Empleado {
	
	private String nombre;
	private String documento;
	private int id;
	private Cargo cargo; 
	public Empleado(int id, String nombre, String documento, Cargo cargo) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.documento = documento;
		this.id = id;
		this.cargo = cargo;
	}
	

	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	

}
