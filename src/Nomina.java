import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;;

public class Nomina{


	LocalDate fecha1;
	String fecha;
	HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
	
	
	public Nomina(){
	
	}
	
	public void add(Empleado empleado){
		this.empleados.put(empleado.getId(), empleado);
	}
	
	
	public LocalDate getFecha() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse(fecha,fmt);
		
		return fecha1;
	}

	public void setFecha(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	
	public Nomina(String fecha) {
		this.fecha = fecha;
		
	}
	
	public void calcularNomina(){
		Empleado empleado;
		double acum = 0.0;
		for (Map.Entry<Integer, Empleado> hempleado : empleados.entrySet()) {
			empleado = hempleado.getValue();
			acum = acum + empleado.getCargo().getSalario();
			System.out.println("Id=" + hempleado.getKey() + ", Cédula="+empleado.getDocumento()+ 
		    ", Nombre="+empleado.getNombre()+ 
		    ", Salario=" + empleado.getCargo().getSalario());
		}
		
		System.out.printf("La nómina total para la fecha "+fecha+ " es: "+String.valueOf(acum));
		

	}

}