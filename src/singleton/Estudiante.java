package singleton;

public class Estudiante {
	
	private String nombre;
	private String ci;
	
	public Estudiante(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
	}
	
	public void infoEstudiante() {
		System.out.println("ESTUDIANTE:");
		System.out.println("Nombre: "+nombre);
		System.out.println("C.I.: "+ci);
	}
	
	

}
