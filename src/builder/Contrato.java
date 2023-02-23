package builder;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private String nombre;
	private int costo;
	private String empresa;
	private List<String> listaCanales = new ArrayList<>();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void setCanales(String canal) {
		listaCanales.add(canal);
	}
	
	public void infoContrato() {
		System.out.println("CONTRATO SERVICIO: "+empresa);
		System.out.println("Costo: "+costo);
		System.out.println("Lista de canales: ");
		listaCanales.forEach((n)-> System.out.println(n));
		
	}
	
	

}
