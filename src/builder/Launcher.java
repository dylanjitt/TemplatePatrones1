package builder;

public class Launcher {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		ContratoHBO hbo = new ContratoHBO();
		hbo.setEmpresa();
		hbo.setCosto();
		hbo.setCanales();
		COntratoNETFLIX netflix = new COntratoNETFLIX();
		netflix.setEmpresa();
		netflix.setCosto();
		netflix.setCanales();
		ContratoAMAZON amazon = new ContratoAMAZON();
		amazon.setEmpresa();
		amazon.setCanales();
		amazon.setCosto();
		
		//user.setTipoContrato(amazon);
		user.setTipoContrato(amazon);
		user.showContrato();
		
		Contrato c = user.getContrato();
		
		c.infoContrato();
		
user.setTipoContrato(netflix);
user.showContrato();
		
		Contrato c2 = user.getContrato();
		
		c2.infoContrato();
		
user.setTipoContrato(hbo);
user.showContrato();
		
		Contrato c3 = user.getContrato();
		
		c3.infoContrato();

	}

}
