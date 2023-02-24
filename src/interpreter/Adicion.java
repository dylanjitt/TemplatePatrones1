package interpreter;

public class Adicion extends OperacionMate{

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("+")){
            context.signo=1;
            context.input=context.input.substring(1);
        }
		
	}

}
