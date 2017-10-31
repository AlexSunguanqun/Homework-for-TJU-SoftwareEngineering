package _20_Flyweight;
import java.util.HashMap;
/**
 * ͼ�����ģʽ��21��ʾ������
 * @author songzy
 * ����2017/10/25
 * ��ֻ�ڱ�Ҫʱ����ʵ����
 */

public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory() {
    }
    public static BigCharFactory getInstance() {
        return singleton;
    }
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
