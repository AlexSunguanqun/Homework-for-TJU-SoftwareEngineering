package _20_Flyweight;
/**
 * ͼ�����ģʽ��21��ʾ������
 * @author songzy
 * ����2017/10/25
 * ��ֻ�ڱ�Ҫʱ����ʵ����
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
