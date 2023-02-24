package builder;

public class ContratoHBO extends BuilderContrato{
	
	private int costo = 100;
	private String empresa = "HBO";

	@Override
	public void infoContrato() {
		this.contrato.infoContrato();
		
	}

	@Override
	public void setCosto() {
		this.contrato.setCosto(100);
		
	}

	@Override
	public void setEmpresa() {
		this.contrato.setEmpresa("HBO");
		
	}

	@Override
	public void setCanales() {
		this.contrato.setCanales("Velma");
		this.contrato.setCanales("The Last Of US");
		this.contrato.setCanales("MAX");
		
		
	}

}
