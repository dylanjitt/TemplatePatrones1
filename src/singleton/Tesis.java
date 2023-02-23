package singleton;

public class Tesis {
	private String titulo;
	private String mencion;
	private Estudiante estudiante;
	
	
	public Tesis(String titulo, String mencion, Estudiante estudiante) {
		this.titulo = titulo;
		this.mencion = mencion;
		this.estudiante = estudiante;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getMencion() {
		return mencion;
	}


	public void setMencion(String mencion) {
		this.mencion = mencion;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public void infoTesis() {
		System.out.println("TITULO TESIS: "+titulo);
		System.out.println("MENCION: "+mencion);
		estudiante.infoEstudiante();
	}
	

}
