package singleton;

public class TesisDB {

	private static TesisDB instance = null;
	private String hora;
	
	public TesisDB() {}
	
	private synchronized static void create(){
        if (instance == null)
            instance = new TesisDB();
    }


    public static TesisDB getInstance(){
        if (instance == null)
            create();
        return instance;
    }
    
    public synchronized void registrarTesis(Tesis tesis,String hora) {
    	this.hora = hora;
    	System.out.println("-----------------------------");
    	System.out.println("Nueva Tesis Registrada: ");
    	tesis.infoTesis();
    	horaPub();
    }
    
    public void horaPub() {
    	System.out.println("HORA DE REGISTRO: "+hora);
    }
	
	
}
