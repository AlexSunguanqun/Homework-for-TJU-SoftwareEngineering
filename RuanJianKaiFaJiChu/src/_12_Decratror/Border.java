package _12_Decratror;

/**
 * ͼ�����ģʽ��12��ʾ������
 * @author songzy
 * ����2017/10/05
 * ��װ�α߿��뱻װ�����һ���ԡ�
 */


public abstract class Border extends Display {
    protected Display display;         
    protected Border(Display display) { 
        this.display = display;
    }
}
