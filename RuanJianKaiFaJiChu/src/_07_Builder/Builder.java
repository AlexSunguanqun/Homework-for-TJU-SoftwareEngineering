package _07_Builder;
/**
 * ͼ�����ģʽ��7��ʾ������
 * @author songzy
 * ����2017/09/28
 * ����װ���ӵ�ʵ����
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
