package builder;

public class COntratoNETFLIX extends BuilderContrato{
	

	private int costo = 150;
	private String empresa = "netflix";
	@Override
	public void infoContrato() {
		this.contrato.infoContrato();
		
	}

	@Override
	public void setCosto() {
		this.contrato.setCosto(150);
		
	}

	@Override
	public void setEmpresa() {
		this.contrato.setEmpresa("netflix");
		
	}

	@Override
	public void setCanales() {
		this.contrato.setCanales("stranger things");
		this.contrato.setCanales("BETTER CALL SAUL");
		this.contrato.setCanales("INSIDE JOB");
		
		
	}
}
