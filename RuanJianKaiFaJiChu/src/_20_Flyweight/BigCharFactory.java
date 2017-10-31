package _20_Flyweight;
import java.util.HashMap;
/**
 * 图解设计模式第21章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《只在必要时生成实例》
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
