package _08_Absttract_factory;

/**
 * ͼ�����ģʽ��8��ʾ������
 * @author songzy
 * ����2017/09/28
 * ���������������װ�ɲ�Ʒ��
 */

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
