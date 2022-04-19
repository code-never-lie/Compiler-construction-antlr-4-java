package controler;

import java.util.HashMap;
import java.util.Map;

import parser.GRAMMERBaseListener;
import parser.GRAMMERParser.AddContext;
import parser.GRAMMERParser.AssignContext;
import parser.GRAMMERParser.PrintContext;

public class Recognizer extends GRAMMERBaseListener {

	private Map<String,Integer> variable;  // according to our grammar a suitable data structures
	public Recognizer() {
		
		variable=new  HashMap<>();  // object of HashMap 
	}
	@Override
	public void exitAssign(AssignContext ctx) {
		 // call  base class constructor using super keyword
		super.exitAssign(ctx); 
		
		String variableName=ctx.ID(0).getText(); 
		
		//Get value from variable  number
		String value= ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.NUMBER().getText();
		
		// Add variable to map
		if (ctx.ID().size()>1) {
			variable.put(variableName, variable.get(value));
			
		}
		else {
			variable.put(variableName, Integer.parseInt(value));
		}
		
		
	}
	@Override
	public void exitAdd(AddContext ctx) {
		// call  base class constructor using super keyword
		super.exitAdd(ctx); 
		
		// This method is called when the parser has finished
		// parsing the add statement
		String variableName=ctx.ID().size()>1 ? ctx.ID(1).getText():ctx.ID(0).getText();
		int value = ctx.ID().size()>1? variable.get(ctx.ID(0).getText()): Integer.parseInt(ctx.NUMBER().getText());
		variable.put(variableName, variable.get(variableName)+value);
		
		
	}
	@Override
	public void exitPrint(PrintContext ctx) {
		// TODO Auto-generated method stub
		super.exitPrint(ctx);
		

		// This method is called when the parser has finished
		// parsing the print statement
		String output=ctx.ID()==null ? ctx.NUMBER().getText() : variable.get(ctx.ID().getText()).toString();
	  System.out.println("Input  Accepted "+"\n" + output);
	}
	
	

	
}
