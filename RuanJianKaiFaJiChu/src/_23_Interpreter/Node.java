package _23_Interpreter;
/**
 * ͼ�����ģʽ��23��ʾ������
 * @author songzy
 * ����2017/10/25
 * ���﷨����Ҳ���ࡷ
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
