package _09_Bridge;
/**
 * ͼ�����ģʽ��9��ʾ������
 * @author songzy
 * ����2017/10/05
 * ������Ĺ��ܲ�νṹ����ʵ��νṹ���롷
 */
public class CountDisplay extends Displayay {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {      
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
