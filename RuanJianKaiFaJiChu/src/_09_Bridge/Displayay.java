package _09_Bridge;
/**
 * 图解设计模式第9章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《将类的功能层次结构与现实层次结构分离》
 */

public class Displayay {
    private DisplayImpl impl;
    public Displayay(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {
        open();
        print();                    
        close();
    }
}
