package _08_Absttract_factory;

/**
 * ͼ�����ģʽ��8��ʾ������
 * @author songzy
 * ����2017/09/28
 * ���������������װ�ɲ�Ʒ��
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
