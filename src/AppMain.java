public class AppMain {

	public AppMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo cargo = new Cargo(1,"Analista",1000000);
		Cargo cargo2 = new Cargo(2,"Desarrolldor",2000000);
		Empleado empleado1 = new Empleado(1,"Marisella Restrepo","1128400766",cargo);
		Empleado empleado2 = new Empleado(2,"Alejandro Moncada","1128400767",cargo2);
		Empleado empleado3 = new Empleado(3,"Camilo Echeverri","1128400768",cargo2);
		Empleado empleado4 = new Empleado(4,"Juan Pablo Moncada","1128400769",cargo);
		Empleado empleado5 = new Empleado(5,"Sthefa Cardenas","11284007701",cargo2);
		Nomina nomina1 = new Nomina("30/09/2017");
		nomina1.add(empleado1);
		nomina1.add(empleado2);
		nomina1.add(empleado3);
		nomina1.add(empleado4);
		nomina1.add(empleado5);
		nomina1.calcularNomina();

		}
	
	    

}
