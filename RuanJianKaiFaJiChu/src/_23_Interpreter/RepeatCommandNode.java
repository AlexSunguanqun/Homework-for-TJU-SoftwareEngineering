package _23_Interpreter;
/**
 * ͼ�����ģʽ��23��ʾ������
 * @author songzy
 * ����2017/10/25
 * ���﷨����Ҳ���ࡷ
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
