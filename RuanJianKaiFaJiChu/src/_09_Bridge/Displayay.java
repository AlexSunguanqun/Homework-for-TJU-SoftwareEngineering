package _09_Bridge;
/**
 * ͼ�����ģʽ��9��ʾ������
 * @author songzy
 * ����2017/10/05
 * ������Ĺ��ܲ�νṹ����ʵ��νṹ���롷
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
