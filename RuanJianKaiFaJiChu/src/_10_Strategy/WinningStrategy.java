package _10_Strategy;


/**
 * ͼ�����ģʽ��10��ʾ������
 * @author songzy
 * ����2017/10/05
 * ��������滻�㷨��
 */

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }
    public void study(boolean win) {
        won = win;
    }
}
