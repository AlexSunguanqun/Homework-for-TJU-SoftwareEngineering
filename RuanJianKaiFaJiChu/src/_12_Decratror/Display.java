package _12_Decratror;

/**
 * ͼ�����ģʽ��12��ʾ������
 * @author songzy
 * ����2017/10/05
 * ��װ�α߿��뱻װ�����һ���ԡ�
 */


public abstract class Display {
    public abstract int getColumns();               
    public abstract int getRows();                  
    public abstract String getRowText(int row);     
    public void show() {                           
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
