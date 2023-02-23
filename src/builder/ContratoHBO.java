package builder;

public class ContratoHBO extends BuilderContrato{
	

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
		this.contrato.setCanales("ABB");
		this.contrato.setCanales("BBC");
		this.contrato.setCanales("MAX");
		
		
	}

}
