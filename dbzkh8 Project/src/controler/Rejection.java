package controler;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class Rejection extends BaseErrorListener {

	public Rejection() {
		
		
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		// TODO Auto-generated method stub
		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
		// for printing the error on console with line number & say Rejected
		System.out.println("Input  Rejected " + "Error line number" +line +":" +charPositionInLine);
		System.exit(1); //Program terminate if found sentex error
	}

}
