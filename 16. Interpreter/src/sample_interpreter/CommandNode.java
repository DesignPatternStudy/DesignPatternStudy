package sample_interpreter;
// <command> ::= <repeat command> | <primitive command>에서 <command>를 나타냄
public class CommandNode extends Node {
	private Node node;
	
	@Override
	public void parse(Context context) throws ParseException {
		if (context.currentToken().equals("repeat")) {
			node = new RepeatCommandNode();
			node.parse(context);
		} else {
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}
	public String toString() {
		return node.toString();
	}
}
