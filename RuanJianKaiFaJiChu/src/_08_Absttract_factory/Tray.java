package _08_Absttract_factory;

/**
 * ͼ�����ģʽ��8��ʾ������
 * @author songzy
 * ����2017/09/28
 * ���������������װ�ɲ�Ʒ��
 */


import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
