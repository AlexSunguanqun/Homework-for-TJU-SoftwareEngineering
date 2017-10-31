package _09_Bridge;
/**
 * 图解设计模式第9章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《将类的功能层次结构与现实层次结构分离》
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
