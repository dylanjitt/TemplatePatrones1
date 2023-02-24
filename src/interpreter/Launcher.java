package interpreter;

public class Launcher {
	public static void main (String[]args){
        String msg = " 10 / 2 + 5 + 5 + 5";
        Evaluator evaluador = new Evaluator(msg);
        System.out.println("resultado final: "+evaluador.evaluateFormula());



    }

}
