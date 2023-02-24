package interpreter;

public class NumberExpression extends OperacionMate {

    public NumberExpression(int digit){
        this.digit=digit;
    }


    @Override
    public void interpreter(Context context) {
            context.output=context.output+ (context.signo* Integer.parseInt(context.input.substring(0,this.digit)));
            context.input=context.input.substring(this.digit);
    }
}
