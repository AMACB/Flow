package flow.token;

public abstract class Token {
	public abstract TokenType getType();
	public abstract String getData();
	public static Token[] tokenize() {
		return null;
	}
}
