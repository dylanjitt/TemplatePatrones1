package interpreter;

import java.util.ArrayList;
import java.util.List;

public class Evaluator extends OperacionMate{
    private List<OperacionMate> formula = new ArrayList<>();
    private Context context;

    //formulaOriginal --> 1 + 23 + 3000 - 44444 - 2 + 2
    public Evaluator(String formulaOriginal){
        context = new Context(formulaOriginal.replace(" ",""));
        for (String msg:formulaOriginal.split(" ")){
            switch (msg){
                case "+":
                    formula.add(new Adicion());
                    break;
                case "/":
                    formula.add(new Division());
                    break;
                default:
                    formula.add(new NumberExpression(msg.length()));
                    break;
            }
        }
    }

    public int evaluateFormula(){
        for (OperacionMate operacionMatematicas:formula) {
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {

    }
}