package controler;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.GRAMMERLexer;
import parser.GRAMMERParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	// input file read from commond line agr
	GRAMMERLexer  lexer = new GRAMMERLexer(CharStreams.fromFileName(args[0]));
	//create object for tokenization
	CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	//create object for parser
	GRAMMERParser parser= new GRAMMERParser(tokenStream);
	//Remove defult show error & warning from inside lexer
	lexer.removeErrorListeners();
	//Remove defult show error  & warning from inside parser
	parser.removeErrorListeners();
	//Recognizer Register with parser
	parser.addParseListener(new Recognizer());
	//Recognizer Rejection with parser
	parser.addErrorListener(new Rejection());
    //start parsing
	parser.program();
	
} 
catch (Exception e)
{ 
	// print Exception
  e.printStackTrace();
}
	
	}

}
