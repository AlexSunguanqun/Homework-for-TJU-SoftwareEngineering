package _09_Bridge;
/**
 * ͼ�����ģʽ��9��ʾ������
 * @author songzy
 * ����2017/10/05
 * ������Ĺ��ܲ�νṹ����ʵ��νṹ���롷
 */

public class Main {
    public static void main(String[] args) {
        Displayay d1 = new Displayay(new StringDisplayImpl("Hello, China."));
        Displayay d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
