package flow.token;

/**
 * The token for keywords.
 * @author AMACB
 *
 */
public class Keyword extends Token {
	public String[] keywords;
	
	/**
	 * The value of which the Keyword holds.
	 */
	private String data;
	
	public TokenType getType() {
		return TokenType.KEYWORD;
	}
	public String getData() {
		return data;
	}
}