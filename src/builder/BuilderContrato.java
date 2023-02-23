package builder;

public abstract class BuilderContrato {
	protected Contrato contrato;

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		contrato = new Contrato();
	}
	
	public abstract void infoContrato();
	public abstract void setCosto();
	public abstract void setEmpresa();
	public abstract void setCanales();
	
	

}
