package _10_Strategy;
/**
 * ͼ�����ģʽ��10��ʾ������
 * @author songzy
 * ����2017/10/05
 * ��������滻�㷨��
 */

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
