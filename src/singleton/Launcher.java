package singleton;

public class Launcher {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Damon Albarn", "584864-1p");
		Estudiante e2 = new Estudiante("Sarah Lynn", "1234567");
		Estudiante e3 = new Estudiante("Jamie Hewlett","676767");
		Estudiante e4 = new Estudiante("Luz Noceda", "432432");
		Estudiante e5 = new Estudiante("Kevin Parker", "475842365");
		
		Tesis t1 = new Tesis("El Futuro del arte", "Andrew Watterson" , e1);
		Tesis t2 = new Tesis("La psicologia del Exito", "Andres Valdez", e2);
		Tesis t3 = new Tesis("Sangria Dividida", "Edwin Maruchal", e3);
		Tesis t4 = new Tesis("NFT y Crypto-blockchain", "Tommy Veneros", e4);
		
		Tesis t5 = new Tesis("El Futuro del arte", "Andrew Watterson" , e5);
		
		TesisDB.getInstance().registrarTesis(t1, "08:00");
		TesisDB.getInstance().registrarTesis(t2, "19:00");
		TesisDB.getInstance().registrarTesis(t3, "06:00");
		TesisDB.getInstance().registrarTesis(t4, "18:45");
		TesisDB.getInstance().registrarTesis(t5, "09:00");
		
		

	}
	

}
