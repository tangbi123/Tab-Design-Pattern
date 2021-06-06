package Interpreter;

public class ProgrameNode extends Node{
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString(){
        return "[program" + commandListNode + "]";
    }
}
