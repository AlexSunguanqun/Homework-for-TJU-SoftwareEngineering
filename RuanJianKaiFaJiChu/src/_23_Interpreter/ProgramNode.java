package _23_Interpreter;
/**
 * 图解设计模式第23章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《语法规则也是类》
 */
// <program> ::= program <command list>
public class ProgramNode extends Node {
    private Node commandListNode;
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
