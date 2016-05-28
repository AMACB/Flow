package flow.token;

import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class Token {
	public abstract TokenType getType();
	public abstract String getData();
	private static String[] keyLiterals = new String[]{"null","false","true"};
	
	/**
	 * Tokenize a String. The logic is as follows:
	 * 
	 * <ol>
	 * 	<li></li>
	 * </ol>
	 * 
	 * @return array of Tokens
	 */
	public static Token[] tokenize(String s) {
		String data = new String(s);
		ArrayList<Token> tokens = new ArrayList<Token>();
		// Begin by scanning for keywords \\
		while (data.length() > 0) {
			// Ignore whitespace
			data.replaceFirst("^\\s+","");
			// Scan for keyword literals
			for (String literal: keyLiterals) {
				if (data.startsWith(literal)) {
					tokens.add(new Literal(literal));
					removePrefix(data,literal);
					continue;
				}
			}
		}
		return null;
	}
	
	private static char firstChar(String s) {
		return s.charAt(0);
	}
	
	private static void removePrefix(String s, String prefix) {
		s.replaceFirst("^"+prefix,"");
	}
}
