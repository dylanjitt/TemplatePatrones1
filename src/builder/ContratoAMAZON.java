package builder;

public class ContratoAMAZON extends BuilderContrato{
	

	@Override
	public void infoContrato() {
		this.contrato.infoContrato();
		
	}

	@Override
	public void setCosto() {
		this.contrato.setCosto(50);
		
	}

	@Override
	public void setEmpresa() {
		this.contrato.setEmpresa("aws");
		
	}

	@Override
	public void setCanales() {
		this.contrato.setCanales("Invincible");
		this.contrato.setCanales("The Boys");
		this.contrato.setCanales("SNK");
		
		
	}

}
