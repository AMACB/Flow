package flow.token;

/**
 * The token for operators, e.g. + - %
 * @author AMACB
 *
 */
public class Operator extends Token {
	/**
	 * The value of which the Operator holds.
	 */
	private String data;
	
	public Operator(String data) {
		this.data = data;
	}
	
	public TokenType getType() {
		return TokenType.OPERATOR;
	}
	public String getData() {
		return data;
	}
}
