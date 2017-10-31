package _20_Flyweight;
/**
 * ͼ�����ģʽ��21��ʾ������
 * @author songzy
 * ����2017/10/25
 * ��ֻ�ڱ�Ҫʱ����ʵ����
 */
public class BigString {
    private BigChar[] bigchars;
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
