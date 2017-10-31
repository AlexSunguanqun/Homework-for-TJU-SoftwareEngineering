package _23_Interpreter;
/**
 * 图解设计模式第23章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《语法规则也是类》
 */
// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
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
