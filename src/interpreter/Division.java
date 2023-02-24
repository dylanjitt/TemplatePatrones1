package interpreter;

public class Division extends OperacionMate {



    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("/")){
            context.signo=context.signo/1;
            context.input=context.input.substring(1);
        }
    }
}
