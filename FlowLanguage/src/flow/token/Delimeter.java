package flow.token;

/**
 * The token for delimeters: . ( ) [ ] { }
 * @author AMACB
 *
 */
public class Delimeter extends Token {
	/**
	 * The value of which the Operator holds.
	 */
	private String data;
	
	public Delimeter(String data) {
		this.data = data;
	}
	
	public TokenType getType() {
		return TokenType.DELIMETER;
	}
	public String getData() {
		return data;
	}
}
