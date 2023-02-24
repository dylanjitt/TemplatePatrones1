package builder;

public class Usuario {

	private BuilderContrato builder;
	
	public Contrato getContrato() {
		return builder.getContrato();
	}
	
	public void setTipoContrato (BuilderContrato builder) {
		this.builder = builder;
	}
	
	public void showContrato() {
		this.builder.infoContrato();
	}

}
