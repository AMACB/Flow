package flow.compiled;

/**
 * This class will contain the data for a pseudo-compiled 
 * @author HankoTanks
 *
 */
public class Compiled {
	private String data;
	Compiled(String compiledData) { // package visible only
		this.data = compiledData;
	}
	
	public void execute() {
		// TODO execute the compiled code
	}
}