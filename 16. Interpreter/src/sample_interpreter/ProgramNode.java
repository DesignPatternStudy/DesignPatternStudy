package sample_interpreter;
// <program> ::= program <command list>���� <program>�� ��Ÿ��
// <program> ::= program <command list>
public class ProgramNode extends Node {
	private Node commandListNode;
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("program");
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	public String toString() {
		return "[program " + commandListNode + "]";
	}
}
