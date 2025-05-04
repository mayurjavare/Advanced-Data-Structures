package dataStructure;

public class ParanthesesCheck {
	private String expr1 = "{8+4*(3*2)}";
	private String expr2 = "{8+4*(3*2})";
	private String expr3 = "[4+{8+4*(3*2)]";

	public boolean match(char c1, char c2)
	{
		if( ((c1=='(')&&(c2==')')) || ((c1=='{')&&(c2=='}')) || ((c1=='[')&&(c2==']')) )
			return true;
		return false;
	}
	
}
