package prototype;

public class Camara {
	
	private int foco;
	private int lente;
	
	public Camara(int foco, int lente) {
		this.foco = foco;
		this.lente = lente;
	}
	
	public void infoLente() {
		System.out.println("CAMARA:");
		System.out.println("Lente: "+lente+" mpx");
		System.out.println("Foco: "+foco);
	}
	
	

}
