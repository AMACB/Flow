package flow.token;

/**
 * The token for
 * <code>. , ( ) [ ] { }</code>.
 * @author AMACB
 *
 */
public class Separator extends Token {
	/**
	 * The value of which the Separator holds.
	 */
	private String data;
	
	public Separator(String data) {
		this.data = data;
	}
	
	public TokenType getType() {
		return TokenType.SEPARATOR;
	}
	public String getData() {
		return data;
	}
}
