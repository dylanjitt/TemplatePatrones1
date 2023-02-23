package prototype;

public class Celular {
	
	private String modelo;
	private int tamaño;
	private int peso;
	private Camara camara;
	private int imei;
	private String Origen;
	
	public Celular(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}
	
	public void infoCel() {
		System.out.println("------------------");
		System.out.println("CELULAR:");
		System.out.println("Modelo: "+modelo);
		System.out.println("Tamano: "+tamaño+" cm");
		System.out.println("Peso: "+peso+"g.");
		camara.infoLente();
		System.out.println("IMEI: "+imei);
		System.out.println("Pais Creado: "+Origen);
	}
	
	

}
