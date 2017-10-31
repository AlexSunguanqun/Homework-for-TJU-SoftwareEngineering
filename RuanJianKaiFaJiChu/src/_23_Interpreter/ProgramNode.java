package _23_Interpreter;
/**
 * ͼ�����ģʽ��23��ʾ������
 * @author songzy
 * ����2017/10/25
 * ���﷨����Ҳ���ࡷ
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
