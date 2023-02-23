package prototype;

public class Launcher {
	public static void main(String[] args) {
		
		Camara c = new Camara(10, 5);
		Celular a1 = new Celular("A1");
		a1.setPeso(60);
		a1.setTamaño(20);
		a1.setCamara(c);
		a1.setImei(10001);
		a1.setOrigen("Bolivia");
		
		Celular a2 = a1.clone();
		a2.setImei(10002);
		Celular a3 = a1.clone();
		a3.setImei(10003);
		Celular a4 = a1.clone();
		a4.setImei(10004);
		Celular a5 = a1.clone();
		a5.setImei(10005);
		
		a1.infoCel();
		a2.infoCel();
		a3.infoCel();
		a4.infoCel();
		a5.infoCel();
	}
}
