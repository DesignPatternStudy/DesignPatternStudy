package sample_interpreter;
// <repeat command> ::= repeat <number> <command list>에서 <repeat command>를 나타냄
public class RepeatCommandNode extends Node {
	private int number;
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("repeat");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	
	public String toString() {
		return "[repeat " + number + " " + commandListNode + "]";
	}
}
