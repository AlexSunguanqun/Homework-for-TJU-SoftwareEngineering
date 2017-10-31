package _23_Interpreter;
/**
 * ͼ�����ģʽ��23��ʾ������
 * @author songzy
 * ����2017/10/25
 * ���﷨����Ҳ���ࡷ
 */
public class CommandNode extends Node {
    private Node node;
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
