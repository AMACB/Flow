package flow.compiled;

public enum InstructionType {
	ASSIGNMENT, /* Contains a variable name, an assignment operator, and an expression */
	EXPRESSION, /* References variables, contains non assignment operators */
	CONDITIONAL, /* Executes until END if condition */
	BEGIN, /* Marks the beginning of a statement */
	END, /* Marks the end of a statement */
	REPEAT, /* Execute a statement again */
}
