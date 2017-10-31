package _11_Composite;

/**
 * ͼ�����ģʽ��11��ʾ������
 * @author songzy
 * ����2017/10/05
 * �����������ݵ�һ���ԡ�
 */



public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
