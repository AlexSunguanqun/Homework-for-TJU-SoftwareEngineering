package _23_Interpreter;
/**
 * ͼ�����ģʽ��23��ʾ������
 * @author songzy
 * ����2017/10/25
 * ���﷨����Ҳ���ࡷ
 */

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
    private String name;
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }
    public String toString() {
        return name;
    }
}
